package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents an Address's block number
 */

public class Block {

    public static final String EXAMPLE = "123";
    public static final String MESSAGE_BLOCK_CONSTRAINTS =
            "Address Block should contains 3 numbers";
    public static final String BLOCK_VALIDATION_REGEX = "[\\d{3}]";

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given phone number.
     *
     * @throws IllegalValueException if given block string is invalid.
     */
    public Block(String block, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedBlock = block.trim();
        if (!isValidBlock(trimmedBlock)) {
            throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
        }
        this.value = trimmedBlock;
    }

    /**
     * Returns true if the given string is a valid address block number.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(BLOCK_VALIDATION_REGEX);
    }

    public boolean isPrivate() {return isPrivate;}

}
