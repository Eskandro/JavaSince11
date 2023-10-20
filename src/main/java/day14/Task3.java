package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {

        List<Person> humans = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {


                String line = scanner.nextLine();
                String[] people = line.split(" ");


                if(Integer.parseInt(people[1]) < 0){
                    throw new IllegalArgumentException();
                }
                Person person = new Person(people[0], Integer.parseInt(people[1]));
                humans.add(person);

            }
            return humans;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
