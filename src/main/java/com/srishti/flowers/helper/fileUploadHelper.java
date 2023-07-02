package com.srishti.flowers.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class fileUploadHelper {

    public final String UPLOAD_DIR = "D:\\Java\\JavaFullStack\\CapstoneProject\\flowersApp\\src\\assets\\img\\all";

    public boolean uploadFile(MultipartFile file){
        boolean f = false;

        try{
            Files.copy(file.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            f=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return f;
    }
}
