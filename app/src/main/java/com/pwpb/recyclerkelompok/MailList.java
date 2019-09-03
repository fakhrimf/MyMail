package com.pwpb.recyclerkelompok;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MailList extends AppCompatActivity {
    ConstraintLayout background;
    ImageView star;

    private void initUI(){
        background = findViewById(R.id.background);
        star = findViewById(R.id.imgBintang);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_list);
        initUI();
        Random rand = new Random();
        int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        background.setBackgroundColor(color);

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                star.setBackgroundResource(R.drawable.ic_star_yellow_24dp);
            }
        });
    }
}
