package seedu.addressbook.data.person;

/**
 * Represents an Address's _blockNumber number
 */

public class Block {

    public static final String EXAMPLE = "123";

    private String _blockNumber;

    public Block(String blockNumber){
        _blockNumber = blockNumber;
    }
    public String get_blockNumber() {return _blockNumber;}
    public void set_blockNumber(String _blockNumber) {this._blockNumber = _blockNumber;}

}
