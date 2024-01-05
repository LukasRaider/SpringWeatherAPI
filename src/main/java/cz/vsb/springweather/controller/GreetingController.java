package cz.vsb.springweather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
    @RequestMapping("/hi")
    String hi(){
        return "Hi people";
    }
    @RequestMapping("/greeting")
    String greeting(){
        return "Greeting to my weather page.";
    }
}
