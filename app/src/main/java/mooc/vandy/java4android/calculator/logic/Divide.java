package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    private int argOne;
    private int argTwo;

    public Divide(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    public String toString() {
        if (argOne != 0 || argTwo != 0) {
            return String.valueOf(argOne / argTwo) + " R:" + String.valueOf(argOne % argTwo);
        } else {
            return "numebr invalid";
        }
    }
}
