package com.example.photofragments_main;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class ContentFrag extends Fragment {
    GridView gridView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.content_frag, container, false);
        gridView = view.findViewById(R.id.grid);
        return view;
    }

    private AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(getContext(), ViewPhotoActivity.class);
            intent.putExtra("id", gridView.getAdapter().getItemId(i));
            startActivity(intent);
        }
    };

    public void updateContent(int position){
        PhotoAdapter photoAdapter = new PhotoAdapter(PhotoData.getPhotosByCategory(position), getContext());
        gridView.setAdapter(photoAdapter);
        gridView.setOnItemClickListener(onItemClick);
    }
}
