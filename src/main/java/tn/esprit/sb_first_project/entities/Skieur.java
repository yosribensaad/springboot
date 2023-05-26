package tn.esprit.sb_first_project.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numSkieur;

    private String nomS;

    private String prenomS;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String ville;

    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes;

    @OneToOne
    private Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;


}
