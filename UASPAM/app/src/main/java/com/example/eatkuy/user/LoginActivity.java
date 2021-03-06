package com.example.eatkuy.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.eatkuy.MainActivity;
import com.example.eatkuy.MenuAwal;
import com.example.eatkuy.R;
import com.example.eatkuy.database.DBHelper;

import static android.text.Html.fromHtml;


//mendeklarasikan variable EditText, Button, DBHelper
public class LoginActivity extends AppCompatActivity {
    EditText edtEmail, edtPassword;
    Button lgnBtn;
    DBHelper dbHelper;


    //mendeklarasikan variable dari layout agar data yang di deklarasikan dapat dimunculkan
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtPassword = (EditText)findViewById(R.id.edtPassword);
        lgnBtn = (Button)findViewById(R.id.lgnBtn);

        dbHelper = new DBHelper(this);


        //membuat textview Daftar
        TextView daftar = (TextView)findViewById(R.id.edtDaftar);
        daftar.setText(fromHtml("Belum punya akun. " +
                "</font><font color='#3b5998'>create one</font>"));

        //memanggil class DaftarActivity dengan menekan textview
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, DaftarActivity.class);
                startActivity(i);
            }
        });

        //membuat fungsi onclick pada button lgnBtn
        lgnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menyimpan input user di edittext email kedalam variabel email
                String email = edtEmail.getText().toString().trim();

                //menyimpan input user di edittext password kedalam variabel password
                String password = edtPassword.getText().toString().trim();

                //mengecek apakah isi dari email dan password sudah benar
                Boolean res = dbHelper.checkUser(email, password);
                if (res == true){
                    Toast.makeText(LoginActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, MenuAwal.class));
                }else {
                    Toast.makeText(LoginActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public static Spanned fromHtml(String html){
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        }else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}