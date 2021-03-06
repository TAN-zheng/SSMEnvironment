package com.stx.service.impl;

import com.stx.mapper.CustomerMapper;
import com.stx.po.Customer;
import com.stx.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//注解一个类。
@Service
public class CustomerServiceImpl implements CustomerService {
//    注解注入CustomerMapper。
@Autowired
    private CustomerMapper customerMapper;
    @Override
//    添加客户
    public void addCustomerService(Customer customer) {
        this.customerMapper.addCustomer(customer);
        int i=1/0;
    }
}
