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
    public String index(Model model,Customer customer) {
        return "index";
    }


    @GetMapping("/login")
    public String getlogin(Model model) {
        model.addAttribute("customer", new Customer());
        return "login";
    }
    @GetMapping("/customeredit")
    public String customeredit(Model model,Customer customer) {
        return "customer";
    }
    @GetMapping("/logout")
    public String logout(Model model,Customer customer) {
        //使cookie无效
        return "/";
    }

    @GetMapping("/register")
    public String register(Model model,Customer customer) {
        return "register";
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
