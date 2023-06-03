package tn.esprit.sb_first_project.services;

import org.springframework.stereotype.Service;
import tn.esprit.sb_first_project.entities.Skieur;
import tn.esprit.sb_first_project.repositories.ISkieurRepo;

import java.util.List;

@Service
public class SkieurServiceImpl implements ISkieurService{

    private ISkieurRepo iskieurRepo;

    @Override
    public Skieur addSkieur(Skieur skieur){
        return iskieurRepo.save(skieur);
    }

    @Override
    public List<Skieur> getAll(){
        return iskieurRepo.findAll();
    }
    @Override
    public Skieur getSkieurById(Long id) {
        return iskieurRepo.findById(id).get();
    }
    @Override
    public void deleteSkieurById(Long id) {
        iskieurRepo.deleteById(id);
    }
    @Override
    public Skieur updateSkieur(Long id){
        Skieur skieur = iskieurRepo.findById(id).get();
        return iskieurRepo.save(skieur);
    }
}
