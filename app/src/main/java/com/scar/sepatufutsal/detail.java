package com.scar.sepatufutsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class detail extends AppCompatActivity implements View.OnClickListener{

    public static String EXTRA_BRAND = "BRAND";
    public static String EXTRA_NAME = "NAME";
    public static String EXTRA_HARGA = "HARGA";
    public static String EXTRA_DESKRIPSI = "DESKRIPSI";
    public static String EXTRA_GAMBAR = "GAMBAR";

    private int total = 0;

    ImageView img_item_Photo;
    Button btnBuy;
    public TextView tvName, tvBrand, tvHarga, tvDesc;

    String name;
    String harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img_item_Photo = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_item_name);
        tvBrand = findViewById(R.id.tv_item_brand);
        tvHarga= findViewById(R.id.tv_item_price);
        tvDesc = findViewById(R.id.tv_item_deskripsi);
        btnBuy = findViewById(R.id.btn_beli);

        name = getIntent().getStringExtra(EXTRA_NAME);
        String brand = getIntent().getStringExtra(EXTRA_BRAND);
        Glide.with(this).load(getIntent().getStringExtra(EXTRA_GAMBAR)).into(img_item_Photo);
        String desc = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        harga = getIntent().getStringExtra(EXTRA_HARGA);

        tvName.setText(name);
        tvBrand.setText(brand);
        tvHarga.setText(harga);
        tvDesc.setText(desc);

        Button btnBuy = findViewById(R.id.btn_beli);
        btnBuy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_beli:
                Intent moveIntent = new Intent(detail.this, form.class);
                moveIntent.putExtra(EXTRA_NAME, name);
                moveIntent.putExtra(EXTRA_HARGA, harga);
                startActivity(moveIntent);
                break;
        }
    }
}
