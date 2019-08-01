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

    public Customer checkCustomer(Customer customer) {
        CustomerExample ex = new CustomerExample();
        ex.createCriteria().andCustomeridEqualTo(customer.getCustomerid()).andCustomerpasswordEqualTo(customer.getCustomerpassword());
        List<Customer> customers = customerMapper.selectByExample(ex);
        return customers.size() > 0 ? customers.get(0) : null;

    }

    public Customer findCustomerByRequest(HttpServletRequest request) {
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

    public Boolean deleteHotelByid(String customerid) {
        hotelMapper.deleteByPrimaryKey(customerid);
        return true;
    }


    public Boolean deleteCustomerByid(String customerid) {
        customerMapper.deleteByPrimaryKey(customerid);
        return true;
    }

    public List<Customer> findAll() {
        return customerMapper.findAll();
    }

    public List<Hotel> hotelList() {
        return hotelMapper.hotelList();
    }

    public List<Hotel> searchHotelByConditions(String word, String where, String hotelclass) {
        HotelExample ex = new HotelExample();
        if(hotelclass.equals("0")){

            HotelExample.Criteria criteria1 = ex.createCriteria();
            criteria1.andHotelnameLike("%" + word + "%").andCityLike("%"+where+"%");
            HotelExample.Criteria criteria2 = ex.createCriteria();
            criteria2.andAddressLike("%" + word + "%").andCityLike("%"+where+"%");
            ex.or(criteria2);
            HotelExample.Criteria criteria3 = ex.createCriteria();
            criteria3.andCountryLike("%" + word + "%").andCityLike("%"+where+"%");
            ex.or(criteria3);

        }
        else{

            HotelExample.Criteria criteria1 = ex.createCriteria();
            criteria1.andHotelnameLike("%" + word + "%").andHotelclassEqualTo(hotelclass).andCityLike("%"+where+"%");
            HotelExample.Criteria criteria2 = ex.createCriteria();
            criteria2.andAddressLike("%" + word + "%").andHotelclassEqualTo(hotelclass).andCityLike("%"+where+"%");
            ex.or(criteria2);
            HotelExample.Criteria criteria3 = ex.createCriteria();
            criteria3.andCountryLike("%" + word + "%").andHotelclassEqualTo(hotelclass).andCityLike("%"+where+"%");
            ex.or(criteria3);

        }




        if (hotelMapper.selectByExample(ex) != null) {
            return hotelMapper.selectByExample(ex);
        } else {
            return null;
        }



    }

    public Boolean insertCustomer(Customer customer) {
        if (customer != null) {
            customerMapper.insert(customer);
            return true;
        } else {
            return false;
        }
    }

    public List<OrderForm> selectOrderFormByCustomerID(String customerID) {
        OrderFormExample ex = new OrderFormExample();
        ex.createCriteria().andCustomeridEqualTo(customerID);
        return orderFormMapper.selectByExample(ex);
    }

    public List<Room> selectByConditions(String where,String word) {
        RoomExample ex = new RoomExample();

        return roomMapper.selectByExample(ex);
    }

    public Boolean updateCustomer(Customer customer, String customerid) {
        customer.setCustomerid(customerid);
        customerMapper.updateByPrimaryKeySelective(customer);
        return true;
    }


}

