package com.example.products.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brands")

public class Brands {
    @Id
    @Column(name = "brand_id")
    private int id;
    @Column(name = "brand_title")
    private String title;

    public Brands() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
