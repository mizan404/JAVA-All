/*
 * There are given some points that should be remembered 
 * by the java programmer.
 * Nested interface must be public 
 *      if it is declared inside the interface 
 *      but it can have any access modifier if declared within the class.
 * Nested interfaces are declared static implicitely.
 */

package nested_class;

public interface Displayable {

    void show();

    interface Message {

        void msg();
    }
}
