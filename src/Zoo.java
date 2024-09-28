public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR_CAGES = 25;
    private int animalCount;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.animalCount = 0;
    }

    public void displayZoo() {
        System.out.println("Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Nbr Cages: " + this.NBR_CAGES);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal est déjà présent dans le zoo.");
            return false;
        }
        if (animalCount < NBR_CAGES) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("No more space in the zoo to add new animals.");
            return false;
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;
            animalCount--;
            return true;
        }
        return false;
    }

    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            return null;
        }
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].toString());
        }
    }
}
