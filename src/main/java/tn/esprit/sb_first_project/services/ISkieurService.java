package tn.esprit.sb_first_project.services;

import tn.esprit.sb_first_project.entities.Skieur;
import tn.esprit.sb_first_project.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {

    public Skieur addSkieur(Skieur skieur);
    public List<Skieur> getAll();
    public Skieur getSkieurById(Long id);

    public void deleteSkieurById(Long id);

    public Skieur updateSkieur(Long id);

    public Skieur getSkieurByNomSAndPrenomS(String nom,String prenom);

    List<Skieur> retrieveSkieursByTypeAbonnement(TypeAbonnement typeAbonnement);

    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);
}
