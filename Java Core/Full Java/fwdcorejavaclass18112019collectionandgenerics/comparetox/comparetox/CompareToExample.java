package collectionexample.comparetox;
/*The method compareTo() is used for comparing two strings lexicographically. 
 * Each character of both the strings is converted into a 
 * Unicode value for comparison. If both the strings are equal 
 * then this method returns 0 else it returns positive or negative value. 
 * The result is positive if the first string is lexicographically 
 * greater than the second string else the result would be negative.*/

public class CompareToExample {
    public static void main(String args[]) {
       String str1 = "This is a sirng";
       String str2 = "This is a sirng";
       String str3 = "This is another sirng";

       int var1 = str1.compareTo( str2 );
       System.out.println("str1 & str2 comparison: "+var1);

       int var2 = str1.compareTo( str3 );
       System.out.println("str1 & str3 comparison: "+var2);

       int var3 = str2.compareTo("compareTo method example");
       System.out.println("str2 & string argument comparison: "+var3);
   }
}
