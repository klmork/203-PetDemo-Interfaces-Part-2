public class Cat implements Pet {
    private int amountFed;
    private final int fullAt;
    private final int id;
    public Cat(int amount, int fullAt, int id) {
        this.amountFed = amount; this.fullAt = fullAt; this.id = id;
    }
    public void speak() {
        System.out.println("meow");
    }
    public int eat(int amount) {
        System.out.println("eating!!!");
        amountFed += amount;
        return amountFed;
    }
    public void display() {
        System.out.println(this.getClass() + ": " + id);
    }
}
