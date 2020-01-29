import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class Tester {

    private Calculator check;

    @BeforeEach
    public void init(){
        check = new Calculator();
    }

    @Test
    public void emptyString() throws Exception {
        assertEquals(check.add(""),0);
    }
    @Test
    public void singleValue() throws Exception {
        assertEquals(check.add("1"), 1);
    }

    @Test
    public void twoNumberReturnSum() throws Exception {
        assertEquals(check.add("1,2"),3);
    }
    @Test
    public void twoNumbersNewLine() throws Exception {
        assertEquals(check.add("1\n2,3"),6);
    }
    @Test
    public void threeNumbersDelimiter() throws Exception {
        assertEquals(check.add("//4\n142"),3);
    }

}
