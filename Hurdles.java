package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class Hurdles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hurdles);
        String []mobileArray={

                "Feb 9:: 9:30 a.m.(InterCollege)\n110m Hurdles (Boys)",
                "Feb 9:: 9:45 a.m.(IntraCollege)\n110m Hurdles (Boys)",
                "Feb 9:: 10:00 a.m.(IntraCollege)\n100m Hurdles (Girls)",
                "Feb 9:: 11:45 a.m.(InterCollege)\n100m Hurdles (Girls)",
                "Feb 10:: 9:45 a.m.(IntraCollege)\n400m Hurdles Final (Boys)",
                "Feb 10:: 2:00 p.m.(InterCollege)\n400m Hurdles (Boys)",

        };

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewhurldes);
        listView.setAdapter(adapter);
    }

}
