package com.mnnit.athleticmeet.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.mnnit.athleticmeet.R;

public class Winner extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//For FullScreen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        b1=(Button)findViewById(R.id.inter_winner);
        b2=(Button)findViewById(R.id.intra_winner);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),InterWinner.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),IntraWinner.class);
                startActivity(i);
            }
        });
    }
}
