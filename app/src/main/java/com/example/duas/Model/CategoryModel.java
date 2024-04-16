package com.example.duas.Model;

public class CategoryModel {

    private int img;
    private String title;

    public CategoryModel(int img, String name) {
        this.img = img;
        this.title = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

