package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return this.swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", Swimming Depth: " + this.swimmingDepth + " meters";
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming at a depth of " + this.swimmingDepth + " meters.");
    }
}
