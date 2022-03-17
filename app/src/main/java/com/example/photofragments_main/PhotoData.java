package com.example.photofragments_main;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, 2,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/french-onion-soup-1536x1024.jpg"));
        photos.add(new Photo(1, 2,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/coq-au-vin-1-1536x1024.jpg"));
        photos.add(new Photo(2, 2,
                "https://www.expatica.com/app/uploads/sites/5/2014/05/cassoulet-1536x1024.jpg"));
        photos.add(new Photo(3, 1,
                "https://a-z-animals.com/media/shiba-inu-1-400x300.jpg"));
        photos.add(new Photo(4, 1,
                "https://a-z-animals.com/media/2018/09/Ragdoll-header-400x300.jpg"));
        photos.add(new Photo(5, 1,
                "https://a-z-animals.com/media/2021/07/Rodent-mouse-400x300.jpg"));
        photos.add(new Photo(6, 0,
                "https://www.allaboutgardening.com/wp-content/uploads/2021/12/Japanese-Iris.jpg"));
        photos.add(new Photo(7, 0,
                "https://www.allaboutgardening.com/wp-content/uploads/2022/01/African-Violet.jpg"));
        photos.add(new Photo(8, 0,
                "https://www.allaboutgardening.com/wp-content/uploads/2021/11/American-Wisteria.jpg"));
        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for(int i = 0; i < phs.size(); i++){
            if(phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Photo> getPhotosByCategory(int category){
        ArrayList<Photo> allPhotos = generatePhotoData();
        ArrayList<Photo> photos = new ArrayList<Photo>();
        for(int i = 0; i < allPhotos.size(); i++){
            if(allPhotos.get(i).getCategory() == category){
                photos.add(allPhotos.get(i));
            }
        }
        return photos;
    }
}

