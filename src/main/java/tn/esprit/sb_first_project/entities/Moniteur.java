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
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;

    private String nomM;

    private String prenomM;

    @Temporal(TemporalType.DATE)
    private Date dateRecru;

    @OneToMany
    private List<Cours> cours;
}
