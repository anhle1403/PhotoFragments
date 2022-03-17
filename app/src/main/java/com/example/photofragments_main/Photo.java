package com.example.photofragments_main;

public class Photo {
    private int id;
    private int category;
    private String sourcePhoto;

    public Photo(int id, int category, String sourcePhoto){
        this.id = id;
        this.category = category;
        this.sourcePhoto = sourcePhoto;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCategory() {return category;}
    public void setCategory() {this.category = category;}

    public String getSourcePhoto() { return sourcePhoto; }
    public void setSourcePhoto(String sourcePhoto) { this.sourcePhoto = sourcePhoto; }
}
