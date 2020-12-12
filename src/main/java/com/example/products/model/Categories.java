package com.example.products.model;

import javax.persistence.*;

@Entity
@Table(name = "categories")

public class Categories {

    @Id
    @Column(name = "cat_id")
    private int cat_id;
    @Column(name = "cat_title")
    private String title;

    public Categories() {
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
