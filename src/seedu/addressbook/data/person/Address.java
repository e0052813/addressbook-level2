package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses to be in this format <Block, StreetName, Unit, PostalCode>";
    public static final String ADDRESS_VALIDATION_REGEX = "[\\d{3}],[\\p{Alpha}]+,[\\d{2}]-[\\d{2,3}],[\\d{6}]";

    public static final int BLOCK_INDEX = 0;
    public static final int STREETNAME_INDEX = 1;
    public static final int UNIT_INDEX = 2;
    public static final int POSTALCODE_INDEX = 3;

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = trimmedAddress;
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    /**
     * Splits the trimmedAddress into BLOCK, StreetName, Unit and PostalCode.
     * @param trimmedAddress
     * @return
     */

    public String[] splitAddress(String trimmedAddress) {

        String[] addressComponents = trimmedAddress.split(", ");

        return addressComponents;
    }

    /**
     * Extracts the Block StreetName, Unit and PostalCode from addressComponents
     * @param addressComponents
     */
    public void extractAddress(String[] addressComponents){

        block = new Block(addressComponents[BLOCK_INDEX]);
        street = new Street(addressComponents[STREETNAME_INDEX]);
        unit = new Unit(addressComponents[UNIT_INDEX]);
        postalCode = new PostalCode(addressComponents[POSTALCODE_INDEX]);

        return;
    }
}
