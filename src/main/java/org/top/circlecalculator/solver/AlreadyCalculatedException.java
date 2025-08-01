package org.top.circlecalculator.solver;

public class AlreadyCalculatedException extends RuntimeException {
    public AlreadyCalculatedException() {
        super("calculations were already done");
    }
}
