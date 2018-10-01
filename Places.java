package com.mnnit.athleticmeet.activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mnnit.athleticmeet.R;

public class Places extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        mMap.addMarker(new MarkerOptions().position(new LatLng(25.492241, 81.866089)).title("BasketBall Court")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.494204, 81.861415)).title("Yumuna Gate")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
       //start  
         mMap.addMarker(new MarkerOptions().position(new LatLng(25.492659, 81.868167)).title("Mnnit Dispensary")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

         mMap.addMarker(new MarkerOptions().position(new LatLng(25.490568, 81.863250)).title("SVBH Boys Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
     
         mMap.addMarker(new MarkerOptions().position(new LatLng(25.490125, 81.863936)).title("PG Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

          mMap.addMarker(new MarkerOptions().position(new LatLng(25.490518, 81.864270)).title("School of Management Studies")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

          mMap.addMarker(new MarkerOptions().position(new LatLng(25.493866, 81.867707)).title("S.V.Patel Boys Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        
         mMap.addMarker(new MarkerOptions().position(new LatLng(25.494373, 81.868035)).title("Tilak Boys Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
      
         mMap.addMarker(new MarkerOptions().position(new LatLng(25.494673, 81.868910)).title("Tirath Raj Canteen")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

         mMap.addMarker(new MarkerOptions().position(new LatLng(25.495206, 81.868188)).title("Boys hostel Mess")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

         mMap.addMarker(new MarkerOptions().position(new LatLng(25.495556, 81.868064)).title("Tandon Boys Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
       
         mMap.addMarker(new MarkerOptions().position(new LatLng(25.494934, 81.868691)).title("Malviya Boys Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
 
         mMap.addMarker(new MarkerOptions().position(new LatLng(25.498042, 81.870065)).title("Raman Boys Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

         mMap.addMarker(new MarkerOptions().position(new LatLng(25.498422, 81.870195)).title("Tagore Boys Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));  

         mMap.addMarker(new MarkerOptions().position(new LatLng(25.489748, 81.869819)).title("Executive Department Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
       
         mMap.addMarker(new MarkerOptions().position(new LatLng(25.488339, 81.869708)).title("KNG Girls Hostel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));       
       //end
        mMap.addMarker(new MarkerOptions().position(new LatLng(25.49262, 81.861108)).title("Ganga Gate")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.491440, 81.866388)).title("Saraswati Gate")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));


        mMap.addMarker(new MarkerOptions().position(new LatLng(25.494687, 81.867397)).title("Raj Canteen")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
    //    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.496818, 81.867339), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.493504, 81.862377)).title("Administrative Building")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
       // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.492941, 81.865943), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.492745, 81.865890)).title("GYM")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
     //   mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.492941, 81.865943), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.493463, 81.865917)).title("Gymkhana Ground")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
      //  mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.492941, 81.865943), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.494598, 81.864652)).title("Athletic Ground").snippet("Football Ground")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
       // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.492941, 81.865943), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.491509, 81.866127)).title("Bikaner Cafeteria")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
      //  mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.492941, 81.865943), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.492071, 81.864747)).title("Vijaya Bank")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
      //  mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.492941, 81.865943), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.491834, 81.865833)).title("SBI ATM")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
       // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.492941, 81.865943), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.491924, 81.865956)).title("MP HALL")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
      //  mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.492941, 81.865943), 10.0f));

        mMap.addMarker(new MarkerOptions().position(new LatLng(25.494957, 81.867540)).title("Student Activity Centre")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.494598, 81.864652), 16.0f));





    }
}
