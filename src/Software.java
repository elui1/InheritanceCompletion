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

    public boolean equals(Object other) {
        if (!super.equals(other)) {
            return false;
        }

        if (this.programmer != ((Software)other).programmer) {
            return false;
        }

        if (this.platform != ((Software)other).platform) {
            return false;
        }

        if (this.os != ((Software)other).os) {
            return false;
        }

        return true;
    }
}
