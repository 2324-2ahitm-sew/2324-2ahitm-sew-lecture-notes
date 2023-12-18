package at.htlleonding;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Wish {
    private String name;
    private BigDecimal price;

    //region constructors
    public Wish() {
    }

    public Wish(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
    //endregion

    //region getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    //endregion


    /**
     * Compares two objects of type Wish by their name
     * <p>
     * Tip: you can generate this method in IntelliJ by pressing Alt+Insert
     *
     * @param object
     * @return true if the names are equal, false otherwise
     */
    @Override
    public boolean equals(Object object) {



        return false;
    }

    @Override
    public int hashCode() {
        return -1000;
    }

    @Override
    public String toString() {
        int noOfSpaces = 27 - name.length();
        DecimalFormat df = new DecimalFormat("#,###.00 €");
        return String.format("%s ", name)
                + String.format("%" + noOfSpaces + "s", df.format(price));
    }
}
