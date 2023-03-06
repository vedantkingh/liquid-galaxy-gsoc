package com.example.gsocsample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button about_me_button,lg_video_button,lg_website_button,email_me_button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hiding the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Initializing all components
        about_me_button=findViewById(R.id.about_me_button);
        lg_video_button=findViewById(R.id.lg_video_button);
        lg_website_button=findViewById(R.id.lg_website_button);
        email_me_button=findViewById(R.id.email_me_button);

        //about_me_button action to redirect to AboutMe activity
        about_me_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, AboutMe.class);
                startActivity(intent);
            }
        });

        //lg_video_button action to redirect to LgVideo activity
        lg_video_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1doZUYCRz6FTahlmaP9e_dPd38qbggUwT/view"));
                startActivity(intent);
            }
        });

        //lg_website_button action to redirect to Liquid Galaxy web page
        lg_website_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.liquidgalaxy.eu/"));
                startActivity(intent);
            }
        });

        //email_me_button action to email me
        email_me_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"vedantkingh@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Liquid Galaxy GSoC 2023");
                startActivity(intent);
            }
        });
    }
}