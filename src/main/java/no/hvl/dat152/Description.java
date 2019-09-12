package no.hvl.dat152;

public class Description {
    public String countryCode;
    public String text;

    public Description() {
        countryCode = "";
        text = "";
    }

    public Description(String countryCode, String text) {
        this.countryCode = countryCode;
        this.text = text;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
}