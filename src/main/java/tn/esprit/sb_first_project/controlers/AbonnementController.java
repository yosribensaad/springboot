package tn.esprit.sb_first_project.controlers;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sb_first_project.entities.Abonnement;
import tn.esprit.sb_first_project.entities.TypeAbonnement;
import tn.esprit.sb_first_project.services.IAbonnementService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@RestController
@RequestMapping("/Abonnement")
public class AbonnementController {

    private IAbonnementService iAbonnementService;

    @GetMapping("/retrieve-all-abonnementBytype/{typeAbonnement}")
    public Set<Abonnement> getAbonnementsBytype(@PathVariable("typeAbonnement") TypeAbonnement typeAbonnement) {
        Set<Abonnement> listAbonnement = iAbonnementService.getAbonnementByType(typeAbonnement);
        return listAbonnement;
    }

    @GetMapping("/getAbonnementsByDates/{date1}/{date2}")
    public List<Abonnement> getAbonnementsByDates(@PathVariable("date1") @DateTimeFormat(pattern= "yyyy-MM-dd") LocalDate startDate,
                                                  @PathVariable("date2") @DateTimeFormat(pattern= "yyyy-MM-dd")  LocalDate endDate){
        return iAbonnementService.retrieveAbonnementByDates(startDate, endDate);
    }
}
