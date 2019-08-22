package com.scar.sepatufutsal;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder>  {
    private ArrayList<Sepatu> listSepatu;

    public CardViewAdapter(ArrayList<Sepatu> listsepatu){
        this.listSepatu = listsepatu;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_sepatu, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {
        final Sepatu sepatu = listSepatu.get(i);

        Glide.with(holder.itemView.getContext())
                .load(sepatu.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(sepatu.getName());
        holder.tvBrand.setText(sepatu.getBrand());
        holder.tvHarga.setText(sepatu.getHarga());

        holder.card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), detail.class);
                detail detail = new detail();
                intent.putExtra(detail.EXTRA_GAMBAR, sepatu.getPhoto());
                intent.putExtra(detail.EXTRA_NAME, sepatu.getName());
                intent.putExtra(detail.EXTRA_BRAND, sepatu.getBrand());
                intent.putExtra(detail.EXTRA_HARGA, sepatu.getHarga());
                intent.putExtra(detail.EXTRA_DESKRIPSI, sepatu.getDeskripsi());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return listSepatu.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView card_View;
        public ImageView imgPhoto;
        public TextView tvName, tvBrand, tvHarga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvHarga = itemView.findViewById(R.id.tv_item_harga);
            tvBrand = itemView.findViewById(R.id.tv_item_brand);
            card_View = itemView.findViewById(R.id.card_view);
        }
    }
}
