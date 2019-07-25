package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.service.Cservice;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class test {

    @Autowired
    private Cservice Cservice;
    //访问服务器跳转页面。
    @RequestMapping("/")
    public String index(Model model) {

        return "index.html";
    }



    //login 的跳转页面
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("customer",new Customer());
        return "login.html";
    }




    //访问customer的跳转界面
    @GetMapping("/list")
    public String goUserListPage(Model model) {
        model.addAttribute("customer", Cservice.listCustomer());

        return "list.html";
    }


    @PostMapping("/list")
    public String test2(@ModelAttribute Customer customer,Model model) {
        model.addAttribute("check", (Cservice.findUserByPrimaryKey(customer.getCid())).getCpassword());
        System.out.println((Cservice.findUserByPrimaryKey(customer.getCid())).getCpassword());
        System.out.println(customer.getCpassword());
        if((Cservice.findUserByPrimaryKey(customer.getCid())).getCpassword().equals(customer.getCpassword())){
            return "list";
        }
        else  {return "login";

                }

    }

    //访问search的跳转界面。
    @GetMapping("/search")
    public String goUserEditPage(@RequestParam("cid") String id, Model model) {
        Customer customer = Cservice.findUserByPrimaryKey(id);
        model.addAttribute("customer", customer);
        return "list.html";
    }
}
