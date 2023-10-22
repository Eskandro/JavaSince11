package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/shoes.csv");
        File file2 = new File("src/main/resources/missing_shoes");
        List<ExampleShoes> shoes = checkNoShoes(file1, file2);

    }

    public static List<ExampleShoes> checkNoShoes(File file1, File file2) {
        List<ExampleShoes> shoes = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter writer = new PrintWriter(file2);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoe = line.split(";");


                ExampleShoes exampleShoes = new ExampleShoes(shoe[0], Integer.parseInt(shoe[1]),
                        Integer.parseInt(shoe[2]));

                if (Integer.parseInt(shoe[2]) == 0) {
                    shoes.add(exampleShoes);
                    writer.println(line);
                }

            }
            writer.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return shoes;
    }
}
