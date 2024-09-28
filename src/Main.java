import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("cats", "Lion", 20, true);
        Animal giraffe = new Animal("mammals", "Giraffe", 15, true);
        Animal tiger = new Animal("cats", "Tiger", 5, true);


        Zoo myZoo = new Zoo("Safari Zoo", "Tunis");

        System.out.println("Ajout Lion: " + myZoo.addAnimal(lion));
        System.out.println("Ajout Giraffe: " + myZoo.addAnimal(giraffe));
        System.out.println("Ajout Lion (encore): " + myZoo.addAnimal(lion)); // Should not add
        System.out.println("Ajout Tiger: " + myZoo.addAnimal(tiger));


        myZoo.displayAnimals();


        int giraffeIndex = myZoo.searchAnimal(giraffe);
        System.out.println("Recherche de giraffe: " + giraffeIndex);


        Animal anotherLion = new Animal("cats", "Lion", 20, true);
        int anotherLionIndex = myZoo.searchAnimal(anotherLion);
        System.out.println("Recherche d'un autre Lion identique: " + anotherLionIndex);


        Zoo myZoo1 = new Zoo("Safari Zoo", "Tunis");
        Zoo myZoo2 = new Zoo("Wildlife Park", "Sousse");

        myZoo1.addAnimal(new Animal("Félins", "Lion", 5, true));
        myZoo1.addAnimal(new Animal("Ruminants", "Girafe", 7, true));
        myZoo1.addAnimal(new Animal("Oiseaux", "Aigle", 6, true));

        myZoo2.addAnimal(new Animal("Cétacés", "Dauphin", 4, true));
        myZoo2.addAnimal(new Animal("Félins", "Tigre", 6, true));
        myZoo2.addAnimal(new Animal("Oiseaux", "Aigle", 3, true));
        myZoo2.addAnimal(new Animal("Félins", "Lion", 2, true));

        Zoo largerZoo = Zoo.comparerZoo(myZoo1, myZoo2);
        if (largerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est: " + largerZoo);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }


        boolean removedLion = myZoo.removeAnimal(lion);
        System.out.println("Suppression du Lion: " + removedLion);
    }
}
