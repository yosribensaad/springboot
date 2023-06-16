package tn.esprit.sb_first_project.controlers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sb_first_project.entities.Piste;
import tn.esprit.sb_first_project.services.IPisteService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Piste")
public class PisteController {
    private IPisteService pisteService;

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste p) {
        return pisteService.addPiste(p);
    }

    @GetMapping("/get/{id}")
    public Piste retrievePiste(@PathVariable("id") Long id) {
        return pisteService.retrievePiste(id);
    }

    @GetMapping("/getAll")
    public List<Piste> retrieveAllPistes() {
        return pisteService.retrieveAllPistes();
    }

    @PutMapping("/update/{id}")
    public Piste updatePiste(@PathVariable("id") Long id) {
        return pisteService.updatePiste(id);
    }
}
