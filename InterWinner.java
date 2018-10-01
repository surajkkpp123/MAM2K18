package com.mnnit.athleticmeet.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.mnnit.athleticmeet.listeners.CustomRVItemTouchListener;
import com.mnnit.athleticmeet.R;
import com.mnnit.athleticmeet.listeners.RecyclerViewItemClickListener;
import com.mnnit.athleticmeet.adapters.RecyclerviewAdapterWinner;

import java.util.ArrayList;
import java.util.List;

public class InterWinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_winner);
        List<DataWinner> data = fill_with_data();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview3);
        RecyclerviewAdapterWinner adapter = new RecyclerviewAdapterWinner(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new CustomRVItemTouchListener(this, recyclerView, new RecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent i=new Intent(getApplicationContext(), Winners_Activity.class);
                i.putExtra("position",position);
                i.putExtra("check","inter");
                i.putExtra("title",((TextView)view.findViewById(R.id.games)).getText().toString());
                startActivity(i);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
    public List<DataWinner> fill_with_data() {

        List<DataWinner> data = new ArrayList<>();

        data.add(new DataWinner("100m (Boys)"));
        data.add(new DataWinner("100m (Girls)"));
        data.add(new DataWinner("200m (Boys)"));
        data.add(new DataWinner("200m (Girls)"));
        data.add(new DataWinner("400m (Boys)"));
        data.add(new DataWinner("400m (Girls)"));
        data.add(new DataWinner("4X100m Relay (Boys)"));
        data.add(new DataWinner("4X100m  Relay (Girls)"));
        data.add(new DataWinner("800m (Boys)"));
        data.add(new DataWinner("800m (Girls)"));
        data.add(new DataWinner("5000m (Boys)"));
        data.add(new DataWinner("Discuss Throw (Boys)"));
        data.add(new DataWinner("Discuss Throw (Girls)"));
        data.add(new DataWinner("Long Jump (Boys)"));
        data.add(new DataWinner("Long Jump (Girls)"));
        data.add(new DataWinner("High Jump (Boys)"));
        data.add(new DataWinner("High Jump (Girls)"));
        data.add(new DataWinner("110m Hurdles (Boys)"));
        data.add(new DataWinner("100m Hurdles (Girls)"));
        data.add(new DataWinner("400m Hurdles (Boys)"));
        data.add(new DataWinner("Shotput (Boys)"));
        data.add(new DataWinner("Shotput (Girls)"));
        data.add(new DataWinner("Triple Jump (Boys)"));
        data.add(new DataWinner("Javelin (Boys)"));
        data.add(new DataWinner("Javelin (Girls)"));
        data.add(new DataWinner("Hammer Throw (Boys)"));
        data.add(new DataWinner("Hammer Throw (Girls)"));






        return data;
    }
}
