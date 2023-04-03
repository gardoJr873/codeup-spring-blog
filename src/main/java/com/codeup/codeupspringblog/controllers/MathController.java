package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String addTwoNumbers(@PathVariable int number, @PathVariable int number2) {
        return number + " plus " + number2 + " is " + (number + number2) + " !";
    }
    @RequestMapping(path = "/subtract/{number}/from/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtractTwoNumbers(@PathVariable int number, @PathVariable int number2) {
        return number + " minus " + number2 + " is " + (number2 - number) + "!";
    }
    @RequestMapping(path = "/multiply/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiplyTwoNumbers(@PathVariable int number, @PathVariable int number2) {
        return number + " multiplied " + number2 + " is " + (number * number2) + "!";
    }
    @RequestMapping(path = "/divide/{number}/by/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divideTwoNumbers(@PathVariable int number, @PathVariable int number2) {
        return number + " divided by " + number2 + " is " + (number/number2) + "!";
    }
}

