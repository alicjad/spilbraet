package com.example.demo.Controller;

import com.example.demo.Model.Game;
import com.example.demo.Model.News;
import com.example.demo.Repositories.GamesRepository;
import com.example.demo.Repositories.IGameRepository;
import com.example.demo.Repositories.INewsRepository;
import com.example.demo.Repositories.NewsRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

@org.springframework.stereotype.Controller
public class Controller {
    private IGameRepository gamesRepository;
    private INewsRepository newsRepository;

    public Controller() {
        gamesRepository = new GamesRepository();
        newsRepository=new NewsRepository();
    }

    @GetMapping("/")
    public String mainPage(Model model) throws SQLException {
        model.addAttribute("news", newsRepository.readAll());
        //model.addAttribute("size", newsRepository.size());

        return "mainPage";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "aboutPage";
    }

    @GetMapping("/news")
    public String newsPage(Model model) throws SQLException {
        model.addAttribute("news", newsRepository.readAll());
        return "newsPage";

    }

    @GetMapping("/updateNews")
    public String updateNews(@RequestParam("id") int newsId, Model model) throws SQLException {
        News news=newsRepository.read(newsId);
        model.addAttribute("news", news);
        return "updateNews";
    }

    @PostMapping("/updateNews")
    public String updateNews(@ModelAttribute News news, Model model) throws SQLException {
        newsRepository.update(news);
        model.addAttribute("news", newsRepository.readAll());
        return"redirect:/news";
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
        model.addAttribute("game", game);
        return "gameInfo";
    }

}
