package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return this.swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", Swimming Speed: " + this.swimmingSpeed + " km/h";
    }
}

