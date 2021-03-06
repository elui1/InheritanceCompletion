import java.text.NumberFormat;

public abstract class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    public String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat pr = NumberFormat.getCurrencyInstance();
        return pr.format(price);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (this.getClass() != other.getClass()) {
            return false;
        }

        if (this.code != ((Product)other).code) {
            return false;
        }

        if (this.description != ((Product)other).description) {
            return false;
        }

        if (this.price != ((Product)other).price) {
            return false;
        }

        return true;
    }
}
