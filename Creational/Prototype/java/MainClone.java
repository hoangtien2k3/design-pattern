package Creational.Prototype.java;

public class MainClone {
    public static void main(String[] args) {

        User user1 = new User("hoangtien2k3","hoangtien2k3qx1@gmail.com",20);
        System.out.println(user1);
        User user2 = user1.clone();
        System.out.println(user2);

        System.out.println("==================");
        user1.setAge(30);
        System.out.println(user1);
        System.out.println(user2);

    }
}
