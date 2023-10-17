package day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        carList.add("BMW");
        carList.add("Volkswagen");
        carList.add("Lada");
        carList.add("Isuzu");
        carList.add("Toyota");
        System.out.println(carList);

        carList.add(2, "Tesla");
        carList.remove(0);
        System.out.println(carList);


    }
}
