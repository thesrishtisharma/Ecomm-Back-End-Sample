package com.srishti.flowers.controller;

import com.srishti.flowers.helper.fileUploadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("http://localhost:4200")
public class imgController {

    @Autowired
    private fileUploadHelper fileUploadHelper;

    @PostMapping("/uploadFileToServer")
    public ResponseEntity<String> uploadFileToServer(@RequestParam("file") MultipartFile file){
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());

        try {
            //Logic for empty file
            if (file.isEmpty()) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
            }

            //Logic for content type
            if (!file.getContentType().equals("image/jpeg")) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEG/JPG content type allowed");
            }

            //File upload code..
            boolean f =  fileUploadHelper.uploadFile(file);
            if(f){
                return ResponseEntity.ok("File is successfully uploaded");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong, try again..");
    }
}
