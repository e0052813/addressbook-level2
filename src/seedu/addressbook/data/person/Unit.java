package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents an Address's unit number
 */

public class Unit {

    public static final String EXAMPLE = "05-06";
    public static final String MESSAGE_UNIT_CONSTRAINTS =
            "Address Unit should contains 2 digits, followed by a - and then 2 or 3 digits";
    public static final String UNIT_VALIDATION_REGEX = "[\\d{2}-\\d{2,3}]";

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given unit number.
     *
     * @throws IllegalValueException if given unit string is invalid.
     */
    public Unit(String unit, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedUnit = unit.trim();
        if (!isValidUnit(trimmedUnit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.value = trimmedUnit;
    }

    /**
     * Returns true if the given string is a valid address unit number.
     */
    public static boolean isValidUnit(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }

    public boolean isPrivate() {return isPrivate;}

}
