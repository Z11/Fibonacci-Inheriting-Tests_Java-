/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Alejandro
 */

public class RecursiveFibonacci implements FibonacciInterface {
    public int getValueAt(int indexPos) {
        return indexPos > 1 ? getValueAt(indexPos - 1) + getValueAt(indexPos - 2) : 1;
    }
}
