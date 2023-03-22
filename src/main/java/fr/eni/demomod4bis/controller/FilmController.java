package fr.eni.demomod4bis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/film")
public class FilmController {
    @GetMapping("/ajout")
    public String ajoutFilm() {
        return null;
    }
    @GetMapping("/delete")
    public String deleteFilm() {
        return null;
    }
}
