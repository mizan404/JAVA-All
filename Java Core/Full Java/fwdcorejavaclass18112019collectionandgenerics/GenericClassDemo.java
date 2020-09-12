/* the type parameter section of a generic class can have 
 * one or more type parameters separated by commas. 
 * These classes are known as parameterized classes or parameterized 
 * types because they accept one or more parameters.
 */
package generics_ex;

public class GenericClassDemo<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericClassDemo<Integer> integerBox = new GenericClassDemo();
        GenericClassDemo<String> stringBox = new GenericClassDemo();

        integerBox.add(new Integer(10));
        stringBox.add("Hello World");
        float ff=20000f;

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
        System.out.printf("Total is: $%,.2f%n", ff);
        System.out.printf("Total: %-30.2f: ", ff);
        System.out.println(ff);
    }
}
