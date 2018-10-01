package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;

public class Race extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race);
        String[] mobileArray = {"Feb 8:: 10:15 a.m.(InterCollege)\n100m Heats(Boys)","Feb 8:: 10:30 a.m.(IntraCollege)\n100m Heats(Boys)",
                "Feb 8:: 10:45 a.m.(InterCollege)\n100m Heats(Girls)",
                "Feb 8:: 11:00 a.m.(IntraCollege)\n100m Heats(Girls)",
                "Feb 8:: 11:45 a.m.(IntraCollege)\n800m Finals(Boys)",
                "Feb 8:: 12:00 a.m.(IntraCollege)\n800m Final(Girls)",
                "Feb 8:: 2.00 p.m.(InterCollege)\n400m Heats(Boys)",
                "Feb 8:: 2:15 p.m.(IntraCollege)\n400m Time Trial(Boys)",
                "Feb 8:: 2.30 p.m.(InterCollege)\n400m Heats(Girl)",
                "Feb 8:: 3:00 p.m.(IntraCollege)\n1500m (Boys)"
                ,"Feb 8:: 3.15 p.m.(InterCollege)\n1500m (Boys)",
                "Feb 8:: 3:30 p.m.(IntraCollege)\n1500m (Girls)",
                "Feb 8:: 3.45 p.m.(InterCollege)\n1500m (Girl)",
                "Feb 8:: 5:00 p.m.(IntraCollege)\nThree Leg Race Finals (Boys&Girls)",
                "Feb 9:: 10:15 a.m.(IntraCollege)\n200m Heats(Boys)",
                "Feb 9:: 10:45 a.m.(IntraCollege)\n200m Heats(Girls)",
                "Feb 9:: 1:30 p.m.(IntraCollege)\n100m Race(Teaching and Admin Staff Below 45 years)",
                "Feb 9:: 1:45 p.m.(IntraCollege)\n50m Brisk Walk (Teaching and Admin Staff Below 45 years)",
                "Feb 9:: 2:00 p.m.(InterCollege)\n200m Heats(Boys)","Feb 9:: 2.15 p.m.(InterCollege)\n200m Heats(Girls)","Feb 9:: 3.30 p.m.(InterCollege)\n400m Finals (Boys)",
                "Feb 9:: 4:00 p.m.(InterCollege)\n400m Finals(Girls)",
                "Feb 9:: 4:00 p.m.(InterCollege)\n400m Finals(Girls)",
                "Feb 9:: 4:30 p.m.(InterCollege)\n800m Finals(Boys)",
                "Feb 9:: 4:45 p.m.(InterCollege)\n800m Finals(Girls)",
                "Feb 9:: 5:15 p.m.(IntraCollege)\n50m Race(Staff Ward blow 10 years\n100m Race(Staff Ward between 10-15 years))",
                "Feb 9:: 5:30 p.m.(IntraCollege)\n200m Race(Non Teaching class III and equivalent Tech. staff \n400m Non Teaching class IV and equivalent Tech. staff and Lab Bearers)",
                "Feb 9:: 6:00 p.m.(IntraCollege)\n Brick Race (Mixed)",
                "Feb 10:: 9:30 a.m.(InterCollege)\n100m Finals(Boys)",
                "Feb 10:: 10:00 a.m.(InterCollege)\n5000m Finals(Boys)",
                "Feb 10:: 10:30 a.m.(IntraCollege)\n3000m Finals(Boys)",
                "Feb 10:: 11:00 a.m.(IntraCollege)\n200m Finals(Girls)",
                "Feb 10:: 11:30 a.m.(InterCollege)\n200m Finals(Boys)",
                "Feb 10:: 11:45 a.m.(IntraCollege)\n200m Finals(Boys)",
                "Feb 10:: 2:20 p.m.(IntraCollege)\n100m Finals(Girls)",
                "Feb 10:: 2:45 a.m.(IntraCollege)\n100m Finals(Boys)"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listviewrace);
        listView.setAdapter(adapter);
    }
}
