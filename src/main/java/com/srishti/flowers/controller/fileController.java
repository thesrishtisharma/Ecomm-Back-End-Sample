package com.srishti.flowers.controller;

import com.srishti.flowers.model.file;
import com.srishti.flowers.service.fileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class fileController {

    @Autowired
    public fileService fileService;

    @PostMapping("/addFile")
    public file addFile(@RequestBody file file){
        return fileService.addFile(file);
    }

    @GetMapping("/fileList")
    public List<file> getFileList(){
        return fileService.getFileList();
    }

    @GetMapping("/fileListByType/{type}")
    public  List<file> getFileListByType(@PathVariable String type){
        return fileService.getFileListByType(type);
    }

    @GetMapping("/fileListById/{id}")
    public List<file> getFileListById(@PathVariable int id){
        return fileService.getFileListById(id);
    }

    @GetMapping("/fileListLowToHigh")
    public List<file> getFileListByPriceAsc(){
        return  fileService.getFileListByPriceAsc();
    }

    @GetMapping("/fileListLowToHigh/{type}")
    public List<file> findByTypeOrderByPriceAsc(@PathVariable String type){
        return fileService.findByTypeOrderByPriceAsc(type);
    }

    @GetMapping("/fileListHighToLow")
    public List<file> findByOrderByPriceDesc(){
        return fileService.findByOrderByPriceDesc();
    }

    @GetMapping("/fileListHighToLow/{type}")
    public List<file> findByTypeOrderByPriceDesc(@PathVariable String type){
        return fileService.findByTypeOrderByPriceDesc(type);
    }
}
