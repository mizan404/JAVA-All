/* static nested class
 * A static class that is created inside a class is known as 
 * static nested class. It cannot access the non-static members.
 * It can access static data members of outer class including private.
 * static nested class cannot access non-static (instance) data member or method.
 */
package nested_class;

public class TestOuter1 {

    private static int data = 30;

    static class Inner {

        void msg() {
            System.out.println("data is " + data);
        }

        static void msg2() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        Inner obj = new Inner();
        obj.msg();
        Inner.msg2();//no need to create the instance of static nested class  
    }
}
