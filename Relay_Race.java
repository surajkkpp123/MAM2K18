package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class Relay_Race extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relay__race);
        String []mobileArray={

                "Feb 8:: 4:00 p.m.(InterCollege)\n4X100m Heats(Boys)",
                "Feb 8:: 4:15 p.m.(IntraCollege)\n4X100m Relay Time Trial(Boys)",
                "Feb 8:: 4:30 p.m.(InterCollege)\n4X100m Heats(Girls)",
                "Feb 8:: 4:45 p.m.(IntraCollege)\n4X100m Relay Time Trial(Girls)",
                "Feb 9:: 11:00 a.m.(InterCollege)\n4X400m Relay Time Trial(Boys)",
                "Feb 9:: 11:20 a.m.(InterCollege)\n4X400m Relay Time Trial(Girls)",
                "Feb 9:: 11:40 a.m.(IntraCollege)\n4X400m Relay Time Trial(Boys)",
                "Feb 9:: 12:00 a.m.(IntraCollege)\n4X400m Relay Time Trial(Girls)",
                "Feb 10:: 2:40 p.m.(InterCollege)\n4X100m Finals(Boys)",
                "Feb 10:: 2:55 p.m.(InterCollege)\n4X100m Finals(Girls)"

        };

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewrelay);
        listView.setAdapter(adapter);


    }

}
