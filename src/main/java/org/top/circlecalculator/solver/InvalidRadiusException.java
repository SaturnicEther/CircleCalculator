package org.top.circlecalculator.solver;

public class InvalidRadiusException extends RuntimeException {
    public InvalidRadiusException(String message) {
        super("radius is invalid: " + message);
    }
}
