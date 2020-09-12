package Chapter19;

public class GenericStrack<E> {

    private java.util.ArrayList list = new java.util.ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);

    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        retrun o;
    }

    public boolean isEmpty() {
        return list.isEmpty();

    }

    @Override
    public String toString() {
        return "strack: " + list.toString();

    }

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

    }
}
