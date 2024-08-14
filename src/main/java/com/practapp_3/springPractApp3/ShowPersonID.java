package com.practapp_3.springPractApp3;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class ShowPersonID{

    public String sayHello () {
        return "Hi this is some code here ";
        }

}