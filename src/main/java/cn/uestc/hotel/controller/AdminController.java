package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Hotel;
import cn.uestc.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class AdminController {
    @Autowired
    private CustomerService customerService;


    @GetMapping("customerList")
    public String getCustomerListPage(Model model) {

        model.addAttribute("customers", customerService.findAllCustomer());
        return "customerList";
    }

    @GetMapping("hotelList")
    public String getHotelListPage(Model model) {

        model.addAttribute("hotels", customerService.findAllHotel());
        return "hotelList";
    }

    @PostMapping("hotelList")
    public String addImg(Model model, @RequestParam("img") MultipartFile file, @RequestParam("hotelid") String hotelid) throws IOException {
        Hotel hotel = customerService.searchHotelByHotelID(hotelid);
        if (file != null) {
            hotel.setImg(file.getBytes());
            hotel.setImgname(file.getOriginalFilename());
            hotel.setImglength(file.getSize());
            hotel.setImgtype(file.getContentType());
            customerService.updateHotel(hotel);
        }
        model.addAttribute("hotels", customerService.findAllHotel());
        return "hotelList";
    }

    @GetMapping("hotelEdit")
    public String hotelEdit(Model model, @RequestParam("hotelid") String hotelid) {

        Hotel hotel = customerService.searchHotelByHotelID(hotelid);
        model.addAttribute("hotel", hotel);
        return "hotelEdit";
    }

    @GetMapping("/deleteCustomer")
    @ResponseBody
    public Boolean deleteCustomer(@RequestParam("id") String id) {
        customerService.deleteCustomerByid(id);
        return true;
    }

    @GetMapping("/deleteHotel")
    @ResponseBody
    public Boolean deleteUser(@RequestParam("id") String id) {
        customerService.deleteHotelByid(id);
        return true;
    }


    @GetMapping("grant")
    @ResponseBody
    public Boolean grant(@RequestParam("id") String id) {
        return customerService.grant(id);

    }

}
