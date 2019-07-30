package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.domain.Hotel;
import cn.uestc.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


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


    @GetMapping("/logout")
    public String logout(HttpServletRequest request, Model model, Customer customer) {
        //使cookie无效
        request.getSession(false).invalidate();

        return "/index";
    }


    @GetMapping("/register")
    public String getRegisterPage(Model model, Customer customer) {
        return "register";
    }


    @PostMapping("/register")

    public String registerCustomer(Model model, Customer customer) {
        customer.setRoleid("2");
        customerService.insertCustomer(customer);
        return "redirect:login";

    }


    @PostMapping("/search")
    public String searchhotel(@RequestParam("word") String word, Model model) {
        List<Hotel> hotels = customerService.search(word);
        model.addAttribute("hotels", hotels);
        return "searchResult";

    }

    @GetMapping("search")
    public String getSearchPage(Model model, Customer customer, HttpServletRequest request) {
        customer = customerService.findCustomerByRequest(request);//customer has the total data including id,name,password....
        if (customer == null) {
            model.addAttribute("msg", "0");
        } else {
            model.addAttribute("customer", customer);
        }

        return "search";
    }

    @RequestMapping("customerInformation")
    public String getCustomerPage(Model model, Customer customer, HttpServletRequest request) {
        customer = customerService.findCustomerByRequest(request);//customer has the total data including id,name,password....
        if (customer == null) {
            model.addAttribute("msg", "0");
        } else {
            model.addAttribute("customer", customer);
        }
        return "customerInformation";//用户修改页面
    }

    @GetMapping("customerInformationEdit")
    public String getCustomerInformationEdit(Model model, Customer customer) {

        return "customerInformationEdit";//用户修改页面
    }

    @GetMapping("customerPasswordEdit")
    public String getCustomerPassportEdit(Model model, Customer customer) {

        return "customerPasswordEdit";//密码修改页面
    }

    @PostMapping("customerPasswordEdit")
    public String ChangePassword(Model model, Customer customer, HttpServletRequest request) {
        String customerid = customerService.findCustomerByRequest(request).getCustomerid();
        customerService.updateCustomer(customer, customerid);
        return "customerInformation";//密码修改页面
    }

    @PostMapping("customerInformationEdit")
    public String customerInformationEdit(Model model, Customer customer, HttpServletRequest request) {
        String customerid = customerService.findCustomerByRequest(request).getCustomerid();
        customerService.updateCustomer(customer, customerid);
        return "customerInformation";
    }

    @RequestMapping("orderview")
    public String orderview(Model model, Customer customer, HttpServletRequest request) {
        customer = customerService.findCustomerByRequest(request);//customer has the total data including id,name,password....
        if (customer == null) {
            model.addAttribute("msg", "0");
        } else {
            model.addAttribute("customer", customer);
        }
        String customerid = customerService.findCustomerByRequest(request).getCustomerid();
        model.addAttribute("orderForms", customerService.selectOrderFormByCustomerID(customerid));
        return "orderview";//查看订单页面
    }

    @RequestMapping("/roomlist")
    public String getRoomList(Model model,@RequestParam("hotelid") String hotelid) {

        model.addAttribute("rooms",customerService.selectRoomByHotelID(hotelid));
        return "roomlist";
    }

}
