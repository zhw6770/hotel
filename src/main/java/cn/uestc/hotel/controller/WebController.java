package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebController {


    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String index(Model model, Customer customer) {
        return "redirect:index";
    }


    @GetMapping("/index")
    public String getIndexpage(Model model, Customer customer, HttpServletRequest request) {
        if (customerService.findCustomerByRequest(request) == null) {
            Customer customer1=new Customer();
            customer1.setCustomername("登录");
            model.addAttribute("customer", customer1);
        } else {
            customer =customerService.findCustomerByRequest(request);
            model.addAttribute("customer", customer);
        }

        return "index";
    }




}
