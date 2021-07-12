package com.example.eatkuy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eatkuy.user.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    //mendeklarasikan variable dari layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        //mengirimkan pesan dan runnable ke antrian pesan looper dan mengeksekusinya
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            //menjalankan splashscreen
            @Override
            public void run() {

                //memanggil class LoginActivity setelah tampilan splashscreen selesai
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
            }
            //membuat durasi waktu splashscreen muncul
        }, 3000L); //3000 L = 3 detik
    }
}