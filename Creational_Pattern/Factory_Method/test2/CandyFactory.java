package Creational_Pattern.Factory_Method.test2;

public class CandyFactory {
    public static Candy getCandy(CandyType candyType) {
        if (candyType == candyType.HARD) {
            return new HardCandy();
        } else if(candyType == CandyType.MINTY) {
            return new MintyCandy();
        }
        return null;
    }
}
