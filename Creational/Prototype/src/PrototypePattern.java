package Creational.Prototype.src;

public class PrototypePattern {
    public static void main(String[] args) {
        final Bird bird = new Bird();
        bird.setAge(1);
        bird.setName("bird");
        bird.setMaxFlyTime(10);

        // copy
        final Animal cloneBird = bird.clone();

        final Bird cloneBird1 = bird.clone();

        System.out.println("Hash Code Object Bird: " + bird.hashCode());
        System.out.println("Hash Code Object Clone Bird: " + cloneBird.hashCode());

        System.out.println("Bird: " + bird.getMaxFlyTime() + " -> " + bird.getName() + " -> " + bird.getAge());
        System.out.println("Bird1: " + cloneBird1.getMaxFlyTime() + " -> " + cloneBird1.getName() + " -> " + cloneBird1.getAge());


        final Fish fish = new Fish();
        fish.setAge(3);
        fish.setName("fish");
        fish.setPreferWater("sea");
        final Animal cloneFish = fish.clone();

    }
}
