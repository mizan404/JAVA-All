/* Types of Nested classes
 * There are two types of nested classes non-static and 
 * static nested classes.
 * The non-static nested classes are also known as inner classes.
 *   1.non-static nested class(inner class)
 *         a)Member inner class
 *         b)Anonymous inner class
 *         c)Local inner class
 *   2.static nested class
 * Member Inner Class-A class created within class and outside method.
 * Example of member inner class that is invoked inside a class
 */
package nested_class;

public class TestMemberOuter1 {

    private int data = 30;

    class Inner {

        void msg() {
            System.out.println("data is " + data);
            //display();
        }
    }

    void display() {
        Inner in = new Inner();
        in.msg();
    }

    public static void main(String args[]) {
        TestMemberOuter1 obj = new TestMemberOuter1();
        obj.display();
    }
}
