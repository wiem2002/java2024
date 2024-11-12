package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class zoo {
    private List<Animal> animals; // Utilisation d'une ArrayList
    private String name;
    private String city;
    private final int NBR_CAGES = 3; // Réduire la capacité à 3 pour les tests
    private int animalCount;
    public Aquatic[] aquaticAnimals = new Aquatic[10]; // Array pour les animaux aquatiques

    // Constructeur
    public zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new ArrayList<>(); // Initialisation de la liste
        this.animalCount = 0;
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Setter pour le nom
    public void setName(String name) {
        this.name = name;
    }

    // Méthode pour ajouter un animal au zoo avec gestion des exceptions
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        // Vérification si l'âge de l'animal est négatif
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }

        // Vérification si le zoo est plein (capacité maximale de 3)
        if (animals.size() >= NBR_CAGES) {
            throw new ZooFullException("Impossible d'ajouter plus d'animaux. Le zoo est plein.");
        }

        // Ajout de l'animal au zoo
        animals.add(animal);

        // Affichage des informations
        System.out.println("Animal ajouté : " + animal);
        System.out.println("Total des animaux : " + animals.size());
    }

    // Méthode pour rechercher un animal dans le zoo
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals.get(i).equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    // Méthode pour afficher tous les animaux du zoo
    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    // Méthode pour ajouter un animal aquatique
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
    }


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

        System.out.println("Nombre de dauphins : " + dolphinsCount);
        System.out.println("Nombre de pingouins : " + penguinsCount);
    }
}
