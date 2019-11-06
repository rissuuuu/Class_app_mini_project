package com.example.aos_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class OUR_TEAM extends AppCompatActivity {
RelativeLayout relativeLayout1,relativeLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our__team);
        relativeLayout1=findViewById(R.id.clickai);
        relativeLayout2=findViewById(R.id.clickit);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OUR_TEAM.this,MTECH_AI.class);
                startActivity(intent);
            }
        });

        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OUR_TEAM.this,MTECH_IT.class);
                startActivity(intent);
            }
        });
    }
}
