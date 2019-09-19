package com.setup.setup.service.contact;

import javax.persistence.*;

@Entity
@Table(name = "table_contact_info")
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String mobileNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public ContactInfo(String name, String mobileNum) {
        this.name = name;
        this.mobileNum = mobileNum;
    }

    public ContactInfo(){}
}
