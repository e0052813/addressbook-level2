package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    @Test
    public void isAnyNull() throws Exception {

        // no items
        assertHasNull();

        // one item
        assertHasNull("");
        assertHasNull("1234");
        assertHasNull("abcd");

        // multiple items
        assertHasNull(1, 2, 3);
        assertHasNull("abc", "def", "ghi");
        assertHasNull(1, "abc");

        // one null item
        assertNoNull(1, null);
        assertNoNull("abc", null);
        assertNoNull(1, "abc", null);

        // multiple null items
        assertNoNull(null, null);
        assertNoNull(null, null, null);
        assertNoNull(1, 2, null, null);
        assertNoNull("abc", "def", null, null);
        assertNoNull(null, 1, null);
        assertNoNull("abc", null, "abc", null);
    }

    private void assertNoNull(Object... items) {
        assertTrue(Utils.isAnyNull(items));
    }

    private void assertHasNull(Object... items) {
        assertFalse(Utils.isAnyNull(items));
    }
}
