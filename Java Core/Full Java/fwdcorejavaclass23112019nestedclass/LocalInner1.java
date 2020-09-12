/*Local inner class-
 * A class that is created inside a method is known as local inner class. 
 * If you want to invoke the methods of local inner class, 
 * you must instantiate this class inside the method.
 * 1) Local inner class cannot be invoked from outside the method.
 * 2) Local inner class cannot access non-final local variable.
 * 
 */
 
package nested_class;

public class LocalInner1 {

    private int data = 30;//instance variable  

    void display() {
        final int x=5;
        class Local {

            void msg() {
                System.out.println(x);
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        LocalInner1 obj = new LocalInner1();
        obj.display();
    }
}
