package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class Discuss_Throw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discuss__throw);

        String mobileArray[] ={
                "Feb 8:: 10:30 a.m.(InterCollege)\n Discuss Throw (Boys)",
                "Feb 8:: 10:45 a.m.(IntraCollege)\n Discuss Throw (Boys)",
                "Feb 8:: 11:00 a.m.(InterCollege)\n Discuss Throw (Girls)",
                "Feb 8:: 11:15 a.m.(IntraCollege)\n Discuss Throw (Girls)",
        };
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewdiscuss);
        listView.setAdapter(adapter);
    }
}
