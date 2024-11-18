package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class Main {
    public static void main(String[] args) {
        try {

            Aquatic dolphin = new Dolphin("Cetacea", "Dolphin", 5, true, "Ocean", 25.5F);
            Terrestrial bear = new Terrestrial("Ursidae", "Bear", 7, true, 4);
            Penguin penguin = new Penguin("Spheniscidae", "Penguin", 3, false, "Polar Regions", 15.0F);

            System.out.println("\n--- Test des comportements alimentaires ---");

            dolphin.eatMeat(Food.MEAT);
            bear.eatMeat(Food.MEAT);
            bear.eatPlant(Food.PLANT);
            bear.eatPlantAndMeat(Food.BOTH);
            penguin.eatMeat(Food.MEAT); // Si nécessaire, Penguin implémente l'interface Carnivore

            System.out.println("\n--- Création et gestion du zoo ---");

            zoo myZoo = new zoo("Safari Zoo", "Tunis");
            myZoo.addAnimal(dolphin);
            myZoo.addAnimal(bear);
            myZoo.addAnimal(penguin);

            System.out.println("\nAnimaux dans le zoo '" + myZoo.getName() + "':");
            myZoo.displayAnimals();

            System.out.println("\n--- Comparaison de deux zoos ---");

            zoo myZoo1 = new zoo("Safari Zoo", "Tunis");
            zoo myZoo2 = new zoo("Wildlife Park", "Nabeul");

            myZoo1.addAnimal(new Dolphin("Cetacea", "Dolphin", 4, true, "Ocean", 20.0F));
            myZoo2.addAnimal(new Terrestrial("Mammal", "Elephant", 8, true, 4));

            zoo largerZoo = zoo.comparerZoo(myZoo1, myZoo2);
            if (largerZoo != null) {
                System.out.println("Le zoo avec le plus d'animaux est: " + largerZoo.getName());
            } else {
                System.out.println("Les deux zoos ont le même nombre d'animaux.");
            }

            System.out.println("\n--- Suppression d'un animal du zoo ---");

            boolean removedBear = myZoo.removeAnimal(bear);
            System.out.println("Suppression du Bear: " + (removedBear ? "Réussi" : "Échec"));

            System.out.println("\n--- Comportement de nage des animaux aquatiques ---");

            Dolphin dolphinSwim = new Dolphin("Cetacea", "Dolphin", 5, true, "Ocean", 25.5F);
            Penguin penguinSwim = new Penguin("Spheniscidae", "Penguin", 3, false, "Polar Regions", 15.0F);

            dolphinSwim.swim();
            penguinSwim.swim();


            myZoo.addAquaticAnimal(dolphinSwim);
            myZoo.addAquaticAnimal(penguinSwim);

            System.out.println("\nAnimaux aquatiques dans le zoo:");
            for (Aquatic aquatic : myZoo.getAquaticAnimals()) {
                if (aquatic != null) {
                    aquatic.swim();
                }
            }

        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
