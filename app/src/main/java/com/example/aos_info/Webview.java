package com.example.aos_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.util.Objects;
import java.util.Set;

public class Webview extends AppCompatActivity {
   WebView browser;
    String message;
    String key[]={"notification","19mcmi01","19mcmi02","19mcmi03","19mcmi04","19mcmi05","19mcmi06","19mcmi07","19mcmi08",
            "19mcmi09","19mcmi10","19mcmi11","19mcmi12","19mcmi13","19mcmi14","19mcmi15","19mcmi16"
            ,"19mcmi17","19mcmi18","19mcmi19","19mcmi20","19mcmi21","19mcmi22","19mcmi23","19mcmi24"
            ,"19mcmi25","19mcmi26","19mcmi27","19mcmi28","19mcmi29","19mcmi30","19mcmi31"
            ,"19mcmi32","19mcmi33","19mcmi34","19mcmi35","19mcmb01","19mcmb02","19mcmb03","19mcmb04"
            ,"19mcmb05","19mcmb06","19mcmb07","19mcmb08","19mcmb09","19mcmb10","19mcmb11","19mcmb12","19mcmb13"
            ,"19mcmb14","19mcmb15","19mcmb16","19mcmb17","19mcmb18","19mcmb19","19mcmb20","19mcmb21","19mcmb22","19mcmb23"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        browser=findViewById(R.id.webv);
            for(int i=0;i<key.length;i++) {
            message = (getIntent().getExtras()).getString(key[i]);
            browser.getSettings().setJavaScriptEnabled(true);
            browser.getSettings().setAppCacheEnabled(true);
            browser.loadUrl(message);
            browser.setWebViewClient(new WebViewClient());
        }

    }




}
