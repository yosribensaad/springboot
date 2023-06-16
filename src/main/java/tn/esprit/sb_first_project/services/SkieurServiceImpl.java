package tn.esprit.sb_first_project.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sb_first_project.entities.Piste;
import tn.esprit.sb_first_project.entities.Skieur;
import tn.esprit.sb_first_project.entities.TypeAbonnement;
import tn.esprit.sb_first_project.repositories.IPisteRepo;
import tn.esprit.sb_first_project.repositories.ISkieurRepo;

import java.util.List;

@Service
@Slf4j
public class SkieurServiceImpl implements ISkieurService{

    @Autowired
    private ISkieurRepo iskieurRepo;

    @Autowired
    private IPisteRepo iPisteRepo;

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
        Skieur s = iskieurRepo.findById(id).get();
        log.info("le nom du skieur est"+ s.getNomS());
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

    @Override
    public Skieur getSkieurByNomSAndPrenomS(String nom, String prenom) {
        return iskieurRepo.getSkieurByNomSAndPrenomS(nom,prenom);
    }

    @Override
    public List<Skieur> retrieveSkieursByTypeAbonnement(TypeAbonnement typeAbonnement) {
        return iskieurRepo.findByAbonnementTypeAbon(typeAbonnement);
    }
    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = iskieurRepo.findByNumSkieur(numSkieur);
        Piste piste =iPisteRepo.findByNumPiste(numPiste);
        skieur.getPistes().add(piste);
        return skieur;
    }


}
