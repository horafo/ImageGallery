package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/brand")
    public String architecture() {
        return "brand";
    }



    @RequestMapping(value = "/brand1like", method = RequestMethod.POST)
    public String brand1like(Model model) {
        Brand brand = brandService.getBrandById(1);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand1";
    }

    @RequestMapping(value = "/brand1dislike", method = RequestMethod.POST)
    public String brand1dislike(Model model) {
        Brand brand = brandService.getBrandById(1);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand1";
    }

    @RequestMapping("/brand1")
    public String brand1() { return "brand1";}



    @RequestMapping(value = "/brand2like", method = RequestMethod.POST)
    public String brand2like(Model model) {
        Brand brand = brandService.getBrandById(2);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand2";
    }

    @RequestMapping(value = "/brand2dislike", method = RequestMethod.POST)
    public String brand2dislike(Model model) {
        Brand brand = brandService.getBrandById(2);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand2";
    }

    @RequestMapping("/brand2")
    public String brand2() { return "brand2";}



    @RequestMapping(value = "/brand3like", method = RequestMethod.POST)
    public String brand3like(Model model) {
        Brand brand = brandService.getBrandById(3);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand3";
    }

    @RequestMapping(value = "/brand3dislike", method = RequestMethod.POST)
    public String brand3dislike(Model model) {
        Brand brand = brandService.getBrandById(3);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand3";
    }

    @RequestMapping("/brand3")
    public String brand3() { return "brand3";}



    @RequestMapping(value = "/brand4like", method = RequestMethod.POST)
    public String brand4like(Model model) {
        Brand brand = brandService.getBrandById(4);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand4";
    }

    @RequestMapping(value = "/brand4dislike", method = RequestMethod.POST)
    public String brand4dislike(Model model) {
        Brand brand = brandService.getBrandById(4);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand4";
    }

    @RequestMapping("/brand4")
    public String brand4() { return "brand4";}



    @RequestMapping(value = "/brand5like", method = RequestMethod.POST)
    public String brand5like(Model model) {
        Brand brand = brandService.getBrandById(5);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand5";
    }

    @RequestMapping(value = "/brand5dislike", method = RequestMethod.POST)
    public String brand5dislike(Model model) {
        Brand brand = brandService.getBrandById(5);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand5";
    }

    @RequestMapping("/brand5")
    public String brand5() { return "brand5";}



    @RequestMapping(value = "/brand6like", method = RequestMethod.POST)
    public String brand6like(Model model) {
        Brand brand = brandService.getBrandById(6);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand6";
    }

    @RequestMapping(value = "/brand6dislike", method = RequestMethod.POST)
    public String brand6dislike(Model model) {
        Brand brand = brandService.getBrandById(6);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand6";
    }

    @RequestMapping("/brand6")
    public String brand6() { return "brand6";}



    @RequestMapping(value = "/brand7like", method = RequestMethod.POST)
    public String brand7like(Model model) {
        Brand brand = brandService.getBrandById(7);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand7";
    }

    @RequestMapping(value = "/brand7dislike", method = RequestMethod.POST)
    public String brand7dislike(Model model) {
        Brand brand = brandService.getBrandById(7);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand7";
    }

    @RequestMapping("/brand7")
    public String brand7() { return "brand7";}



    @RequestMapping(value = "/brand8like", method = RequestMethod.POST)
    public String brand8like(Model model) {
        Brand brand = brandService.getBrandById(8);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand8";
    }

    @RequestMapping(value = "/brand8dislike", method = RequestMethod.POST)
    public String brand8dislike(Model model) {
        Brand brand = brandService.getBrandById(8);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand8";
    }

    @RequestMapping("/brand8")
    public String brand8() { return "brand8";}



    @RequestMapping(value = "/brand9like", method = RequestMethod.POST)
    public String brand9like(Model model) {
        Brand brand = brandService.getBrandById(9);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand9";
    }

    @RequestMapping(value = "/brand9dislike", method = RequestMethod.POST)
    public String brand9dislike(Model model) {
        Brand brand = brandService.getBrandById(9);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand9";
    }

    @RequestMapping("/brand9")
    public String brand9() { return "brand9";}



    @RequestMapping(value = "/brand10like", method = RequestMethod.POST)
    public String brand10like(Model model) {
        Brand brand = brandService.getBrandById(10);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand10";
    }

    @RequestMapping(value = "/brand10dislike", method = RequestMethod.POST)
    public String brand10dislike(Model model) {
        Brand brand = brandService.getBrandById(10);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand10";
    }

    @RequestMapping("/brand10")
    public String brand10() { return "brand10";}



    @RequestMapping(value = "/brand11like", method = RequestMethod.POST)
    public String brand11like(Model model) {
        Brand brand = brandService.getBrandById(11);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand11";
    }

    @RequestMapping(value = "/brand11dislike", method = RequestMethod.POST)
    public String brand11dislike(Model model) {
        Brand brand = brandService.getBrandById(11);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand11";
    }

    @RequestMapping("/brand11")
    public String brand11() { return "brand11";}



    @RequestMapping(value = "/brand12like", method = RequestMethod.POST)
    public String brand12like(Model model) {
        Brand brand = brandService.getBrandById(12);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand12";
    }

    @RequestMapping(value = "/brand12dislike", method = RequestMethod.POST)
    public String brand12dislike(Model model) {
        Brand brand = brandService.getBrandById(12);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand12";
    }

    @RequestMapping("/brand12")
    public String brand12() { return "brand12";}



    @RequestMapping(value = "/brand13like", method = RequestMethod.POST)
    public String brand13like(Model model) {
        Brand brand = brandService.getBrandById(13);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand13";
    }

    @RequestMapping(value = "/brand13dislike", method = RequestMethod.POST)
    public String brand13dislike(Model model) {
        Brand brand = brandService.getBrandById(13);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand13";
    }

    @RequestMapping("/brand13")
    public String brand13() { return "brand13";}



    @RequestMapping(value = "/brand14like", method = RequestMethod.POST)
    public String brand14like(Model model) {
        Brand brand = brandService.getBrandById(14);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand14";
    }

    @RequestMapping(value = "/brand14dislike", method = RequestMethod.POST)
    public String brand14dislike(Model model) {
        Brand brand = brandService.getBrandById(14);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand14";
    }

    @RequestMapping("/brand14")
    public String brand14() { return "brand14";}



    @RequestMapping(value = "/brand15like", method = RequestMethod.POST)
    public String brand15like(Model model) {
        Brand brand = brandService.getBrandById(15);
        Integer CountLike = brand.getLike();
        brand.setLike(CountLike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("like", brand.getLike());
        model.addAttribute("dislike", brand.getDislike());

        return "brand15";
    }

    @RequestMapping(value = "/brand15dislike", method = RequestMethod.POST)
    public String brand15dislike(Model model) {
        Brand brand = brandService.getBrandById(15);
        Integer CountDislike = brand.getDislike();
        brand.setDislike(CountDislike + 1);
        brandService.updateBrand(brand);
        model.addAttribute("dislike", brand.getDislike());
        model.addAttribute("like", brand.getLike());

        return "brand15";
    }

    @RequestMapping("/brand15")
    public String brand15() { return "brand15";}


}
