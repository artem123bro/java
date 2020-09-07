package ball;

public class Ball {
    private String color;
    private double rad;

    public Ball(String c, int r) {
        color = c;
        rad = r;
    }

    public Ball() {
        color = "Green";
        rad = 0;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public void setName(String name) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRad() {
        return rad;
    }
}