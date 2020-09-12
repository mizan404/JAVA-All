package Chapter19;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5}; 
        String[] strings={"London", "Paris","New York", "Austin"};
        GenericMethodDemo.<Integer>print(integer);
        GenericMethodDemo.<String>print(string);
        
    }
    public static <E> void print(E[] list){
    for (int i =0; i<list.length; i++)
            System.out.println();
    }
}
