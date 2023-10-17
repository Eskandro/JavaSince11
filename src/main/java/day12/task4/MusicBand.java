package day12.task4;

import java.util.List;

public class MusicBand {
    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    private String name;
    private int year;
    private List<String> members;

    public List<String> getMembers() {
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
    public void addMembers(String... newMembers){
        for(String member: newMembers){
            this.members.add(member);
        }
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String member : a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
