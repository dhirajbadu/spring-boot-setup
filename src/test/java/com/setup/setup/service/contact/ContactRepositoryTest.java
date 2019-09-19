package com.setup.setup.service.contact;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactRepositoryTest {

    @Autowired
    private ContactInfoRepository contactInfoRepository;

    @Test
    public void save(){
        ContactInfo expected = contactInfoRepository.save(new ContactInfo("Syam" , "121345"));
        ContactInfo actual = contactInfoRepository.findByName("Syam");
        Assert.assertEquals(expected.getName() , actual.getName());
    }
}
