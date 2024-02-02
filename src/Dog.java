public class Dog implements Pet {
    private int amountFed;
    private final int fullAt;
    private final int id;

    public Dog(int amount, int fullAt, int id) {
        this.amountFed = amount; this.fullAt = fullAt; this.id = id;
    }
    public void speak() {
        System.out.println("bark");
    }


    public void sit() {
        System.out.println("sitting");
    }

    public int getAmountFed() { return amountFed; }
    public int getId() { return id; }
    public void setAmountFed(int amount) {
        this.amountFed += amount;
    }
}
