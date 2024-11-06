package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR_CAGES = 25;
    private int animalCount;
    public Aquatic[] aquaticAnimals = new Aquatic[10]; // Array for aquatic animals

    // Constructor
    public zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.animalCount = 0;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to add an animal to the zoo
    public boolean addAnimal(Animal animal) {
        if (animalCount < NBR_CAGES) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("The zoo is full, cannot add more animals.");
            return false;
        }
    }

    // Method to search for an animal in the zoo (returns index or -1 if not found)
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    // Method to remove an animal from the zoo
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = animals[animalCount - 1];
            animals[animalCount - 1] = null;
            animalCount--;
            return true;
        } else {
            System.out.println("Animal not found in the zoo.");
            return false;
        }
    }

    // Method to check if the zoo is full
    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    // Static method to compare two zoos (based on the number of animals)
    public static zoo comparerZoo(zoo z1, zoo z2) {
        return (z1.animalCount > z2.animalCount) ? z1 : z2;
    }

    // Method to display all animals in the zoo
    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Method to add an aquatic animal to the aquaticAnimals array
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
    }

    // Method to find the maximum swimming depth among penguins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    // Method to display the count of each type of aquatic animal (Dolphins and Penguins)
    public void displayNumberOfAquaticsByType() {
        int dolphinsCount = 0;
        int penguinsCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinsCount++;
            } else if (aquatic instanceof Penguin) {
                penguinsCount++;
            }
        }

        System.out.println("Number of Dolphins: " + dolphinsCount);
        System.out.println("Number of Penguins: " + penguinsCount);
    }

    // Method to get a list of all aquatic animals
    public List<Aquatic> getAquaticAnimals() {
        List<Aquatic> aquaticAnimalList = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Aquatic) {
                aquaticAnimalList.add((Aquatic) animal);
            }
        }
        return aquaticAnimalList;
    }
}
