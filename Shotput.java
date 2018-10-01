package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class Shotput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotput);
        String []mobileArray={

                "Feb 9:: 10:00 a.m.(InterCollege)\nShotput(Boys)",
                "Feb 9:: 10:30 a.m.(IntraCollege)\nShotput(Boys)",
                "Feb 9:: 11:00 a.m.(InterCollege)\nShotput(Girls)",
                "Feb 9:: 11:30 a.m.(IntraCollege)\nShotput(Girls)",

        };

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewshotput);
        listView.setAdapter(adapter);


    }

}
