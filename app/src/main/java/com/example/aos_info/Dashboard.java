package com.example.aos_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Dashboard extends AppCompatActivity {
    RelativeLayout relativeLayout,relativeLayout2,relativeLayout3,relativeLayout4,relativeLayout5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        relativeLayout=findViewById(R.id.click1);
        relativeLayout2=findViewById(R.id.click2);
        relativeLayout3=findViewById(R.id.click3);
        relativeLayout4=findViewById(R.id.click4);
        relativeLayout5=findViewById(R.id.click5);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this,Guide.class);
                startActivity(intent);
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this,OUR_PROJECTS.class);
                startActivity(intent);
            }
        });relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this,PROJECT_LEADERS.class);
                startActivity(intent);
            }
        });relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this,OUR_TEAM.class);
                startActivity(intent);
            }
        });
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key="notification";
                Intent intent=new Intent(Dashboard.this,Webview.class);
                intent.putExtra(key,"https://notifications297543443.wordpress.com");
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {

    }
}
