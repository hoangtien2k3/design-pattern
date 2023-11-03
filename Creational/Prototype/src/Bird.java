package Creational.Prototype.src;

public class Bird extends Animal {
    private int maxFlyTime;

    @Override
    public Bird clone() {
        final Bird bird = new Bird();
        bird.setMaxFlyTime(maxFlyTime);
        cloneProperties(bird);
        return bird;
    }

    public void setMaxFlyTime(int maxFlyTime) {
        this.maxFlyTime = maxFlyTime;
    }

    public int getMaxFlyTime() {
        return maxFlyTime;
    }
}
