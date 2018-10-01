package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class Tug_Of_War extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tug__of__war);
        String []mobileArray={

                "Feb 9:: 12:15 p.m.(IntraCollege)\nTug of war heats (Boys& Girls)",
                "Feb 10:: 11:00 a.m.(IntraCollege)\nTug of war Finals (Boys& Girls)"
        };

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewtug_of_war);
        listView.setAdapter(adapter);
    }


}
