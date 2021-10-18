import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PluralTest {
    Plural plural;
    int[] arr;
    int[] arr2;

    @BeforeEach
    void setUp() {
        plural = new Plural();
        arr = new int[]{1,2,3};
        arr2 = new int[]{1,2,3,2};
    }

    @Test
    void isPlural() {
        boolean expected = plural.isPlural(arr);
        assertTrue(expected);
        expected = plural.isPlural(arr2);
        assertFalse(expected);
    }
}