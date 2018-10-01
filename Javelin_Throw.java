package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class Javelin_Throw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javelin__throw);
        String []mobileArray={

                "Feb 9:: 2:00 p.m.(InterCollege)\nJavelin Throw (Boys)",
                "Feb 9:: 2:15 p.m.(IntraCollege)\nJavelin Throw (Boys)",
                "Feb 9:: 2:45 p.m.(InterCollege)\nJavelin Throw (Girls)",



        };

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewjavelin);
        listView.setAdapter(adapter);

    }
}
