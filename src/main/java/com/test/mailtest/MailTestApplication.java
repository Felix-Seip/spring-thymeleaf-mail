package com.test.mailtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailTestApplication implements CommandLineRunner {

	@Autowired
	private MyMailSender myMailSender;

	public static void main(String[] args) {
		SpringApplication.run(MailTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myMailSender.sendMail();
		System.out.println("Sent Email to felixseip01@gmail.com");
	}
}
