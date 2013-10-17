/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * auto indent: 
 * control + shift + F
 * Code Coverage instructions:
 * http://wiki.netbeans.org/TutorialCodeCoveragePlugin
 * @author Alejandro
 */

public class iterativeFibonacci  implements FibonacciInterface{

    public int getValueAt(int indexPos) {
        int currentValue = 1, previousValue = 1;
        for (int currentPosition = 2; currentPosition <= indexPos; ++currentPosition) {
            currentValue += previousValue;
            previousValue = currentValue - previousValue;
        }
        return currentValue;
    }
}
