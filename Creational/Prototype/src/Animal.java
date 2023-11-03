package Creational.Prototype.src;

public class Animal implements Cloneable {
    private String name;
    private int age;

    @Override
    public Animal clone() {
        final Animal animal = new Animal();
        cloneProperties(animal);
        return animal;
    }

    protected void cloneProperties(Animal animal) {
        animal.setName(name);
        animal.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
