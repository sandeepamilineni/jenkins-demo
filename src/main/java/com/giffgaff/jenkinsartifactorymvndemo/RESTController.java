package com.giffgaff.jenkinsartifactorymvndemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
    @GetMapping("/helo")
    public String heloworld() {
        return "Jenkins demo";
    }
}
