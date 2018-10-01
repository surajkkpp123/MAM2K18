package com.mnnit.athleticmeet.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.mnnit.athleticmeet.listeners.CustomRVItemTouchListener;
import com.mnnit.athleticmeet.R;
import com.mnnit.athleticmeet.listeners.RecyclerViewItemClickListener;
import com.mnnit.athleticmeet.adapters.Recycler_View_Adapter;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private View navHeader;
    private ImageView imgNavHeaderBg, imgProfile;
    private TextView txtName, txtWebsite;
    private Toolbar toolbar;
    private FloatingActionButton fab;
    private String[] activityTitles;
    private Handler mHandler;
    private ImageButton imageButton;
    // index to identify current nav menu item
    public static int navItemIndex = 0,REQUEST_PHONE_CALL=1;

    // tags used to attach the intent
    @Override
    protected void onPostResume() {
        super.onPostResume();
        MenuItem mn;
        mn=navigationView.getMenu().getItem(0);
        mn.setChecked(true);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//For FullScreen
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.transition.activity_slide,R.transition.fadeout);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        List<Data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mHandler = new Handler();
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        // Navigation view header
        navHeader = navigationView.getHeaderView(0);
        imgNavHeaderBg = (ImageView) navHeader.findViewById(R.id.img_header_bg);
        // load toolbar titles from string resources
        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);
        MenuItem mn;
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
        }
        mn=navigationView.getMenu().getItem(0);
        mn.setChecked(true);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer) {


            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawer.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessary or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();
        // load nav menu header data

        // initializing navigation menu
        setUpNavigationView();


       // slide4();
    slide3();
        recyclerView.addOnItemTouchListener(new CustomRVItemTouchListener(this, recyclerView, new RecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                if(position==0)
                {
                    Intent i=new Intent(getApplicationContext(),Events.class);
                    startActivity(i);

                }
                if(position==1)
                {
                    Intent i=new Intent(getApplicationContext(),Schedule.class);
                    startActivity(i);

                }
                if(position==2)
                {
                    Intent i=new Intent(getApplicationContext(),Winner.class);
                    startActivity(i);

                }
                if(position==3)
                {
                    Intent i=new Intent(getApplicationContext(),Places.class);
                    startActivity(i);

                }
                if(position==5)
                {
                    Intent i=new Intent(getApplicationContext(),ContactAvtivity.class);
                    startActivity(i);

                }
                if(position==4)
                {
                    Intent i=new Intent(getApplicationContext(),About_Activity.class);
                    startActivity(i);

                }
//                if(position==6)
//                {
//                    Intent i=new Intent(getApplicationContext(),Developer_Activity.class);
//                    startActivity(i);
//
//                }




            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }

    public void slide3(){
        TextView textView = (TextView) findViewById(R.id.tvanim);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);
        textView.startAnimation(animation1);
    }
    public void slide4(){
        TextView textView = (TextView) findViewById(R.id.tvanim);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.zoom_out);
        textView.startAnimation(animation1);
    }
    public void slide5(){
        TextView textView = (TextView) findViewById(R.id.tvanim);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.zoom_in);
        textView.startAnimation(animation1);
    }



    private void setUpNavigationView() {
        MenuItem mn;
        mn=navigationView.getMenu().getItem(0);
        mn.setChecked(true);
        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        navItemIndex = 0;
                        drawer.closeDrawers();
                        break;
                    case R.id.nav_inter:
                        navItemIndex = 1;

                        menuItem.setChecked(false);
                        startActivity(new Intent(MainActivity.this, Inter_Activity.class));
                        drawer.closeDrawers();
                        return true;
                    case R.id.nav_intra:
                        navItemIndex = 2;

                        startActivity(new Intent(MainActivity.this, Intra_Activity.class));
                        drawer.closeDrawers();
                        return true;
                    case R.id.nav_place:
                        navItemIndex = 3;
                        startActivity(new Intent(MainActivity.this, Places.class));
                        drawer.closeDrawers();
                        return  true;
                    case R.id.nav_contacts:
                        navItemIndex = 3;
                        startActivity(new Intent(getApplicationContext(), ContactAvtivity.class));
                        drawer.closeDrawers();
                        return  true;
                    case R.id.nav_about:
                        navItemIndex = 4;
                        startActivity(new Intent(MainActivity.this, About_Activity.class));
                        drawer.closeDrawers();
                        return  true;
                    case R.id.nav_rateus:
                        navItemIndex = 5;
                        break;
                    case R.id.nav_share:

                       break;
                    case R.id.nav_developer:
                        startActivity(new Intent(MainActivity.this, Developer_Activity.class));
                        drawer.closeDrawers();
                        return  true;

                    default:
                        navItemIndex = 0;
                }
                //Checking if the item is in checked state or not, if not make it in checked state

//                if (menuItem.isChecked()) {
//                    menuItem.setChecked(false);
//                } else {
//                    menuItem.setChecked(true);
//                }
                //menuItem.setChecked(true);


                return true;
            }
        });

    }
    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("Events", "", R.drawable.events));
        data.add(new Data("Schedule", "", R.drawable.schedule));
        data.add(new Data("Winners", "", R.drawable.winners));
        data.add(new Data("Places", "", R.drawable.place));
        data.add(new Data("About MAM", "", R.drawable.athletics));
        data.add(new Data("Contacts", "", R.drawable.contact));
       // data.add(new Data("Developer", "Description", R.drawable.think));


        return data;
    }

}

