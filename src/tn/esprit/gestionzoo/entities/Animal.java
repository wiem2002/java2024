package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return this.isMammal;
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }

    public String toString() {
        return "Family: " + this.family + ", Name: " + this.name + ", Age: " + this.age + ", Is Mammal: " + this.isMammal;
    }
}


