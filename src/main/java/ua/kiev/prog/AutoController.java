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
public class AutoController {

    @Autowired
    private AutoService autoService;

    @RequestMapping("/auto")
    public String auto() {
        return "auto";
    }



    @RequestMapping(value = "/auto1like", method = RequestMethod.POST)
    public String auto1like(Model model) {
        Auto auto = autoService.getAutoById(1);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto1";
    }

    @RequestMapping(value = "/auto1dislike", method = RequestMethod.POST)
    public String auto1dislike(Model model) {
        Auto auto = autoService.getAutoById(1);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto1";
    }

    @RequestMapping("/auto1")
    public String auto1() {
        return "auto1";
    }


    @RequestMapping(value = "/auto2like", method = RequestMethod.POST)
    public String auto2like(Model model) {
        Auto auto = autoService.getAutoById(2);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto2";
    }

    @RequestMapping(value = "/auto2dislike", method = RequestMethod.POST)
    public String auto2dislike(Model model) {
        Auto auto = autoService.getAutoById(2);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto2";
    }

    @RequestMapping("/auto2")
    public String auto2() {
        return "auto2";
    }



    @RequestMapping(value = "/auto3like", method = RequestMethod.POST)
    public String auto3like(Model model) {
        Auto auto = autoService.getAutoById(3);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto3";
    }

    @RequestMapping(value = "/auto3dislike", method = RequestMethod.POST)
    public String auto3dislike(Model model) {
        Auto auto = autoService.getAutoById(3);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto3";
    }

    @RequestMapping("/auto3")
    public String auto3() {
        return "auto3";
    }



    @RequestMapping(value = "/auto4like", method = RequestMethod.POST)
    public String auto4like(Model model) {
        Auto auto = autoService.getAutoById(4);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto4";
    }

    @RequestMapping(value = "/auto4dislike", method = RequestMethod.POST)
    public String auto4dislike(Model model) {
        Auto auto = autoService.getAutoById(4);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto4";
    }

    @RequestMapping("/auto4")
    public String auto4() {
        return "auto4";
    }



    @RequestMapping(value = "/auto5like", method = RequestMethod.POST)
    public String auto5like(Model model) {
        Auto auto = autoService.getAutoById(5);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto5";
    }

    @RequestMapping(value = "/auto5dislike", method = RequestMethod.POST)
    public String auto5dislike(Model model) {
        Auto auto = autoService.getAutoById(5);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto5";
    }

    @RequestMapping("/auto5")
    public String auto5() {
        return "auto5";
    }



    @RequestMapping(value = "/auto6like", method = RequestMethod.POST)
    public String auto6like(Model model) {
        Auto auto = autoService.getAutoById(6);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto6";
    }

    @RequestMapping(value = "/auto6dislike", method = RequestMethod.POST)
    public String auto6dislike(Model model) {
        Auto auto = autoService.getAutoById(6);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto6";
    }

    @RequestMapping("/auto6")
    public String auto6() {
        return "auto6";
    }



    @RequestMapping(value = "/auto7like", method = RequestMethod.POST)
    public String auto7like(Model model) {
        Auto auto = autoService.getAutoById(7);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto7";
    }

    @RequestMapping(value = "/auto7dislike", method = RequestMethod.POST)
    public String auto7dislike(Model model) {
        Auto auto = autoService.getAutoById(7);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto7";
    }

    @RequestMapping("/auto7")
    public String auto7() {
        return "auto7";
    }



    @RequestMapping(value = "/auto8like", method = RequestMethod.POST)
    public String auto8like(Model model) {
        Auto auto = autoService.getAutoById(8);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto8";
    }

    @RequestMapping(value = "/auto8dislike", method = RequestMethod.POST)
    public String auto8dislike(Model model) {
        Auto auto = autoService.getAutoById(8);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto8";
    }

    @RequestMapping("/auto8")
    public String auto8() {
        return "auto8";
    }



    @RequestMapping(value = "/auto9like", method = RequestMethod.POST)
    public String auto9like(Model model) {
        Auto auto = autoService.getAutoById(9);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto9";
    }

    @RequestMapping(value = "/auto9dislike", method = RequestMethod.POST)
    public String auto9dislike(Model model) {
        Auto auto = autoService.getAutoById(9);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto9";
    }

    @RequestMapping("/auto9")
    public String auto9() {
        return "auto9";
    }



    @RequestMapping(value = "/auto10like", method = RequestMethod.POST)
    public String auto10like(Model model) {
        Auto auto = autoService.getAutoById(10);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto10";
    }

    @RequestMapping(value = "/auto10dislike", method = RequestMethod.POST)
    public String auto10dislike(Model model) {
        Auto auto = autoService.getAutoById(10);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto10";
    }

    @RequestMapping("/auto10")
    public String auto10() {
        return "auto10";
    }



