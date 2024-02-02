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



    public int getAmountFed() { return amountFed; }
    public void setAmountFed(int amount) {
        this.amountFed += amount;
    }
    public int getId() { return id; }

}
