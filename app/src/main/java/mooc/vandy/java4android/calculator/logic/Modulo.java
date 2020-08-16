package mooc.vandy.java4android.calculator.logic;

public class Modulo {
    private int argOne;
    private int argTwo;

    public Modulo(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    public String toString() {
        if(argOne == 0 || argTwo == 0) {
            return "number invalid";
        }else{
            return String.valueOf(argOne % argTwo);
        }
    }
}
