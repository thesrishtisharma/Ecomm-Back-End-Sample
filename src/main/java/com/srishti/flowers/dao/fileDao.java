package com.srishti.flowers.dao;

import com.srishti.flowers.model.file;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface fileDao extends JpaRepository<file, Integer> {
    List<file> findByType(String type);
    List<file> findById(int id);
    List<file> findByOrderByPriceAsc();
    List<file> findByTypeOrderByPriceAsc(String type);
    List<file> findByOrderByPriceDesc();
    List<file> findByTypeOrderByPriceDesc(String type);
}
