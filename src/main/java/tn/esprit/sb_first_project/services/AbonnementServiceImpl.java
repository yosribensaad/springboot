package tn.esprit.sb_first_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sb_first_project.entities.Abonnement;
import tn.esprit.sb_first_project.entities.TypeAbonnement;
import tn.esprit.sb_first_project.repositories.IAbonnementRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class AbonnementServiceImpl implements IAbonnementService{

    @Autowired
    private IAbonnementRepo iAbonnementSRepo;

    @Override
    public Set<Abonnement> getAbonnementByType(TypeAbonnement type) {
        return iAbonnementSRepo.findByTypeAbon(type);
    }

    @Override
    public List<Abonnement> retrieveAbonnementByDates(LocalDate startDate, LocalDate endDate) {
        return iAbonnementSRepo.getAbonnementsBetweenDates(startDate, endDate);

    }
}
