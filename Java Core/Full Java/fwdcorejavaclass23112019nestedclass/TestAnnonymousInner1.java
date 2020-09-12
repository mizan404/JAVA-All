/*Annonymous Inner Class-A class created for implementing interface 
 * or extending class. Its name is decided by the java compiler.
 * annonymous inner class by interface
 */
package nested_class;

interface Eatable {

    void eat();
}

public class TestAnnonymousInner1 {
    

    public static void main(String args[]) {

        new Eatable() {

            public void eat() {
                System.out.println("nice fruits");
            }
        }.eat();
        
    }
}
