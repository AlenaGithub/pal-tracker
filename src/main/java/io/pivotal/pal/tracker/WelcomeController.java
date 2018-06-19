package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String welcomeMessage = "default";

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return welcomeMessage;
    }
}