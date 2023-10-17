package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();

        members1.add("first");
        members1.add("second");
        members1.add("third");
        members1.add("fourth");

        List<String> members2 = new ArrayList<>();
        members2.add("fifth");
        members2.add("sixth");
        members2.add("eighth");
        members2.add("nineth");
        members2.add("tenth");
        members2.add("tenth");

        MusicBand musicBand1 = new MusicBand("Ramstein", 1994, members1);
        MusicBand musicBand2 = new MusicBand("Sabaton", 1999, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();


        musicBand1.addMembers("eleventh", "twelveth", "thirteenth");
        musicBand1.printMembers();
    }
}
