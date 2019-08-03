package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.domain.OrderForm;
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
    public String getIndexpage(Model model, Customer customer, HttpServletRequest request, OrderForm orderform) {
        if (customerService.searchCustomerByRequest(request) == null) {
            Customer customer1 = new Customer();
            customer1.setCustomername("登录");
            model.addAttribute("customer", customer1);
        } else {
            customer = customerService.searchCustomerByRequest(request);
            model.addAttribute("customer", customer);
        }
        model.addAttribute("orderform", orderform);
        return "index";
    }

    @RequestMapping("orderCreate")
    public String dr() {
        return "orderCreate";
    }


}
