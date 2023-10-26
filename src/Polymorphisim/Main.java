import java.util.*;
public class Main {
    public static void main(String[] args) {
        var Pets = new ArrayList<pets>();
        var Dog = new dog();
        var catpet = new Catpet();

        Pets.add(Dog);
        Pets.add(catpet);

        for (pets p: Pets) {
            System.out.println(p.sound()); // <= Polymorphism (late binding) is happening here.
        }
    }
}
