package tn.esprit.sb_first_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sb_first_project.entities.Cours;
import tn.esprit.sb_first_project.repositories.ICoursRepo;

import java.util.List;

@Service
public class CoursServicceImpl implements ICoursService{
    @Autowired
    private ICoursRepo coursRepo;

    @Override
    public Cours addCours(Cours cours){
        return coursRepo.save(cours);
    }

    @Override
    public List<Cours> retrieveAllCourses(){
        return coursRepo.findAll();
    }
    @Override
    public Cours retrieveCours(Long id) {
        return coursRepo.findById(id).get();
    }
    @Override
    public Cours updateCours(Long id){
        Cours cours = coursRepo.findById(id).get();
        return coursRepo.save(cours);
    }
}
