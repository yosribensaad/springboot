package tn.esprit.sb_first_project.services;

import tn.esprit.sb_first_project.entities.Cours;

import java.util.List;

public interface ICoursService {
    Cours addCours(Cours cours);

    List<Cours> retrieveAllCourses();

    Cours retrieveCours(Long id);

    Cours updateCours(Long id);
}
