package com.example.rowielokentmatsui.writeme;

import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Category extends AppCompatActivity {
    private int average = 0;
    private int hard = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        operner();
    }
    @Override
    protected void onResume() {
        operner();
        super.onResume();
        operner();
    }

    @Override
    protected void onStart() {
        operner();
        super.onStart();
        operner();
    }

    @Override
    protected void onPause() {
        operner();
        super.onPause();
        operner();
    }

    public void operner(){
        DataManager db = new DataManager(this);
        int ids= db.getAverageCat();
        int hrds= db.getHrdCat();
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);

        Button avg = (Button)findViewById(R.id.averagesbtn);
        Button hrd = (Button)findViewById(R.id.hardsbtn);
        // Log.d("maonani", String.valueOf(ids));
        //Toast.makeText(this, ids, Toast.LENGTH_SHORT).show();
        if(ids!=0){
            avg.setBackgroundResource(R.drawable.avr_btn);
            average=1;
        }else{
            avg.getBackground().setColorFilter(filter);
            average=0;
        }
        if(hrds!=0){
            hrd.setBackgroundResource(R.drawable.hard_btn);
            hard=1;
        }else{
            hrd.getBackground().setColorFilter(filter);
            hard=0;
        }
    }
    public void goEasy(View view){
        Bundle bundle = new Bundle();
        final Intent start = new Intent(this, SplashScreen.class);
        bundle.putInt("type", 1);
        start.putExtras(bundle);
        startActivity(start);
    }
    public void goAv(View view){
        if(average==0){
            Toast.makeText(this, "Please finish easy mode first", Toast.LENGTH_SHORT).show();
        }
        else {
            Bundle bundle = new Bundle();
            final Intent start = new Intent(this, SplashScreen.class);
            bundle.putInt("type", 2);
            start.putExtras(bundle);
            startActivity(start);
        }
    }
    public void goHard(View view){
        if(hard==0){
            Toast.makeText(this, "Please finish average mode first", Toast.LENGTH_SHORT).show();
        }
        else {
            final Intent start = new Intent(this, HardDraw.class);
            startActivity(start);
        }
    }
    public void goback(View view){
        finish();
    }


}
