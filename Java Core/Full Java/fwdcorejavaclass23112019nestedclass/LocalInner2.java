/*
 * accessing non-final local variable in local inner class
 * Local inner class cannot access non-final local variable.
 */
package nested_class;

public class LocalInner2 {

    private int data = 30;//instance variable  

    void display() {
        // a local class can only access local variables that are declared final. 
        //However, starting in Java SE 8, a local class can access local variables and parameters of the enclosing block that are final or effectively final. A variable or parameter whose value is never changed after it is initialized is effectively final.
        final int value = 50;//local variable must be final  
        class Local {

            void msg() {
                System.out.println(value);
            }//C.T.Error  
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        LocalInner2 obj = new LocalInner2();
        obj.display();
    }
}
