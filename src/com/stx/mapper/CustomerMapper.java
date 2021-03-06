package com.stx.mapper;

import com.stx.po.Customer;

public interface CustomerMapper {
//    通过Id查询客户。
    public Customer findCustomerById(Integer id);
    public void addCustomer(Customer customer);
}
