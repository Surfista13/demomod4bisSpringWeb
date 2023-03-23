package fr.eni.demomod4bis.controller;

import fr.eni.demomod4bis.bo.Personne;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String idTrainer(String prenom, String nom,int age) {
        System.out.println(prenom+ " "+ nom + " "+ age);
        return "view-trainer-form";
    }
    @PostMapping("/identite")
    public String idTrainerPost(Personne personne) {
        System.out.println(personne);
        return "view-trainer-form";
    }
    @GetMapping({"/detail/variable/{email}","/detail/variable"})
    public String detailTrainerVariable(@PathVariable(value="email",required=false) String emailt) {
        System.out.println("Variable email: " + emailt);
        return "view-trainer-form";
    }
}
