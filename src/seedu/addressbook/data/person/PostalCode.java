package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents an Address's postal code.
 */

public class PostalCode {

    public static final String EXAMPLE = "123";
    public static final String MESSAGE_POSTALCODE_CONSTRAINTS =
            "Address's postal code should contains 6 numbers";
    public static final String POSTALCODE_VALIDATION_REGEX = "[\\d{6}]";

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given postal code.
     *
     * @throws IllegalValueException if given block string is invalid.
     */
    public PostalCode(String postalCode, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedPostalCode =  postalCode.trim();
        if (!isValidBlock(trimmedPostalCode)) {
            throw new IllegalValueException(MESSAGE_POSTALCODE_CONSTRAINTS);
        }
        this.value = trimmedPostalCode;
    }

    /**
     * Returns true if the given string is a valid address block number.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(POSTALCODE_VALIDATION_REGEX);
    }

    public boolean isPrivate() {return isPrivate;}

}
