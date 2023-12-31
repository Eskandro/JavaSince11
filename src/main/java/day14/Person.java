package day14;

public class Person {
    private String name;
    private int year;

    public Person(String name, int age) {
        this.name = name;
        this.year = age;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
