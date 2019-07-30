package cn.uestc.hotel.service;

import cn.uestc.hotel.domain.*;
import cn.uestc.hotel.mapper.CustomerMapper;
import cn.uestc.hotel.mapper.HotelMapper;
import cn.uestc.hotel.mapper.OrderFormMapper;
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

    public Customer checkCustomer(Customer customer) {
        CustomerExample ex = new CustomerExample();
        ex.createCriteria().andCustomeridEqualTo(customer.getCustomerid()).andCustomerpasswordEqualTo(customer.getCustomerpassword());
        List<Customer> customers = customerMapper.selectByExample(ex);
        return customers.size() > 0 ? customers.get(0) : null;

    }
    public Customer findCustomerByRequest(HttpServletRequest request) {

        return customerMapper.selectByPrimaryKey(request.getSession().getAttribute("customerid").toString());

    }
    public Boolean deleteCustomerByid(String customerid) {
        customerMapper.deleteByPrimaryKey(customerid);
        return true;
    }
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }
    public List<Hotel> search(String word) {
        HotelExample ex = new HotelExample();
        HotelExample.Criteria criteria1 = ex.createCriteria();
        criteria1.andHotelnameLike("%"+word+"%");
        HotelExample.Criteria criteria2 = ex.createCriteria();
        criteria2.andAddressLike("%"+word+"%");
        ex.or(criteria2);


        if(hotelMapper.selectByExample(ex)!=null){
            return hotelMapper.selectByExample(ex);
        }
        else {
            return null;
        }


    }
    public Boolean insertCustomer(Customer customer){
       if(customer!=null) {
           customerMapper.insert(customer);
           return true;
       }
       else {
           return false;
       }
    }
    public List<OrderForm> selectOrderFormByCustomerID(String customerID){
        OrderFormExample ex=new OrderFormExample();
        ex.createCriteria().andCustomeridEqualTo(customerID);
        return orderFormMapper.selectByExample(ex);
    }
    public Boolean updateCustomer(Customer customer,String customerid){
        customer.setCustomerid(customerid);
        customerMapper.updateByPrimaryKeySelective(customer);
        return true;
    }

}

