package com.mayurchaure.programmingebooks;

public class PDFModel {

    private int id;
    private String title;
    private int image;
    private String link;

    public PDFModel() {
    }

    public PDFModel(int id, String title, double price, int image, String link) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.link=link;


    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public int getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }


}