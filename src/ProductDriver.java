/**
 * Inheritance 2
 * Using the code from the previous "Inheritance completion activity #1",
 * create an override of the equals method for the superclass, and Book and Software subclasses.
 */

public class ProductDriver {
    public static void main(String[] args) {
        Product p = new Product();
        p.setCode("AUR342");
        p.setDescription("Useful apparatus");
        p.setPrice(45.1);
        System.out.println(p.toString());

        Software s = new Software();
        s.setCode("NRF852");
        s.setProgrammer("abc");
        s.setPlatform("mac");
        s.setOs("X");
        s.setPrice(4532.266325489);
        System.out.println(s.toString());

        Book b1 = new Book();
        b1.setCode("OIR563");
        b1.setAuthor("JK Rowling");
        b1.setPages(126);
        b1.setPrice(137.888);
        System.out.println(b1.toString());

        Book b2 = new Book();
        b2.setCode("OIR563");
        b2.setAuthor("JK Rowling");
        b2.setPages(126);
        b2.setPrice(137.888);
        System.out.println(b1.toString());

        System.out.println(b1.equals(b2)); // true
        System.out.println(b1 == b2); // false

    }
}
