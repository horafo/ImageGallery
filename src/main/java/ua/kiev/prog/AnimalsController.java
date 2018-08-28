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
public class AnimalsController {

    @Autowired
    private AnimalsService animalsService;

    @RequestMapping("/animals")
    public String animals() {
        return "animals";
    }


    @RequestMapping(value = "/animals1like", method = RequestMethod.POST)
    public String animals1like(Model model) {
        Animals animals = animalsService.getAnimalsById(1);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals1";
    }

    @RequestMapping(value = "/animals1dislike", method = RequestMethod.POST)
    public String animals1dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(1);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals1";
    }

    @RequestMapping("/animals1")
    public String animals1() {
        return "animals1";
    }


    @RequestMapping(value = "/animals2like", method = RequestMethod.POST)
    public String animals2like(Model model) {
        Animals animals = animalsService.getAnimalsById(2);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals2";
    }

    @RequestMapping(value = "/animals2dislike", method = RequestMethod.POST)
    public String animals2dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(2);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals2";
    }

    @RequestMapping("/animals2")
    public String animals2() {
        return "animals2";
    }


    @RequestMapping(value = "/animals3like", method = RequestMethod.POST)
    public String animals3like(Model model) {
        Animals animals = animalsService.getAnimalsById(3);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals3";
    }

    @RequestMapping(value = "/animals3dislike", method = RequestMethod.POST)
    public String animals3dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(3);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals3";
    }

    @RequestMapping("/animals3")
    public String animals3() {
        return "animals3";
    }


    @RequestMapping(value = "/animals4like", method = RequestMethod.POST)
    public String animals4like(Model model) {
        Animals animals = animalsService.getAnimalsById(4);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals4";
    }

    @RequestMapping(value = "/animals4dislike", method = RequestMethod.POST)
    public String animals4dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(4);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals4";
    }

    @RequestMapping("/animals4")
    public String animals4() {
        return "animals4";
    }


    @RequestMapping(value = "/animals5like", method = RequestMethod.POST)
    public String animals5like(Model model) {
        Animals animals = animalsService.getAnimalsById(5);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals5";
    }

    @RequestMapping(value = "/animals5dislike", method = RequestMethod.POST)
    public String animals5dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(5);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals5";
    }

    @RequestMapping("/animals5")
    public String animals5() {
        return "animals5";
    }


    @RequestMapping(value = "/animals6like", method = RequestMethod.POST)
    public String animals6like(Model model) {
        Animals animals = animalsService.getAnimalsById(6);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals6";
    }

    @RequestMapping(value = "/animals6dislike", method = RequestMethod.POST)
    public String animals6dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(6);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals6";
    }

    @RequestMapping("/animals6")
    public String animals6() {
        return "animals6";
    }


    @RequestMapping(value = "/animals7like", method = RequestMethod.POST)
    public String animals7like(Model model) {
        Animals animals = animalsService.getAnimalsById(7);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals7";
    }

    @RequestMapping(value = "/animals7dislike", method = RequestMethod.POST)
    public String animals7dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(7);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals7";
    }

    @RequestMapping("/animals7")
    public String animals7() {
        return "animals7";
    }


    @RequestMapping(value = "/animals8like", method = RequestMethod.POST)
    public String animals8like(Model model) {
        Animals animals = animalsService.getAnimalsById(8);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals8";
    }

    @RequestMapping(value = "/animals8dislike", method = RequestMethod.POST)
    public String animals8dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(8);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals8";
    }

    @RequestMapping("/animals8")
    public String animals8() {
        return "animals8";
    }


    @RequestMapping(value = "/animals9like", method = RequestMethod.POST)
    public String animals9like(Model model) {
        Animals animals = animalsService.getAnimalsById(9);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals9";
    }

    @RequestMapping(value = "/animals9dislike", method = RequestMethod.POST)
    public String animals9dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(9);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals9";
    }

    @RequestMapping("/animals9")
    public String animals9() {
        return "animals9";
    }


    @RequestMapping(value = "/animals10like", method = RequestMethod.POST)
    public String animals10like(Model model) {
        Animals animals = animalsService.getAnimalsById(10);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals10";
    }

    @RequestMapping(value = "/animals10dislike", method = RequestMethod.POST)
    public String animals10dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(10);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals10";
    }

    @RequestMapping("/animals10")
    public String animals10() {
        return "animals10";
    }


    @RequestMapping(value = "/animals11like", method = RequestMethod.POST)
    public String animals11like(Model model) {
        Animals animals = animalsService.getAnimalsById(11);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals11";
    }

    @RequestMapping(value = "/animals11dislike", method = RequestMethod.POST)
    public String animals11dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(11);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals11";
    }

    @RequestMapping("/animals11")
    public String animals11() {
        return "animals11";
    }


    @RequestMapping(value = "/animals12like", method = RequestMethod.POST)
    public String animals12like(Model model) {
        Animals animals = animalsService.getAnimalsById(12);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals12";
    }

    @RequestMapping(value = "/animals12dislike", method = RequestMethod.POST)
    public String animals12dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(12);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals12";
    }

    @RequestMapping("/animals12")
    public String animals12() {
        return "animals12";
    }


    @RequestMapping(value = "/animals13like", method = RequestMethod.POST)
    public String animals13like(Model model) {
        Animals animals = animalsService.getAnimalsById(13);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals13";
    }

    @RequestMapping(value = "/animals13dislike", method = RequestMethod.POST)
    public String animals13dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(13);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals13";
    }

    @RequestMapping("/animals13")
    public String animals13() {
        return "animals13";
    }


    @RequestMapping(value = "/animals14like", method = RequestMethod.POST)
    public String animals14like(Model model) {
        Animals animals = animalsService.getAnimalsById(14);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals14";
    }

    @RequestMapping(value = "/animals14dislike", method = RequestMethod.POST)
    public String animals14dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(14);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals14";
    }

    @RequestMapping("/animals14")
    public String animals14() {
        return "animals14";
    }


    @RequestMapping(value = "/animals15like", method = RequestMethod.POST)
    public String animals15like(Model model) {
        Animals animals = animalsService.getAnimalsById(15);
        Integer CountLike = animals.getLike();
        animals.setLike(CountLike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("like", animals.getLike());
        model.addAttribute("dislike", animals.getDislike());

        return "animals15";
    }

    @RequestMapping(value = "/animals15dislike", method = RequestMethod.POST)
    public String animals15dislike(Model model) {
        Animals animals = animalsService.getAnimalsById(15);
        Integer CountDislike = animals.getDislike();
        animals.setDislike(CountDislike + 1);
        animalsService.updateAnimals(animals);
        model.addAttribute("dislike", animals.getDislike());
        model.addAttribute("like", animals.getLike());

        return "animals15";
    }

    @RequestMapping("/animals15")
    public String animals15() {
        return "animals15";
    }



}