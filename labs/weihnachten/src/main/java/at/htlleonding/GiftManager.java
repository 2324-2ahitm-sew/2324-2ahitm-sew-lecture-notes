package at.htlleonding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GiftManager {



    public GiftManager() {
    }

    public boolean addPerson(Person p) {


        return false;
    }

    public Person[] getPersons() {

        return null;
    }

    /**
     * Imports all CSV files from the directory specified in the field directoryPath
     */
    public void importCsvFiles() {

    }

    public void printGiftList() {
        DecimalFormat df = new DecimalFormat("Total:            #,###.00 €");
        BigDecimal total = BigDecimal.ZERO;

        // ... your code here


        System.out.println(df.format(total));
    }
}