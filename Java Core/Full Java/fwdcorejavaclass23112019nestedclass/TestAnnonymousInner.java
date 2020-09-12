/*Annonymous Inner Class-A class created for implementing interface 
 * or extending class. Its name is decided by the java compiler.
 * annonymous inner class by abstract class
 */
package nested_class;

abstract class Person {

    abstract void eat();

    void sum() {
    }
}

public class TestAnnonymousInner {

    public static void main(String args[]) {
        new Person() {

            @Override
            void eat() {
                System.out.println("nice fruits");
            }
        }.eat();
    }
}
