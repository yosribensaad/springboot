package tn.esprit.sb_first_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.sb_first_project.entities.Skieur;
import tn.esprit.sb_first_project.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;

@Repository
public interface ISkieurRepo extends JpaRepository<Skieur,Long> {
    public Skieur findByNomSAndPrenomS(String nom,String prenom);
    public List<Skieur> findByDateNaissanceGreaterThan(Date dateNaissance);

    public Skieur findByNomSAndPrenomSAndDateNaissance(String nom,String prenom,Date dateNaissance);
    Skieur findByNumSkieur(Long numSkieur);
    @Query("select s from Skieur s where s.nomS=:nom and s.prenomS=:prenom")
    public Skieur getSkieurByNomSAndPrenomS(@Param("nom") String nom, @Param("prenom") String prenom);

    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement TypeAbonnement);
}
