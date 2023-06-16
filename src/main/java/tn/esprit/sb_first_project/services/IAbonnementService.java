package tn.esprit.sb_first_project.services;

import tn.esprit.sb_first_project.entities.Abonnement;
import tn.esprit.sb_first_project.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    Set<Abonnement> getAbonnementByType(TypeAbonnement type);

    List<Abonnement> retrieveAbonnementByDates(LocalDate startDate, LocalDate endDate);
}
