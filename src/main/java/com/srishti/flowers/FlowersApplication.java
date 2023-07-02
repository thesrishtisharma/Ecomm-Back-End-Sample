package com.srishti.flowers;

import com.srishti.flowers.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FlowersApplication {

    //@Autowired
    //public emailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(FlowersApplication.class, args);
    }

    /*@EventListener()
    public void triggerWhenStarts(){
        emailService.sendEmail("itanvisharmaa@gmail.com", "hey! Checkinggg... ", "mail sent fro");
    }*/
}
