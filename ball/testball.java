package ball;

public class testball {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 2);
        Ball b2 = new Ball("Black", 7);
        Ball b3 = new Ball("White", 6);
        b3.setRad(1);
        System.out.println(b2.getColor() + " ball is " + b2.getRad() + " inches");
    }
}