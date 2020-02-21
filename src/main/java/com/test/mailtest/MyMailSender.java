package com.test.mailtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Component
public class MyMailSender {
    private JavaMailSender javaMailSender;
    private MailContentBuilder mailContentBuilder;

    @Autowired
    public MyMailSender(JavaMailSender mailSender, MailContentBuilder mailContentBuilder) {
        this.javaMailSender = mailSender;
        this.mailContentBuilder = mailContentBuilder;
    }

    public void sendMail() throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo("felixseip01@gmail.com");
        helper.setSubject("Subject");
        helper.setText(mailContentBuilder.build("Hello Repository", "Hello Branch"), true);

//        FileSystemResource file
//                = new FileSystemResource(new File(""));
//        helper.addAttachment("Invoice", file);

        javaMailSender.send(message);
    }

}
