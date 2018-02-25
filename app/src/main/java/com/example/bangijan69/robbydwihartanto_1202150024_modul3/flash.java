package com.example.bangijan69.robbydwihartanto_1202150024_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class flash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            Thread.sleep(5000);
            //menunggu selama 5 detik
            Intent intent = new Intent(flash.this, login.class);
            startActivity(intent);
            //setleh itu maka akan membuka login.class
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
            // jika terjadi kesalahaan
        }
    }
}
