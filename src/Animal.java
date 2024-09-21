
public class Animal {
    public String family;
    public String name ;
    public int age;
    public boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("----- Animal Information -----");
        System.out.println("Family: " + this.family);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Is Mammal: " + this.isMammal);
    }

    public String toString() {
        return "Family: " + this.family + ", Name: " + this.name + ", Age: " + this.age + ", Is Mammal: " + this.isMammal;
    }


}
