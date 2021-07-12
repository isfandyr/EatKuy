package com.example.eatkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuAwal extends AppCompatActivity {

    //mendeklarasikan variabel layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);

        //deklarasi variabel button
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //method untuk masuk kedalam MainActivity
                Intent i = new Intent(MenuAwal.this, MainActivity.class);
                startActivity(i);
            }
        });

        //deklarasi variabel button
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menampilkan pesan notifikasi jika mengklik button2
                Toast.makeText(getApplicationContext(), "Mohon maaf, resep minuman belum tersedia.", Toast.LENGTH_LONG).show();
            }
        });
    }
}