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
public class SpaceController {

    @Autowired
    private SpaceService spaceService;

    @RequestMapping("/space")
    public String space() {
        return "space";
    }


    @RequestMapping(value = "/space1like", method = RequestMethod.POST)
    public String space1like(Model model) {
        Space space = spaceService.getSpaceById(1);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space1";
    }

    @RequestMapping(value = "/space1dislike", method = RequestMethod.POST)
    public String space1dislike(Model model) {
        Space space = spaceService.getSpaceById(1);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space1";
    }

    @RequestMapping("/space1")
    public String space1() {
        return "space1";
    }


    @RequestMapping(value = "/space2like", method = RequestMethod.POST)
    public String space2like(Model model) {
        Space space = spaceService.getSpaceById(2);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space2";
    }

    @RequestMapping(value = "/space2dislike", method = RequestMethod.POST)
    public String space2dislike(Model model) {
        Space space = spaceService.getSpaceById(2);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space2";
    }

    @RequestMapping("/space2")
    public String space2() {
        return "space2";
    }


    @RequestMapping(value = "/space3like", method = RequestMethod.POST)
    public String space3like(Model model) {
        Space space = spaceService.getSpaceById(3);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space3";
    }

    @RequestMapping(value = "/space3dislike", method = RequestMethod.POST)
    public String space3dislike(Model model) {
        Space space = spaceService.getSpaceById(3);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space3";
    }

    @RequestMapping("/space3")
    public String space3() {
        return "space3";
    }


    @RequestMapping(value = "/space4like", method = RequestMethod.POST)
    public String space4like(Model model) {
        Space space = spaceService.getSpaceById(4);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space4";
    }

    @RequestMapping(value = "/space4dislike", method = RequestMethod.POST)
    public String space4dislike(Model model) {
        Space space = spaceService.getSpaceById(4);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space4";
    }

    @RequestMapping("/space4")
    public String space4() {
        return "space4";
    }


    @RequestMapping(value = "/space5like", method = RequestMethod.POST)
    public String space5like(Model model) {
        Space space = spaceService.getSpaceById(5);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space5";
    }

    @RequestMapping(value = "/space5dislike", method = RequestMethod.POST)
    public String space5dislike(Model model) {
        Space space = spaceService.getSpaceById(5);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space5";
    }

    @RequestMapping("/space5")
    public String space5() {
        return "space5";
    }


    @RequestMapping(value = "/space6like", method = RequestMethod.POST)
    public String space6like(Model model) {
        Space space = spaceService.getSpaceById(6);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space6";
    }

    @RequestMapping(value = "/space6dislike", method = RequestMethod.POST)
    public String space6dislike(Model model) {
        Space space = spaceService.getSpaceById(6);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space6";
    }

    @RequestMapping("/space6")
    public String space6() {
        return "space6";
    }


    @RequestMapping(value = "/space7like", method = RequestMethod.POST)
    public String space7like(Model model) {
        Space space = spaceService.getSpaceById(7);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space7";
    }

    @RequestMapping(value = "/space7dislike", method = RequestMethod.POST)
    public String space7dislike(Model model) {
        Space space = spaceService.getSpaceById(7);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space7";
    }

    @RequestMapping("/space7")
    public String space7() {
        return "space7";
    }


    @RequestMapping(value = "/space8like", method = RequestMethod.POST)
    public String space8like(Model model) {
        Space space = spaceService.getSpaceById(8);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space8";
    }

    @RequestMapping(value = "/space8dislike", method = RequestMethod.POST)
    public String space8dislike(Model model) {
        Space space = spaceService.getSpaceById(8);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space8";
    }

    @RequestMapping("/space8")
    public String space8() {
        return "space8";
    }


    @RequestMapping(value = "/space9like", method = RequestMethod.POST)
    public String space9like(Model model) {
        Space space = spaceService.getSpaceById(9);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space9";
    }

    @RequestMapping(value = "/space9dislike", method = RequestMethod.POST)
    public String space9dislike(Model model) {
        Space space = spaceService.getSpaceById(9);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space9";
    }

    @RequestMapping("/space9")
    public String space9() {
        return "space9";
    }


    @RequestMapping(value = "/space10like", method = RequestMethod.POST)
    public String space10like(Model model) {
        Space space = spaceService.getSpaceById(10);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space10";
    }

    @RequestMapping(value = "/space10dislike", method = RequestMethod.POST)
    public String space10dislike(Model model) {
        Space space = spaceService.getSpaceById(10);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space10";
    }

    @RequestMapping("/space10")
    public String space10() {
        return "space10";
    }


    @RequestMapping(value = "/space11like", method = RequestMethod.POST)
    public String space11like(Model model) {
        Space space = spaceService.getSpaceById(11);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space11";
    }

    @RequestMapping(value = "/space11dislike", method = RequestMethod.POST)
    public String space11dislike(Model model) {
        Space space = spaceService.getSpaceById(11);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space11";
    }

    @RequestMapping("/space11")
    public String space11() {
        return "space11";
    }


    @RequestMapping(value = "/space12like", method = RequestMethod.POST)
    public String space12like(Model model) {
        Space space = spaceService.getSpaceById(12);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space12";
    }

    @RequestMapping(value = "/space12dislike", method = RequestMethod.POST)
    public String space12dislike(Model model) {
        Space space = spaceService.getSpaceById(12);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space12";
    }

    @RequestMapping("/space12")
    public String space12() {
        return "space12";
    }


    @RequestMapping(value = "/space13like", method = RequestMethod.POST)
    public String space13like(Model model) {
        Space space = spaceService.getSpaceById(13);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space13";
    }

    @RequestMapping(value = "/space13dislike", method = RequestMethod.POST)
    public String space13dislike(Model model) {
        Space space = spaceService.getSpaceById(13);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space13";
    }

    @RequestMapping("/space13")
    public String space13() {
        return "space13";
    }


    @RequestMapping(value = "/space14like", method = RequestMethod.POST)
    public String space14like(Model model) {
        Space space = spaceService.getSpaceById(14);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space14";
    }

    @RequestMapping(value = "/space14dislike", method = RequestMethod.POST)
    public String space14dislike(Model model) {
        Space space = spaceService.getSpaceById(14);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space14";
    }

    @RequestMapping("/space14")
    public String space14() {
        return "space14";
    }


    @RequestMapping(value = "/space15like", method = RequestMethod.POST)
    public String space15like(Model model) {
        Space space = spaceService.getSpaceById(15);
        Integer CountLike = space.getLike();
        space.setLike(CountLike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("like", space.getLike());
        model.addAttribute("dislike", space.getDislike());

        return "space15";
    }

    @RequestMapping(value = "/space15dislike", method = RequestMethod.POST)
    public String space15dislike(Model model) {
        Space space = spaceService.getSpaceById(15);
        Integer CountDislike = space.getDislike();
        space.setDislike(CountDislike + 1);
        spaceService.updateSpace(space);
        model.addAttribute("dislike", space.getDislike());
        model.addAttribute("like", space.getLike());

        return "space15";
    }

    @RequestMapping("/space15")
    public String space15() {
        return "space15";
    }
}