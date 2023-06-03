package tn.esprit.sb_first_project.controlers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sb_first_project.entities.Skieur;
import tn.esprit.sb_first_project.services.ISkieurService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Skieur")
public class SkieurController {
    private ISkieurService skieurService;

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur sk) {
        return skieurService.addSkieur(sk);
    }

    @GetMapping("/get/{id}")
    public Skieur getSkieurById(@PathVariable("id") Long id) {
        return skieurService.getSkieurById(id);
    }

    @GetMapping("/getAll")
    public List<Skieur> getAll() {
        return skieurService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkieurById(@PathVariable("id") Long id) {
        skieurService.deleteSkieurById(id);
    }

    @GetMapping("/get/{nom}/{prenom}")
    public Skieur getSkieurByNomSAndPrenomS(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom) {
        return skieurService.getSkieurByNomSAndPrenomS(nom, prenom);
    }
}
