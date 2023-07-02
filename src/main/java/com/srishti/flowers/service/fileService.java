package com.srishti.flowers.service;

import com.srishti.flowers.dao.fileDao;
import com.srishti.flowers.model.file;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class fileService {

    @Autowired
    public fileDao fileDao;

    public file addFile(file file){
        return fileDao.save(file);
    }

    public List<file> getFileList(){
        return fileDao.findAll();
    }

    public List<file> getFileListByType(String type){
        return fileDao.findByType(type);
    }

    public List<file> getFileListById(int id){
        return fileDao.findById(id);
    }

    public List<file> getFileListByPriceAsc(){
        return fileDao.findByOrderByPriceAsc();
    }

    public List<file> findByTypeOrderByPriceAsc(String type){
        return fileDao.findByTypeOrderByPriceAsc(type);
    }

    public List<file> findByOrderByPriceDesc(){
        return fileDao.findByOrderByPriceDesc();
    }

    public List<file> findByTypeOrderByPriceDesc(String type){
        return fileDao.findByTypeOrderByPriceDesc(type);
    }
}
