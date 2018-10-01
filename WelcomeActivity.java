package com.mnnit.athleticmeet.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.mnnit.athleticmeet.R;

public class WelcomeActivity extends AppCompatActivity {
    ImageView iv;
    TextView tv;
    private int log;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//fullscreen
        setContentView(R.layout.activity_welcome);
        iv=(ImageView)findViewById(R.id.img);
        sp=getApplicationContext().getSharedPreferences("login",MODE_PRIVATE);
        log=sp.getInt("successful",0);

        tv=(TextView)findViewById(R.id.sell);
        Animation ani= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.welcome_animation);
//
//        RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        rotate.setDuration(5000);
//        rotate.setInterpolator(new LinearInterpolator());



//        iv.startAnimation(rotate);
    //    iv.animate().rotationY(360f);
        //ani.setDuration(5000);
     //   iv.setAnimation(ani);
      //  tv.setAnimation(ani);
        Handler mhandler=new Handler();
        Animation ani1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        tv.startAnimation(ani1);
        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1500);
     //   setup();
//        ani.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//
//                    finish();
//                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
    }
    //@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//    private void setup(){
//
//        Fade fade= (Fade) TransitionInflater.from(this).inflateTransition(R.transition.activity_slide);
//        getWindow().setExitTransition(fade);
//
//    }
}
