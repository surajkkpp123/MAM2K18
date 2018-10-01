package com.mnnit.athleticmeet.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mnnit.athleticmeet.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;

public class Intra_winner_activity extends AppCompatActivity {

    private  TextView tv,tv1,tv2,tv3;
    private ProgressBar spinner;
    int position;
    String first,second,third;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra_winner_activity);
        tv=(TextView)findViewById(R.id.tvv);
        tv1=(TextView)findViewById(R.id.tvv1);
        tv2=(TextView)findViewById(R.id.tvv2);
        tv3=(TextView)findViewById(R.id.tvv3);
        linearLayout=(LinearLayout)findViewById(R.id.l2);
        Intent i=getIntent();
        position=i.getIntExtra("position",-54);
        spinner=(ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.VISIBLE);
        if(position==0)
        {
            tv.setText("100m (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");

        }
        if(position==1)
        {
            tv.setText("100m (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");

        }
        if(position==2)
        {
            tv.setText("200m (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==3)
        {
            tv.setText("200m (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==4)
        {
            tv.setText("400m (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==5)
        {
            tv.setText("400m (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==6)
        {
            tv.setText("4X100m Relay (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==7)
        {
            tv.setText("4X100m Realy (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==8)
        {
            tv.setText("4X400m Relay (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==9)
        {
            tv.setText("4X400m Relay (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==10)
        {
            tv.setText("800m (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==11)
        {
            tv.setText("800m (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==12)
        {
            tv.setText("1500m (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==13)
        {
            tv.setText("1500m (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==14)
        {
            tv.setText("30000m (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==15)
        {
            tv.setText("Three Leg Race(Boys & Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==16)
        {
            tv.setText("Discuss Throw (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==17)
        {
            tv.setText("Discuss Throw (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==18)
        {
            tv.setText("Long Jump (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==19)
        {
            tv.setText("Long Jump (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==20)
        {


            tv.setText("High Jump (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");

        }
        if(position==21)
        {

            tv.setText("High Jump (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==22)
        {
            tv.setText("110m Hurdles(Boys) Winners");

            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==23)
        {
            tv.setText("100m Hurdles(Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");

        }
        if(position==24)
        {
            tv.setText("400m Hurdles(Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==25)
        {
            tv.setText("Shotput (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==26)
        {
            tv.setText("Shotput (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }

        if(position==27)
        {
            tv.setText("Javelin Throw (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");

        }
        if(position==28)
        {
            tv.setText("Javelin Throw (Girls) Winners)");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");

        }
        if(position==29)
        {
            tv.setText("Hammer Throw (Boys) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==30)
        {
            tv.setText("Hammer Throw (Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==31)
        {
            tv.setText("Slow Cycling (Boys and Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==32)
        {
            tv.setText("Tug of war (Boys and Girls) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==33)
        {
            tv.setText("Musical Chair (Laddies) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==34)
        {
            tv.setText("100m Race Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==35)
        {
            tv.setText("50m Brisk Walk Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==36)
        {
            tv.setText("50m Race (Staff Wards) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==37)
        {
            tv.setText("100m Race (Staff Wards) Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==38)
        {
            tv.setText("200m Race Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==39)
        {
            tv.setText("400m Race Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }
        if(position==40)
        {
            tv.setText("Brick Race Winners");
            BackgroundTask1 back=new BackgroundTask1();
            back.execute(position+"");
        }


    }

    public class BackgroundTask1 extends AsyncTask<String,Void,Void> {

        String res;
        String ID;
        HashMap<String, String> contact = new HashMap<>();
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            spinner.setVisibility(View.VISIBLE);

        }

        @Override
        protected Void doInBackground(String... params) {
            String user_url="https://aniketmam2k18.000webhostapp.com/retrieve1.php";

            String id=params[0];
            ID=id;


            Log.d("TAGG::",id);
            try {
                URL url =new URL(user_url);
                HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream os=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
                String data= URLEncoder.encode("ID","UTF-8")+"="+ URLEncoder.encode(id,"UTF-8");
                Log.d("TAGG","data="+data);
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                InputStream is=new BufferedInputStream(httpURLConnection.getInputStream());
                res=convertStreamToString(is);
                Log.d("results","res="+res);

            } catch (MalformedURLException e) {
                Log.d("TAGG::","error1="+ e.toString());
            } catch (IOException e) {
                Log.d("TAGG::","error2="+ e.toString());
            }

            return null;
        }



        private String convertStreamToString(InputStream is) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();

            String line = null;
            try {
                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            spinner.setVisibility(View.GONE);
            if(res!=null) {

                //tv.setText(res);
                Log.e("RESULT", res);
                try {
                    JSONObject jsonObject=new JSONObject(res);
                    Log.d("TAGG","Error 1");
                    JSONArray jsonArray=jsonObject.getJSONArray("result");
                    Log.d("TAGG","Error 2");
                    JSONObject c=jsonArray.getJSONObject(0);
                    first=c.getString("first");
                    second =c.getString("second");
                    third=c.getString("third");
                    tv1.setText("1. "+first);
                    tv2.setText("2. "+second);
                    tv3.setText("3. "+third);
                } catch (JSONException e) {
                    Log.e("TAGG","error in parsing error  ");
                    tv2.setText("Winners not decided yet");
                    e.printStackTrace();

                }
            }
            else
            {
                Snackbar.make(linearLayout,"No internet Connection or \nServer not responding ",Snackbar.LENGTH_INDEFINITE).setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        BackgroundTask1 back=new BackgroundTask1();
                        back.execute(position+"");
                    }
                }).setActionTextColor(Color.RED).show();
            }


        }


    }
}
