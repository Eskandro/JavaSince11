package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("srsum");
        double sredSum = printResult(file);
        DecimalFormat decimalFormat = new DecimalFormat("0.000"); // Формат для вывода трех знаков после запятой
        System.out.println(sredSum);
        System.out.println(decimalFormat.format(sredSum));
    }

    public static double printResult(File file) {
        double srSum = 0;
        List<Integer> intNumbers = new ArrayList();
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            for (String number : numbers) {
                srSum += Integer.parseInt(number);
            }
            srSum /= numbers.length; // Рассчитываем среднее арифметическое
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return srSum;
    }
}
