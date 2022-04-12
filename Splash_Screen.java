package com.example.artamisportfolioapp;

import static com.example.artamisportfolioapp.R.layout.activity_splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class Splash_Screen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(activity_splash_screen);

        Thread thread=new Thread()
        {
            public void run()
            {

                try
                {
                    sleep(4000);
                    finish();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent intent = new Intent(Splash_Screen.this, MainActivity.class);
                    startActivity(intent);
                }
            }

        };thread.start();

    }














}
