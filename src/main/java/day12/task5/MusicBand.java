package day12.task5;

import java.util.List;

public class MusicBand {
    private List<MusicArtist> members;
    private String name;
    private int year;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void printMembers(){
        System.out.println(this.members);
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusicArtist member : a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }



}
