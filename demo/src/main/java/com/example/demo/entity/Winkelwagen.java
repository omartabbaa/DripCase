package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "winkelwagen")
public class Winkelwagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int totalprice;
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
