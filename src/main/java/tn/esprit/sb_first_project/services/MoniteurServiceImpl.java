package tn.esprit.sb_first_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sb_first_project.entities.Moniteur;
import tn.esprit.sb_first_project.repositories.IMoniteurRepo;

import java.util.List;

@Service
public class MoniteurServiceImpl implements IMoniteurService {
    @Autowired
    private IMoniteurRepo moniteurRepo;


    @Override
    public Moniteur addMoniteur(Moniteur piste){
        return moniteurRepo.save(piste);
    }

    @Override
    public List<Moniteur> retrieveAllMoniteurs(){
        return moniteurRepo.findAll();
    }
    @Override
    public Moniteur retrieveMoniteur(Long id) {
        return moniteurRepo.findById(id).get();
    }
    @Override
    public Moniteur updateMoniteur(Long id){
        Moniteur piste = moniteurRepo.findById(id).get();
        return moniteurRepo.save(piste);
    }
}
