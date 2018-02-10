package seedu.addressbook.data.person;

/**
 * Represents an Address's unit number
 */

public class Unit {

    public static final String EXAMPLE = "05-06";

    private String _unitNumber;

    public Unit(String unitNumber){
        _unitNumber = unitNumber;
    }
    public String get_unitNumber(){return _unitNumber;}
    public void set_unitNumber(String _unitNumber){this._unitNumber = _unitNumber;}

}
