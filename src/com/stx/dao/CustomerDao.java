package com.stx.dao;

import com.stx.po.Customer;

public interface CustomerDao {
    public Customer findCustomerById(Integer id);
}
