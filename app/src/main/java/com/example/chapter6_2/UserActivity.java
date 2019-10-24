package com.example.chapter6_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends BaseActivity {
    private Button mReturnButton;
    private Button forceOfflineBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        mReturnButton = (Button)findViewById(R.id.returnback);
        forceOfflineBtn=findViewById(R.id.force_offline_btn);
    }
    public void force_offline(View view){
        Intent intent = new Intent("com.example.chapter6_2.FORCE_OFFLINE");
        sendBroadcast(intent);
    }

    public void back_to_login(View view) {
        Intent intent3 = new Intent(UserActivity.this,LoginActivity.class) ;
        startActivity(intent3);
        finish();
    }
}
