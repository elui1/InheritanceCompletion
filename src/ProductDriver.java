public class ProductDriver {
    public static void main(String[] args) {
        Product p = new Product();
        p.setCode("AUR342");
        p.setDescription("Useful apparatus");
        p.setPrice(45.1);
        System.out.println(p.toString());

        Book b = new Book();
        b.setCode("OIR563");
        b.setAuthor("JK Rowling");
        b.setPages(126);
        b.setPrice(137.888);
        System.out.println(b.toString());

        Software s = new Software();
        s.setCode("NRF852");
        s.setProgrammer("abc");
        s.setPlatform("mac");
        s.setOs("X");
        s.setPrice(4532.266325489);
        System.out.println(s.toString());

    }
}
