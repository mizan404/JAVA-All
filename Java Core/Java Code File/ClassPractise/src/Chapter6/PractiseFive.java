package Chapter6;

public class PractiseFive {

    double balance = 5000.0;

    public static void main(String[] args) {
        PractiseFive m = new PractiseFive();
        boolean rs = m.checkBalance(4500.0);
        System.out.println("Result: " + rs);
    }

    public boolean checkBalance(double withdrew) {
        balance = balance - withdrew;
        if (balance>= 6000.0) {
            return true;
        }
        return false;
    }
}
