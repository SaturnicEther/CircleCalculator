package org.top.circlecalculator.solver;

public class NotCalculatedException extends RuntimeException {
    public NotCalculatedException() {
        super("Calculation was not done");
    }
}
