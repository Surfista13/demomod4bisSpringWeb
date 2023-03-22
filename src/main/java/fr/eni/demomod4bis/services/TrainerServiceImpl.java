package fr.eni.demomod4bis.services;

import fr.eni.demomod4bis.bo.Trainer;
import fr.eni.demomod4bis.repository.TrainerDAO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Primary
@Profile("default")
public class TrainerServiceImpl implements TrainerService {
   private TrainerDAO trainerDAO;

   public TrainerServiceImpl(TrainerDAO trainerDAO) {
      this.trainerDAO = trainerDAO;
   }

    @Override
    public void ajouter(String firstName, String lastName, String email) {
        Trainer nouveau = new Trainer(firstName, lastName, email);
        trainerDAO.create(nouveau);
    }

    @Override
    public List<Trainer> trouverTous() {
        return trainerDAO.findAll();
    }
}
