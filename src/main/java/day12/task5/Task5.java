package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("first", 32));
        members1.add(new MusicArtist("second", 43));
        members1.add(new MusicArtist("third", 45));
        members1.add(new MusicArtist("fourth", 55));

        MusicBand musicBand1 = new MusicBand("Ramstein", 1994, members1);

        List<MusicArtist> members2 = new ArrayList<>();

        members2.add(new MusicArtist("fifth", 32));
        members2.add(new MusicArtist("sixth", 43));
        members2.add(new MusicArtist("seventh", 45));
        members2.add(new MusicArtist("eighth", 55));

        MusicBand musicBand2 = new MusicBand("Sabaton", 1999, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);
        System.out.println();
        musicBand1.printMembers();
        musicBand2.printMembers();
    }

}
