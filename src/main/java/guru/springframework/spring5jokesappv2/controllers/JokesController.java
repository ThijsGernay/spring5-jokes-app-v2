package guru.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import guru.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomQuote());
        return "index";
    }

}
