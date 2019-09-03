package com.pwpb.recyclerkelompok;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class MailAdapter extends RecyclerView.Adapter<MailAdapter.ViewHolder> {
    private List<Mails> mailsList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNama, tvNamaSingkat, tvSubject, tvIsi, tvWaktu;
        public CardView cvbg;

        public ViewHolder(View v) {
            super(v);
            cvbg = v.findViewById(R.id.cvbg);
            tvNama = v.findViewById(R.id.txtNama);
            tvNamaSingkat = v.findViewById(R.id.tvNamaSingkat);
            tvSubject = v.findViewById(R.id.txtSubject);
            tvIsi = v.findViewById(R.id.txtIsi);
            tvWaktu = v.findViewById(R.id.txtWaktu);
        }
    }

    public MailAdapter(List<Mails> mailsList) {
        this.mailsList = mailsList;
    }

    @Override
    public MailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_mail_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MailAdapter.ViewHolder holder, int position) {
        Mails m = mailsList.get(position);
        holder.tvNama.setText(m.getNama());
        holder.tvNamaSingkat.setText(m.getNamaSingkat());
        holder.tvSubject.setText(m.getSubject());
        holder.tvIsi.setText(m.getIsi());
        holder.tvWaktu.setText(m.getWaktu());
        Random random = new Random();
        holder.cvbg.setCardBackgroundColor(Color.rgb(random.nextInt(200),random.nextInt(200),random.nextInt(200)));
    }

    @Override
    public int getItemCount() {
        return mailsList.size();
    }
}


