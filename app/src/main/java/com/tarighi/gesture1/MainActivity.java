package com.tarighi.gesture1;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "LifeCycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "LifeCycle", "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "LifeCycle", "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "LifeCycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "LifeCycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "LifeCycle", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "LifeCycle", "onRestart");
    }
}
