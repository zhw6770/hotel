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


    @RequestMapping("customerlist")
    public String getListPage(Model model) {

        model.addAttribute("customers",customerService.findAll());
        return "customerlist";
    }



    @GetMapping("/delete")
    @ResponseBody
    public Boolean deleteUser(@RequestParam("id") String id) {
        customerService.deleteCustomerByid(id);
        return true;
    }

}
