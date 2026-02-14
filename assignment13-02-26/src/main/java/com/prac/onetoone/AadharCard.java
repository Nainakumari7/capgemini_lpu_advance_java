package com.prac.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AadharCard {

    @Id
    private int aadharNo;
    private String address;

    public int getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(int aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
