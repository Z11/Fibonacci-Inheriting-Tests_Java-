/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Hash map explanation:
 * http://docs.oracle.com/javase/6/docs/api/java/util/Map.html#get(java.lang.Object)
 * http://www.java-samples.com/showtutorial.php?tutorialid=369
 * @author Alejandro
 */
import java.util.HashMap;

public class MemoizedRecursiveFibonacci extends RecursiveFibonacci implements FibonacciInterface {
  private HashMap<Integer,Integer> valueAt = new HashMap();
  
  @Override
  public int getValueAt(int indexPos) {
      if(!valueAt.containsKey(indexPos)){
          valueAt.put(indexPos, super.getValueAt(indexPos));
      }
      //System.out.println(valueAt.get(indexPos));
    return valueAt.get(indexPos);
  }
}
