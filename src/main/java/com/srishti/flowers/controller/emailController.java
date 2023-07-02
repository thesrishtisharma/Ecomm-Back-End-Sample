package com.srishti.flowers.controller;

import com.srishti.flowers.model.email;
import com.srishti.flowers.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class emailController {

    @Autowired emailService emailService;

    @PostMapping("/sendEmail")
    public ResponseEntity<email> sendEmail(@RequestBody email email){
        try {
            emailService.sendEmail(email);
            System.out.println("Success");
            return new ResponseEntity<>(email, HttpStatus.OK);
        }
        catch (MailException e){
            System.out.println(" ********** FAILED ********** ");
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
