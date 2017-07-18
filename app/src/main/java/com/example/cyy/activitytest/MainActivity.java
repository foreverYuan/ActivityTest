package com.example.cyy.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.cyy.activitytest.life_cycle.LifeActivityA;
import com.example.cyy.activitytest.tools.Utils;

/**
 * Created by cyy on 2017/7/17.
 *
 * 主Activity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 点击回调事件，在xml中“ android:onClick="doClick" ”注册
     * @param v
     */
   public void doClick(View v){
        switch (v.getId()){
            case R.id.btn_activity_lifeCycle:
                Utils.jumpActivity(MainActivity.this, LifeActivityA.class);
        }
    }
}
