package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {

    int value;
    /**
     * construct operand from string token.
     */
    public Operand(String token) {
        if (this.check(token)){
            this.value = Integer.parseInt(token);
        }
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.value = value;
    }

    /**
     * return value of operand
     */
    public int getValue() {
        return valueOf();
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try {
            int d = Integer.parseInt(token);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public int valueOf(){
        return value;
    }
}
