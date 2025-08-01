package org.top.circlecalculator.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.top.circlecalculator.api.message.ErrorMessage;
import org.top.circlecalculator.api.message.RadiusMessage;
import org.top.circlecalculator.api.message.ResultMessage;
import org.top.circlecalculator.solver.CalculationsData;
import org.top.circlecalculator.solver.InvalidRadiusException;
import org.top.circlecalculator.solver.Solver;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class SolverController {
    private final Solver solver;

    @PostMapping("solve")
    public ResultMessage solve(@RequestBody RadiusMessage radius) {
        CalculationsData data = new CalculationsData(radius.getRadius(), radius.getIsDiameter());
        solver.solve(data);
        return new ResultMessage(data.getPerimeter(), data.getSquare(), radius);
    }

    @ExceptionHandler({InvalidRadiusException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage badRequestError(final InvalidRadiusException ex) {
        return new ErrorMessage(ex.getClass().getSimpleName(), ex.getMessage());
    }
}
