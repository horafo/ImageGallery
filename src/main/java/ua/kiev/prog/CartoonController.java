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
public class CartoonController {

    @Autowired
    private CartoonService cartoonService;

    @RequestMapping("/cartoon")
    public String cartoon() {
        return "cartoon";
    }



    @RequestMapping(value = "/cartoon1like", method = RequestMethod.POST)
    public String cartoon1like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(1);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon1";
    }

    @RequestMapping(value = "/cartoon1dislike", method = RequestMethod.POST)
    public String cartoon1dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(1);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon1";
    }

    @RequestMapping("/cartoon1")
    public String cartoon1() {
        return "cartoon1";
    }



    @RequestMapping(value = "/cartoon2like", method = RequestMethod.POST)
    public String cartoon2like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(2);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon2";
    }

    @RequestMapping(value = "/cartoon2dislike", method = RequestMethod.POST)
    public String cartoon2dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(2);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon2";
    }

    @RequestMapping("/cartoon2")
    public String cartoon2() {
        return "cartoon2";
    }



    @RequestMapping(value = "/cartoon3like", method = RequestMethod.POST)
    public String cartoon3like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(3);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon3";
    }

    @RequestMapping(value = "/cartoon3dislike", method = RequestMethod.POST)
    public String cartoon3dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(3);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon3";
    }

    @RequestMapping("/cartoon3")
    public String cartoon3() {
        return "cartoon3";
    }



    @RequestMapping(value = "/cartoon4like", method = RequestMethod.POST)
    public String cartoon4like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(4);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon4";
    }

    @RequestMapping(value = "/cartoon4dislike", method = RequestMethod.POST)
    public String cartoon4dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(4);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon4";
    }

    @RequestMapping("/cartoon4")
    public String cartoon4() {
        return "cartoon4";
    }



    @RequestMapping(value = "/cartoon5like", method = RequestMethod.POST)
    public String cartoon5like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(5);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon5";
    }

    @RequestMapping(value = "/cartoon5dislike", method = RequestMethod.POST)
    public String cartoon5dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(5);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon5";
    }

    @RequestMapping("/cartoon5")
    public String cartoon5() {
        return "cartoon5";
    }



    @RequestMapping(value = "/cartoon6like", method = RequestMethod.POST)
    public String cartoon6like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(6);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon6";
    }

    @RequestMapping(value = "/cartoon6dislike", method = RequestMethod.POST)
    public String cartoon6dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(6);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon6";
    }

    @RequestMapping("/cartoon6")
    public String cartoon6() {
        return "cartoon6";
    }



    @RequestMapping(value = "/cartoon7like", method = RequestMethod.POST)
    public String cartoon7like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(7);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon7";
    }

    @RequestMapping(value = "/cartoon7dislike", method = RequestMethod.POST)
    public String cartoon7dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(7);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon7";
    }

    @RequestMapping("/cartoon7")
    public String cartoon7() {
        return "cartoon7";
    }



    @RequestMapping(value = "/cartoon8like", method = RequestMethod.POST)
    public String cartoon8like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(8);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon8";
    }

    @RequestMapping(value = "/cartoon8dislike", method = RequestMethod.POST)
    public String cartoon8dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(8);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon8";
    }

    @RequestMapping("/cartoon8")
    public String cartoon8() {
        return "cartoon8";
    }



    @RequestMapping(value = "/cartoon9like", method = RequestMethod.POST)
    public String cartoon9like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(9);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon9";
    }

    @RequestMapping(value = "/cartoon9dislike", method = RequestMethod.POST)
    public String cartoon9dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(9);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon9";
    }

    @RequestMapping("/cartoon9")
    public String cartoon9() {
        return "cartoon9";
    }



    @RequestMapping(value = "/cartoon10like", method = RequestMethod.POST)
    public String cartoon10like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(10);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon10";
    }

    @RequestMapping(value = "/cartoon10dislike", method = RequestMethod.POST)
    public String cartoon10dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(10);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon10";
    }

    @RequestMapping("/cartoon10")
    public String cartoon10() {
        return "cartoon10";
    }



    @RequestMapping(value = "/cartoon11like", method = RequestMethod.POST)
    public String cartoon11like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(11);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon11";
    }

    @RequestMapping(value = "/cartoon11dislike", method = RequestMethod.POST)
    public String cartoon11dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(11);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon11";
    }

    @RequestMapping("/cartoon11")
    public String cartoon11() {
        return "cartoon11";
    }



    @RequestMapping(value = "/cartoon12like", method = RequestMethod.POST)
    public String cartoon12like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(12);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon12";
    }

    @RequestMapping(value = "/cartoon12dislike", method = RequestMethod.POST)
    public String cartoon12dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(12);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon12";
    }

    @RequestMapping("/cartoon12")
    public String cartoon12() {
        return "cartoon12";
    }



    @RequestMapping(value = "/cartoon13like", method = RequestMethod.POST)
    public String cartoon13like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(13);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon13";
    }

    @RequestMapping(value = "/cartoon13dislike", method = RequestMethod.POST)
    public String cartoon13dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(13);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon13";
    }

    @RequestMapping("/cartoon13")
    public String cartoon13() {
        return "cartoon13";
    }



    @RequestMapping(value = "/cartoon14like", method = RequestMethod.POST)
    public String cartoon14like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(14);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon14";
    }

    @RequestMapping(value = "/cartoon14dislike", method = RequestMethod.POST)
    public String cartoon14dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(14);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon14";
    }

    @RequestMapping("/cartoon14")
    public String cartoon14() {
        return "cartoon14";
    }



    @RequestMapping(value = "/cartoon15like", method = RequestMethod.POST)
    public String cartoon15like(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(15);
        Integer CountLike = cartoon.getLike();
        cartoon.setLike(CountLike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("like", cartoon.getLike());
        model.addAttribute("dislike", cartoon.getDislike());

        return "cartoon15";
    }

    @RequestMapping(value = "/cartoon15dislike", method = RequestMethod.POST)
    public String cartoon15dislike(Model model) {
        Cartoon cartoon = cartoonService.getCartoonById(15);
        Integer CountDislike = cartoon.getDislike();
        cartoon.setDislike(CountDislike + 1);
        cartoonService.updateCartoon(cartoon);
        model.addAttribute("dislike", cartoon.getDislike());
        model.addAttribute("like", cartoon.getLike());

        return "cartoon15";
    }

    @RequestMapping("/cartoon15")
    public String cartoon15() {
        return "cartoon15";
    }


}
