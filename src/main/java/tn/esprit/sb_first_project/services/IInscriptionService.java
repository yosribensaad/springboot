package tn.esprit.sb_first_project.services;

import tn.esprit.sb_first_project.entities.Inscription;
import tn.esprit.sb_first_project.entities.Support;

import java.util.List;

public interface IInscriptionService {

    List<Integer> numWeeksCoursOfMoniteurBySupport(Long numInstructor, Support support);
}
