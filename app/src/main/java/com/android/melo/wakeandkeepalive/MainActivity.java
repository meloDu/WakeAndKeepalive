package com.android.melo.wakeandkeepalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(getApplicationContext(), DaemonService.class));
        Log.d("MainActivity", "onCreate(): savedInstanceState = [" + savedInstanceState + "]");
        Toast.makeText(this, "开启后台守护服务", Toast.LENGTH_SHORT).show();
//        finish();
    }
}
