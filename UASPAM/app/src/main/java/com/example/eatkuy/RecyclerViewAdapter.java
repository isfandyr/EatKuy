package com.example.eatkuy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    //deklarasi variabel dengan jenis data ArrayList
    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    //deklarasi variabel dengan jenis data Context
    private Context context;

    //membuat konstruktor RecyclerViewAdapter
    public RecyclerViewAdapter(ArrayList<String> fotoMakanan, ArrayList<String> namaMakanan, ArrayList<String> infoMakanan, Context context) {
        //memberi nilai fotoMakanan dengan fotoMakanan
        this.fotoMakanan = fotoMakanan;
        //memberi nilai namaMakanan dengan namaMakanan
        this.namaMakanan = namaMakanan;
        //memberi nilai infoMakanan dengan infoMakanan
        this.infoMakanan = infoMakanan;
        //memberi nilai context dengan context
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        //membuat objek view holder
        ViewHolder holder = new ViewHolder(view);

        //mengembaliakan nilai ke variabel holder
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(fotoMakanan.get(position)).into(holder.imageViewFotoMakanan);

        holder.textViewNamaMakanan.setText(namaMakanan.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, namaMakanan.get(position), Toast.LENGTH_LONG).show();

                //method untuk ke DetailActivity
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_makanan", fotoMakanan.get(position));
                intent.putExtra("nama_makanan", namaMakanan.get(position));
                intent.putExtra("info_makanan", infoMakanan.get(position));

                context.startActivity(intent);
            }
        });
    }

    //fungsi getItemCount() mengembalikan jumlah item yang akan ditampilkan dalam list
    @Override
    public int getItemCount()
    {
        //mengembalikan nilai berupa jumlah data dari array data
        return namaMakanan.size();
    }

    //membuat class untuk mendeklarasikan tempat
    public class ViewHolder extends RecyclerView.ViewHolder{

        //mendeklarasikan variabel
        CircleImageView imageViewFotoMakanan;
        TextView textViewNamaMakanan;
        ConstraintLayout constraintLayout;


        //fungsi terjadi ketika tampilan item siap untuk ditampilkan
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //mendeklarasikan variabel dari layout
            imageViewFotoMakanan = itemView.findViewById(R.id.imageViewFotoMakanan);
            textViewNamaMakanan = itemView.findViewById(R.id.textViewNamaMakanan);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
