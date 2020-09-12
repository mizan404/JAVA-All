package nested_class;

class TestNestedInterface implements Displayable.Message {

    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]) {
        Displayable.Message message = new TestNestedInterface();//upcasting here  
        message.msg();
    }
}
