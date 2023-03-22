package fr.eni.demomod4bis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/trainers")
public class TrainerController {
    @GetMapping("/ajout")
    public String allTrainer() {
        System.out.println("Nous chargerons la liste des formateurs");
        return "view-trainer";
    }
//    @GetMapping("/detail")
//    public String detailTrainer(@RequestParam(name="email",required = false,defaultValue = "e@e.com") String emailTrainer) {
//        System.out.println(emailTrainer);
//        return "view-trainer-form";
//    }
    @GetMapping("/detail")
    public String detailTrainer(String email) {
        System.out.println(email);
        return "view-trainer-form";
    }
    @GetMapping("/identite")
    public String idTrainer(String prenom, String nom) {
        System.out.println(prenom+ " "+ nom);
        return "view-trainer-form";
    }
}
