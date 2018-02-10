package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents an Address's street number
 */

public class Street {

    public static final String EXAMPLE = "23";
    public static final String MESSAGE_STREET_CONSTRAINTS =
            "Address Street Number should contains 2 numbers";
    public static final String STREET_VALIDATION_REGEX = "[\\d{2}]";

    public final String streetNumber;
    private boolean isPrivate;

    /**
     * Validates given street number.
     *
     * @throws IllegalValueException if given street string is invalid.
     */
    public Street(String street, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedStreet = street.trim();
        if (!isValidStreet(trimmedStreet)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        this.streetNumber = trimmedStreet;
    }

    /**
     * Returns true if the given string is a valid address street number.
     */
    public static boolean isValidStreet(String test) {
        return test.matches(STREET_VALIDATION_REGEX);
    }

    public boolean isPrivate() {return isPrivate;}

}
