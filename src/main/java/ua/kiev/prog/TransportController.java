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
public class TransportController {

    @Autowired
    private TransportService transportService;

    @RequestMapping("/transport")
    public String transport() {
        return "transport";
    }


    @RequestMapping(value = "/transport1like", method = RequestMethod.POST)
    public String transport1like(Model model) {
        Transport transport = transportService.getTransportById(1);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport1";
    }

    @RequestMapping(value = "/transport1dislike", method = RequestMethod.POST)
    public String transport1dislike(Model model) {
        Transport transport = transportService.getTransportById(1);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport1";
    }

    @RequestMapping("/transport1")
    public String transport1() {
        return "transport1";
    }


    @RequestMapping(value = "/transport2like", method = RequestMethod.POST)
    public String transport2like(Model model) {
        Transport transport = transportService.getTransportById(2);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport2";
    }

    @RequestMapping(value = "/transport2dislike", method = RequestMethod.POST)
    public String transport2dislike(Model model) {
        Transport transport = transportService.getTransportById(2);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport2";
    }

    @RequestMapping("/transport2")
    public String transport2() {
        return "transport2";
    }


    @RequestMapping(value = "/transport3like", method = RequestMethod.POST)
    public String transport3like(Model model) {
        Transport transport = transportService.getTransportById(3);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport3";
    }

    @RequestMapping(value = "/transport3dislike", method = RequestMethod.POST)
    public String transport3dislike(Model model) {
        Transport transport = transportService.getTransportById(3);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport3";
    }

    @RequestMapping("/transport3")
    public String transport3() {
        return "transport3";
    }


    @RequestMapping(value = "/transport4like", method = RequestMethod.POST)
    public String transport4like(Model model) {
        Transport transport = transportService.getTransportById(4);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport4";
    }

    @RequestMapping(value = "/transport4dislike", method = RequestMethod.POST)
    public String transport4dislike(Model model) {
        Transport transport = transportService.getTransportById(4);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport4";
    }

    @RequestMapping("/transport4")
    public String transport4() {
        return "transport4";
    }


    @RequestMapping(value = "/transport5like", method = RequestMethod.POST)
    public String transport5like(Model model) {
        Transport transport = transportService.getTransportById(5);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport5";
    }

    @RequestMapping(value = "/transport5dislike", method = RequestMethod.POST)
    public String transport5dislike(Model model) {
        Transport transport = transportService.getTransportById(5);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport5";
    }

    @RequestMapping("/transport5")
    public String transport5() {
        return "transport5";
    }


    @RequestMapping(value = "/transport6like", method = RequestMethod.POST)
    public String transport6like(Model model) {
        Transport transport = transportService.getTransportById(6);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport6";
    }

    @RequestMapping(value = "/transport6dislike", method = RequestMethod.POST)
    public String transport6dislike(Model model) {
        Transport transport = transportService.getTransportById(6);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport6";
    }

    @RequestMapping("/transport6")
    public String transport6() {
        return "transport6";
    }


    @RequestMapping(value = "/transport7like", method = RequestMethod.POST)
    public String transport7like(Model model) {
        Transport transport = transportService.getTransportById(7);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport7";
    }

    @RequestMapping(value = "/transport7dislike", method = RequestMethod.POST)
    public String transport7dislike(Model model) {
        Transport transport = transportService.getTransportById(7);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport7";
    }

    @RequestMapping("/transport7")
    public String transport7() {
        return "transport7";
    }


    @RequestMapping(value = "/transport8like", method = RequestMethod.POST)
    public String transport8like(Model model) {
        Transport transport = transportService.getTransportById(8);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport8";
    }

    @RequestMapping(value = "/transport8dislike", method = RequestMethod.POST)
    public String transport8dislike(Model model) {
        Transport transport = transportService.getTransportById(8);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport8";
    }

    @RequestMapping("/transport8")
    public String transport8() {
        return "transport8";
    }


    @RequestMapping(value = "/transport9like", method = RequestMethod.POST)
    public String transport9like(Model model) {
        Transport transport = transportService.getTransportById(9);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport9";
    }

    @RequestMapping(value = "/transport9dislike", method = RequestMethod.POST)
    public String transport9dislike(Model model) {
        Transport transport = transportService.getTransportById(9);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport9";
    }

    @RequestMapping("/transport9")
    public String transport9() {
        return "transport9";
    }


    @RequestMapping(value = "/transport10like", method = RequestMethod.POST)
    public String transport10like(Model model) {
        Transport transport = transportService.getTransportById(10);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport10";
    }

    @RequestMapping(value = "/transport10dislike", method = RequestMethod.POST)
    public String transport10dislike(Model model) {
        Transport transport = transportService.getTransportById(10);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport10";
    }

    @RequestMapping("/transport10")
    public String transport10() {
        return "transport10";
    }


    @RequestMapping(value = "/transport11like", method = RequestMethod.POST)
    public String transport11like(Model model) {
        Transport transport = transportService.getTransportById(11);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport11";
    }

    @RequestMapping(value = "/transport11dislike", method = RequestMethod.POST)
    public String transport11dislike(Model model) {
        Transport transport = transportService.getTransportById(11);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport11";
    }

    @RequestMapping("/transport11")
    public String transport11() {
        return "transport11";
    }


    @RequestMapping(value = "/transport12like", method = RequestMethod.POST)
    public String transport12like(Model model) {
        Transport transport = transportService.getTransportById(12);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport12";
    }

    @RequestMapping(value = "/transport12dislike", method = RequestMethod.POST)
    public String transport12dislike(Model model) {
        Transport transport = transportService.getTransportById(12);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport12";
    }

    @RequestMapping("/transport12")
    public String transport12() {
        return "transport12";
    }


    @RequestMapping(value = "/transport13like", method = RequestMethod.POST)
    public String transport13like(Model model) {
        Transport transport = transportService.getTransportById(13);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport13";
    }

    @RequestMapping(value = "/transport13dislike", method = RequestMethod.POST)
    public String transport13dislike(Model model) {
        Transport transport = transportService.getTransportById(13);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport13";
    }

    @RequestMapping("/transport13")
    public String transport13() {
        return "transport13";
    }


    @RequestMapping(value = "/transport14like", method = RequestMethod.POST)
    public String transport14like(Model model) {
        Transport transport = transportService.getTransportById(14);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport14";
    }

    @RequestMapping(value = "/transport14dislike", method = RequestMethod.POST)
    public String transport14dislike(Model model) {
        Transport transport = transportService.getTransportById(14);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport14";
    }

    @RequestMapping("/transport14")
    public String transport14() {
        return "transport14";
    }


    @RequestMapping(value = "/transport15like", method = RequestMethod.POST)
    public String transport15like(Model model) {
        Transport transport = transportService.getTransportById(15);
        Integer CountLike = transport.getLike();
        transport.setLike(CountLike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("like", transport.getLike());
        model.addAttribute("dislike", transport.getDislike());

        return "transport15";
    }

    @RequestMapping(value = "/transport15dislike", method = RequestMethod.POST)
    public String transport15dislike(Model model) {
        Transport transport = transportService.getTransportById(15);
        Integer CountDislike = transport.getDislike();
        transport.setDislike(CountDislike + 1);
        transportService.updateTransport(transport);
        model.addAttribute("dislike", transport.getDislike());
        model.addAttribute("like", transport.getLike());

        return "transport15";
    }

    @RequestMapping("/transport15")
    public String transport15() {
        return "transport15";
    }
}