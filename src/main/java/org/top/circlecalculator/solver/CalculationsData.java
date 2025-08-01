package org.top.circlecalculator.solver;

import lombok.Getter;

public class CalculationsData {
    @Getter
    private final Double radius;
    @Getter
    private final boolean isDiameter;

    public CalculationsData(Double radius, boolean isDiameter) {
        if(radius < 0){
            throw new InvalidRadiusException("radius must be greater than zero");
        }
        this.radius = radius;
        this.isDiameter = isDiameter;
    }

    private boolean isSolved = false;
    private Double perimeter;
    private Double square;

    public Double getPerimeter() {
        if(!isSolved){
            throw new NotCalculatedException();
        }
        return perimeter;
    }

    public Double getSquare() {
        if(!isSolved){
            throw new NotCalculatedException();
        }
        return square;
    }

    public void setResult(double perimeter, double square) {
        acceptSolved();
        this.perimeter = perimeter;
        this.square = square;
    }

    private void acceptSolved(){
        if (isSolved) {
            throw new AlreadyCalculatedException();
        }
        isSolved = true;
    }
}
