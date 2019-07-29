package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/login")
    public String getLoginPage(HttpServletRequest request, Customer customer) {
        request.getSession(true);
        return "login";
    }


    @PostMapping("/login")
    public String login(@ModelAttribute Customer customer, Model model, HttpServletRequest request, HttpServletResponse response) {

        if (customerService.checkCustomer(customer) != null) {
            request.getSession().setAttribute("customerid", customer.getCustomerid());
            return "redirect:index";
        } else {
            model.addAttribute("msg", "0");
            return "login";
        }

    }


    @GetMapping("/customer")
    public String customeredit(Model model, Customer customer) {
        return "customer";
    }


    @GetMapping("/logout")
    public String logout(HttpServletRequest request,Model model, Customer customer) {
        //使cookie无效
       request.getSession(false).invalidate();

        return "/index";
    }


    @GetMapping("/register")
    public String register(Model model, Customer customer) {
        return "register";
    }


}
