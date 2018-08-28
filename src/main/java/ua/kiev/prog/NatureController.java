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
public class NatureController {

    @Autowired
    private NatureService natureService;

    @RequestMapping("/nature")
    public String nature() {
        return "nature";
    }


    @RequestMapping(value = "/nature1like", method = RequestMethod.POST)
    public String nature1like(Model model) {
        Nature nature = natureService.getNatureById(1);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature1";
    }

    @RequestMapping(value = "/nature1dislike", method = RequestMethod.POST)
    public String nature1dislike(Model model) {
        Nature nature = natureService.getNatureById(1);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature1";
    }

    @RequestMapping("/nature1")
    public String nature1() {
        return "nature1";
    }


    @RequestMapping(value = "/nature2like", method = RequestMethod.POST)
    public String nature2like(Model model) {
        Nature nature = natureService.getNatureById(2);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature2";
    }

    @RequestMapping(value = "/nature2dislike", method = RequestMethod.POST)
    public String nature2dislike(Model model) {
        Nature nature = natureService.getNatureById(2);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature2";
    }

    @RequestMapping("/nature2")
    public String nature2() {
        return "nature2";
    }


    @RequestMapping(value = "/nature3like", method = RequestMethod.POST)
    public String nature3like(Model model) {
        Nature nature = natureService.getNatureById(3);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature3";
    }

    @RequestMapping(value = "/nature3dislike", method = RequestMethod.POST)
    public String nature3dislike(Model model) {
        Nature nature = natureService.getNatureById(3);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature3";
    }

    @RequestMapping("/nature3")
    public String nature3() {
        return "nature3";
    }


    @RequestMapping(value = "/nature4like", method = RequestMethod.POST)
    public String nature4like(Model model) {
        Nature nature = natureService.getNatureById(4);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature4";
    }

    @RequestMapping(value = "/nature4dislike", method = RequestMethod.POST)
    public String nature4dislike(Model model) {
        Nature nature = natureService.getNatureById(4);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature4";
    }

    @RequestMapping("/nature4")
    public String nature4() {
        return "nature4";
    }


    @RequestMapping(value = "/nature5like", method = RequestMethod.POST)
    public String nature5like(Model model) {
        Nature nature = natureService.getNatureById(5);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature5";
    }

    @RequestMapping(value = "/nature5dislike", method = RequestMethod.POST)
    public String nature5dislike(Model model) {
        Nature nature = natureService.getNatureById(5);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature5";
    }

    @RequestMapping("/nature5")
    public String nature5() {
        return "nature5";
    }


    @RequestMapping(value = "/nature6like", method = RequestMethod.POST)
    public String nature6like(Model model) {
        Nature nature = natureService.getNatureById(6);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature6";
    }

    @RequestMapping(value = "/nature6dislike", method = RequestMethod.POST)
    public String nature6dislike(Model model) {
        Nature nature = natureService.getNatureById(6);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature6";
    }

    @RequestMapping("/nature6")
    public String nature6() {
        return "nature6";
    }


    @RequestMapping(value = "/nature7like", method = RequestMethod.POST)
    public String nature7like(Model model) {
        Nature nature = natureService.getNatureById(7);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature7";
    }

    @RequestMapping(value = "/nature7dislike", method = RequestMethod.POST)
    public String nature7dislike(Model model) {
        Nature nature = natureService.getNatureById(7);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature7";
    }

    @RequestMapping("/nature7")
    public String nature7() {
        return "nature7";
    }


    @RequestMapping(value = "/nature8like", method = RequestMethod.POST)
    public String nature8like(Model model) {
        Nature nature = natureService.getNatureById(8);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature8";
    }

    @RequestMapping(value = "/nature8dislike", method = RequestMethod.POST)
    public String nature8dislike(Model model) {
        Nature nature = natureService.getNatureById(8);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature8";
    }

    @RequestMapping("/nature8")
    public String nature8() {
        return "nature8";
    }


    @RequestMapping(value = "/nature9like", method = RequestMethod.POST)
    public String nature9like(Model model) {
        Nature nature = natureService.getNatureById(9);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature9";
    }

    @RequestMapping(value = "/nature9dislike", method = RequestMethod.POST)
    public String nature9dislike(Model model) {
        Nature nature = natureService.getNatureById(9);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature9";
    }

    @RequestMapping("/nature9")
    public String nature9() {
        return "nature9";
    }


    @RequestMapping(value = "/nature10like", method = RequestMethod.POST)
    public String nature10like(Model model) {
        Nature nature = natureService.getNatureById(10);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature10";
    }

    @RequestMapping(value = "/nature10dislike", method = RequestMethod.POST)
    public String nature10dislike(Model model) {
        Nature nature = natureService.getNatureById(10);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature10";
    }

    @RequestMapping("/nature10")
    public String nature10() {
        return "nature10";
    }


    @RequestMapping(value = "/nature11like", method = RequestMethod.POST)
    public String nature11like(Model model) {
        Nature nature = natureService.getNatureById(11);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature11";
    }

    @RequestMapping(value = "/nature11dislike", method = RequestMethod.POST)
    public String nature11dislike(Model model) {
        Nature nature = natureService.getNatureById(11);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature11";
    }

    @RequestMapping("/nature11")
    public String nature11() {
        return "nature11";
    }


    @RequestMapping(value = "/nature12like", method = RequestMethod.POST)
    public String nature12like(Model model) {
        Nature nature = natureService.getNatureById(12);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature12";
    }

    @RequestMapping(value = "/nature12dislike", method = RequestMethod.POST)
    public String nature12dislike(Model model) {
        Nature nature = natureService.getNatureById(12);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature12";
    }

    @RequestMapping("/nature12")
    public String nature12() {
        return "nature12";
    }


    @RequestMapping(value = "/nature13like", method = RequestMethod.POST)
    public String nature13like(Model model) {
        Nature nature = natureService.getNatureById(13);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature13";
    }

    @RequestMapping(value = "/nature13dislike", method = RequestMethod.POST)
    public String nature13dislike(Model model) {
        Nature nature = natureService.getNatureById(13);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature13";
    }

    @RequestMapping("/nature13")
    public String nature13() {
        return "nature13";
    }


    @RequestMapping(value = "/nature14like", method = RequestMethod.POST)
    public String nature14like(Model model) {
        Nature nature = natureService.getNatureById(14);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature14";
    }

    @RequestMapping(value = "/nature14dislike", method = RequestMethod.POST)
    public String nature14dislike(Model model) {
        Nature nature = natureService.getNatureById(14);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature14";
    }

    @RequestMapping("/nature14")
    public String nature14() {
        return "nature14";
    }


    @RequestMapping(value = "/nature15like", method = RequestMethod.POST)
    public String nature15like(Model model) {
        Nature nature = natureService.getNatureById(15);
        Integer CountLike = nature.getLike();
        nature.setLike(CountLike + 1);
        natureService.updateNature(nature);
        model.addAttribute("like", nature.getLike());
        model.addAttribute("dislike", nature.getDislike());

        return "nature15";
    }

    @RequestMapping(value = "/nature15dislike", method = RequestMethod.POST)
    public String nature15dislike(Model model) {
        Nature nature = natureService.getNatureById(15);
        Integer CountDislike = nature.getDislike();
        nature.setDislike(CountDislike + 1);
        natureService.updateNature(nature);
        model.addAttribute("dislike", nature.getDislike());
        model.addAttribute("like", nature.getLike());

        return "nature15";
    }

    @RequestMapping("/nature15")
    public String nature15() {
        return "nature15";
    }
}