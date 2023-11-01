package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        Map<String, Integer> map = new HashMap<>();
        List<String> famousWords = new ArrayList<>();
        int chichikovCount = 0;
        int countWords = 0;

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("[.,:;()?!\"\\s–]+");
                int minWordLength = 2;

                for (String word : words) {
                    String uniqueWord = word.toLowerCase();

                    if (uniqueWord.length() > minWordLength) {
                        if (map.containsKey(uniqueWord)) {
                            map.replace(uniqueWord, map.get(uniqueWord), map.get(uniqueWord).intValue() + 1);
                        } else {
                            map.put(uniqueWord, 1);
                        }
                        if (uniqueWord.equals("чичиков")) {
                            chichikovCount++;
                        }
                        countWords++;
                    }
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        int limit = 100;
        for (int i = 0; i < Math.min(limit, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Чичиков: " + chichikovCount);
        System.out.println("Количество слов в произведении: " + countWords);
    }
}

