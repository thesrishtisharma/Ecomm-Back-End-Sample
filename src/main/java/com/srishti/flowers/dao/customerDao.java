package com.srishti.flowers.dao;

import com.srishti.flowers.model.customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface customerDao extends JpaRepository<customer, Integer> {

    List<customer> findByEmail(String email);
}
