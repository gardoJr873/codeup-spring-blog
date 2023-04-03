package com.codeup.codeupspringblog.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//we will be  using annotations fairly extensively to configure our application, as opposed to the more traditional and verbose format of XML-based configuration.
@Controller
class HelloController {
    @GetMapping("/join")
    public String showJoinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String joinCohort(@RequestParam(name= "cohort") String cohort, Model model) {
        model.addText("cohort");
        return "join";
    }
}

//@Controller defines that our class is a controller
//@GetMapping defines a method that should be invoked when a GET request is received for the specified URI
//@ResponseBody tell spring that whatever is returned from this method should be the body of our response

//PathVariables
//Spring allows us to use path variables that are a part of the URI of a request

