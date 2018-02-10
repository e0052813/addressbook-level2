package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents an Address's street name
 */

public class Street {

    public static final String EXAMPLE = "Serangoon";

    private String _streetName;

    public Street(String streetName){
        _streetName = streetName;
    }
    public String getStreetName(){return _streetName;}
    public void setStreetName(String streetName){this._streetName = streetName;}

}
