package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GamesController {

    @Autowired
    private GamesService gamesService;

    @RequestMapping("/games")
    public String games() {
        return "games";
    }


    @RequestMapping(value = "/games1like", method = RequestMethod.POST)
    public String games1like(Model model) {
        Games games = gamesService.getGamesById(1);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games1";
    }

    @RequestMapping(value = "/games1dislike", method = RequestMethod.POST)
    public String games1dislike(Model model) {
        Games games = gamesService.getGamesById(1);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games1";
    }

    @RequestMapping("/games1")
    public String games1() {
        return "games1";
    }


    @RequestMapping(value = "/games2like", method = RequestMethod.POST)
    public String games2like(Model model) {
        Games games = gamesService.getGamesById(2);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games2";
    }

    @RequestMapping(value = "/games2dislike", method = RequestMethod.POST)
    public String games2dislike(Model model) {
        Games games = gamesService.getGamesById(2);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games2";
    }

    @RequestMapping("/games2")
    public String games2() { return "games2"; }


    @RequestMapping(value = "/games3like", method = RequestMethod.POST)
    public String games3like(Model model) {
        Games games = gamesService.getGamesById(3);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games3";
    }

    @RequestMapping(value = "/games3dislike", method = RequestMethod.POST)
    public String games3dislike(Model model) {
        Games games = gamesService.getGamesById(3);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games3";
    }

    @RequestMapping("/games3")
    public String games3() {
        return "games3";
    }


    @RequestMapping(value = "/games4like", method = RequestMethod.POST)
    public String games4like(Model model) {
        Games games = gamesService.getGamesById(4);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games4";
    }

    @RequestMapping(value = "/games4dislike", method = RequestMethod.POST)
    public String games4dislike(Model model) {
        Games games = gamesService.getGamesById(4);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games4";
    }

    @RequestMapping("/games4")
    public String games4() {
        return "games4";
    }


    @RequestMapping(value = "/games5like", method = RequestMethod.POST)
    public String games5like(Model model) {
        Games games = gamesService.getGamesById(5);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games5";
    }

    @RequestMapping(value = "/games5dislike", method = RequestMethod.POST)
    public String games5dislike(Model model) {
        Games games = gamesService.getGamesById(5);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games5";
    }

    @RequestMapping("/games5")
    public String games5() {
        return "games5";
    }


    @RequestMapping(value = "/games6like", method = RequestMethod.POST)
    public String games6like(Model model) {
        Games games = gamesService.getGamesById(6);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games6";
    }

    @RequestMapping(value = "/games6dislike", method = RequestMethod.POST)
    public String games6dislike(Model model) {
        Games games = gamesService.getGamesById(6);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games6";
    }

    @RequestMapping("/games6")
    public String games6() {
        return "games6";
    }


    @RequestMapping(value = "/games7like", method = RequestMethod.POST)
    public String games7like(Model model) {
        Games games = gamesService.getGamesById(7);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games7";
    }

    @RequestMapping(value = "/games7dislike", method = RequestMethod.POST)
    public String games7dislike(Model model) {
        Games games = gamesService.getGamesById(7);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games7";
    }

    @RequestMapping("/games7")
    public String games7() {
        return "games7";
    }


    @RequestMapping(value = "/games8like", method = RequestMethod.POST)
    public String games8like(Model model) {
        Games games = gamesService.getGamesById(8);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games8";
    }

    @RequestMapping(value = "/games8dislike", method = RequestMethod.POST)
    public String games8dislike(Model model) {
        Games games = gamesService.getGamesById(8);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games8";
    }

    @RequestMapping("/games8")
    public String games8() {
        return "games8";
    }


    @RequestMapping(value = "/games9like", method = RequestMethod.POST)
    public String games9like(Model model) {
        Games games = gamesService.getGamesById(9);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games9";
    }

    @RequestMapping(value = "/games9dislike", method = RequestMethod.POST)
    public String games9dislike(Model model) {
        Games games = gamesService.getGamesById(9);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games9";
    }

    @RequestMapping("/games9")
    public String games9() {
        return "games9";
    }


    @RequestMapping(value = "/games10like", method = RequestMethod.POST)
    public String games10like(Model model) {
        Games games = gamesService.getGamesById(10);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games10";
    }

    @RequestMapping(value = "/games10dislike", method = RequestMethod.POST)
    public String games10dislike(Model model) {
        Games games = gamesService.getGamesById(10);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games10";
    }

    @RequestMapping("/games10")
    public String games10() {
        return "games10";
    }


    @RequestMapping(value = "/games11like", method = RequestMethod.POST)
    public String games11like(Model model) {
        Games games = gamesService.getGamesById(11);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games11";
    }

    @RequestMapping(value = "/games11dislike", method = RequestMethod.POST)
    public String games11dislike(Model model) {
        Games games = gamesService.getGamesById(11);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games11";
    }

    @RequestMapping("/games11")
    public String games11() {
        return "games11";
    }


    @RequestMapping(value = "/games12like", method = RequestMethod.POST)
    public String games12like(Model model) {
        Games games = gamesService.getGamesById(12);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games12";
    }

    @RequestMapping(value = "/games12dislike", method = RequestMethod.POST)
    public String games12dislike(Model model) {
        Games games = gamesService.getGamesById(12);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games12";
    }

    @RequestMapping("/games12")
    public String games12() {
        return "games12";
    }


    @RequestMapping(value = "/games13like", method = RequestMethod.POST)
    public String games13like(Model model) {
        Games games = gamesService.getGamesById(13);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games13";
    }

    @RequestMapping(value = "/games13dislike", method = RequestMethod.POST)
    public String games13dislike(Model model) {
        Games games = gamesService.getGamesById(13);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games13";
    }

    @RequestMapping("/games13")
    public String games13() {
        return "games13";
    }


    @RequestMapping(value = "/games14like", method = RequestMethod.POST)
    public String games14like(Model model) {
        Games games = gamesService.getGamesById(14);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games14";
    }

    @RequestMapping(value = "/games14dislike", method = RequestMethod.POST)
    public String games14dislike(Model model) {
        Games games = gamesService.getGamesById(14);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games14";
    }

    @RequestMapping("/games14")
    public String games14() {
        return "games14";
    }


    @RequestMapping(value = "/games15like", method = RequestMethod.POST)
    public String games15like(Model model) {
        Games games = gamesService.getGamesById(15);
        Integer CountLike = games.getLike();
        games.setLike(CountLike + 1);
        gamesService.updateGames(games);
        model.addAttribute("like", games.getLike());
        model.addAttribute("dislike", games.getDislike());

        return "games15";
    }

    @RequestMapping(value = "/games15dislike", method = RequestMethod.POST)
    public String games15dislike(Model model) {
        Games games = gamesService.getGamesById(15);
        Integer CountDislike = games.getDislike();
        games.setDislike(CountDislike + 1);
        gamesService.updateGames(games);
        model.addAttribute("dislike", games.getDislike());
        model.addAttribute("like", games.getLike());

        return "games15";
    }

    @RequestMapping("/games15")
    public String games15() {
        return "games15";
    }
}