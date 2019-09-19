package com.setup.setup.controller;

import com.setup.setup.service.contact.ContactInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private ContactInfoRepository contactInfoRepository;

    @GetMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("contactList" , contactInfoRepository.findAll());
        return "index";
    }
}
