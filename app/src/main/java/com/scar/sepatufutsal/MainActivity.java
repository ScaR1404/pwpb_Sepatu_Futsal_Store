package com.scar.sepatufutsal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSepatu;
    private ArrayList<Sepatu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSepatu = findViewById(R.id.rv_sepatu);
        rvSepatu.setHasFixedSize(true);

        list.addAll(SepatuData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvSepatu.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter= new CardViewAdapter(list);
        rvSepatu.setAdapter(cardViewAdapter);
    }
}
