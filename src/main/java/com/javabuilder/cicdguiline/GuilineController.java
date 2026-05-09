package com.javabuilder.cicdguiline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuilineController {

    @GetMapping("/guiline")
    public String guiline() {
        return "Continues Integration";
    }

    @GetMapping("/index")
    public String home() {
        return "Welcome to BackendService";
    }

}
