package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator {
    private int priority = 3;
    private String token = "^";
    public int priority() {
        return priority;
    }
    public Operand execute(Operand op1, Operand op2) {
        int x, y, power =1, i =1;
        if (op2.getValue() == 0);
        else {
            do{
                power *= op1.getValue();
                i++;
            } while (i <= op2.getValue());
        }
        Operand result = new Operand(power);

        return result;
    }
}
