package day12.task3;

public class MusicBand {
    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
