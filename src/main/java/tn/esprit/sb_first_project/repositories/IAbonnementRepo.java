package tn.esprit.sb_first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.sb_first_project.entities.Abonnement;
import tn.esprit.sb_first_project.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;

@Repository
public interface IAbonnementRepo extends JpaRepository<Abonnement,Long> {


    @Query("select a from Abonnement a where a.typeAbon =: typeA order by a.dateDebut")
    List<Abonnement> getAbonnementsOrderByDateDebut(@Param("typeA") TypeAbonnement typeAbon);

    @Query("select a from Abonnement a where a.dateDebut between :date1 and :date2")
    List<Abonnement> getAbonnementsBetweenDates(@Param("date1") Date date1, @Param("date2") Date date2);


}
