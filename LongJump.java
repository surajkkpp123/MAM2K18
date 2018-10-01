package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class LongJump extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_jump);
        String mobileArray[]={
                "Feb 8:: 11:45 a.m.(InterCollege)\n Long Jump (Boys)",
                "Feb 8:: 12:00 a.m.(IntraCollege)\n Long Jump (Boys)",
                "Feb 8:: 2:00 p.m.(InterCollege)\n Long Jump (Girls)",
                "Feb 8:: 2:30 p.m.(IntraCollege)\n Long Jump (Girls)"
        };
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewlongjump);
        listView.setAdapter(adapter);
    }
}
