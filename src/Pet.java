
public interface Pet {
    void speak();

    boolean eat(int amount);

    default void sayHi() {
        System.out.println("Hi");
    }

}

