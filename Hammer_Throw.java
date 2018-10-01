package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class Hammer_Throw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hammer__throw);
        String []mobileArray={

                "Feb 10:: 11:30 a.m.(InterCollege)\nHammer Throw (Boys)",
                "Feb 10:: 12:00 a.m.(IntraCollege)\nHammer Throw (Boys)",
                "Feb 10:: 12:30 p.m.(InterCollege)\nHammer Throw (Girls)",
                "Feb 10:: 1:00 p.m.(IntraCollege)\nHammer Throw (Girls)",




        };

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewhammer);
        listView.setAdapter(adapter);


    }
}
