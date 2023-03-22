package fr.eni.demomod4bis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomController {
    @GetMapping("/bonjour")
    public String repobdreABonjour() {
        System.out.println("Appel de bonjour");;
        return "page-bonjour";
    }
}
