package tn.esprit.sb_first_project.services;

import tn.esprit.sb_first_project.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur piste);

    List<Moniteur> retrieveAllMoniteurs();

    Moniteur retrieveMoniteur(Long id);

    Moniteur updateMoniteur(Long id);
}
