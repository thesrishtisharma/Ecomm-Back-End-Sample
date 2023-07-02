package com.srishti.flowers.service;

import com.srishti.flowers.dao.shopDao;
import com.srishti.flowers.model.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shopService {

    @Autowired
    public shopDao shopDao;

    public List<shop> getShopList(){
        return shopDao.findAll();
    }

    public List<shop> getShopListById(int id){
        return shopDao.findById(id);
    }

    public shop addShopList(shop shop){
        return shopDao.save(shop);
    }
}
