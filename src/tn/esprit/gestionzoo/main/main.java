package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.zoo;
import tn.esprit.gestionzoo.entities.Aquatic;

public class main {
    public static void main(String[] args) {
        // Create instances of animals with parameterized constructors
        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 5, true, "Ocean", 25.5F);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Polar Regions", 15.0F);
        Terrestrial lion = new Terrestrial("Mammal", "Lion", 10, true, 4);
        Terrestrial giraffe = new Terrestrial("Mammal", "Giraffe", 15, true, 4);

        System.out.println("\nInstances créées avec constructeurs paramétrés :");
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(lion);
        System.out.println(giraffe);

        // Create a zoo and add animals
        zoo myZoo = new zoo("Safari Zoo", "Tunis");
        myZoo.addAnimal(dolphin);
        myZoo.addAnimal(penguin);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(giraffe);

        System.out.println("\nAnimaux dans le zoo '" + myZoo.getName() + "':");
        myZoo.displayAnimals();

        // Create two zoos and compare them
        zoo myZoo1 = new zoo("Safari Zoo", "Tunis");
        zoo myZoo2 = new zoo("Wildlife Park", "Nabeul");

        myZoo1.addAnimal(new Dolphin("Mammal", "Dolphin", 4, true, "Ocean", 20.0F));
        myZoo1.addAnimal(new Penguin("Bird", "Penguin", 3, false, "Polar Regions", 10.0F));
        myZoo2.addAnimal(new Terrestrial("Mammal", "Elephant", 8, true, 4));
        myZoo2.addAnimal(new Terrestrial("Mammal", "Zebra", 6, true, 4));

        zoo largerZoo = zoo.comparerZoo(myZoo1, myZoo2);
        if (largerZoo != null) {
            System.out.println("\nLe zoo avec le plus d'animaux est: " + largerZoo.getName());
        } else {
            System.out.println("\nLes deux zoos ont le même nombre d'animaux.");
        }

        // Remove an animal from the zoo
        boolean removedLion = myZoo.removeAnimal(lion);
        System.out.println("\nSuppression du Lion: " + (removedLion ? "Réussi" : "Échec"));

        // Demonstrate swimming behavior for specific aquatic animals
        Dolphin dolphinSwim = new Dolphin("Mammal", "Dolphin", 5, true, "Ocean", 25.5F);
        Penguin penguinSwim = new Penguin("Bird", "Penguin", 3, false, "Polar Regions", 15.0F);

        dolphinSwim.swim();
        penguinSwim.swim();

        // Add aquatic animals to the zoo's aquatic animal list
        myZoo.addAquaticAnimal(dolphinSwim);
        myZoo.addAquaticAnimal(penguinSwim);

        // Display swimming behavior of aquatic animals
        System.out.println("\nSwimming behavior of aquatic animals in the zoo:");
        for (Aquatic aquatic : myZoo.getAquaticAnimals()) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }
}
