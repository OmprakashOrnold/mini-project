package com.dsoft.ms.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-SERVICE")
public interface WelcomeClient {

    @GetMapping("/welcome")
     String invokeWelcomeMsg();

}
