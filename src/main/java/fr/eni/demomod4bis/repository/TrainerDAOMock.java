package fr.eni.demomod4bis.repository;

import fr.eni.demomod4bis.bo.Trainer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class TrainerDAOMock implements TrainerDAO {

    private static List<Trainer> lstTrainers;

    public TrainerDAOMock() {
        lstTrainers = new ArrayList<>();
        lstTrainers.add(new Trainer("Anne-Lise", "Baille", "abaille@campus-eni.fr"));
        lstTrainers.add(new Trainer("Stéphane", "Gobin", "sgobin@campus-eni.fr"));
        lstTrainers.add(new Trainer("Julien", "Trillard", "jtrillard@campus-eni.fr"));
    }
    @Override
    public void create(Trainer trainer) {
        lstTrainers.add(trainer);
    }
    @Override
    public Trainer read(String email) {
        for (Trainer trainer : lstTrainers) {
            if(trainer.getEmail().equals(email)) {
                return trainer;            }
        }        return null;
    }

    @Override
    public void update(Trainer trainer) {
        Trainer current = read(trainer.getEmail());
        if(current != null) {
            current.setFirstName(trainer.getFirstName());
            current.setLastName(trainer.getLastName());
        }
    }
    @Override
    public void delete(String email) {
        Iterator<Trainer> it = lstTrainers.iterator();
        while(it.hasNext()) {
            Trainer current = it.next();
            if(current.getEmail().equals(email)) {
                it.remove();
                break;
            }
        }
    }
    @Override
    public List<Trainer> findAll() {
        return lstTrainers;
    }
}
