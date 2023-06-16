package tn.esprit.sb_first_project.services;

import tn.esprit.sb_first_project.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);

    List<Piste> retrieveAllPistes();

    Piste retrievePiste(Long id);

    Piste updatePiste(Long id);
}
