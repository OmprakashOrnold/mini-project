package com.dsoft.ms.controller;


import com.dsoft.ms.client.WelcomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    private WelcomeClient welcomeClient;

    @GetMapping("/greet")
    public String greet(){
        String welcomeMsg = welcomeClient.invokeWelcomeMsg();
        String greetMsg = "Good Morning, ";
        return greetMsg.concat(welcomeMsg);
    }

    //
    @GetMapping("/name")
    public String name() {

        return "omprakash";
    }

}
