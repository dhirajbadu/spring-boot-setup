package com.setup.setup.controller;

import com.setup.setup.service.contact.ContactInfo;
import com.setup.setup.service.contact.ContactInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexRestController {

    @Autowired
    private ContactInfoRepository contactInfoRepository;

    @GetMapping("/api")
    public List<ContactInfo> index(){
        List<ContactInfo> contactInfoList = contactInfoRepository.findAll();
        return contactInfoList;
    }
}
