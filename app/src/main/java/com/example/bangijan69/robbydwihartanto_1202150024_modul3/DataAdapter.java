package com.example.bangijan69.robbydwihartanto_1202150024_modul3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bangijan69 on 2/24/2018.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    //inisialisa arrya  tiitle, gambar, diksripsi
    private ArrayList<String> title;
    private ArrayList<Integer> gambar;
    private ArrayList<String> diskripsi;
    // konstruktor

    public DataAdapter(ArrayList<String> kota, ArrayList<Integer> gambar, ArrayList<String> diskripsi){
        this.title = kota;
        this.gambar =gambar;
        this.diskripsi =diskripsi;
    }


    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {
        viewHolder.txtkota.setText(title.get(i));
        viewHolder.relativeLayout.setBackgroundResource(gambar.get(i));
        //set gambar dan set Tex pada masing masing element
    }

    @Override
    public int getItemCount() {
        return title.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtkota;
        private ImageView imageView;
        //inisilasi sasi texview, imageview
        private RelativeLayout relativeLayout;
        public ViewHolder(View view) {
            super(view);
            txtkota = (TextView)view.findViewById(R.id.daftar_judul);
            relativeLayout =(RelativeLayout)view.findViewById(R.id.background_list);
            //unutk menyabungkan element yang ada di layout

        }
    }
}
