package com.example.wendy_lu.findfood2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class foodlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);
        Intent intent=this.getIntent();
        String act=intent.getStringExtra("Title");
        if(act.equals("L"))
            getSupportActionBar().setTitle("店家列表");
        else if(act.equals("F"))
            getSupportActionBar().setTitle("我的最愛");
    }
}
