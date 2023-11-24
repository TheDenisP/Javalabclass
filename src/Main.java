import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Dog("Buddy", 3, 15.5, true, true);
        animals[1] = new Blowfish("Bluey", 1, 0.2, false, true);
        animals[2] = new Pigeon("Pidgey", 2, 0.5, "white", "Spain");
        animals[3] = new Mammal("Morsley", 20, 2.5, true);

        for (Animal a : animals) {
            System.out.println(a);
        }




    }
}
