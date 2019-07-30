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
        return "index";
    }


    @GetMapping("/index")
    public String getIndexpage(Model model, Customer customer, HttpServletRequest request) {
        customer = customerService.findCustomerByRequest(request);//customer has the total data including id,name,password....
        if (customer == null) {
            model.addAttribute("msg", "0");
        } else {
            model.addAttribute("customer", customer);
        }

        return "index";
    }

    @RequestMapping("/roomlist")
    public String sindex(Model model, Customer customer) {
        return "roomlist";
    }


}
