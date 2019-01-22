public abstract class Base {
    private String name;

    Base(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
