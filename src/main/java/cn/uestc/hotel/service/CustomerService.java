package cn.uestc.hotel.service;

import cn.uestc.hotel.domain.*;
import cn.uestc.hotel.mapper.CustomerMapper;
import cn.uestc.hotel.mapper.HotelMapper;
import cn.uestc.hotel.mapper.OrderFormMapper;
import cn.uestc.hotel.mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private HotelMapper hotelMapper;
    @Autowired
    private OrderFormMapper orderFormMapper;
    @Autowired
    private RoomMapper roomMapper;


    public Boolean updateHotel(Hotel hotel) {

        hotelMapper.updateByPrimaryKey(hotel);
        return true;
    }

    public Boolean updateHotelWithBolb(HotelWithBLOBs hotelWithBLOBs) {

        hotelMapper.updateByPrimaryKeySelective(hotelWithBLOBs);
        return true;
    }

    public Boolean updateCustomer(Customer customer, String customerid) {
        customer.setCustomerid(customerid);
        customerMapper.updateByPrimaryKeySelective(customer);
        return true;
    }

    public Boolean insertOrderForm(OrderForm orderForm) {
        orderFormMapper.insert(orderForm);
        return true;
    }

    public Boolean insertCustomer(Customer customer) {
        if (customer != null) {
            customerMapper.insert(customer);
            return true;
        } else {
            return false;
        }
    }

    public Boolean deleteCustomerByid(String customerid) {
        customerMapper.deleteByPrimaryKey(customerid);
        return true;
    }

    public Boolean changeCustomerStateByid(String customerid) {
        Customer customer = customerMapper.selectByPrimaryKey(customerid);
        if (customer.getIsavailable().equals("1")) {
            customer.setIsavailable("0");
            customerMapper.updateByPrimaryKeySelective(customer);
        } else {
            customer.setIsavailable("1");
            customerMapper.updateByPrimaryKeySelective(customer);
        }
        return true;
    }

    public Boolean changeHotelStateByid(String hotelid) {

        HotelWithBLOBs hotel = hotelMapper.selectByPrimaryKey(hotelid);
        if (hotel.getIsavailable() == 1) {
            hotel.setIsavailable(0);
            hotelMapper.updateByPrimaryKeySelective(hotel);//有问题！！！！！！！！！！！！
        } else {
            hotel.setIsavailable(1);
            hotelMapper.updateByPrimaryKeySelective(hotel);
        }
        return true;
    }

    public Boolean grant(String customerid) {
        Customer customer = this.searchCustomerByCustomerID(customerid);
        System.out.println("11");
        if (Integer.valueOf(customer.getRoleid()) == 1) {
            customer.setRoleid("2");
            System.out.println("re");
        } else {
            customer.setRoleid("1");
        }
        customerMapper.updateByPrimaryKeySelective(customer);
        return true;
    }

    public Boolean cancelOrder(String orderformid) {
        OrderForm orderform = orderFormMapper.selectByPrimaryKey(orderformid);
        orderform.setIsavailable("0");
        orderFormMapper.updateByPrimaryKeySelective(orderform);//废弃订单
        int num = Integer.valueOf(orderform.getRoomnum());
        BasicService basicService = new BasicService();

        if (num > 0) {
            num--;
            List<OrderForm> list1 = this.searchOrderFormByRoomIDAndHotelid(orderform.getRoomid1(), orderform.getHotelid());
            String maxDate = "0000000000";
            for (int i = 0; i < list1.size(); i++) {
                if (basicService.getDays(maxDate, list1.get(i).getLefttime()) > 0) {
                    maxDate = list1.get(i).getLefttime();

                }
            }
            Room room1 = roomMapper.selectByPrimaryKey(orderform.getRoomid1());
            room1.setEndtime(maxDate);
            roomMapper.updateByPrimaryKeySelective(room1);
        }
        if (num > 0) {
            num--;
            List<OrderForm> list2 = this.searchOrderFormByRoomIDAndHotelid(orderform.getRoomid2(), orderform.getHotelid());
            String maxDate = "0000000000";
            for (int i = 0; i < list2.size(); i++) {
                if (basicService.getDays(maxDate, list2.get(i).getLefttime()) > 0) {
                    maxDate = list2.get(i).getLefttime();

                }
            }
            Room room2 = roomMapper.selectByPrimaryKey(orderform.getRoomid2());
            room2.setEndtime(maxDate);
            roomMapper.updateByPrimaryKeySelective(room2);
        }
        if (num > 0) {
            num--;
            List<OrderForm> list3 = this.searchOrderFormByRoomIDAndHotelid(orderform.getRoomid3(), orderform.getHotelid());
            String maxDate = "0000000000";
            for (int i = 0; i < list3.size(); i++) {
                if (basicService.getDays(maxDate, list3.get(i).getLefttime()) > 0) {
                    maxDate = list3.get(i).getLefttime();

                }
            }
            Room room3 = roomMapper.selectByPrimaryKey(orderform.getRoomid3());
            room3.setEndtime(maxDate);
            roomMapper.updateByPrimaryKeySelective(room3);
        }
        if (num > 0) {
            num--;
            List<OrderForm> list4 = this.searchOrderFormByRoomIDAndHotelid(orderform.getRoomid4(), orderform.getHotelid());
            String maxDate = "0000000000";
            for (int i = 0; i < list4.size(); i++) {
                if (basicService.getDays(maxDate, list4.get(i).getLefttime()) > 0) {
                    maxDate = list4.get(i).getLefttime();

                }
            }
            Room room4 = roomMapper.selectByPrimaryKey(orderform.getRoomid4());
            room4.setEndtime(maxDate);
            roomMapper.updateByPrimaryKeySelective(room4);
        }
        if (num > 0) {
            num--;
            List<OrderForm> list5 = this.searchOrderFormByRoomIDAndHotelid(orderform.getRoomid5(), orderform.getHotelid());
            String maxDate = "0000000000";
            for (int i = 0; i < list5.size(); i++) {
                if (basicService.getDays(maxDate, list5.get(i).getLefttime()) > 0) {
                    maxDate = list5.get(i).getLefttime();

                }
            }
            Room room5 = roomMapper.selectByPrimaryKey(orderform.getRoomid5());
            room5.setEndtime(maxDate);
            roomMapper.updateByPrimaryKeySelective(room5);
        }
        return true;
    }

    public Boolean deleteHotelByid(String customerid) {
        hotelMapper.deleteByPrimaryKey(customerid);
        return true;
    }

    public Customer checkCustomer(Customer customer) {
        CustomerExample ex = new CustomerExample();
        ex.createCriteria().andCustomeridEqualTo(customer.getCustomerid()).andCustomerpasswordEqualTo(customer.getCustomerpassword()).andIsavailableEqualTo("1");
        List<Customer> customers = customerMapper.selectByExample(ex);
        return customers.size() > 0 ? customers.get(0) : null;

    }

    public List<OrderForm> searchOrderFormByRoomIDAndHotelid(String roomid, String hotelid) {
        OrderFormExample ex = new OrderFormExample();
        OrderFormExample.Criteria criteria1 = ex.createCriteria();
        criteria1.andRoomid1EqualTo(roomid).andHotelidEqualTo(hotelid).andIsavailableEqualTo("1");
        OrderFormExample.Criteria criteria2 = ex.createCriteria();
        criteria2.andRoomid1EqualTo(roomid).andHotelidEqualTo(hotelid).andIsavailableEqualTo("1");
        ex.or(criteria2);
        OrderFormExample.Criteria criteria3 = ex.createCriteria();
        criteria3.andRoomid1EqualTo(roomid).andHotelidEqualTo(hotelid).andIsavailableEqualTo("1");
        ex.or(criteria3);
        OrderFormExample.Criteria criteria4 = ex.createCriteria();
        criteria4.andRoomid1EqualTo(roomid).andHotelidEqualTo(hotelid).andIsavailableEqualTo("1");
        ex.or(criteria4);
        OrderFormExample.Criteria criteria5 = ex.createCriteria();
        criteria5.andRoomid1EqualTo(roomid).andHotelidEqualTo(hotelid).andIsavailableEqualTo("1");
        ex.or(criteria5);

        return orderFormMapper.selectByExample(ex);


    }

    public Customer searchCustomerByRequest(HttpServletRequest request) {
        try {
            if (customerMapper.selectByPrimaryKey(request.getSession().getAttribute("customerid").toString()) != null) {
                return customerMapper.selectByPrimaryKey(request.getSession().getAttribute("customerid").toString());
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }


    }

    public Customer searchCustomerByCustomerID(String customerid) {
        return customerMapper.selectByPrimaryKey(customerid);
    }

    public Room searchRoomByRoomID(String roomid) {
        return roomMapper.selectByPrimaryKey(roomid);
    }

    public Hotel searchHotelByHotelID(String hotelid) {
        return hotelMapper.selectByPrimaryKey(hotelid);
    }

    public HotelWithBLOBs searchHotelWithBlobByHotelID(String hotelid) {
        return hotelMapper.selectByPrimaryKey(hotelid);
    }

    public Room searchRoomImformationByHotelIDAndType(String hotelid, String type) {
        try {
            RoomExample ex = new RoomExample();
            ex.createCriteria().andTypeEqualTo(type).andHotelidEqualTo(hotelid);
            return roomMapper.selectByExample(ex).get(0);
        } catch (Exception e) {
            return null;
        }


    }

    public List<Customer> findAllCustomer() {
        return customerMapper.findAll();
    }

    public List<Hotel> findAllHotel() {
        return hotelMapper.hotelList();
    }

    public List<Room> findAllRoom(String hotelid) {
        RoomExample ex = new RoomExample();
        ex.createCriteria().andHotelidEqualTo(hotelid);
        return roomMapper.selectByExample(ex);
    }

    public List<OrderForm> selectOrderFormByCustomerID(String customerID) {
        OrderFormExample ex = new OrderFormExample();
        ex.createCriteria().andCustomeridEqualTo(customerID);
        return orderFormMapper.selectByExample(ex);
    }

    public List<Hotel> searchHotelByConditions(String word, String where, String hotelclass) {
        HotelExample ex = new HotelExample();
        if (hotelclass.equals("0")) {

            HotelExample.Criteria criteria1 = ex.createCriteria();
            criteria1.andHotelnameLike("%" + word + "%").andCityLike("%" + where + "%").andIsavailableEqualTo(1);
            HotelExample.Criteria criteria2 = ex.createCriteria();
            criteria2.andAddressLike("%" + word + "%").andCityLike("%" + where + "%").andIsavailableEqualTo(1);
            ex.or(criteria2);
            HotelExample.Criteria criteria3 = ex.createCriteria();
            criteria3.andCountryLike("%" + word + "%").andCityLike("%" + where + "%").andIsavailableEqualTo(1);
            ex.or(criteria3);

        } else {

            HotelExample.Criteria criteria1 = ex.createCriteria();
            criteria1.andHotelnameLike("%" + word + "%").andHotelclassEqualTo(hotelclass).andCityLike("%" + where + "%").andIsavailableEqualTo(1);
            HotelExample.Criteria criteria2 = ex.createCriteria();
            criteria2.andAddressLike("%" + word + "%").andHotelclassEqualTo(hotelclass).andCityLike("%" + where + "%").andIsavailableEqualTo(1);
            ex.or(criteria2);
            HotelExample.Criteria criteria3 = ex.createCriteria();
            criteria3.andCountryLike("%" + word + "%").andHotelclassEqualTo(hotelclass).andCityLike("%" + where + "%").andIsavailableEqualTo(1);
            ex.or(criteria3);

        }


        if (hotelMapper.selectByExample(ex) != null) {
            return hotelMapper.selectByExample(ex);
        } else {
            return null;
        }


    }

    public List<Room> searchRoomByCondition(String hotelid, String arrivetime, String lefttime, String num, String type) {
        RoomExample ex = new RoomExample();
        int number = Integer.valueOf(num);
        ex.createCriteria().andHotelidEqualTo(hotelid).andEndtimeLessThan(arrivetime).andTypeEqualTo(type);
        List<Room> rooms = roomMapper.selectByExample(ex);
        if (rooms.size() < number) {
            return null;
        } else {
            for (int i = 0; i < number; i++) {
                rooms.get(i).setEndtime(lefttime);
                roomMapper.updateByPrimaryKeySelective(rooms.get(i));
            }
            return rooms.subList(0, number);
        }
    }


}

