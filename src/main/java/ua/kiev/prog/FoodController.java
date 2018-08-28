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
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/food")
    public String food() {
        return "food";
    }


    @RequestMapping(value = "/food1like", method = RequestMethod.POST)
    public String food1like(Model model) {
        Food food = foodService.getFoodById(1);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food1";
    }

    @RequestMapping(value = "/food1dislike", method = RequestMethod.POST)
    public String food1dislike(Model model) {
        Food food = foodService.getFoodById(1);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food1";
    }

    @RequestMapping("/food1")
    public String food1() {
        return "food1";
    }


    @RequestMapping(value = "/food2like", method = RequestMethod.POST)
    public String food2like(Model model) {
        Food food = foodService.getFoodById(2);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food2";
    }

    @RequestMapping(value = "/food2dislike", method = RequestMethod.POST)
    public String food2dislike(Model model) {
        Food food = foodService.getFoodById(2);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food2";
    }

    @RequestMapping("/food2")
    public String food2() {
        return "food2";
    }



    @RequestMapping(value = "/food3like", method = RequestMethod.POST)
    public String food3like(Model model) {
        Food food = foodService.getFoodById(3);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food3";
    }

    @RequestMapping(value = "/food3dislike", method = RequestMethod.POST)
    public String food3dislike(Model model) {
        Food food = foodService.getFoodById(3);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food3";
    }

    @RequestMapping("/food3")
    public String food3() {
        return "food3";
    }



    @RequestMapping(value = "/food4like", method = RequestMethod.POST)
    public String food4like(Model model) {
        Food food = foodService.getFoodById(4);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food4";
    }

    @RequestMapping(value = "/food4dislike", method = RequestMethod.POST)
    public String food4dislike(Model model) {
        Food food = foodService.getFoodById(4);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food4";
    }

    @RequestMapping("/food4")
    public String food4() {
        return "food4";
    }



    @RequestMapping(value = "/food5like", method = RequestMethod.POST)
    public String food5like(Model model) {
        Food food = foodService.getFoodById(5);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food5";
    }

    @RequestMapping(value = "/food5dislike", method = RequestMethod.POST)
    public String food5dislike(Model model) {
        Food food = foodService.getFoodById(5);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food5";
    }

    @RequestMapping("/food5")
    public String food5() {
        return "food5";
    }



    @RequestMapping(value = "/food6like", method = RequestMethod.POST)
    public String food6like(Model model) {
        Food food = foodService.getFoodById(6);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food6";
    }

    @RequestMapping(value = "/food6dislike", method = RequestMethod.POST)
    public String food6dislike(Model model) {
        Food food = foodService.getFoodById(6);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food6";
    }

    @RequestMapping("/food6")
    public String food6() {
        return "food6";
    }



    @RequestMapping(value = "/food7like", method = RequestMethod.POST)
    public String food7like(Model model) {
        Food food = foodService.getFoodById(7);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food7";
    }

    @RequestMapping(value = "/food7dislike", method = RequestMethod.POST)
    public String food7dislike(Model model) {
        Food food = foodService.getFoodById(7);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food7";
    }

    @RequestMapping("/food7")
    public String food7() {
        return "food7";
    }



    @RequestMapping(value = "/food8like", method = RequestMethod.POST)
    public String food8like(Model model) {
        Food food = foodService.getFoodById(8);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food8";
    }

    @RequestMapping(value = "/food8dislike", method = RequestMethod.POST)
    public String food8dislike(Model model) {
        Food food = foodService.getFoodById(8);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food8";
    }

    @RequestMapping("/food8")
    public String food8() {
        return "food8";
    }



    @RequestMapping(value = "/food9like", method = RequestMethod.POST)
    public String food9like(Model model) {
        Food food = foodService.getFoodById(9);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food9";
    }

    @RequestMapping(value = "/food9dislike", method = RequestMethod.POST)
    public String food9dislike(Model model) {
        Food food = foodService.getFoodById(9);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food9";
    }

    @RequestMapping("/food9")
    public String food9() {
        return "food9";
    }



    @RequestMapping(value = "/food10like", method = RequestMethod.POST)
    public String food10like(Model model) {
        Food food = foodService.getFoodById(10);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food10";
    }

    @RequestMapping(value = "/food10dislike", method = RequestMethod.POST)
    public String food10dislike(Model model) {
        Food food = foodService.getFoodById(10);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food10";
    }

    @RequestMapping("/food10")
    public String food10() {
        return "food10";
    }



    @RequestMapping(value = "/food11like", method = RequestMethod.POST)
    public String food11like(Model model) {
        Food food = foodService.getFoodById(11);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food11";
    }

    @RequestMapping(value = "/food11dislike", method = RequestMethod.POST)
    public String food11dislike(Model model) {
        Food food = foodService.getFoodById(11);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food11";
    }

    @RequestMapping("/food11")
    public String food11() {
        return "food11";
    }



    @RequestMapping(value = "/food12like", method = RequestMethod.POST)
    public String food12like(Model model) {
        Food food = foodService.getFoodById(12);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food12";
    }

    @RequestMapping(value = "/food12dislike", method = RequestMethod.POST)
    public String food12dislike(Model model) {
        Food food = foodService.getFoodById(12);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food12";
    }

    @RequestMapping("/food12")
    public String food12() {
        return "food12";
    }



    @RequestMapping(value = "/food13like", method = RequestMethod.POST)
    public String food13like(Model model) {
        Food food = foodService.getFoodById(13);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food13";
    }

    @RequestMapping(value = "/food13dislike", method = RequestMethod.POST)
    public String food13dislike(Model model) {
        Food food = foodService.getFoodById(13);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food13";
    }

    @RequestMapping("/food13")
    public String food13() {
        return "food13";
    }



    @RequestMapping(value = "/food14like", method = RequestMethod.POST)
    public String food14like(Model model) {
        Food food = foodService.getFoodById(14);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food14";
    }

    @RequestMapping(value = "/food14dislike", method = RequestMethod.POST)
    public String food14dislike(Model model) {
        Food food = foodService.getFoodById(14);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food14";
    }

    @RequestMapping("/food14")
    public String food14() {
        return "food14";
    }



    @RequestMapping(value = "/food15like", method = RequestMethod.POST)
    public String food15like(Model model) {
        Food food = foodService.getFoodById(15);
        Integer CountLike = food.getLike();
        food.setLike(CountLike + 1);
        foodService.updateFood(food);
        model.addAttribute("like", food.getLike());
        model.addAttribute("dislike", food.getDislike());

        return "food15";
    }

    @RequestMapping(value = "/food15dislike", method = RequestMethod.POST)
    public String food15dislike(Model model) {
        Food food = foodService.getFoodById(15);
        Integer CountDislike = food.getDislike();
        food.setDislike(CountDislike + 1);
        foodService.updateFood(food);
        model.addAttribute("dislike", food.getDislike());
        model.addAttribute("like", food.getLike());

        return "food15";
    }

    @RequestMapping("/food15")
    public String food15() {
        return "food15";
    }

}