    @RequestMapping(value = "/auto11like", method = RequestMethod.POST)
    public String auto11like(Model model) {
        Auto auto = autoService.getAutoById(11);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto11";
    }

    @RequestMapping(value = "/auto11dislike", method = RequestMethod.POST)
    public String auto11dislike(Model model) {
        Auto auto = autoService.getAutoById(11);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto11";
    }

    @RequestMapping("/auto11")
    public String auto11() {
        return "auto11";
    }



    @RequestMapping(value = "/auto12like", method = RequestMethod.POST)
    public String auto12like(Model model) {
        Auto auto = autoService.getAutoById(12);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto12";
    }

    @RequestMapping(value = "/auto12dislike", method = RequestMethod.POST)
    public String auto12dislike(Model model) {
        Auto auto = autoService.getAutoById(12);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto12";
    }

    @RequestMapping("/auto12")
    public String auto12() {
        return "auto12";
    }



    @RequestMapping(value = "/auto13like", method = RequestMethod.POST)
    public String auto13like(Model model) {
        Auto auto = autoService.getAutoById(13);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto13";
    }

    @RequestMapping(value = "/auto13dislike", method = RequestMethod.POST)
    public String auto13dislike(Model model) {
        Auto auto = autoService.getAutoById(13);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto13";
    }

    @RequestMapping("/auto13")
    public String auto13() {
        return "auto13";
    }



    @RequestMapping(value = "/auto14like", method = RequestMethod.POST)
    public String auto14like(Model model) {
        Auto auto = autoService.getAutoById(14);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto14";
    }

    @RequestMapping(value = "/auto14dislike", method = RequestMethod.POST)
    public String auto14dislike(Model model) {
        Auto auto = autoService.getAutoById(14);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto14";
    }

    @RequestMapping("/auto14")
    public String auto14() {
        return "auto14";
    }



    @RequestMapping(value = "/auto15like", method = RequestMethod.POST)
    public String auto15like(Model model) {
        Auto auto = autoService.getAutoById(15);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto15";
    }

    @RequestMapping(value = "/auto15dislike", method = RequestMethod.POST)
    public String auto15dislike(Model model) {
        Auto auto = autoService.getAutoById(15);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto15";
    }

    @RequestMapping("/auto15")
    public String auto15() {
        return "auto15";
    }



    @RequestMapping(value = "/auto16like", method = RequestMethod.POST)
    public String auto16like(Model model) {
        Auto auto = autoService.getAutoById(16);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto16";
    }

    @RequestMapping(value = "/auto16dislike", method = RequestMethod.POST)
    public String auto16dislike(Model model) {
        Auto auto = autoService.getAutoById(16);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto16";
    }

    @RequestMapping("/auto16")
    public String auto16() {
        return "auto16";
    }



    @RequestMapping(value = "/auto17like", method = RequestMethod.POST)
    public String auto17like(Model model) {
        Auto auto = autoService.getAutoById(17);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto17";
    }

    @RequestMapping(value = "/auto17dislike", method = RequestMethod.POST)
    public String auto17dislike(Model model) {
        Auto auto = autoService.getAutoById(17);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto17";
    }

    @RequestMapping("/auto17")
    public String auto17() {
        return "auto17";
    }



    @RequestMapping(value = "/auto18like", method = RequestMethod.POST)
    public String auto18like(Model model) {
        Auto auto = autoService.getAutoById(18);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto18";
    }

    @RequestMapping(value = "/auto18dislike", method = RequestMethod.POST)
    public String auto18dislike(Model model) {
        Auto auto = autoService.getAutoById(18);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto18";
    }

    @RequestMapping("/auto18")
    public String auto18() {
        return "auto18";
    }



    @RequestMapping(value = "/auto19like", method = RequestMethod.POST)
    public String auto19like(Model model) {
        Auto auto = autoService.getAutoById(19);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto19";
    }

    @RequestMapping(value = "/auto19dislike", method = RequestMethod.POST)
    public String auto19dislike(Model model) {
        Auto auto = autoService.getAutoById(19);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto19";
    }

    @RequestMapping("/auto19")
    public String auto19() {
        return "auto19";
    }



    @RequestMapping(value = "/auto20like", method = RequestMethod.POST)
    public String auto20like(Model model) {
        Auto auto = autoService.getAutoById(20);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto20";
    }

    @RequestMapping(value = "/auto20dislike", method = RequestMethod.POST)
    public String auto20dislike(Model model) {
        Auto auto = autoService.getAutoById(20);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto20";
    }

    @RequestMapping("/auto20")
    public String auto20() {
        return "auto20";
    }


    @RequestMapping(value = "/auto21like", method = RequestMethod.POST)
    public String auto21like(Model model) {
        Auto auto = autoService.getAutoById(21);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto21";
    }

