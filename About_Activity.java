package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.mnnit.athleticmeet.R;

public class About_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//For FullScreen
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.transition.activity_slide,R.transition.fadeout);
        setContentView(R.layout.activity_about_);
    }
}
