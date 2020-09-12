package Chapter10;

public class TestPrimitives {

    int xyz = 100;
    Double dxy = new Double(20.0);
    String str2 = String.valueOf(dxy);
    Float fxy1 = new Float("25");
    Float fxy2 = new Float(20d);
    Float fxy3 = new Float(25.5f);
    String str3 = String.valueOf(fxy3);
    static Integer x = new Integer("1000");
    static int y = x;//y is not object or instance
    static int p = 15;      
    static Integer q = p;
    Integer a = 5000;
    int b = a;
    String s1 = "10";
    int x1 = Integer.parseInt(s1);
    long x2 = Long.parseLong(s1);
    float x3 = Float.parseFloat(s1);
    double x4 = Double.parseDouble(s1);
    byte x5 = Byte.parseByte(s1);
    short x6 = Short.parseShort(s1);
    String s2 = "true";
    boolean x7 = Boolean.parseBoolean(s2);


    public static void main(String[] args) {
        TestPrimitives tp = new TestPrimitives();
        System.out.println(" " + tp.s1);
        System.out.println(""+ q);
    }

}
