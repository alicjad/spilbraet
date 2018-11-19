package com.example.demo.Controller;

import com.example.demo.Model.Game;
import com.example.demo.Repositories.GamesRepository;
import com.example.demo.Repositories.IGamesRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    private IGamesRepository gamesRepository;

    public Controller() {
        gamesRepository = new GamesRepository();
    }

    @GetMapping("/")
    public String mainPage(){
        return "mainPage";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "aboutPage";
    }

    @GetMapping("/games")
    public String gamesPage(Model model){
        model.addAttribute("games", gamesRepository.readAll());
        return "gamesPage";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return"contactPage";

    }

    @GetMapping("/gameInfo")
    public String gameInfoPage(@RequestParam("id") int id, Model model) {
        Game game = gamesRepository.read(id);
        // assert game != null;
        model.addAttribute("game", game);
        return "gameInfo";
    }
}
