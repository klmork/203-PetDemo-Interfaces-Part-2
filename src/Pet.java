
public interface Pet {
    void speak();

    default void sayHi() {
        System.out.println("Hi");
    }

    default int doubleAmountFed() {
        return getAmountFed() * 2;
    }

    default int eat(int amount) {
        System.out.println("eating!!!");
        setAmountFed(amount);
        return getAmountFed();
    }
    void setAmountFed(int amount);

    int getAmountFed();

    default void display() {
        System.out.println(this.getClass() + ": " + getId());
    }
    int getId();


}

