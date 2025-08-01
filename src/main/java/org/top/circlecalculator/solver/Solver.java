package org.top.circlecalculator.solver;

import org.springframework.stereotype.Service;

@Service
public class Solver {
    public void solve(CalculationsData calc){
        Double radius = calc.getRadius();
        if (calc.isDiameter()) {
            radius /= 2;
        }
        double p = 2 * Math.PI * radius;
        double s = Math.PI * radius * radius;
        calc.setResult(p, s);
    }
}
