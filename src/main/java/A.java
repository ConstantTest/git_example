public class A extends Base {

    private int number;

    public A(String name, int number) {
        super(name);
        this.number = number;
    }

    public void print() {
        System.out.format("Class: %s, number: %d", getName(), number);
    }
}
