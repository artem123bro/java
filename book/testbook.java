package book;

public class testbook {
    public static void main(String[] args) {
        book b1 = new book("Holy Bible", 780);
        book b2 = new book("Alphabet", 137);
        book b3 = new book("Fable fire", 345);

        System.out.println(b3.getName() + " has " + b3.getStr() + " pages.");
    }
}
