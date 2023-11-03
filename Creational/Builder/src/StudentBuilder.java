package Creational.Builder.src;

public interface StudentBuilder {
    StudentBuilder setId(int id);
    StudentBuilder setName(String name);
    StudentBuilder setAddress(String address);
    StudentBuilder setDateOfBirth(String dateOfBirth);
    StudentBuilder setPhoneNumber(String phoneNumber);
    Student build();
}
