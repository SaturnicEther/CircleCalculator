package org.top.circlecalculator.api.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.top.circlecalculator.api.message.ErrorMessage;

@RestController
public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    public ErrorMessage handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        Object message = request.getAttribute(RequestDispatcher.ERROR_MESSAGE);
        return new ErrorMessage(status.toString(), message.toString());
    }
}