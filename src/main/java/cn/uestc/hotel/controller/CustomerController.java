package cn.uestc.hotel.controller;


import cn.uestc.hotel.domain.*;
import cn.uestc.hotel.service.BasicService;
import cn.uestc.hotel.service.CustomerService;

import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    @Autowired
    private BasicService basicService;

    @GetMapping("IP")
    public String localtion(Model model) {
        try {
            String location = basicService.showIP();
            while (location.equals("false")) {
                location = basicService.showIP();
            }

            String word = "";
            String where = "";
            String hotelclass = "0";
            List<Hotel> hotels = customerService.searchHotelByConditions(word, where, hotelclass);
            model.addAttribute("hotels", hotels);

        } catch (Exception e) {
        } finally {
            return "hotelResult";
        }

    }


    @GetMapping("showHotelImg")
    public ResponseEntity<Resource> showHotelImg(@RequestParam("hotelid") String hotelid) {
        HotelWithBLOBs hotelWithBLOBs = customerService.searchHotelWithBlobByHotelID(hotelid);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(hotelWithBLOBs.getImgtype()))
                .body(new ByteArrayResource(((HotelWithBLOBs) hotelWithBLOBs).getImg()));


    }


    @GetMapping("showRoomImg1")
    public ResponseEntity<Resource> showRoom1Img1(@RequestParam("hotelid") String hotelid) {
        HotelWithBLOBs hotelWithBLOBs = customerService.searchHotelWithBlobByHotelID(hotelid);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(hotelWithBLOBs.getImgtype()))
                .body(new ByteArrayResource(((HotelWithBLOBs) hotelWithBLOBs).getTypeimg1()));
    }

    @GetMapping("showRoomImg2")
    public ResponseEntity<Resource> showRoom1Img2(@RequestParam("hotelid") String hotelid) {
        HotelWithBLOBs hotelWithBLOBs = customerService.searchHotelWithBlobByHotelID(hotelid);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(hotelWithBLOBs.getImgtype()))
                .body(new ByteArrayResource(((HotelWithBLOBs) hotelWithBLOBs).getTypeimg2()));
    }

    @GetMapping("showRoomImg3")
    public ResponseEntity<Resource> showRoom1Img3(@RequestParam("hotelid") String hotelid) {
        HotelWithBLOBs hotelWithBLOBs = customerService.searchHotelWithBlobByHotelID(hotelid);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(hotelWithBLOBs.getImgtype()))
                .body(new ByteArrayResource(((HotelWithBLOBs) hotelWithBLOBs).getTypeimg3()));
    }

    @GetMapping("showRoomImg4")
    public ResponseEntity<Resource> showRoom1Img4(@RequestParam("hotelid") String hotelid) {
        HotelWithBLOBs hotelWithBLOBs = customerService.searchHotelWithBlobByHotelID(hotelid);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(hotelWithBLOBs.getImgtype()))
                .body(new ByteArrayResource(((HotelWithBLOBs) hotelWithBLOBs).getTypeimg4()));
    }

    @GetMapping("showRoomImg5")
    public ResponseEntity<Resource> showRoom1Img5(@RequestParam("hotelid") String hotelid) {
        HotelWithBLOBs hotelWithBLOBs = customerService.searchHotelWithBlobByHotelID(hotelid);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(hotelWithBLOBs.getImgtype()))
                .body(new ByteArrayResource(((HotelWithBLOBs) hotelWithBLOBs).getTypeimg5()));
    }


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

        return "redirect:index";
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


    @GetMapping("customerInformationEdit")
    public String getCustomerInformationEdit(Model model, Customer customer) {

        return "customerInformationEdit";//用户修改页面
    }

    @PostMapping("customerInformationEdit")
    public String customerInformationEdit(Model model, Customer customer, HttpServletRequest request) {
        String customerid = customerService.searchCustomerByRequest(request).getCustomerid();
        customerService.updateCustomer(customer, customerid);
        return "redirect:index";
    }

    @GetMapping("customerPasswordEdit")
    public String getCustomerPassportEdit(Model model, Customer customer) {

        return "customerPasswordEdit";//密码修改页面
    }

    @PostMapping("customerPasswordEdit")
    public String ChangePassword(Model model, Customer customer, HttpServletRequest request) {
        String customerid = customerService.searchCustomerByRequest(request).getCustomerid();
        customerService.updateCustomer(customer, customerid);
        return "redirect:index";
    }

    @GetMapping("orderConfirm")
    public String orderConfirm(Model model, @RequestParam("hotelid") String hotelid, @RequestParam("roomtype") String roomtype, @RequestParam("hotelname") String hotelname, @RequestParam("dailyprice") String dailyprice, @RequestParam("arrivetime") String arrivetime, @RequestParam("lefttime") String lefttime, @RequestParam("num") String num) {
        model.addAttribute("arrivetime", arrivetime);
        model.addAttribute("lefttime", lefttime);
        model.addAttribute("num", num);
        model.addAttribute("hotelid", hotelid);
        model.addAttribute("hotelname", hotelname);
        model.addAttribute("dailyprice", dailyprice);
        model.addAttribute("roomtype", roomtype);
        int days = basicService.getDays(arrivetime, lefttime);
        Float price = days * Float.valueOf(dailyprice) * Integer.valueOf(num);
        model.addAttribute("price", price);
        return "orderConfirm";//查看订单页面
    }


    @GetMapping("orderview")
    public String orderview(Model model, Customer customer, HttpServletRequest request) {
        if (customerService.searchCustomerByRequest(request) == null) {
            Customer customer1 = new Customer();
            customer1.setCustomername("登录");
            model.addAttribute("customer", customer1);
        } else {

            customer = customerService.searchCustomerByRequest(request);
            model.addAttribute("customer", customer);
        }
        String customerid = customerService.searchCustomerByRequest(request).getCustomerid();
        model.addAttribute("orderForms", customerService.selectOrderFormByCustomerID(customerid));
        return "orderview";//查看订单页面
    }


    @PostMapping("hotelResult")
    public String searchHotel(Customer customer, HttpServletRequest request, OrderForm orderform,@RequestParam("word") String word, Model model, @RequestParam("hotelclass") String hotelclass, @RequestParam("where") String where, @RequestParam("arrivetime") String arrivetime, @RequestParam("lefttime") String lefttime, @RequestParam("roomNum") String num) {
        if (arrivetime.equals("") || lefttime.equals("")) {

            if (customerService.searchCustomerByRequest(request) == null) {
                Customer customer1 = new Customer();
                customer1.setCustomername("登录");
                model.addAttribute("customer", customer1);
            } else {
                customer = customerService.searchCustomerByRequest(request);
                model.addAttribute("customer", customer);
            }
            model.addAttribute("orderform", orderform);
model.addAttribute("msg","0");
            return "index";
        }


        List<Hotel> hotels = customerService.searchHotelByConditions(word, where, hotelclass);
        model.addAttribute("hotels", hotels);
        model.addAttribute("arrivetime", arrivetime);
        model.addAttribute("lefttime", lefttime);
        model.addAttribute("num", num);
        return "hotelResult";

    }


    @GetMapping("hotelInformation")
    public String getroomInformation(Model model, @RequestParam("hotelid") String hotelid, @RequestParam("arrivetime") String arrivetime, @RequestParam("lefttime") String lefttime, @RequestParam("num") String num) {
        Hotel hotel = customerService.searchHotelByHotelID(hotelid);
        model.addAttribute("arrivetime", arrivetime);
        model.addAttribute("lefttime", lefttime);
        model.addAttribute("num", num);
        Room roomType1 = customerService.searchRoomImformationByHotelIDAndType(hotelid, hotel.getRoomtype1());
        Room roomType2 = customerService.searchRoomImformationByHotelIDAndType(hotelid, hotel.getRoomtype2());
        Room roomType3 = customerService.searchRoomImformationByHotelIDAndType(hotelid, hotel.getRoomtype3());
        Room roomType4 = customerService.searchRoomImformationByHotelIDAndType(hotelid, hotel.getRoomtype4());
        Room roomType5 = customerService.searchRoomImformationByHotelIDAndType(hotelid, hotel.getRoomtype5());
        model.addAttribute("hotel", hotel);
        if (roomType1 != null) {
            model.addAttribute("roomType1", roomType1);
        } else {
            model.addAttribute("roomType1", new Room());
        }
        if (roomType2 != null) {
            model.addAttribute("roomType2", roomType2);
        } else {
            model.addAttribute("roomType2", new Room());
        }
        if (roomType3 != null) {
            model.addAttribute("roomType3", roomType3);
        } else {
            model.addAttribute("roomType3", new Room());
        }
        if (roomType4 != null) {
            model.addAttribute("roomType4", roomType4);
        } else {
            model.addAttribute("roomType4", new Room());
        }
        if (roomType5 != null) {
            model.addAttribute("roomType5", roomType5);
        } else {
            model.addAttribute("roomType5", new Room());
        }


        return "hotelInformation";
    }


    @GetMapping("/pay")
    public String getOrderRoom(HttpServletRequest request, Model model, @RequestParam("price") String price, @RequestParam("hotelid") String hotelid, @RequestParam("arrivetime") String arrivetime, @RequestParam("lefttime") String lefttime, @RequestParam("num") String num, String type) {
        List<Room> rooms = customerService.searchRoomByCondition(hotelid, arrivetime, lefttime, num, type);
        if (rooms != null) {
            OrderForm orderform = new OrderForm();
            orderform.setOrderformid(basicService.getRandString(1));//生成1段的随机数作为订单号！
            orderform.setLefttime(lefttime);
            orderform.setArrivetime(arrivetime);
            orderform.setHotelid(hotelid);
            orderform.setPrice(Float.valueOf(price));
            orderform.setRoomnum(num);
            orderform.setIsavailable("1");
            orderform.setCustomerid(customerService.searchCustomerByRequest(request).getCustomerid());
            int number = rooms.size();//房间数目
            if (number > 0) {
                orderform.setRoomid1(rooms.get(0).getRoomid());
                number--;
            }
            if (number > 0) {
                orderform.setRoomid2(rooms.get(0).getRoomid());
                number--;
            }

            if (number > 0) {
                orderform.setRoomid3(rooms.get(0).getRoomid());
                number--;
            }

            if (number > 0) {
                orderform.setRoomid4(rooms.get(0).getRoomid());
                number--;
            }

            if (number > 0) {
                orderform.setRoomid5(rooms.get(0).getRoomid());
                number--;
            }


            customerService.insertOrderForm(orderform);

        } else {
            return "订单失败";
        }


        return "redirect:orderview";
    }

@GetMapping("/cancel")
    public String cancelOrderForm(@RequestParam("orderformid") String orderformid){
        customerService.cancelOrder(orderformid);
        return "redirect:index";
}



}
