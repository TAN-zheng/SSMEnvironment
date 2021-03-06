package com.stx.test;

import com.stx.po.Customer;
import com.stx.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {
    public static void main(String[] args) {
        ApplicationContext act=
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        1、获取了CustomerService的实例
        CustomerService customerService =act.getBean(CustomerService.class);
//        2、创建Customer对象
        Customer customer = new Customer();
        customer.setUsername("zhangsan");
        customer.setJobs("manager");
        customer.setPhone("13233334444");
//        调用接口类实现类里面的方法。
        customerService.addCustomerService(customer);
    }
}
