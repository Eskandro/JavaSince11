package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Ramstein", 1994);
        MusicBand musicBand2 = new MusicBand("Sabaton", 1999);
        MusicBand musicBand3 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand4 = new MusicBand("Linkin Park", 1996);
        MusicBand musicBand5 = new MusicBand("Radio Tapok", 2016);
        MusicBand musicBand6 = new MusicBand("Король и Шут", 1988);
        MusicBand musicBand7 = new MusicBand("Eisbrecher", 2003 );
        MusicBand musicBand8 = new MusicBand("Powerwolf", 2003);
        MusicBand musicBand9 = new MusicBand("ИГРА МИРОВ", 2015);
        MusicBand musicBand10 = new MusicBand("FIZICA", 2015);

        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand> groupsAfter2000 = groupsAfter2000(musicBands);

        System.out.println("Groups created after 2000: ");
        for (MusicBand band : groupsAfter2000) {
            System.out.println(band);
        }


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> after2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                after2000.add(band);
            }
        }
        return after2000;
    }
}
