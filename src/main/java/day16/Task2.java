package day16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        generateFileOne();
        generateFileTwo();
        printResult(new File("file2"));
    }

    public static void generateFileOne() {
        try {
            Random random = new Random();
            PrintWriter writer = new PrintWriter("file1");
            for (int i = 0; i < 1000; i++) {
                int number = random.nextInt(101);
                writer.print(number);
                writer.print(" ");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void generateFileTwo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("file1"));
             PrintWriter writer = new PrintWriter("file2")) {
            String line;
            int count = 0;
            double sum = 0;

            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String numberStr : numbers) {
                    int number = Integer.parseInt(numberStr);
                    sum += number;
                    count++;

                    if (count == 20) {
                        double average = sum / 20.0;
                        writer.printf("%.2f ", average);
                        sum = 0;
                        count = 0;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            double sum = 0;

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                } else {
                    scanner.next();
                }
            }

            int result = (int) sum;
            System.out.println("Ответ: " + result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
