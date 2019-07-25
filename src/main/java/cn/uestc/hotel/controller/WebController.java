package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {


    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }


    @GetMapping("/login")
    public String getlogin(Model model) {
        model.addAttribute("customer", new Customer());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Customer customer, Model model) {


        if (customerService.findUserByPrimaryKey(customer.getCustomerid())==null) {
            model.addAttribute("msg", "0");
            return "login";
        }
        else if((customerService.findUserByPrimaryKey(customer.getCustomerid())).getCustomerpassword().equals(customer.getCustomerpassword())){
            return "customer";
        }
        else {
            model.addAttribute("msg", "0");
            return "login";
        }

    }


    @GetMapping("/search")
    public String goUserEditPage(@RequestParam("cid") String id, Model model) {
        Customer customer = customerService.findUserByPrimaryKey(id);
        model.addAttribute("customer", customer);
        return "list.html";
    }
}