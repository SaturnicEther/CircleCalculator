package org.top.circlecalculator.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.top.circlecalculator.api.message.StringMessage;

@RestController
@RequestMapping("api")
public class RootController {
    @GetMapping("")
    public StringMessage root(){return new StringMessage("server is running");}

    @GetMapping("ping")
    public StringMessage ping(){return new StringMessage("pong");}
}
