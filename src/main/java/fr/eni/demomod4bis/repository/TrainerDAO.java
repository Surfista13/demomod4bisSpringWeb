package fr.eni.demomod4bis.repository;

import fr.eni.demomod4bis.bo.Trainer;

import java.util.List;

public interface TrainerDAO {
    void create(Trainer trainer);
    Trainer read(String email);
    void update(Trainer trainer);
    void delete(String email);
    List<Trainer> findAll();
}
