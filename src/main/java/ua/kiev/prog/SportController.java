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
public class SportController {

    @Autowired
    private SportService sportService;

    @RequestMapping("/sport")
    public String sport() {
        return "sport";
    }


    @RequestMapping(value = "/sport1like", method = RequestMethod.POST)
    public String sport1like(Model model) {
        Sport sport = sportService.getSportById(1);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport1";
    }

    @RequestMapping(value = "/sport1dislike", method = RequestMethod.POST)
    public String sport1dislike(Model model) {
        Sport sport = sportService.getSportById(1);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport1";
    }

    @RequestMapping("/sport1")
    public String sport1() {
        return "sport1";
    }


    @RequestMapping(value = "/sport2like", method = RequestMethod.POST)
    public String sport2like(Model model) {
        Sport sport = sportService.getSportById(2);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport2";
    }

    @RequestMapping(value = "/sport2dislike", method = RequestMethod.POST)
    public String sport2dislike(Model model) {
        Sport sport = sportService.getSportById(2);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport2";
    }

    @RequestMapping("/sport2")
    public String sport2() {
        return "sport2";
    }


    @RequestMapping(value = "/sport3like", method = RequestMethod.POST)
    public String sport3like(Model model) {
        Sport sport = sportService.getSportById(3);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport3";
    }

    @RequestMapping(value = "/sport3dislike", method = RequestMethod.POST)
    public String sport3dislike(Model model) {
        Sport sport = sportService.getSportById(3);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport3";
    }

    @RequestMapping("/sport3")
    public String sport3() {
        return "sport3";
    }


    @RequestMapping(value = "/sport4like", method = RequestMethod.POST)
    public String sport4like(Model model) {
        Sport sport = sportService.getSportById(4);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport4";
    }

    @RequestMapping(value = "/sport4dislike", method = RequestMethod.POST)
    public String sport4dislike(Model model) {
        Sport sport = sportService.getSportById(4);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport4";
    }

    @RequestMapping("/sport4")
    public String sport4() {
        return "sport4";
    }


    @RequestMapping(value = "/sport5like", method = RequestMethod.POST)
    public String sport5like(Model model) {
        Sport sport = sportService.getSportById(5);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport5";
    }

    @RequestMapping(value = "/sport5dislike", method = RequestMethod.POST)
    public String sport5dislike(Model model) {
        Sport sport = sportService.getSportById(5);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport5";
    }

    @RequestMapping("/sport5")
    public String sport5() {
        return "sport5";
    }


    @RequestMapping(value = "/sport6like", method = RequestMethod.POST)
    public String sport6like(Model model) {
        Sport sport = sportService.getSportById(6);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport6";
    }

    @RequestMapping(value = "/sport6dislike", method = RequestMethod.POST)
    public String sport6dislike(Model model) {
        Sport sport = sportService.getSportById(6);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport6";
    }

    @RequestMapping("/sport6")
    public String sport6() {
        return "sport6";
    }


    @RequestMapping(value = "/sport7like", method = RequestMethod.POST)
    public String sport7like(Model model) {
        Sport sport = sportService.getSportById(7);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport7";
    }

    @RequestMapping(value = "/sport7dislike", method = RequestMethod.POST)
    public String sport7dislike(Model model) {
        Sport sport = sportService.getSportById(7);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport7";
    }

    @RequestMapping("/sport7")
    public String sport7() {
        return "sport7";
    }


    @RequestMapping(value = "/sport8like", method = RequestMethod.POST)
    public String sport8like(Model model) {
        Sport sport = sportService.getSportById(8);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport8";
    }

    @RequestMapping(value = "/sport8dislike", method = RequestMethod.POST)
    public String sport8dislike(Model model) {
        Sport sport = sportService.getSportById(8);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport8";
    }

    @RequestMapping("/sport8")
    public String sport8() {
        return "sport8";
    }


    @RequestMapping(value = "/sport9like", method = RequestMethod.POST)
    public String sport9like(Model model) {
        Sport sport = sportService.getSportById(9);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport9";
    }

    @RequestMapping(value = "/sport9dislike", method = RequestMethod.POST)
    public String sport9dislike(Model model) {
        Sport sport = sportService.getSportById(9);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport9";
    }

    @RequestMapping("/sport9")
    public String sport9() {
        return "sport9";
    }


    @RequestMapping(value = "/sport10like", method = RequestMethod.POST)
    public String sport10like(Model model) {
        Sport sport = sportService.getSportById(10);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport10";
    }

    @RequestMapping(value = "/sport10dislike", method = RequestMethod.POST)
    public String sport10dislike(Model model) {
        Sport sport = sportService.getSportById(10);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport10";
    }

    @RequestMapping("/sport10")
    public String sport10() {
        return "sport10";
    }


    @RequestMapping(value = "/sport11like", method = RequestMethod.POST)
    public String sport11like(Model model) {
        Sport sport = sportService.getSportById(11);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport11";
    }

    @RequestMapping(value = "/sport11dislike", method = RequestMethod.POST)
    public String sport11dislike(Model model) {
        Sport sport = sportService.getSportById(11);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport11";
    }

    @RequestMapping("/sport11")
    public String sport11() {
        return "sport11";
    }


    @RequestMapping(value = "/sport12like", method = RequestMethod.POST)
    public String sport12like(Model model) {
        Sport sport = sportService.getSportById(12);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport12";
    }

    @RequestMapping(value = "/sport12dislike", method = RequestMethod.POST)
    public String sport12dislike(Model model) {
        Sport sport = sportService.getSportById(12);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport12";
    }

    @RequestMapping("/sport12")
    public String sport12() {
        return "sport12";
    }


    @RequestMapping(value = "/sport13like", method = RequestMethod.POST)
    public String sport13like(Model model) {
        Sport sport = sportService.getSportById(13);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport13";
    }

    @RequestMapping(value = "/sport13dislike", method = RequestMethod.POST)
    public String sport13dislike(Model model) {
        Sport sport = sportService.getSportById(13);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport13";
    }

    @RequestMapping("/sport13")
    public String sport13() {
        return "sport13";
    }


    @RequestMapping(value = "/sport14like", method = RequestMethod.POST)
    public String sport14like(Model model) {
        Sport sport = sportService.getSportById(14);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport14";
    }

    @RequestMapping(value = "/sport14dislike", method = RequestMethod.POST)
    public String sport14dislike(Model model) {
        Sport sport = sportService.getSportById(14);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport14";
    }

    @RequestMapping("/sport14")
    public String sport14() {
        return "sport14";
    }


    @RequestMapping(value = "/sport15like", method = RequestMethod.POST)
    public String sport15like(Model model) {
        Sport sport = sportService.getSportById(15);
        Integer CountLike = sport.getLike();
        sport.setLike(CountLike + 1);
        sportService.updateSport(sport);
        model.addAttribute("like", sport.getLike());
        model.addAttribute("dislike", sport.getDislike());

        return "sport15";
    }

    @RequestMapping(value = "/sport15dislike", method = RequestMethod.POST)
    public String sport15dislike(Model model) {
        Sport sport = sportService.getSportById(15);
        Integer CountDislike = sport.getDislike();
        sport.setDislike(CountDislike + 1);
        sportService.updateSport(sport);
        model.addAttribute("dislike", sport.getDislike());
        model.addAttribute("like", sport.getLike());

        return "sport15";
    }

    @RequestMapping("/sport15")
    public String sport15() {
        return "sport15";
    }

}