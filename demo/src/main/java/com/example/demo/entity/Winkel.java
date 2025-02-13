package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "winkel")


public class Winkel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String logo;
    private String store_email;
    private String phone;
    private String address;


    @OneToOne(mappedBy = "winkel")
    private Admin admin;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStore_email() {
        return store_email;
    }

    public void setStore_email(String store_email) {
        this.store_email = store_email;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





}
