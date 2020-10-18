/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic.pointer.pkg2;

/**
 *
 * @author Admin
 */
import java.lang.Comparable;
public class GenericPointer2 {

    /**
     * @param args the command line arguments
     */
    public static <T extends Comparable<T>> T min(T... elements) {
    T min = elements[0];
    for (T element : elements) {
        if (element.compareTo(min) < 0) {
            min = element;
        }
    }
    return min;
}
    public static void main(String[] args) {
        // TODO code application logic here
       Integer [] intArray ={10,20,30,40,60,80};
       System.out.println("The minimum value is ->"+min(intArray));
    }
    
}
