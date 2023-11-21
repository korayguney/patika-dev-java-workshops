package dev.patika.entity;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String address;
    private long ssidNumber;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(String fullName, String address, long ssidNumber, String phoneNumber) {
        this.fullName = fullName;
        this.address = address;
        this.ssidNumber = ssidNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSsidNumber() {
        return ssidNumber;
    }

    public void setSsidNumber(long ssidNumber) {
        this.ssidNumber = ssidNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
