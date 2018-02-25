package com.example.bangijan69.robbydwihartanto_1202150024_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    ImageView imgview, imageView2;
    TextView textView1, textView2;

    public ArrayList<Integer> batray;

int count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        int gambar = getIntent().getIntExtra("gambar",0); // menerima pesan dari aktivit sebelumnya denagn nama gamabar
        String judul = getIntent().getStringExtra("judul");// menerima pesan dari aktivit sebelumnya denagn nama judul
        String diskripsi = getIntent().getStringExtra("diskripsi"); // menerima pesan dari aktivit sebelumnya denagn nama diskripsi
        // parrhing  dengan elemtn yang ada di layout
        imgview = (ImageView)findViewById(R.id.img_detail);
        textView1 =(TextView)findViewById(R.id.title_detail);
        textView2 =(TextView)findViewById(R.id.detail_paragraf);
        // mengeset data yang sudah dikirimkan
        imgview.setImageResource(gambar);
        textView1.setText(judul.toString());
        textView2.setText(diskripsi.toString());
        imageView2 = (ImageView)findViewById(R.id.gambar_battery);



        //array berguan untuk menapung gambar
        batray = new ArrayList<>();
        batray.add(R.drawable.ic_battery_20);
        batray.add(R.drawable.ic_battery_30);
        batray.add(R.drawable.ic_battery_50);
        batray.add(R.drawable.ic_battery_60);
        batray.add(R.drawable.ic_battery_80);
        batray.add(R.drawable.ic_battery_90);
        batray.add(R.drawable.ic_battery_full);
        // mengeset gambar du imagview2
        imageView2.setImageResource(batray.get(count));



    }

    public void tambah(View view) {
        if (count==6){ // jika =6 tidak melakukan apa apa

        }else {
            count++; // increament
            imageView2.setImageResource(batray.get(count));
            //megeset dengan mengikuti posisi dari count
        }

    }

    public void kurang(View view) {
        if(count==1){ // jika =1 tidak melakukan apa apa

        }
        else {
            count--; //dikurangi
            imageView2.setImageResource(batray.get(count));
            //megeset dengan mengikuti posisi dari count

        }
    }
}
