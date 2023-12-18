package at.htlleonding;

import java.time.LocalDate;
import java.util.Objects;

public class Person {



    //region constructors

    //endregion

    //region getter and setter

    //endregion


    @Override
    public boolean equals(Object object) {


        return false;
    }

    @Override
    public int hashCode() {
        return -1000;
    }

    /**
     * Adds a wish to the list of wishes. The wish is only added if it is not already in the list.
     *
     * @param wish to be added
     * @return true if wish was added, false if wish was already in list
     */
    public boolean addWish(Wish wish) {



        return false;
    }

    /**
     * Removes a wish from the list of wishes
     *
     * Tip 1: Use the equals method of the Wish class
     * Tip 2: Remove the wish by moving the last wish in the list to the position of the wish to be removed
     *
     * @param wish to be removed
     * @return true if wish was removed, false if wish was not in list
     */
    public boolean removeWish(Wish wish) {

        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
