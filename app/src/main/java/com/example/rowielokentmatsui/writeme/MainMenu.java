package com.example.rowielokentmatsui.writeme;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainMenu extends Activity {
   public MediaPlayer m = new MediaPlayer();
   DataManager db  = new DataManager(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        if (ContextCompat.checkSelfPermission(MainMenu.this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            // Permission is not granted
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(MainMenu.this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed; request the permission
                ActivityCompat.requestPermissions(MainMenu.this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        1);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        } else {
            // Permission has already been granted
        }
        int checkdb = db.checkifopened();
        if(checkdb==0){
            Intent start = new Intent(MainMenu.this, CustomBackgroundIntro.class);
            startActivity(start);
            int resu =  db.updateopen();
            String st = resu+ "";
           // Toast.makeText(this, st, Toast.LENGTH_SHORT).show();


        }

        //playbg();
    }
    public void onStart(View view){
        final Intent start = new Intent(MainMenu.this, Category.class);
        startActivity(start);
    }

    public void onPractice(View view){
        final Intent start = new Intent(MainMenu.this, practice_activity.class);
        startActivity(start);
    }

    public void onAchieve(View view){
        final Intent start = new Intent(MainMenu.this, Achievements.class);
        startActivity(start);
    }
    public void onExit(View view){
        finish();
//        if (m.isPlaying()==true) {
//            m.stop();
//            m.release();
//        }
    }
    public void playbg(){

        try {

            if (m.isPlaying()==true) {
                m.stop();
                m.release();
                m = new MediaPlayer();
            }

            AssetFileDescriptor descriptor = getAssets().openFd("audio/bensound-littleidea.mp3");

            m.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();

            m.prepare();
            m.setVolume(1f, 1f);
            m.setLooping(true);
            m.start();

        } catch (Exception e) {
            e.printStackTrace();
            Log.e("audio",e.toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
      //  playbg();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
       // playbg();
    }
    @Override
    protected void onStop() {
//        if (m.isPlaying()==true) {
//            m.stop();
//            m.release();
//        }
        super.onStop();

    }
    public void goHistory(View view){
        final Intent start = new Intent(this, HistoryPick.class);
        startActivity(start);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request.
        }
    }
}

