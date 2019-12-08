package com.k01.waktudunia;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import java.util.List;

public class OseaniaAdapter extends RecyclerView.Adapter<OseaniaAdapter.ViewHolder> {

    private Context context;
    private List<Benua> list;

    public OseaniaAdapter(Context context, List<Benua> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_oseania, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Benua obj = list.get(position);
        holder.negara.setText(obj.getNegara());
        holder.kota.setText(obj.getKota());
        holder.waktu.setText(obj.getWaktu());
        Glide.with(context).load(obj.getPeta()).into(holder.peta);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView negara;
        private TextView kota;
        private TextView waktu;
        private LinearLayout box_linear;
        private ImageView peta;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            negara = itemView.findViewById(R.id.negaraoseania);
            kota = itemView.findViewById(R.id.kotaoseania);
            waktu = itemView.findViewById(R.id.waktuoseania);
            box_linear = itemView.findViewById(R.id.box_linear);
            peta = itemView.findViewById(R.id.petaoseania);
        }
    }
}
