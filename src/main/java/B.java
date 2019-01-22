public class B extends Base {

    private int number;

    public B(String name, int number) {
        super(name);
        this.number = number;
    }

    public void print() {
        System.out.format("Class: %s, number: %d", getName(), number);
    }

    public int getNumber() {
        return number;
    }
}
