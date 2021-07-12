package com.example.eatkuy.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eatkuy.R;
import com.example.eatkuy.database.DBHelper;

//mendeklarasikan variable EditText, Buttonm DBHelper
public class DaftarActivity extends AppCompatActivity {

    EditText edtEmail, edtPassword, edtConPasswowrd;
    Button daftarBtn;
    DBHelper dbHelper;


    //mendeklarasikan variable dari layout agar data yang di deklarasikan dapat dimunculkan
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        dbHelper = new DBHelper(this);

        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtPassword = (EditText)findViewById(R.id.edtPassword);
        edtConPasswowrd = (EditText)findViewById(R.id.edtConPassword);
        daftarBtn = (Button) findViewById(R.id.daftarBtn);

        //membuat fungsi onclick pada button daftarBtn
        daftarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menyimpan input user di edittext email kedalam variabel email
                String email = edtEmail.getText().toString().trim();

                //menyimpan input user di edittext password kedalam variabel password
                String password = edtPassword.getText().toString().trim();

                //menyimpan input user di edittext conPassword kedalam variabel conPassword
                String conPassword = edtConPasswowrd.getText().toString().trim();

                ContentValues values = new ContentValues();

                //membuat kondisi untuk mengecek ulang apakah password sudah sesuai
                if (!password.equals(conPassword)){
                    Toast.makeText(DaftarActivity.this, "Password tidak sesuai", Toast.LENGTH_SHORT).show();
                }
                //membuat kondisi untuk mengecek apakah email dan password kosong atau tidak
                else if (password.equals("") || email.equals("")){
                    Toast.makeText(DaftarActivity.this, "Email dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
                //membuat kondisi jika email dan password sudah benar makan pendaftaran berhasil
                else {
                    values.put(DBHelper.rov_email, email);
                    values.put(DBHelper.rov_password, password);
                    dbHelper.insertData(values);

                    Toast.makeText(DaftarActivity.this, "Daftar berhasil", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    public static Spanned fromHtml(String html){
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        }
        else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}