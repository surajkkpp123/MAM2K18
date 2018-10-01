package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class HighJump extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_jump);

        String []mobileArray={
                "Feb 9:: 3:15 p.m.(InterCollege)\n High Jump (Boys)",
                "Feb 9:: 3:30 p.m.(IntraCollege)\n High Jump (Boys)",
                "Feb 9:: 4:00 p.m.(InterCollege)\n High Jump (Girls)",
                "Feb 9:: 4:30 p.m.(IntraCollege)\n High Jump (Girls)"

        };

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewhighjump);
        listView.setAdapter(adapter);
    }
}
