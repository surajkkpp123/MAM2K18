package com.mnnit.athleticmeet.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.mnnit.athleticmeet.R;

public class Schedule extends AppCompatActivity {
     private Button i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//fullscreen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        i1=(Button)findViewById(R.id.interup);
        i2=(Button)findViewById(R.id.intraup);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Inter_Activity.class);
                startActivity(i1);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Intra_Activity.class);
                startActivity(i1);
            }
        });

    }
}
