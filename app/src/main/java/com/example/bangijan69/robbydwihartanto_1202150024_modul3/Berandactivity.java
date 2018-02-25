package com.example.bangijan69.robbydwihartanto_1202150024_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class Berandactivity extends AppCompatActivity {

    private ArrayList<String> title;
    private ArrayList<Integer> img;
    private  ArrayList<String> diksripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berandactivity);

initView();

    }
    private void initView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        // membuat array untuk menyimapan gambar
        img = new ArrayList<>();
        img.add(R.drawable.ades);
        img.add(R.drawable.amidis);
        img.add(R.drawable.aqua);
        img.add(R.drawable.cleo);
        img.add(R.drawable.equil);
        img.add(R.drawable.evian);
        img.add(R.drawable.vit);
        img.add(R.drawable.pristine);
        img.add(R.drawable.nestle);
        img.add(R.drawable.leminerale);
        img.add(R.drawable.club);
        // membuat array dan menabhakan item
        title = new ArrayList<>();
        title.add("Ades");
        title.add("Amidis");
        title.add("Aqua");
        title.add("Cleo");
        title.add("Equil");
        title.add("Evian");
        title.add("Vit");
        title.add("Prestine");
        title.add("Nestle");
        title.add("Limeneral");
        title.add("Club");
        // membuat dan menambahkan  array diskripsi
        diksripsi = new ArrayList<>();
        diksripsi.add("Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. Kini The Coca-Cola Company merupakan pemilik merek dagang Ades, menggantikan PT. Akasha Wira Internasional atau PT. AdeS Waters Indonesia, pemilik merek dagang Ades sebelumnya.");
        diksripsi.add("AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya. AMIDIS sangat memperhatikan kualitas dari produk, ");
        diksripsi.add("Aqua adalah sebuah merek air minum dalam kemasan yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei.");
        diksripsi.add("Pada 7 Maret 2004, diluncurkan produk Air Murni Cleo sebagai salah satu produk andalan Tanobel dalam kemasan cup 250 mL, botol 330 mL, 550 mL, 1.200 mL, 6 L dan galon 19 L. Setelah itu, Tanobel melebarkan sayap produksi Air Murni Cleo ke berbagai daerah di Indonesia.");
        diksripsi.add("Pada 7 Maret 2004, diluncurkan produk Air Murni Cleo sebagai salah satu produk andalan Tanobel dalam kemasan cup 250 mL, botol 330 mL, 550 mL, 1.200 mL, 6 L dan galon 19 L. Setelah itu, Tanobel melebarkan sayap produksi Air Murni Cleo ke berbagai daerah di Indonesia. ");
        diksripsi.add("Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.");
        diksripsi.add("VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.");
        diksripsi.add("Pristine 8+ merupakan Air minum Alkaline dengan kandungan pH 8+ (Melebihi 8) yang memberikan manfaat detoxifikasi bagi tubuh kita. Buat yang belum tau nih gan, air alkaline memilik banyak manfaat dan pastinya sangat baik untuk tubuh yang bisa menjaga keseimbangan kadar pH dan efektif untuk membantu proses detoxifikasi. Pristine 8+ berasal dari sumber mata air ");
        diksripsi.add("Nestle Pure Life bilang, produksi air minum milik perusahaan justru naik selama bulan Juli ini.");
        diksripsi.add("Laminar Air Flow adalah meja kerja steril untuk melakukan kegiatan inokulasi/ penanaman. Laminar Air Flow merupakan suatu alat yang digunakan dalam pekerjaan persiapan bahan tanaman, penanaman, dan pemindahan tanaman dari sutu botol ke botol yang lain dalam kultur in vitro.");
        diksripsi.add("Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.");


        RecyclerView.Adapter adapter = new DataAdapter(title, img, diksripsi);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                public boolean onSingleTapUp(MotionEvent e){
                    return true;
                }
            });

            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                View child = rv.findChildViewUnder(e.getX(), e.getY());
                if (child != null && gestureDetector.onTouchEvent(e)){
                    int position = rv.getChildAdapterPosition(child);
                    Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                    intent.putExtra("gambar",img.get(position));
                    intent.putExtra("judul", title.get(position));
                    intent.putExtra("diskripsi",diksripsi.get(position));
                    startActivity(intent);

                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }
}
