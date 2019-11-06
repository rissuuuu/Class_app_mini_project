package com.example.aos_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {
static int Splash =3000;
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progressBar1);
        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(MainActivity.this,Dashboard.class));
            progressBar.setVisibility(View.VISIBLE);

        }
    },Splash);

    }
}
