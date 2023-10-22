package day15;

public class ExampleShoes {
    private String name;
    private int size;
    private int count;

    public ExampleShoes(String name, int size, int count) {
        this.name = name;
        this.size = size;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return name + size + count;
    }
}
