package tn.esprit.sb_first_project.controlers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sb_first_project.entities.Support;
import tn.esprit.sb_first_project.services.IInscriptionService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Inscription")
public class InscriptionController {

    private IInscriptionService iInscriptionService;

    @GetMapping("/numWeeksCoursOfMoniteurBySupport/{numMoniteur}/{support}")
    public List<Integer> numWeeksCoursOfMoniteurBySupport(@PathVariable("numMoniteur")Long numMoniteur,@PathVariable("support") Support support) {
        return iInscriptionService.numWeeksCoursOfMoniteurBySupport(numMoniteur,support);
    }
}
