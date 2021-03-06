package com.stx.dao.impl;

import com.stx.dao.CustomerDao;
import com.stx.po.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;
/*
* 一、这个类实现了CustomerDao这个接口，
*二、 继承SqlSessionDaoSupport这个类。
*   1、作为DAO的基类来使用。
*   2、这个类里面封装了SqlSession里面有增删改查的方法。
* */
public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
//    通过id查询客户。
    @Override
    public Customer findCustomerById(Integer id) {

        return this.getSqlSession().selectOne("com.stx.po.CustomerMapper.findCustomerById",id);
    }
}
