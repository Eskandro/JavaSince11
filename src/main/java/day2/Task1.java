package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a >= 1 && a <= 4){
            System.out.println("Малоэтажный дом");
        }
        if(a >= 5 && a <= 8){
            System.out.println("Среднеэтажный дом");
        }
        if(a >= 9){
            System.out.println("Многоэтажный дом");
        }
        if(a <= 0){
            System.out.println("Ошибка ввода");
        }
    }
}
