package Creational.Builder.src;

public class CreateStudent {
    public static void main(String[] args) {
        Student student = new StudentConcreteBuilder()
                .setId(1)
                .setName("hoangtien2k3")
                .setAddress("Thanh Hoa")
                .build();

        System.out.println(student);

        System.out.println("_".repeat(100));

        Student student1 = new StudentConcreteBuilder()
                .setId(2)
                .setName("Tiền Anh Hoáng")
                .setAddress("Thanh Hoá")
                .setDateOfBirth("12/04/2003")
                .setPhoneNumber("0828007853")
                .build();

        System.out.println(student1);
        
    }
}
