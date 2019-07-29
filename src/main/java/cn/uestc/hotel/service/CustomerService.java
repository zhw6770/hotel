package cn.uestc.hotel.service;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.domain.CustomerExample;
import cn.uestc.hotel.domain.Hotel;
import cn.uestc.hotel.domain.HotelExample;
import cn.uestc.hotel.mapper.CustomerMapper;
import cn.uestc.hotel.mapper.HotelMapper;
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

    public Customer checkCustomer(Customer customer) {
        CustomerExample ex = new CustomerExample();
        ex.createCriteria().andCustomeridEqualTo(customer.getCustomerid()).andCustomerpasswordEqualTo(customer.getCustomerpassword());
        List<Customer> customers = customerMapper.selectByExample(ex);
        return customers.size() > 0 ? customers.get(0) : null;

    }

    public Customer findCustomerByid(HttpServletRequest request) {

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
        criteria2.andHotelnameLike("%"+word+"%");
        ex.or(criteria2);


        if(hotelMapper.selectByExample(ex)!=null){
            return hotelMapper.selectByExample(ex);
        }
        else {
            return null;
        }


    }

}
