package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {
    IntStack stack;
    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Before
    public void constructStackTestObject() {
        stack = new IntStack();
    }

}
