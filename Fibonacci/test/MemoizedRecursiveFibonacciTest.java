/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
/**
 * @author Alejandro
 * using "fibonacci.getValue(40)" is assume already knows what object
 * type it will have to be in the tests. In other words, using the
 * object "fibonacci" is by default an object of the class thats being tested.
 * (This is because of the interface)
 */

public class MemoizedRecursiveFibonacciTest extends FibonnaciTests{

  
  public FibonacciInterface setUp(){
        return new MemoizedRecursiveFibonacci();
    }

  @Test
  public void MemRecFasterThanNormalRec() {

        double startTime, recursiveTime, memoizedRecursiveTime;

        startTime = System.nanoTime();
        new RecursiveFibonacci().getValueAt(40);
        recursiveTime = System.nanoTime() - startTime;
        System.out.println("Rec time: "+ recursiveTime);

        startTime = System.nanoTime();
        fibonacci.getValueAt(40);
        memoizedRecursiveTime = System.nanoTime() - startTime;
        System.out.println("Mem time: "+ memoizedRecursiveTime);
       
        assert(memoizedRecursiveTime * 100 < recursiveTime);
    }
}