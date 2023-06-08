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

    //afficher les numéros des semaines où un moniteur a donnée des cours selon un support donné.
    //@Query("select i.numSemaine from Inscription i join Cours c, Moniteur m where c.support=: sup and c.m.NumMoniteur=: idM")
    //List<Integer> getNumSemaineBySupportAndMoniteur(@Param("sup")Support support,@Param("idM") Long idM);
    @Query("SELECT DISTINCT i.numSemaine FROM Inscription i " +
            "JOIN i.cours c " +
            "JOIN c.moniteur m " +
            "WHERE m.numMoniteur = :moniteurId " +
            "AND c.support = :support")
    List<Integer> findWeekNumbersByMoniteurAndSupport(@Param("moniteurId") Long moniteurId, @Param("support") Support support);
}
