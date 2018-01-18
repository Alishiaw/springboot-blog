package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MathController {
    @RequestMapping(path = "/add/{x}/and/{y}",method = RequestMethod.GET)
    @ResponseBody
    public String addition(@PathVariable int x, @PathVariable int y) {
        return  "" +   (x + y);
    }

    @RequestMapping(path = "/subtract/{x}/and/{y}", method = RequestMethod.GET)
    @ResponseBody
    public String subtraction(@PathVariable int x, @PathVariable int y) {
        return  "" +   (x - y);
    }

    @RequestMapping(path = "multiply/{x}/and/{y}",method = RequestMethod.GET)
    @ResponseBody
    public String multiplication(@PathVariable int x, @PathVariable int y) {
        return  "" +   (x * y);
    }

    @RequestMapping (path = "divide//{x}/and/{y}",method = RequestMethod.GET)
    @ResponseBody
    public String division (@PathVariable int x, @PathVariable int y) {
        return  "" +   (x / y);
    }

}

