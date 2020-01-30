import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.*;

public class Tester {

    private Calculator check;

    @BeforeEach
    public void init(){
        check = new Calculator();
    }

    @Test
    public void emptyString() throws Exception {
        assertEquals(Calculator.add(""),0);
    }
    @Test
    public void singleValue() throws Exception {
        assertEquals(Calculator.add("1"), 1);
    }

    @Test
    public void twoNumberReturnSum() throws Exception {
        assertEquals(Calculator.add("1,2"),3);
    }
    @Test
    public void twoNumbersNewLine() throws Exception {
        assertEquals(Calculator.add("1\n2,3"),6);
    }
    @Test
    public void threeNumbersDelimiter() throws Exception {
        assertEquals(Calculator.add("//4\n142"),3);
    }
    @Test
    public void isNegative() throws Exception{


            assertThrows(IllegalArgumentException.class, ()-> check.add("-3 , -4"));
    }
    @Test
    public void lengthDelimiter() throws Exception{
        assertEquals(Calculator.add("//;\n1000,1;2"),3);
    }
    @Test
    public void Delimiterlength() throws Exception{
        assertEquals(Calculator.add("//***\n1***2***3"),6);
    }
}
