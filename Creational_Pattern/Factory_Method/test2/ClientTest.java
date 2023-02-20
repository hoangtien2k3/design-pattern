package Creational_Pattern.Factory_Method.test2;

public class ClientTest {
    public static void main(String[] args) {
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        System.out.println(hardCandy.getCandyName());

        // casting về kiểu lớp con.
        MintyCandy mintyCandy = (MintyCandy) CandyFactory.getCandy(CandyType.MINTY);
        System.out.println(mintyCandy.getCandyName());

        Candy none = CandyFactory.getCandy(null);
        System.out.println(none);
    }
}
