

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Abstract vs. Interface:
 * http://mindprod.com/jgloss/interfacevsabstract.html
 * http://codeofdoom.com/wordpress/2009/02/12/learn-this-when-to-use-an-abstract-class-and-an-interface/comment-page-1/#comments
 * http://www.javacoffeebreak.com/faq/faq0084.html
 *
 * Java does not support multiple inheritance:
 * http://javapapers.com/core-java/why-multiple-inheritance-is-not-supported-in-java/
 * http://stackoverflow.com/questions/5003285/java-multiple-inheritance
 *
 * abstract classes vs. regular class:
 * http://stackoverflow.com/questions/3182440/benefits-of-using-an-abstract-classes-vs-regular-class
 * @author Alejandro
 */


public abstract class FibonnaciTests {

    abstract FibonacciInterface setUp();
    FibonacciInterface fibonacci;

    @Before
    public void setUpObject() throws Exception {
        fibonacci =  setUp();
    }

    @Test
    public void BusterCanary() {
        assert (true);
    }

    @Test
    public void PositionNegativeOne() {
        assertEquals(1, fibonacci.getValueAt(-1));
    }

    @Test
    public void PositionZero() {
        assertEquals(1, fibonacci.getValueAt(0));
    }

    @Test
    public void PositionOne() {
        assertEquals(1, fibonacci.getValueAt(1));
    }

    @Test
    public void PositionTwo() {
        assertEquals(2, fibonacci.getValueAt(2));
    }

    @Test
    public void PositionThree() {
        assertEquals(3, fibonacci.getValueAt(3));
    }

    @Test
    public void PositionTen() {
        assertEquals(89, fibonacci.getValueAt(10));
    }

    @Test
    public void PositionTwenty() {
        assertEquals(10946, fibonacci.getValueAt(20));
    }
}
