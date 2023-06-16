package tn.esprit.sb_first_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sb_first_project.entities.Cours;
import tn.esprit.sb_first_project.entities.Inscription;
import tn.esprit.sb_first_project.entities.Support;
import tn.esprit.sb_first_project.repositories.ICoursRepo;
import tn.esprit.sb_first_project.repositories.IInscriptionRepo;

import java.util.List;

@Service
public class InscriptionServiceImpl implements IInscriptionService{

    @Autowired
    private IInscriptionRepo iInscriptionRepo;

    @Autowired
    private ICoursRepo coursRepo;

    @Override
    public List<Integer> numWeeksCoursOfMoniteurBySupport(Long numMoniteur, Support support) {
        return iInscriptionRepo.numSemaineOfMonitorBySupport(support,numMoniteur);

    }
}
