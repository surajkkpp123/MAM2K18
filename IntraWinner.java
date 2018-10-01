package com.mnnit.athleticmeet.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mnnit.athleticmeet.listeners.CustomRVItemTouchListener;
import com.mnnit.athleticmeet.R;
import com.mnnit.athleticmeet.listeners.RecyclerViewItemClickListener;
import com.mnnit.athleticmeet.adapters.RecyclerviewAdapterWinner;

import java.util.ArrayList;
import java.util.List;

public class IntraWinner extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_winner);

        List<DataWinner> data = fill_with_data();


        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview4);
        RecyclerviewAdapterWinner adapter = new RecyclerviewAdapterWinner(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new CustomRVItemTouchListener(this, recyclerView, new RecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                    Intent i=new Intent(getApplicationContext(), Winners_Activity.class);
                    i.putExtra("position",position);
                    i.putExtra("check","intra");
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
        data.add(new DataWinner("4X400m Relay (Boys)"));
        data.add(new DataWinner("4X400m  Relay (Girls)"));
        data.add(new DataWinner("800m (Boys)"));
        data.add(new DataWinner("800m (Girls)"));
        data.add(new DataWinner("1500m (Boys)"));
        data.add(new DataWinner("1500m (Girls)"));
        data.add(new DataWinner("3000m (Boys)"));
        data.add(new DataWinner("Three Leg Race (Boys and Girls)"));
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
        data.add(new DataWinner("Javelin (Boys)"));
        data.add(new DataWinner("Javelin (Girls)"));
        data.add(new DataWinner("Hammer Throw (Boys)"));
        data.add(new DataWinner("Hammer Throw (Girls)"));
        data.add(new DataWinner("Slow Cycling (Boys and Girls)"));
        data.add(new DataWinner("Tug of war (Boys and Girls)"));
        data.add(new DataWinner("Musical Chair (Ladies)"));
        data.add(new DataWinner("100m Race (Teaching and Admin Staff)"));
        data.add(new DataWinner("50m Brisk Walk (Teaching and Admin Staff)"));
        data.add(new DataWinner("50m Race (Staff Ward)"));
        data.add(new DataWinner("100m Race (Staff Ward)"));
        data.add(new DataWinner("200m Race (Non Teaching Staff(Class III))"));
        data.add(new DataWinner("400m Race (Non Teaching Staff(Class IV))"));
        data.add(new DataWinner("Brick Race"));





        return data;
    }
}
