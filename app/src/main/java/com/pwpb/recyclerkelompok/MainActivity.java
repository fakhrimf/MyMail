package com.pwpb.recyclerkelompok;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private RecyclerView.LayoutManager layoutManager;
    private List<Mails> mailsList;
    private MailAdapter mailAdapter;

    String[] namaSingkat = {
            "T",
            "D",
            "B",
            "G",
            "M",
            "S",
            "N",
            "H"
    };

    String[] nama = {
            "Tokopedia",
            "Dicoding",
            "Blibli",
            "Github",
            "Mojang",
            "Steam",
            "Naufal",
            "Humble Bundle"
    };

    String[] subject = {
            "Selamat, pembayaran tagihan First Media berlangganan anda BERHASIL",
            "Hi Fakhri Maulana Falah, Silahkan memverifikasi akun Anda",
            "Selamat Fakhri, anda memenangkan Lamborghini Murcielago dari Blibli",
            "Discover what's new at Github",
            "New capes are available for you!",
            "An item on your Steam wishlist is on sale!",
            "Tugas CardView",
            "DiRT Rally is available for free!"
    };

    String[] isi = {
            "Internet dan TV Kabel, Halo Fakhri MF pembayaran tagihan First Media berlangganan anda BERHASIL",
            "Silahkan klik link berikut ini untuk memverifikasikan akun dicoding Anda",
            "Selamat! Anda adalah pengguna blibli yang ke 1000000, anda berhak mendapatkan hadiah Lamborghini Murcielago.",
            "We're constantly learning, building and shipping. From new features to deep-dive technical talks.",
            "[Optifine] Hey, theres new capes waiting for you! thanks for donating to the devs!",
            "Grand Theft Auto V, Garry's Mod, and 5 other are on sale right now!",
            "Ini tugas CardView yang kemaren, tolong kirimkan ke drive dan classroom",
            "Claim your free game right now! While stock lasts"
    };

    String[] waktu = {
            "11:00",
            "14:15",
            "15:21",
            "15:30",
            "16:00",
            "18:23",
            "19:00",
            "08:00"
    };

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        if (rv != null) rv.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        mailsList = new ArrayList<>();

        for (int i = 0; i < nama.length; i++) {
            Mails m = new Mails(namaSingkat[i], nama[i], subject[i], isi[i], waktu[i]);
            mailsList.add(m);
        }


        //init adapter
        mailAdapter = new MailAdapter(mailsList);
        //membuat view dan mengganti isinya
        rv.setAdapter(mailAdapter);
        mailAdapter.notifyDataSetChanged();
    }
}
