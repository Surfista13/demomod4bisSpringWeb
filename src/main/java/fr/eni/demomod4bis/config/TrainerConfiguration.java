package fr.eni.demomod4bis.config;

import fr.eni.demomod4bis.bo.Trainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrainerConfiguration {
    @Bean(name="formateurJava")
    public Trainer getTrainerJava() {
        return new Trainer("Jules","Java","jj@sun.com");
    }
    @Bean(name = "formateurPhp")
    public Trainer getTrainerPhp() {
        return new Trainer("Pierre","Php","ms.ch.com");
    }
    @Bean(name = "formCpp")
    public Trainer getTrainerCpp() {
        return new Trainer("Pierre","Php","ms.ch.com");
    }
}
