public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public int nbrCages;

    // Constructeur
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[nbrCages] ;  // Le zoo peut contenir jusqu'à 25 animaux

    }

    public void displayZoo() {
        System.out.println("----- Zoo Information -----");
        System.out.println("Zoo Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of Cages: " + this.nbrCages);
    }

    public String toString() {
        return "Zoo Name: " + this.name + ", City: " + this.city + ", Number of Cages: " + this.nbrCages;
    }
}
