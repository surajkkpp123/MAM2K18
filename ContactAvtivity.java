package com.mnnit.athleticmeet.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import com.mnnit.athleticmeet.R;

public class ContactAvtivity extends AppCompatActivity {

    Button sec,rohit,shreya;
    private static final int REQUEST_PHONE_CALL = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//For FullScreen
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.transition.activity_slide,R.transition.fadeout);
        setContentView(R.layout.activity_contact_avtivity);
        sec=findViewById(R.id.callsec);
        rohit= findViewById(R.id.callrohit);
        shreya=findViewById(R.id.callshreya);
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ContactAvtivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else
                {
                    Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+919565132968"));
                    startActivity(intent);
                }
            }
        });
        rohit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ContactAvtivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else
                {
                    Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+919005196698"));
                    startActivity(intent);
                }
            }
        });
        shreya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+"yshreya@hotmail.com"));
                startActivity(intent);
            }
        });
    }
}
