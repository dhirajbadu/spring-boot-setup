package com.setup.setup;

import com.setup.setup.service.contact.ContactInfo;
import com.setup.setup.service.contact.ContactInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@ComponentScan({"com.setup.setup.service" , "com.setup.setup.controller"})
@SpringBootApplication
public class SetupApplication {

	@Autowired
	private ContactInfoRepository contactInfoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SetupApplication.class, args);

	}

	@PostConstruct
	private void createContact(){
		contactInfoRepository.save(new ContactInfo("Dhiraj" , "12345"));
		contactInfoRepository.save(new ContactInfo("Benis" , "12345"));
		contactInfoRepository.save(new ContactInfo("Kailas" , "12345"));
	}

}
