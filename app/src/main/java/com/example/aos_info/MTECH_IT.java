package com.example.aos_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MTECH_IT extends AppCompatActivity {
    Button mb1,mb2,mb3,mb4,mb5,mb6,mb7,mb8,mb9,mb10,mb11,mb12,mb13,mb14,mb15,mb16,mb17,mb18,mb19,mb20,mb21,mb22,mb23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtech__it);
        mb1=findViewById(R.id.mcmb01);
        mb2=findViewById(R.id.mcmb02);
        mb3=findViewById(R.id.mcmb03);
        mb4=findViewById(R.id.mcmb04);
        mb5=findViewById(R.id.mcmb05);
        mb6=findViewById(R.id.mcmb06);
        mb7=findViewById(R.id.mcmb07);
        mb8=findViewById(R.id.mcmb08);
        mb9=findViewById(R.id.mcmb09);
        mb10=findViewById(R.id.mcmb10);
        mb11=findViewById(R.id.mcmb11);
        mb12=findViewById(R.id.mcmb12);
        mb13=findViewById(R.id.mcmb13);
        mb14=findViewById(R.id.mcmb14);
        mb15=findViewById(R.id.mcmb15);
        mb16=findViewById(R.id.mcmb16);
        mb17=findViewById(R.id.mcmb17);
        mb18=findViewById(R.id.mcmb18);
        mb19=findViewById(R.id.mcmb19);
        mb20=findViewById(R.id.mcmb20);
        mb21=findViewById(R.id.mcmb21);
        mb22=findViewById(R.id.mcmb22);
        mb23=findViewById(R.id.mcmb23);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                String key="19mcmb01";
                intent.putExtra(key,"https://priyanshudebnath.wixsite.com/voicerecognition");
                startActivity(intent);
            }
        });
        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* String key="19mcmb02";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://pranaygawande7.wixsite.com/19mcmb02");
                startActivity(intent);
            */
            }
        });
        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb03";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://manisha8575.wordpress.com");
                startActivity(intent);
            }
        });
        mb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb04";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://pavannayaka4.wixsite.com/aosproject");
                startActivity(intent);
            }
        });
        mb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String key="19mcmb05";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://docs.google.com/document/d/1--7GiTa0TTPHtd5XiH9oYmPJ6oyxeG-KB0Xe-LzirOY/edit#heading=h.5xqwihlp3b6b");
                startActivity(intent);
            */
            }

        });
        mb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String key="19mcmb06";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://19mcmb06.wordpress.com");
                startActivity(intent);*/
            }
        });
        mb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb07";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://aditijain07.wordpress.com");
                startActivity(intent);
            }
        });
        mb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb08";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://19mcmb08.wordpress.com");
                startActivity(intent);

            }

        });
        mb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb09";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://19mcmb09.wordpress.com");
                startActivity(intent);
            }
        });
        mb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb10";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://aosminiproject371035566.wordpress.com");
                startActivity(intent);
            }
        });
        mb11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb11";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://19mcmb11wordperss.wordpress.com");
                startActivity(intent);
            }
        });
        mb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mb13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb13";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://msmohit415.wixsite.com/mysite-4");
                startActivity(intent);
            }
        });
        mb14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb14";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://sravanisasu.github.io");
                startActivity(intent);
            }
        });
        mb15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mb16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb16";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://shreejeetp.github.io");
                startActivity(intent);
            }
        });
        mb17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb17";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://19mcmb17.wordpress.com");
                startActivity(intent);
            }
        });
        mb18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb18";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://19mcmb18.wordpress.com");
                startActivity(intent);
            }
        });
        mb19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String key="19mcmb19";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://19mcmb19.wordpress.com");
                startActivity(intent);*/
            }
        });
        mb20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb20";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://debdeepgoswami.wordpress.com");
                startActivity(intent);
            }
        });
        mb21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb21";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://www.aptechnoservices.com/aos");
                startActivity(intent);
            }
        });
        mb22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb22";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://msmohit415.wixsite.com/mysite-6");
                startActivity(intent);
            }
        });
        mb23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="19mcmb23";
                Intent intent=new Intent(MTECH_IT.this,Webview.class);
                intent.putExtra(key,"https://aosminiproject19mcmb23.godaddysites.com");
                startActivity(intent);

            }
        });
    }
}
