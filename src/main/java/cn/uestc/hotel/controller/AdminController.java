package cn.uestc.hotel.controller;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.domain.Hotel;
import cn.uestc.hotel.domain.HotelWithBLOBs;
import cn.uestc.hotel.domain.Room;
import cn.uestc.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private CustomerService customerService;


    @GetMapping("customerList")
    public String getCustomerListPage(Model model,Customer customer, HttpServletRequest request) {
        if (customerService.searchCustomerByRequest(request) == null) {
            Customer customer1 = new Customer();
            customer1.setCustomername("登录");
            model.addAttribute("customer", customer1);
        } else {
            customer = customerService.searchCustomerByRequest(request);
            model.addAttribute("customer", customer);
        }
        model.addAttribute("customers", customerService.findAllCustomer());
        return "customerList";
    }

    @GetMapping("hotelList")
    public String getHotelListPage(Model model, Customer customer, HttpServletRequest request) {

        if (customerService.searchCustomerByRequest(request) == null) {
            Customer customer1 = new Customer();
            customer1.setCustomername("登录");
            model.addAttribute("customer", customer1);
        } else {
            customer = customerService.searchCustomerByRequest(request);
            model.addAttribute("customer", customer);
        }
        model.addAttribute("hotels", customerService.findAllHotel());
        return "hotelList";
    }

    @PostMapping("hotelList")
    public String addImg(Model model, @RequestParam("img") MultipartFile file, @RequestParam("img1") MultipartFile file1, @RequestParam("img2") MultipartFile file2, @RequestParam("img3") MultipartFile file3, @RequestParam("img4") MultipartFile file4, @RequestParam("img5") MultipartFile file5, @RequestParam("hotelid") String hotelid, @RequestParam("name") String name, @RequestParam("tel") String tel) throws IOException {
        Hotel hotel = customerService.searchHotelByHotelID(hotelid);
        hotel.setHotelname(name);
        hotel.setTel(tel);
        customerService.updateHotel(hotel);
        HotelWithBLOBs hotelwithblobs = customerService.searchHotelWithBlobByHotelID(hotelid);
        if (file.getSize() != 0) {
            hotelwithblobs.setImg(file.getBytes());
            hotelwithblobs.setImgname(file.getOriginalFilename());

            customerService.updateHotelWithBolb(hotelwithblobs);
            if (file1.getSize() != 0) {
                hotelwithblobs.setTypeimg1(file1.getBytes());
                hotelwithblobs.setTypeimgname1(file1.getOriginalFilename());
                customerService.updateHotelWithBolb(hotelwithblobs);
            }
            if (file2.getSize() != 0) {
                hotelwithblobs.setTypeimg2(file2.getBytes());
                hotelwithblobs.setTypeimgname2(file2.getOriginalFilename());
                customerService.updateHotelWithBolb(hotelwithblobs);
            }
            if (file3.getSize() != 0) {
                hotelwithblobs.setTypeimg3(file3.getBytes());
                hotelwithblobs.setTypeimgname3(file3.getOriginalFilename());
                customerService.updateHotelWithBolb(hotelwithblobs);
            }
            if (file4.getSize() != 0) {
                hotelwithblobs.setTypeimg4(file4.getBytes());
                hotelwithblobs.setTypeimgname4(file4.getOriginalFilename());
                customerService.updateHotelWithBolb(hotelwithblobs);
            }
            if (file5.getSize() != 0) {
                hotelwithblobs.setTypeimg5(file5.getBytes());
                hotelwithblobs.setTypeimgname5(file5.getOriginalFilename());
                customerService.updateHotelWithBolb(hotelwithblobs);
            }
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

    @GetMapping("roomList")
    public String getRoomListPage(Model model, @RequestParam("hotelid") String hotelid) {

        List<Room> rooms = customerService.findAllRoom(hotelid);
        model.addAttribute("rooms", rooms);
        return "roomList";
    }

    @GetMapping("roomEdit")
    public String roomEdit(Model model, @RequestParam("roomid") String roomid) {

        Room room = customerService.searchRoomByRoomID(roomid);
        model.addAttribute("room", room);
        return "roomEdit";
    }

    @GetMapping("/deleteCustomer")
    @ResponseBody
    public Boolean deleteCustomer(@RequestParam("id") String id) {
        customerService.deleteCustomerByid(id);
        return true;
    }

    @GetMapping("/changeCustomer")
    public String changeCustomer(@RequestParam("id") String id) {
        customerService.changeCustomerStateByid(id);
        return "redirect:customerList";
    }

    @GetMapping("grant")
    public String grant(@RequestParam("id") String id) {
        customerService.grant(id);
        return "redirect:customerList";

    }



    @GetMapping("/deleteHotel")
    public String deleteUser(@RequestParam("id") String id) {
        customerService.deleteHotelByid(id);
        return "redirect:hotelList";
    }


    @GetMapping("/changeHotel")
    public String changeHotel(@RequestParam("id") String id) {
        customerService.changeHotelStateByid(id);
        return "redirect:hotelList";
    }


}
