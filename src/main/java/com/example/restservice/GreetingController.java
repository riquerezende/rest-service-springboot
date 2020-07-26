package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//HTTP requests are handled by a controller
//These components are identified by the @RestController annotation
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //Handles GET requests for /greeting by returning a new instance of the Greeting class
    //@GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method
    //@RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
