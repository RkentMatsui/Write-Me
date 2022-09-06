package com.example.rowielokentmatsui.writeme;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

/**
 * Created by ssaurel on 02/12/2016.
 */
public class SplashScreen extends AppCompatActivity {
    private ProgressBar mProgress;
    public Bundle getBundle = null;
    private int typego =0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        getBundle = this.getIntent().getExtras();
        if(getBundle==null){
            setContentView(R.layout.activity_splash_screen);
           mProgress = (ProgressBar) findViewById(R.id.splash);
            new Thread(new Runnable() {
                public void run() {
                    doWork();
                    startApp();
                    finish();
                }
            }).start();
            return;
        }
        typego = getBundle.getInt("type");
        // Start lengthy operation in a background thread
        switch (typego){
            case 0:
                setContentView(R.layout.activity_splash_screen);
                mProgress = (ProgressBar) findViewById(R.id.splash);
                new Thread(new Runnable() {
                    public void run() {
                        doWork();
                        startApp();
                        finish();
                    }
                }).start();
                return;
            case 1:
                setContentView(R.layout.activity_splash_screen2);
                new Thread(new Runnable() {
                    public void run() {
                        doWork();
                        startEasy();
                        finish();
                    }
                }).start();

                return;
            case 2:
                setContentView(R.layout.activity_splash_screen2);
                new Thread(new Runnable() {
                    public void run() {
                        doWork();
                        startAvg();
                        finish();
                    }
                }).start();

                return;
            default:
                break;
        }

    }
    private void doWork() {
        for (int progress=0; progress<100; progress+=10) {
            try {
                Thread.sleep(200);
                mProgress.setProgress(progress);
            } catch (Exception e) {
                e.printStackTrace();
                //Timber.e(e.getMessage());
            }
        }
    }

    private void startApp() {
        Intent intent = new Intent(SplashScreen.this, MainMenu.class);
        startActivity(intent);
        finish();
    }
    private void startEasy() {
        Intent intent = new Intent(SplashScreen.this, WriteABC.class);
        startActivity(intent);
    }
    private void startAvg() {
        Intent intent = new Intent(SplashScreen.this, AverageABC.class);
        startActivity(intent);
    }
}
