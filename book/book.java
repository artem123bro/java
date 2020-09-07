package book;

public class book {
    private String name;
    private int str;

    public book(String n, int s) {
        name = n;
        str = s;
    }

    public book() {
        name = "Dance with the dragons";
        str = 200;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStr() {
        return str;
    }
}
