package tn.esprit.sb_first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sb_first_project.entities.Inscription;
@Repository
public interface IInscriptionRepo extends JpaRepository<Inscription,Long> {
}
