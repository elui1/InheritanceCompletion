public class Book extends Product {
    private String author;
    private int pages;

    public Book() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return  "Author:               " + author + "\n" +
                "Pages:                " + pages + "\n" +
                "Price:                " + this.getFormattedPrice() + "\n";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (this.getClass() != other.getClass()) {
            return false;
        }

        if (this.getCode() != ((Book)other).getCode()) {
            return false;
        }

        if (this.getDescription() != ((Book)other).getDescription()) {
            return false;
        }

        if (this.getPrice() != ((Book)other).getPrice()) {
            return false;
        }

        if (this.author != ((Book)other).author) {
            return false;
        }

        if (this.pages != ((Book)other).pages) {
            return false;
        }

        return true;
    }

}
