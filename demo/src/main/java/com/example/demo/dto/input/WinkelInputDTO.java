package com.example.demo.dto.input;

public class WinkelInputDTO {
    private String name;
    private String logo;
    private String store_email;
    private String phone;
    private String address;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getStore_email() {
        return store_email;
    }

    public void setStore_email(String store_email) {
        this.store_email = store_email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
} 