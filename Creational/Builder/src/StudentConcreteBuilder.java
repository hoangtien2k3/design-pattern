package Creational.Builder.src;

public class StudentConcreteBuilder implements StudentBuilder {
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;
    private String phoneNumber;

    @Override
    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public StudentBuilder setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    @Override
    public StudentBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public Student build() {
        return new Student(id, name, address, dateOfBirth, phoneNumber);
    }
}
