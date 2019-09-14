package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class SubtractOperator extends Operator {
    private int priority = 1;
    private String token = "-";
    public int priority() {
        return priority;
    }
    public Operand execute(Operand op1, Operand op2) {
        int x, y, diff;

        diff = op1.getValue() - op2.getValue();
        Operand result = new Operand(diff);

        return result;
    }
}

