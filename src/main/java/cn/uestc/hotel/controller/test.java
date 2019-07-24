package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.service.Cservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class test {

    @Autowired
    private Cservice Cservice;
    @RequestMapping("/login")
    public String login(Model model) {

        return "login.html";
    }
    @RequestMapping("/Customer")
    public String goUserListPage(Model model) {
        model.addAttribute("customer", Cservice.listCustomer());
        return "list.html";
    }
    @GetMapping("/search")
    public String goUserEditPage(@RequestParam("cid") String id, Model model) {
        Customer customer = Cservice.findUserByPrimaryKey(id);
        model.addAttribute("customer", customer);
        return "list.html";
    }
}
