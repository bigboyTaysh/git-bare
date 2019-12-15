package pl.patryk.springwithgit.controller.rest;
import pl.patryk.springwithgit.domain.Preson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/person")
    public Preson me(){
        return new Preson("mariusz", "cos");
    }

}
