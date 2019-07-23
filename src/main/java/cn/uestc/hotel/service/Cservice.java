package cn.uestc.hotel.service;

import cn.uestc.hotel.domain.Customer;
import cn.uestc.hotel.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Cservice {
@Autowired
    private CustomerMapper customerMapper;
    public List<Customer> listCustomer() {
        return customerMapper.findAll();
    }

}
