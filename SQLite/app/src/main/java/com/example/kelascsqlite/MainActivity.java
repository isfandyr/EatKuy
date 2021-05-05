package com.example.kelascsqlite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.kelascsqlite.adapter.TemanAdapter;
import com.example.kelascsqlite.database.DBController;
import com.example.kelascsqlite.database.Teman;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    RecyclerView recyclerView;
    TemanAdapter adapter;
    ArrayList<Teman> temanArrayList;
    DBController controller = new DBController(this);
    String id,nm,tlp;
    private FloatingActionButton fab;


    Bundle bundle = new Bundle();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        fab = findViewById(R.id.floatingBtn);


        bacaData();
        adapter = new TemanAdapter(this,temanArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TemanBaru.class);
                startActivity(intent);
            }
        });


        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu pm = new PopupMenu(getApplicationContext(),view);
                pm.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) MainActivity.this);
                pm.inflate(R.menu.popup_menu);
                pm.show();
            }
        });


        recyclerView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {


                Intent intent = new Intent(MainActivity.this,TampilData.class);
                startActivity(intent);

                return false;
            }
        });

    }

    public void bacaData(){
        ArrayList<HashMap<String,String>> daftarTeman = controller.getAllTeman();
        temanArrayList = new ArrayList<>();

        for (int i = 0; i<daftarTeman.size();i++){
            Teman teman = new Teman();

            teman.setId(daftarTeman.get(i).get("id").toString());
            teman.setNama(daftarTeman.get(i).get("nama").toString());
            teman.setTelpon(daftarTeman.get(i).get("telpon").toString());

            temanArrayList.add(teman);

        }

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.mnedit:
                intent = new Intent(getApplicationContext(),EditData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mndelete:
                Toast.makeText(getApplicationContext(),"Ini untuk delete kontak",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}