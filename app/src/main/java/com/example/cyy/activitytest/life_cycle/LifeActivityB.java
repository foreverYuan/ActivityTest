package com.example.cyy.activitytest.life_cycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.cyy.activitytest.R;
import com.example.cyy.activitytest.tools.Utils;

public class LifeActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_b);
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onRestart()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onSaveInstanceState()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onDestroy()");
    }
}
