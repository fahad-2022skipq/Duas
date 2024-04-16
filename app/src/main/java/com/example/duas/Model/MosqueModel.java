package com.example.duas.Model;

public class MosqueModel {
    private int id;
    private String title;
    private String arabicDua;
    private String urduDua;

    public MosqueModel(int id, String title,String arabicDua, String urduDua) {
        this.id = id;
        this.title = title;
        this.arabicDua = arabicDua;
        this.urduDua = urduDua;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArabicDua() {
        return arabicDua;
    }

    public void setArabicDua(String arabicDua) {
        this.arabicDua = arabicDua;
    }

    public String getUrduDua() {
        return urduDua;
    }

    public void setUrduDua(String urduDua) {
        this.urduDua = urduDua;
    }
}
