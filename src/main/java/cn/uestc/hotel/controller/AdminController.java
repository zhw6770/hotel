package cn.uestc.hotel.controller;

import cn.uestc.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @Autowired
    private CustomerService customerService;


    @RequestMapping("customerList")
    public String getCustomerListPage(Model model) {

        model.addAttribute("customers", customerService.findAll());
        return "customerList";
    }

    @RequestMapping("hotelList")
    public String getHotelListPage(Model model) {

        model.addAttribute("hotels", customerService.hotelList());
        return "hotelList";
    }

    @GetMapping("/deleteCustomer")
    @ResponseBody
    public Boolean deleteCustomer(@RequestParam("id") String id) {
        customerService.deleteCustomerByid(id);
        return true;
    }

    @GetMapping("/deleteHotel")
    @ResponseBody
    public Boolean deleteUser(@RequestParam("id") String id) {
        customerService.deleteHotelByid(id);
        return true;
    }


    @GetMapping("grant")
    @ResponseBody
    public Boolean grant(@RequestParam("id") String id) {
        customerService.deleteHotelByid(id);
        return true;
    }

}
