package tn.esprit.sb_first_project.controlers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sb_first_project.entities.Cours;
import tn.esprit.sb_first_project.services.ICoursService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Cours")
public class CoursController {

    private ICoursService coursService;

    @PostMapping("/addCours")
    public Cours addCours(@RequestBody Cours c) {
        return coursService.addCours(c);
    }

    @GetMapping("/get/{id}")
    public Cours retrieveCours(@PathVariable("id") Long id) {
        return coursService.retrieveCours(id);
    }

    @GetMapping("/getAll")
    public List<Cours> retrieveAllCourses() {
        return coursService.retrieveAllCourses();
    }

    @PutMapping("/update/{id}")
    public Cours updateCours(@PathVariable("id") Long id) {
        return coursService.updateCours(id);
    }
}
