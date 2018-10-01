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
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mnnit.athleticmeet.R;

import org.json.JSONArray;
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

public class Winners_Activity extends AppCompatActivity {

    private  TextView name1, name2, name3, college1, college2, college3, tv;
    private ProgressBar spinner;
    int position;
    String check, title, user_url;
    LinearLayout load,loader,refresh;
    RelativeLayout linearLayout;
    Snackbar snackbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.transition.activity_slide,R.transition.fadeout);
        setContentView(R.layout.activity_winners_);

        name1=findViewById(R.id.name1);
        college1 = findViewById(R.id.college1);

        name2=findViewById(R.id.name2212);
        college2 = findViewById(R.id.college2);

        name3=findViewById(R.id.name3315);
        college3 = findViewById(R.id.college3);

        tv = findViewById(R.id.title);

        linearLayout= findViewById(R.id.ll);
        load=(LinearLayout)findViewById(R.id.load);
        loader=(LinearLayout)findViewById(R.id.loader);
        refresh=(LinearLayout)findViewById(R.id.refresh);

        Intent i=getIntent();
        position=i.getIntExtra("position",-54);
        title = i.getStringExtra("title");
        check = i.getStringExtra("check");

        if(check.equalsIgnoreCase("inter")) {
            user_url = "https://aniketmam2k18.000webhostapp.com/retrieve.php";
        }
        else if(check.equalsIgnoreCase("intra")){
            user_url="https://aniketmam2k18.000webhostapp.com/retrieve1.php";
        }


        spinner=(ProgressBar)findViewById(R.id.progressBar);
        spinner.getProgressDrawable().setColorFilter(
                Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
        spinner.setVisibility(View.VISIBLE);

        findViewById(R.id.refresh_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        showLoader();
                       snackbar.dismiss();
                       BackgroundTask1 back=new BackgroundTask1();
                       back.execute(position+"");

            }
        });

        showLoader();


        tv.setText(title);
        BackgroundTask1 back = new BackgroundTask1();
        back.execute(position + "");

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

                   name1.setText(c.getString("first"));
                   name2.setText(c.getString("second"));
                   name3.setText(c.getString("third"));


                   if(check.equalsIgnoreCase("inter")) {
                       college1.setText(c.getString("college_1"));
                       college2.setText(c.getString("college_2"));
                       college3.setText(c.getString("college_3"));
                   }
                   else if(check.equalsIgnoreCase("intra")){
                       college1.setText("MNNIT, Allahabad");
                       college2.setText("MNNIT, Allahabad");
                       college3.setText("MNNIT, Allahabad");
                   }

                   showLoad();

               } catch (Exception e) {

                   showRefresh();
                 //  Toast.makeText(getApplicationContext(),"Winners not yet announced",Toast.LENGTH_SHORT).show();
                   snackbar = Snackbar.make(linearLayout,"Winners not yet announced.",Snackbar.LENGTH_INDEFINITE);
                           snackbar.setAction("Close", new View.OnClickListener() {
                               @Override
                               public void onClick(View v) {

                                   snackbar.dismiss();

                               }
                               }).show();

                   e.printStackTrace();

               }
           }
           else
           {
               showRefresh();
                snackbar = Snackbar.make(linearLayout,"No internet Connection or \nServer not responding ",Snackbar.LENGTH_INDEFINITE);
               snackbar.setAction("Close", new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       snackbar.dismiss();
                   }
               }).setActionTextColor(Color.RED).show();
           }


        }


    }


    private void showLoad(){

        loader.setVisibility(View.GONE);
        load.setVisibility(View.VISIBLE);
        refresh.setVisibility(View.GONE);

    }

    private void showLoader(){


        loader.setVisibility(View.VISIBLE);
        load.setVisibility(View.GONE);
        refresh.setVisibility(View.GONE);

    }

    private void showRefresh(){

        loader.setVisibility(View.GONE);
        load.setVisibility(View.GONE);
        refresh.setVisibility(View.VISIBLE);

    }

}
