package Creational.Prototype.src;

public class Fish extends Animal {
    private String preferWater;

    @Override
    public Fish clone() {
        final Fish fish = new Fish();
        fish.setPreferWater(preferWater);
        cloneProperties(fish);
        return fish;
    }

    public void setPreferWater(String preferWater) {
        this.preferWater = preferWater;
    }

    public String getPreferWater() {
        return preferWater;
    }
}