    @RequestMapping(value = "/auto21dislike", method = RequestMethod.POST)
    public String auto21dislike(Model model) {
        Auto auto = autoService.getAutoById(21);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto21";
    }

    @RequestMapping("/auto21")
    public String auto21() {
        return "auto21";
    }



    @RequestMapping(value = "/auto22like", method = RequestMethod.POST)
    public String auto22like(Model model) {
        Auto auto = autoService.getAutoById(22);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto22";
    }

    @RequestMapping(value = "/auto22dislike", method = RequestMethod.POST)
    public String auto22dislike(Model model) {
        Auto auto = autoService.getAutoById(22);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto22";
    }

    @RequestMapping("/auto22")
    public String auto22() {
        return "auto22";
    }



    @RequestMapping(value = "/auto23like", method = RequestMethod.POST)
    public String auto23like(Model model) {
        Auto auto = autoService.getAutoById(23);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto23";
    }

    @RequestMapping(value = "/auto23dislike", method = RequestMethod.POST)
    public String auto23dislike(Model model) {
        Auto auto = autoService.getAutoById(23);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto23";
    }

    @RequestMapping("/auto23")
    public String auto23() {
        return "auto23";
    }



    @RequestMapping(value = "/auto24like", method = RequestMethod.POST)
    public String auto24like(Model model) {
        Auto auto = autoService.getAutoById(24);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto24";
    }

    @RequestMapping(value = "/auto24dislike", method = RequestMethod.POST)
    public String auto24dislike(Model model) {
        Auto auto = autoService.getAutoById(24);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto24";
    }

    @RequestMapping("/auto24")
    public String auto24() {
        return "auto24";
    }



    @RequestMapping(value = "/auto25like", method = RequestMethod.POST)
    public String auto25like(Model model) {
        Auto auto = autoService.getAutoById(25);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto25";
    }

    @RequestMapping(value = "/auto25dislike", method = RequestMethod.POST)
    public String auto25dislike(Model model) {
        Auto auto = autoService.getAutoById(25);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto25";
    }

    @RequestMapping("/auto25")
    public String auto25() {
        return "auto25";
    }



    @RequestMapping(value = "/auto26like", method = RequestMethod.POST)
    public String auto26like(Model model) {
        Auto auto = autoService.getAutoById(26);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto26";
    }

    @RequestMapping(value = "/auto26dislike", method = RequestMethod.POST)
    public String auto26dislike(Model model) {
        Auto auto = autoService.getAutoById(26);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto26";
    }

    @RequestMapping("/auto26")
    public String auto26() {
        return "auto26";
    }



    @RequestMapping(value = "/auto27like", method = RequestMethod.POST)
    public String auto27like(Model model) {
        Auto auto = autoService.getAutoById(27);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto27";
    }

    @RequestMapping(value = "/auto27dislike", method = RequestMethod.POST)
    public String auto27dislike(Model model) {
        Auto auto = autoService.getAutoById(27);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto27";
    }

    @RequestMapping("/auto27")
    public String auto27() {
        return "auto27";
    }



    @RequestMapping(value = "/auto28like", method = RequestMethod.POST)
    public String auto28like(Model model) {
        Auto auto = autoService.getAutoById(28);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto28";
    }

    @RequestMapping(value = "/auto28dislike", method = RequestMethod.POST)
    public String auto28dislike(Model model) {
        Auto auto = autoService.getAutoById(28);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto28";
    }

    @RequestMapping("/auto28")
    public String auto28() {
        return "auto28";
    }



    @RequestMapping(value = "/auto29like", method = RequestMethod.POST)
    public String auto29like(Model model) {
        Auto auto = autoService.getAutoById(29);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto29";
    }

    @RequestMapping(value = "/auto29dislike", method = RequestMethod.POST)
    public String auto29dislike(Model model) {
        Auto auto = autoService.getAutoById(29);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto29";
    }

    @RequestMapping("/auto29")
    public String auto29() {
        return "auto29";
    }



    @RequestMapping(value = "/auto30like", method = RequestMethod.POST)
    public String auto30like(Model model) {
        Auto auto = autoService.getAutoById(30);
        Integer CountLike = auto.getLike();
        auto.setLike(CountLike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("like", auto.getLike());
        model.addAttribute("dislike", auto.getDislike());

        return "auto30";
    }

    @RequestMapping(value = "/auto30dislike", method = RequestMethod.POST)
    public String auto30dislike(Model model) {
        Auto auto = autoService.getAutoById(30);
        Integer CountDislike = auto.getDislike();
        auto.setDislike(CountDislike + 1);
        autoService.updateAuto(auto);
        model.addAttribute("dislike", auto.getDislike());
        model.addAttribute("like", auto.getLike());

        return "auto30";
    }

    @RequestMapping("/auto30")
    public String auto30() {
        return "auto30";
    }


}
