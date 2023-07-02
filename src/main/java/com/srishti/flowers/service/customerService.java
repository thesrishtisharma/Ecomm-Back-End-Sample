package com.srishti.flowers.service;

import com.srishti.flowers.dao.customerDao;
import com.srishti.flowers.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerService{

    @Autowired
    private customerDao customerDao;

    public customer addCustomer(customer customer){
        return customerDao.save(customer);
    }

    public List<customer> getCustomerList(){
        return customerDao.findAll();
    }

    public List<customer> getCustomerByEmail(String email){
        return customerDao.findByEmail(email);
    }

}
