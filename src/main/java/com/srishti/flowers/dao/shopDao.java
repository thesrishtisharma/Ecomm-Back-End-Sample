package com.srishti.flowers.dao;

import com.srishti.flowers.model.shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface shopDao extends JpaRepository<shop, Integer> {

    List<shop> findById(int id);
}
