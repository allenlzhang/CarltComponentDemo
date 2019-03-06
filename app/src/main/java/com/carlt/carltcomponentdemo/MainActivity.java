package com.carlt.carltcomponentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.carlt.commonlibs.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getiLoginService().lauch(MainActivity.this, "sdfsf");
            }
        });
        findViewById(R.id.btnMine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getiMineService().launch(MainActivity.this, 123);
            }
        });
        findViewById(R.id.btnShowUI).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServiceFactory.getInstance().getiLoginService().newUserInfoFragment(getSupportFragmentManager(), R.id.flContainer, new Bundle());
            }
        });
    }
}
