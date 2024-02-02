import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pet dog1 = new Dog(0, 5, 1);
        //dog1.sit(); // won't compile
        Dog dog2 = new Dog(0, 10, 2);
        dog2.sit(); // does compile
        Pet cat1 = new Cat(2, 2, 1);

        List<Pet> pets =
                new ArrayList<>(Arrays.asList(dog1, dog2, cat1));

        for (Pet pet : pets) {
            pet.speak(); // does compile
            //pet.sit(); // does not compile
            // TODO: call sit on all dog objects


        }
    }
}