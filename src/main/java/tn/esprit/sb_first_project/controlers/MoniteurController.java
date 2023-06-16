package tn.esprit.sb_first_project.controlers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sb_first_project.entities.Moniteur;
import tn.esprit.sb_first_project.services.IMoniteurService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Moniteur")
public class MoniteurController {

    private IMoniteurService moniteurService;

        @PostMapping("/addMoniteur")
        public Moniteur addMoniteur(@RequestBody Moniteur m) {
        return moniteurService.addMoniteur(m);
        }

        @GetMapping("/get/{id}")
        public Moniteur retrieveMoniteur(@PathVariable("id") Long id) {
        return moniteurService.retrieveMoniteur(id);
        }

        @GetMapping("/getAll")
        public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurService.retrieveAllMoniteurs();
        }

        @PutMapping("/update/{id}")
        public Moniteur updateMoniteur(@PathVariable("id") Long id) {
        return moniteurService.updateMoniteur(id);
        }
}
