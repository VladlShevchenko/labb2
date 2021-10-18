import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class Task7Test {
    Task7 task7;
    String[] arr = {"1", "2", "2"};

    @BeforeEach
    void setUp() {
        task7 = new Task7();
    }

    @Test
    void absoluteValue() {
        int expected = task7.absoluteValue(arr);
        int actual = 0;
        assertEquals(expected,actual);
    }
}