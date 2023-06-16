package tn.esprit.sb_first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.sb_first_project.entities.Inscription;
import tn.esprit.sb_first_project.entities.Support;

import java.util.List;

@Repository
public interface IInscriptionRepo extends JpaRepository<Inscription,Long> {

    Inscription findByNumInscription(Long numInscription);

   @Query("SELECT i.numSemaine FROM Inscription i, Moniteur m "
            + "WHERE m.numMoniteur = :numMonitor "
            + "AND i.cours.support = :support "
            + "AND i.cours IN (SELECT c FROM Moniteur mon JOIN mon.cours c WHERE mon.numMoniteur = :numMonitor)")
    List<Integer> numSemaineOfMonitorBySupport(@Param("support") Support support, @Param("numMonitor") Long numMonitor);
}
