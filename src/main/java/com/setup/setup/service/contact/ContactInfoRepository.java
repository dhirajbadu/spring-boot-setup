package com.setup.setup.service.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo , Long> {

    ContactInfo findByName(String name);
}
