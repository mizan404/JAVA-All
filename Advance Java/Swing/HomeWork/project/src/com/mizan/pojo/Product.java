package com.mizan.pojo;

public class Product {

    private int id;
    private String name;//unique
    private String code;//unique
    private String photoUrl;
    private Category category;
    private boolean status;
    private String note;

    public Product() {
    }

    public Product(String name, String code, String photoUrl, Category category, boolean status, String note) {
        this.name = name;
        this.code = code;
        this.photoUrl = photoUrl;
        this.category = category;
        this.status = status;
        this.note = note;
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.photoUrl = photoUrl;
        this.category = category;
        this.status = status;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isStatus() {
        return status;
    }

    public String getNote() {
        return note;
    }

}
