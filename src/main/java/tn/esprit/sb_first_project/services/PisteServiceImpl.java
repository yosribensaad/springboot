package tn.esprit.sb_first_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sb_first_project.entities.Piste;
import tn.esprit.sb_first_project.repositories.IPisteRepo;

import java.util.List;

@Service
public class PisteServiceImpl implements IPisteService{
    @Autowired
    private IPisteRepo ipisteRepo;

    @Override
    public Piste addPiste(Piste piste){
        return ipisteRepo.save(piste);
    }

    @Override
    public List<Piste> retrieveAllPistes(){
        return ipisteRepo.findAll();
    }
    @Override
    public Piste retrievePiste(Long id) {
        return ipisteRepo.findById(id).get();
    }
    @Override
    public Piste updatePiste(Long id){
        Piste piste = ipisteRepo.findById(id).get();
        return ipisteRepo.save(piste);
    }
}
