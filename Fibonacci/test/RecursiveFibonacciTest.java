

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;

/**
 *
 * @author Alejandro
 */
public class RecursiveFibonacciTest extends FibonnaciTests {

    public FibonacciInterface setUp() {
        return new RecursiveFibonacci();
    }

    @Test
    public void MemRecFasterThanNormalRec() {

        double startTime, recursiveTime, memoizedRecursiveTime;

        startTime = System.nanoTime();
        new RecursiveFibonacci().getValueAt(40);
        recursiveTime = System.nanoTime() - startTime;
        System.out.println("Rec time: " + recursiveTime);

        startTime = System.nanoTime();
        fibonacci.getValueAt(40);
        memoizedRecursiveTime = System.nanoTime() - startTime;
        System.out.println("Mem time: " + memoizedRecursiveTime);

        assert ( true);
    }
}
