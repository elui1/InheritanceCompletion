public class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software() {

    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return  "Programmer:               " + programmer + "\n" +
                "Platform:                 " + platform + "\n" +
                "Os:                       " + os + "\n" +
                "Price:                    " + this.getFormattedPrice() + "\n";
    }
}
