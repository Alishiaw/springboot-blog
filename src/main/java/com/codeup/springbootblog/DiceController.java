package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DiceController {
    @GetMapping ("/roll-dice")
    public String rollDice() {
        return "roll-dice";
    }
}
