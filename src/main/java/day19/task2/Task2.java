package day19.task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");

        Map<Integer, Point> map = new HashMap<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                if (numbers.length == 3) {
                    int id = Integer.parseInt(numbers[0]);
                    int x = Integer.parseInt(numbers[1]);
                    int y = Integer.parseInt(numbers[2]);
                    map.put(id, new Point(x, y));
                } else {
                    System.out.println("Координаты в файле записаны неверно");
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Введите координаты квадрата через пробел: ");
        int x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] coords = input.split(" ");
        if (coords.length == 4) {
            x1 = Integer.parseInt(coords[0]);
            y1 = Integer.parseInt(coords[1]);
            x2 = Integer.parseInt(coords[2]);
            y2 = Integer.parseInt(coords[3]);
        } else {
            System.err.println("Некорректный ввод");
            return;
        }

        int count = 0;
        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
            Point point = entry.getValue();
            if (point.getX() > x1 && point.getX() < x2 && point.getY() > y1 && point.getY() < y2) {
                count++;
                System.out.println("Машина ID " + entry.getKey() + " внутри квадрата.");
            }
        }

        System.out.println("Всего машин внутри квадрата: " + count);
    }
}

