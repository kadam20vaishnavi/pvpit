package com.sbit.pvpitmockmhtcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class Gallery extends AppCompatActivity {

    RecyclerView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Gallery");

        gridView = findViewById(R.id.gallary);

        ArrayList<Imagemodel> listphotos = new ArrayList<>();

        listphotos.add(new Imagemodel(R.drawable.slide1));
        listphotos.add(new Imagemodel(R.drawable.slide2));
        listphotos.add(new Imagemodel(R.drawable.slide7));
        listphotos.add(new Imagemodel(R.drawable.slide8));
        listphotos.add(new Imagemodel(R.drawable.slide9));
        listphotos.add(new Imagemodel(R.drawable.slide10));
        listphotos.add(new Imagemodel(R.drawable.slide11));
        listphotos.add(new Imagemodel(R.drawable.slide12));
        listphotos.add(new Imagemodel(R.drawable.slide13));
        listphotos.add(new Imagemodel(R.drawable.slide14));
        listphotos.add(new Imagemodel(R.drawable.slide15));
        listphotos.add(new Imagemodel(R.drawable.slide16));
        listphotos.add(new Imagemodel(R.drawable.slide17));
        listphotos.add(new Imagemodel(R.drawable.slide18));
        listphotos.add(new Imagemodel(R.drawable.slide19));
        listphotos.add(new Imagemodel(R.drawable.slide20));
        listphotos.add(new Imagemodel(R.drawable.slide21));
        listphotos.add(new Imagemodel(R.drawable.slide22));
        listphotos.add(new Imagemodel(R.drawable.slide23));
        listphotos.add(new Imagemodel(R.drawable.slide24));
        listphotos.add(new Imagemodel(R.drawable.slide25));
        listphotos.add(new Imagemodel(R.drawable.slide26));
        listphotos.add(new Imagemodel(R.drawable.slide27));
        listphotos.add(new Imagemodel(R.drawable.slide28));
        listphotos.add(new Imagemodel(R.drawable.slide29));
        listphotos.add(new Imagemodel(R.drawable.slide30));
        listphotos.add(new Imagemodel(R.drawable.slide31));
        listphotos.add(new Imagemodel(R.drawable.slide32));
        listphotos.add(new Imagemodel(R.drawable.slide33));
        listphotos.add(new Imagemodel(R.drawable.slide34));
        listphotos.add(new Imagemodel(R.drawable.slide35));
        listphotos.add(new Imagemodel(R.drawable.slide36));
        listphotos.add(new Imagemodel(R.drawable.slide37));
        listphotos.add(new Imagemodel(R.drawable.slide38));
        listphotos.add(new Imagemodel(R.drawable.slide39));
        listphotos.add(new Imagemodel(R.drawable.slide40));
        listphotos.add(new Imagemodel(R.drawable.slide41));
        listphotos.add(new Imagemodel(R.drawable.slide42));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        GalleryAdapter adapter = new GalleryAdapter(listphotos, this);
        gridView.setAdapter(adapter);
        gridView.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}