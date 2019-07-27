package cn.uestc.hotel.service;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.domain.CustomerExample;
import cn.uestc.hotel.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Service
public class CustomerService {
@Autowired
    private CustomerMapper customerMapper;
    public Customer checkCustomer(Customer customer){
        CustomerExample ex=new CustomerExample();
        ex.createCriteria().andCustomeridEqualTo(customer.getCustomerid()).andCustomerpasswordEqualTo(customer.getCustomerpassword());
        List<Customer> customers=customerMapper.selectByExample(ex);
        return customers.size()>0 ? customers.get(0) :null;

    }
    public Customer findCustomerByid(HttpServletRequest request){

       return customerMapper.selectByPrimaryKey(request.getSession().getAttribute("customerid").toString());

    }

}
