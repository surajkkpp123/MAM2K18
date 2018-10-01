package com.mnnit.athleticmeet.activities;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.mnnit.athleticmeet.listeners.CustomRVItemTouchListener;
import com.mnnit.athleticmeet.R;
import com.mnnit.athleticmeet.listeners.RecyclerViewItemClickListener;
import com.mnnit.athleticmeet.adapters.RecyclerviewAdapter;

import java.util.ArrayList;
import java.util.List;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//For FullScreen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        List<ItemData> data = fill_with_data();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);

        GridLayoutManager lLayout = new GridLayoutManager(this, 2);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lLayout);

        recyclerView.addOnItemTouchListener(new CustomRVItemTouchListener(this, recyclerView, new RecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                if(position==0)
                {

                    Intent i=new Intent(getApplicationContext(),Race.class);
                    startActivity(i);

                }
                if(position==1)
                {
                    Intent i=new Intent(getApplicationContext(),Discuss_Throw.class);
                    startActivity(i);

                }
                if(position==2)
                {
                    Intent i=new Intent(getApplicationContext(),LongJump.class);
                    startActivity(i);
                }
                if(position==3)
                {

                    Intent i=new Intent(getApplicationContext(),HighJump.class);
                    startActivity(i);

                }
                if(position==4)
                {
                    Intent i=new Intent(getApplicationContext(),TripleJump.class);
                    startActivity(i);

                }
                if(position==5)
                {
                    Intent i=new Intent(getApplicationContext(),Hurdles.class);
                    startActivity(i);

                }
                if(position==6)
                {
                    Intent i=new Intent(getApplicationContext(),Tug_Of_War.class);
                    startActivity(i);

                }
                if(position==7)
                {
                    Intent i=new Intent(getApplicationContext(),Javelin_Throw.class);
                    startActivity(i);

                }
                if(position==8)
                {
                    Intent i=new Intent(getApplicationContext(),Hammer_Throw.class);
                    startActivity(i);

                }
                if(position==9)
                {
                    Intent i=new Intent(getApplicationContext(),Musical_Chair.class);
                    startActivity(i);

                }
                if(position==10)
                {
                    Intent i=new Intent(getApplicationContext(),Relay_Race.class);
                    startActivity(i);

                }
                if(position==11)
                {
                    Intent i=new Intent(getApplicationContext(),Mixed_Race.class);
                    startActivity(i);

                }
                if(position==12)
                {
                    Intent i=new Intent(getApplicationContext(),Shotput.class);
                    startActivity(i);

                }
                if(position==13)
                {
                    Intent i=new Intent(getApplicationContext(),SlowCycle.class);
                    startActivity(i);

                }




            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));




    }

    public List<ItemData> fill_with_data() {

        List<ItemData> data = new ArrayList<>();

        data.add(new ItemData("Race", R.drawable.race));
        data.add(new ItemData("Discuss Throw", R.drawable.discuss));
        data.add(new ItemData("Long Jump", R.drawable.long_jump));
        data.add(new ItemData("High Jump", R.drawable.high_jump));
        data.add(new ItemData("Triple Jump", R.drawable.triple_jump));
        data.add(new ItemData("Hurdles", R.drawable.hurdle));
        data.add(new ItemData("Tug Of War", R.drawable.tug_war));
        data.add(new ItemData("Javelin Throw ", R.drawable.javelin));
        data.add(new ItemData("Hammer Throw", R.drawable.hammer));
        data.add(new ItemData("Musical Chair", R.drawable.musical_chair));
        data.add(new ItemData("Relay Race", R.drawable.relay_race));
        data.add(new ItemData("Mixed Relay Race", R.drawable.mixed_relay));
        data.add(new ItemData("Shotput", R.drawable.shotput));
        data.add(new ItemData("Slow Cycle", R.drawable.slow_cycle));


        return data;
    }
}
