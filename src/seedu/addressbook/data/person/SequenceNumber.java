package seedu.addressbook.data.person;

public class SequenceNumber {

    private int value;
    private static int nextSequenceNumber=1;

public static int getNumberSequence(){
    return nextSequenceNumber;
}

}
