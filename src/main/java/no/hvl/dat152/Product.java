package no.hvl.dat152;

public class Product {
    private String name;
    private Description description[];
    private float price;
    private String imgFile;

    public Product() {
        name = "";
        description = new Description[2];
        price = 0;
        imgFile = "";
    }

    public Product(String name, Description[] description, float price, String imgFile) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgFile = imgFile;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public Description[] getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(Description[] description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the imgFile
     */
    public String getImgFile() {
        return imgFile;
    }

    /**
     * @param imgFile the imgFile to set
     */
    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }
}