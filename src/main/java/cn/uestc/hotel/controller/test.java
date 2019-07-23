package cn.uestc.hotel.controller;

import cn.uestc.hotel.service.Cservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

    @Autowired
    private Cservice CService;

    @RequestMapping("/Customer")
    public String goUserListPage(Model model) {
        model.addAttribute("users", CService.listCustomer());
        return "List.html";
    }


}
