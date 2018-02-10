package seedu.addressbook.data.person;

/**
 * Represents an Address's postal code.
 */

public class PostalCode {

    public static final String EXAMPLE = "550306";

    private String _postalCode;

    public PostalCode(String postalCode){
        _postalCode = postalCode;
    }
    public String get_postalCode(){return _postalCode;}
    public void set_postalCode(String _postalCode){this._postalCode = _postalCode;}

}
