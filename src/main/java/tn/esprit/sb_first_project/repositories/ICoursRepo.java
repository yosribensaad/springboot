package tn.esprit.sb_first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sb_first_project.entities.Cours;
@Repository
public interface ICoursRepo extends JpaRepository<Cours,Long> {

    Cours findByNumCours(Long numCours);
}
