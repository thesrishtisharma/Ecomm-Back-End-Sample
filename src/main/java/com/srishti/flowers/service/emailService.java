package com.srishti.flowers.service;

import com.srishti.flowers.model.email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class emailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(email email){
        System.out.println("Attempting to send email...");

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom("imsrishtisharma@gmail.com");
        simpleMailMessage.setTo(email.getTo());
        simpleMailMessage.setSubject(email.getTopic());
        simpleMailMessage.setText(email.getBody());

        javaMailSender.send(simpleMailMessage);

        System.out.println("E-Mail successfully sent !");
    }
}
