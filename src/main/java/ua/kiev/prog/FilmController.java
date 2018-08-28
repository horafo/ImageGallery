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
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping("/film")
    public String film() {
        return "film";
    }



    @RequestMapping(value = "/film1like", method = RequestMethod.POST)
    public String film1like(Model model) {
        Film film = filmService.getFilmById(1);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film1";
    }

    @RequestMapping(value = "/film1dislike", method = RequestMethod.POST)
    public String film1dislike(Model model) {
        Film film = filmService.getFilmById(1);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film1";
    }

    @RequestMapping("/film1")
    public String film1() {
        return "film1";
    }



    @RequestMapping(value = "/film2like", method = RequestMethod.POST)
    public String film2like(Model model) {
        Film film = filmService.getFilmById(2);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film2";
    }

    @RequestMapping(value = "/film2dislike", method = RequestMethod.POST)
    public String film2dislike(Model model) {
        Film film = filmService.getFilmById(2);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film2";
    }

    @RequestMapping("/film2")
    public String film2() {
        return "film2";
    }



    @RequestMapping(value = "/film3like", method = RequestMethod.POST)
    public String film3like(Model model) {
        Film film = filmService.getFilmById(3);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film3";
    }

    @RequestMapping(value = "/film3dislike", method = RequestMethod.POST)
    public String film3dislike(Model model) {
        Film film = filmService.getFilmById(3);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film3";
    }

    @RequestMapping("/film3")
    public String film3() {
        return "film3";
    }



    @RequestMapping(value = "/film4like", method = RequestMethod.POST)
    public String film4like(Model model) {
        Film film = filmService.getFilmById(4);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film4";
    }

    @RequestMapping(value = "/film4dislike", method = RequestMethod.POST)
    public String film4dislike(Model model) {
        Film film = filmService.getFilmById(4);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film4";
    }

    @RequestMapping("/film4")
    public String film4() {
        return "film4";
    }



    @RequestMapping(value = "/film5like", method = RequestMethod.POST)
    public String film5like(Model model) {
        Film film = filmService.getFilmById(5);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film5";
    }

    @RequestMapping(value = "/film5dislike", method = RequestMethod.POST)
    public String film5dislike(Model model) {
        Film film = filmService.getFilmById(5);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film5";
    }

    @RequestMapping("/film5")
    public String film5() {
        return "film5";
    }



    @RequestMapping(value = "/film6like", method = RequestMethod.POST)
    public String film6like(Model model) {
        Film film = filmService.getFilmById(6);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film6";
    }

    @RequestMapping(value = "/film6dislike", method = RequestMethod.POST)
    public String film6dislike(Model model) {
        Film film = filmService.getFilmById(6);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film6";
    }

    @RequestMapping("/film6")
    public String film6() {
        return "film6";
    }



    @RequestMapping(value = "/film7like", method = RequestMethod.POST)
    public String film7like(Model model) {
        Film film = filmService.getFilmById(7);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film7";
    }

    @RequestMapping(value = "/film7dislike", method = RequestMethod.POST)
    public String film7dislike(Model model) {
        Film film = filmService.getFilmById(7);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film7";
    }

    @RequestMapping("/film7")
    public String film7() {
        return "film7";
    }



    @RequestMapping(value = "/film8like", method = RequestMethod.POST)
    public String film8like(Model model) {
        Film film = filmService.getFilmById(8);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film8";
    }

    @RequestMapping(value = "/film8dislike", method = RequestMethod.POST)
    public String film8dislike(Model model) {
        Film film = filmService.getFilmById(8);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film8";
    }

    @RequestMapping("/film8")
    public String film8() {
        return "film8";
    }



    @RequestMapping(value = "/film9like", method = RequestMethod.POST)
    public String film9like(Model model) {
        Film film = filmService.getFilmById(9);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film9";
    }

    @RequestMapping(value = "/film9dislike", method = RequestMethod.POST)
    public String film9dislike(Model model) {
        Film film = filmService.getFilmById(9);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film9";
    }

    @RequestMapping("/film9")
    public String film9() {
        return "film9";
    }



    @RequestMapping(value = "/film10like", method = RequestMethod.POST)
    public String film10like(Model model) {
        Film film = filmService.getFilmById(10);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film10";
    }

    @RequestMapping(value = "/film10dislike", method = RequestMethod.POST)
    public String film10dislike(Model model) {
        Film film = filmService.getFilmById(10);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film10";
    }

    @RequestMapping("/film10")
    public String film10() {
        return "film10";
    }



    @RequestMapping(value = "/film11like", method = RequestMethod.POST)
    public String film11like(Model model) {
        Film film = filmService.getFilmById(11);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film11";
    }

    @RequestMapping(value = "/film11dislike", method = RequestMethod.POST)
    public String film11dislike(Model model) {
        Film film = filmService.getFilmById(11);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film11";
    }

    @RequestMapping("/film11")
    public String film11() {
        return "film11";
    }



    @RequestMapping(value = "/film12like", method = RequestMethod.POST)
    public String film12like(Model model) {
        Film film = filmService.getFilmById(12);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film12";
    }

    @RequestMapping(value = "/film12dislike", method = RequestMethod.POST)
    public String film12dislike(Model model) {
        Film film = filmService.getFilmById(12);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film12";
    }

    @RequestMapping("/film12")
    public String film12() {
        return "film12";
    }



    @RequestMapping(value = "/film13like", method = RequestMethod.POST)
    public String film13like(Model model) {
        Film film = filmService.getFilmById(13);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film13";
    }

    @RequestMapping(value = "/film13dislike", method = RequestMethod.POST)
    public String film13dislike(Model model) {
        Film film = filmService.getFilmById(13);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film13";
    }

    @RequestMapping("/film13")
    public String film13() {
        return "film13";
    }



    @RequestMapping(value = "/film14like", method = RequestMethod.POST)
    public String film14like(Model model) {
        Film film = filmService.getFilmById(14);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film14";
    }

    @RequestMapping(value = "/film14dislike", method = RequestMethod.POST)
    public String film14dislike(Model model) {
        Film film = filmService.getFilmById(14);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film14";
    }

    @RequestMapping("/film14")
    public String film14() {
        return "film14";
    }



    @RequestMapping(value = "/film15like", method = RequestMethod.POST)
    public String film15like(Model model) {
        Film film = filmService.getFilmById(15);
        Integer CountLike = film.getLike();
        film.setLike(CountLike + 1);
        filmService.updateFilm(film);
        model.addAttribute("like", film.getLike());
        model.addAttribute("dislike", film.getDislike());

        return "film15";
    }

    @RequestMapping(value = "/film15dislike", method = RequestMethod.POST)
    public String film15dislike(Model model) {
        Film film = filmService.getFilmById(15);
        Integer CountDislike = film.getDislike();
        film.setDislike(CountDislike + 1);
        filmService.updateFilm(film);
        model.addAttribute("dislike", film.getDislike());
        model.addAttribute("like", film.getLike());

        return "film15";
    }

    @RequestMapping("/film15")
    public String film15() {
        return "film15";
    }

}
