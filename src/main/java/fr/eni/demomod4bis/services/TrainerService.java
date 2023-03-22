package fr.eni.demomod4bis.services;

import fr.eni.demomod4bis.bo.Trainer;

import java.util.List;

public interface TrainerService {

    void ajouter(String firstName, String lastName, String email);
    List<Trainer> trouverTous();
}
