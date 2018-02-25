package com.example.bangijan69.robbydwihartanto_1202150024_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText edit_pass, edit_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // inisialisasi prashing
        edit_user = (EditText)findViewById(R.id.edit_user);
        edit_pass = (EditText)findViewById(R.id.edit_pass);




    }

    public void login(View view) {
        // penyimpaan dari edit_user dan edit_passwor kedalaam sebuah variable
        String username =edit_user.getText().toString();
        String password = edit_pass.getText().toString();
        String us= "EAD";
        String pas = "MOBILE";



        if (us.equals(username)&& pas.equals(pas)){ // membadingkan nilai us dan pas dari vaariabel usrname dan password
            Intent intent = new Intent(login.this,Berandactivity.class);
            startActivity(intent);
        }else { // menapilkan jika kesalahan mengisi passsword
            Toast.makeText(login.this, "Username dan Passwor anda salah ", Toast.LENGTH_LONG).show();

        }



    }
}
