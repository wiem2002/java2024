import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Création d'un objet Animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création d'un objet Zoo (myZoo)
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 10);

       Animal[] animals = new Animal[25];

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        lion.displayAnimal();

        System.out.println(lion);
        System.out.println(lion.toString());
    }
}
