package com.praneeth.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomMessage {
    public String getWelcomeMessage() {
        return "Welcome to the SpringBoot Application!";
    }
}
