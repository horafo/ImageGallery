package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArchitectureController {

    @Autowired
    private ArchitectureService architectureService;

    @RequestMapping("/architecture")
    public String architecture() {
        return "architecture";
    }



    @RequestMapping(value = "/architecture1like", method = RequestMethod.POST)
    public String architecture1like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(1);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture1";
    }

    @RequestMapping(value = "/architecture1dislike", method = RequestMethod.POST)
    public String architecture1dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(1);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture1";
    }

    @RequestMapping("/architecture1")
    public String architecture1() {
        return "architecture1";
    }



    @RequestMapping(value = "/architecture2like", method = RequestMethod.POST)
    public String architecture2like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(2);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture2";
    }

    @RequestMapping(value = "/architecture2dislike", method = RequestMethod.POST)
    public String architecture2dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(2);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture2";
    }

    @RequestMapping("/architecture2")
    public String architecture2() {
        return "architecture2";
    }



    @RequestMapping(value = "/architecture3like", method = RequestMethod.POST)
    public String architecture3like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(3);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture3";
    }

    @RequestMapping(value = "/architecture3dislike", method = RequestMethod.POST)
    public String architecture3dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(3);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture3";
    }

    @RequestMapping("/architecture3")
    public String architecture3() {
        return "architecture3";
    }



    @RequestMapping(value = "/architecture4like", method = RequestMethod.POST)
    public String architecture4like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(4);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture4";
    }

    @RequestMapping(value = "/architecture4dislike", method = RequestMethod.POST)
    public String architecture4dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(4);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture4";
    }

    @RequestMapping("/architecture4")
    public String architecture4() {
        return "architecture4";
    }



    @RequestMapping(value = "/architecture5like", method = RequestMethod.POST)
    public String architecture5like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(5);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture5";
    }

    @RequestMapping(value = "/architecture5dislike", method = RequestMethod.POST)
    public String architecture5dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(5);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture5";
    }

    @RequestMapping("/architecture5")
    public String architecture5() {
        return "architecture5";
    }



    @RequestMapping(value = "/architecture6like", method = RequestMethod.POST)
    public String architecture6like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(6);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture6";
    }

    @RequestMapping(value = "/architecture6dislike", method = RequestMethod.POST)
    public String architecture6dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(6);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture6";
    }

    @RequestMapping("/architecture6")
    public String architecture6() {
        return "architecture6";
    }



    @RequestMapping(value = "/architecture7like", method = RequestMethod.POST)
    public String architecture7like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(7);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture7";
    }

    @RequestMapping(value = "/architecture7dislike", method = RequestMethod.POST)
    public String architecture7dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(7);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture7";
    }

    @RequestMapping("/architecture7")
    public String architecture7() {
        return "architecture7";
    }



    @RequestMapping(value = "/architecture8like", method = RequestMethod.POST)
    public String architecture8like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(8);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture8";
    }

    @RequestMapping(value = "/architecture8dislike", method = RequestMethod.POST)
    public String architecture8dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(8);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture8";
    }

    @RequestMapping("/architecture8")
    public String architecture8() {
        return "architecture8";
    }



    @RequestMapping(value = "/architecture9like", method = RequestMethod.POST)
    public String architecture9like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(9);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture9";
    }

    @RequestMapping(value = "/architecture9dislike", method = RequestMethod.POST)
    public String architecture9dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(9);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture9";
    }

    @RequestMapping("/architecture9")
    public String architecture9() {
        return "architecture9";
    }



    @RequestMapping(value = "/architecture10like", method = RequestMethod.POST)
    public String architecture10like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(10);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture10";
    }

    @RequestMapping(value = "/architecture10dislike", method = RequestMethod.POST)
    public String architecture10dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(10);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture10";
    }

    @RequestMapping("/architecture10")
    public String architecture10() {
        return "architecture10";
    }



    @RequestMapping(value = "/architecture11like", method = RequestMethod.POST)
    public String architecture11like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(11);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture11";
    }

    @RequestMapping(value = "/architecture11dislike", method = RequestMethod.POST)
    public String architecture11dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(11);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture11";
    }

    @RequestMapping("/architecture11")
    public String architecture11() {
        return "architecture11";
    }



    @RequestMapping(value = "/architecture12like", method = RequestMethod.POST)
    public String architecture12like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(12);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture12";
    }

    @RequestMapping(value = "/architecture12dislike", method = RequestMethod.POST)
    public String architecture12dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(12);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture12";
    }

    @RequestMapping("/architecture12")
    public String architecture12() {
        return "architecture12";
    }



    @RequestMapping(value = "/architecture13like", method = RequestMethod.POST)
    public String architecture13like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(13);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture13";
    }

    @RequestMapping(value = "/architecture13dislike", method = RequestMethod.POST)
    public String architecture13dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(13);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture13";
    }

    @RequestMapping("/architecture13")
    public String architecture13() {
        return "architecture13";
    }



    @RequestMapping(value = "/architecture14like", method = RequestMethod.POST)
    public String architecture14like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(14);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture14";
    }

    @RequestMapping(value = "/architecture14dislike", method = RequestMethod.POST)
    public String architecture14dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(14);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture14";
    }

    @RequestMapping("/architecture14")
    public String architecture14() {
        return "architecture14";
    }



    @RequestMapping(value = "/architecture15like", method = RequestMethod.POST)
    public String architecture15like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(15);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture15";
    }

    @RequestMapping(value = "/architecture15dislike", method = RequestMethod.POST)
    public String architecture15dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(15);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture15";
    }

    @RequestMapping("/architecture15")
    public String architecture15() {
        return "architecture15";
    }



    @RequestMapping(value = "/architecture16like", method = RequestMethod.POST)
    public String architecture16like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(16);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture16";
    }

    @RequestMapping(value = "/architecture16dislike", method = RequestMethod.POST)
    public String architecture16dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(16);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture16";
    }

    @RequestMapping("/architecture16")
    public String architecture16() {
        return "architecture16";
    }



    @RequestMapping(value = "/architecture17like", method = RequestMethod.POST)
    public String architecture17like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(17);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture17";
    }

    @RequestMapping(value = "/architecture17dislike", method = RequestMethod.POST)
    public String architecture17dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(17);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture17";
    }

    @RequestMapping("/architecture17")
    public String architecture17() {
        return "architecture17";
    }



    @RequestMapping(value = "/architecture18like", method = RequestMethod.POST)
    public String architecture18like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(18);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture18";
    }

    @RequestMapping(value = "/architecture18dislike", method = RequestMethod.POST)
    public String architecture18dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(18);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture18";
    }

    @RequestMapping("/architecture18")
    public String architecture18() {
        return "architecture18";
    }



    @RequestMapping(value = "/architecture19like", method = RequestMethod.POST)
    public String architecture19like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(19);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture19";
    }

    @RequestMapping(value = "/architecture19dislike", method = RequestMethod.POST)
    public String architecture19dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(19);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture19";
    }

    @RequestMapping("/architecture19")
    public String architecture19() {
        return "architecture19";
    }



    @RequestMapping(value = "/architecture20like", method = RequestMethod.POST)
    public String architecture20like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(20);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture20";
    }

    @RequestMapping(value = "/architecture20dislike", method = RequestMethod.POST)
    public String architecture20dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(20);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture20";
    }

    @RequestMapping("/architecture20")
    public String architecture20() {
        return "architecture20";
    }



    @RequestMapping(value = "/architecture21like", method = RequestMethod.POST)
    public String architecture21like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(21);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture21";
    }

    @RequestMapping(value = "/architecture21dislike", method = RequestMethod.POST)
    public String architecture21dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(21);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture21";
    }

    @RequestMapping("/architecture21")
    public String architecture21() {
        return "architecture21";
    }



    @RequestMapping(value = "/architecture22like", method = RequestMethod.POST)
    public String architecture22like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(22);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture22";
    }

    @RequestMapping(value = "/architecture22dislike", method = RequestMethod.POST)
    public String architecture22dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(22);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture22";
    }

    @RequestMapping("/architecture22")
    public String architecture22() {
        return "architecture22";
    }



    @RequestMapping(value = "/architecture23like", method = RequestMethod.POST)
    public String architecture23like(Model model) {
        Architecture architecture = architectureService.getArchitectureById(23);
        Integer CountLike = architecture.getLike();
        architecture.setLike(CountLike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("like", architecture.getLike());
        model.addAttribute("dislike", architecture.getDislike());

        return "architecture23";
    }

    @RequestMapping(value = "/architecture23dislike", method = RequestMethod.POST)
    public String architecture23dislike(Model model) {
        Architecture architecture = architectureService.getArchitectureById(23);
        Integer CountDislike = architecture.getDislike();
        architecture.setDislike(CountDislike + 1);
        architectureService.updateArchitecture(architecture);
        model.addAttribute("dislike", architecture.getDislike());
        model.addAttribute("like", architecture.getLike());

        return "architecture23";
    }

    @RequestMapping("/architecture23")
    public String architecture23() {
        return "architecture23";
    }


}
