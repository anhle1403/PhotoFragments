package com.example.photofragments_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PhotoAdapter extends BaseAdapter {
    private ArrayList<Photo> photoList;
    private Context context;

    public PhotoAdapter(ArrayList<Photo> photoList, Context context){
        this.photoList = photoList;
        this.context = context;
    }

    public int getCount() { return photoList.size(); }
    public Object getItem(int position) { return photoList.get(position); }
    public long getItemId(int position) { return photoList.get(position).getId(); }
    public View getView(int position, View convertView, ViewGroup parent){
        final MyView dataItem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            dataItem = new MyView();
            convertView = inflater.inflate(R.layout.content_layout, null);
            dataItem.ivPhoto = convertView.findViewById(R.id.imv_photo);
            convertView.setTag(dataItem);
        }
        else {
            dataItem = (MyView) convertView.getTag();
        }
        Picasso.get().load(photoList.get(position).getSourcePhoto())
                .resize(400, 400).centerCrop().into(dataItem.ivPhoto);
        return convertView;
    }

    private static class MyView{
        ImageView ivPhoto;
    }
}
