package com.example.cyy.activitytest.life_cycle;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.cyy.activitytest.R;
import com.example.cyy.activitytest.tools.Utils;

/**
 * Created by cyy on 2017/7/17.
 *
 * Activity生命周期演示
 */
public class LifeActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_activity);
        Log.e(Utils.LIFE_CYCLE_TAG, this.getClass() + "-------------------------------onCreate()");
    }

    public void doClick(View v){
        switch (v.getId()){
            case R.id.btn_jump_lifeActivityB:
                Utils.jumpActivity(LifeActivityA.this, LifeActivityB.class);
                break;

            case R.id.btn_bomb_box:
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                AlertDialog dialog = builder.setTitle("测试Activity周期弹框")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setCancelable(false)
                        .create();
                if(!dialog.isShowing()){
                    dialog.show();
                }

//                Toast.makeText(this, "aaaaaaaaaaaa", Toast.LENGTH_SHORT).show();
                break;
        }
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
