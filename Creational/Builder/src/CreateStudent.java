package Creational.Builder.src;

public class CreateStudent {
    public static void main(String[] args) {
        Student student = new StudentConcreteBuilder()
                .setId(1)
                .setName("hoangtien2k3")
                .setAddress("thanh hoa")
                .build();

        System.out.println(student);
        
    }
}
