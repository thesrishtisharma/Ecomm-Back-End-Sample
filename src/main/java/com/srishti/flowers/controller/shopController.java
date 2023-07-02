package com.srishti.flowers.controller;

import com.srishti.flowers.model.shop;
import com.srishti.flowers.service.shopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class shopController {

    @Autowired
    public shopService shopService;

    @GetMapping("/shopList")
    public List<shop> getShopList(){
        return shopService.getShopList();
    }

    @GetMapping("/shopListById/{id}")
    public List<shop> getShopListById(@PathVariable int id){
        return shopService.getShopListById(id);
    }

    @PostMapping("/addShopToDb")
    public shop addShopToDb(@RequestBody shop shop){
        return shopService.addShopList(shop);
    }
}
