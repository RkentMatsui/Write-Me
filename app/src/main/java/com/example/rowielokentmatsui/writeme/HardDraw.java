package com.example.rowielokentmatsui.writeme;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rowielokentmatsui.writeme.models.Classification;
import com.example.rowielokentmatsui.writeme.models.Classifier;
import com.example.rowielokentmatsui.writeme.models.TensorFlowClassifier;
import com.example.rowielokentmatsui.writeme.views.DrawModel;
import com.example.rowielokentmatsui.writeme.views.DrawView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Rowielokent Matsui on 05/02/2018.
 */



public class HardDraw extends Activity implements View.OnTouchListener{

    private static final int PIXEL_WIDTH =30;
    // ui elements
    private Button clearBtn, classBtn;
    private TextView resText;
    private List<Classifier> mClassifiers = new ArrayList<>();

    // views
    private DrawModel drawModel;
    private DrawView drawView;
    private PointF mTmpPiont = new PointF();

    private float mLastX;
    private float mLastY;
    static {
        System.loadLibrary("native-lib");
    }
    public Bundle getBundle = null;
    private String letter="";
    private int str = 0;
    private int finaler =0;
    private String[] strarr = {"BigA",
            "BigB", "BigC",
            "BigD", "BigE",
            "BigF", "BigG",
            "BigH", "BigI",
            "BigJ", "BigK",
            "BigL", "BigM",
            "BigN", "BigO",
            "BigP", "BigQ",
            "BigR", "BigS",
            "BigT", "BigU",
            "BigV", "BigW",
            "BigX", "BigY",
            "BigZ", "Smalla",
            "Smallb","circle",
            "Smallc","Smalld",
            "Smalle","Smallf",
            "Smallg","Smallh",
            "Smalli","Smallj",
            "Smallk","Smalll",
            "Smallm","Smalln",
            "Smallo","Smallp",
            "Smallq","Smallr",
            "Smalls","Smallt",
            "Smallu","Smallv",
            "Smallw","Smallx",
            "Smally","Smallz",
            "circle","rectangle",
            "square","triangle"};

    private String letteraudio="";
    private String clickaudio="";
    MediaPlayer m = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_draw);
        int min = 0;
        int max = 54;

        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        letter = strarr[i1];
    //    Toast.makeText(this, letter, Toast.LENGTH_SHORT).show();
        try {
            switch(letter)
            {
            case "BigA":
                str = R.drawable.badgea;
                letteraudio="audio/big_a.MP3";
                clickaudio="audio/sound_a.mp3";
                break;
            case "BigB":
                str = R.drawable.badgeb;
                letteraudio="audio/big_b.MP3";
                clickaudio="audio/sound_b.mp3";
                break;
            case "BigC":
                str = R.drawable.badgec;
                letteraudio="audio/big_c.MP3";
                clickaudio="audio/sound_c.mp3";
                break;
            case "BigD":
                str = R.drawable.badged;
                letteraudio="audio/big_d.MP3";
                clickaudio="audio/sound_d.mp3";
                break;
            case "BigE":
                str = R.drawable.badgee;
                letteraudio="audio/big_e.MP3";
                clickaudio="audio/sound_e.mp3";
                break;
            case "BigF":
                str = R.drawable.badgef;
                letteraudio="audio/big_f.MP3";
                clickaudio="audio/sound_f.mp3";
                break;
            case "BigG":
                str = R.drawable.badgeg;
                letteraudio="audio/big_g.MP3";
                clickaudio="audio/sound_g.mp3";
                break;
            case "BigH":
                str = R.drawable.badgeh;
                letteraudio="audio/big_h.MP3";
                clickaudio="audio/sound_h.mp3";
                break;
            case "BigI":
                str = R.drawable.badgei;
                letteraudio="audio/big_i.MP3";
                clickaudio="audio/sound_i.mp3";
                break;
            case "BigJ":
                str = R.drawable.badgej;
                letteraudio="audio/big_j.MP3";
                clickaudio="audio/sound_j.mp3";
                break;
            case "BigK":
                str = R.drawable.badgek;
                letteraudio="audio/big_k.MP3";
                clickaudio="audio/sound_k.mp3";
                break;
            case "BigL":
                str = R.drawable.badgel;
                letteraudio="audio/big_l.MP3";
                clickaudio="audio/sound_l.mp3";
                break;
            case "BigM":
                str = R.drawable.badgem;
                letteraudio="audio/big_m.MP3";
                clickaudio="audio/sound_m.mp3";
                break;
            case "BigN":
                str = R.drawable.badgen;
                letteraudio="audio/big_n.MP3";
                clickaudio="audio/sound_n.mp3";
                break;
            case "BigO":
                str = R.drawable.badgeo;
                letteraudio="audio/big_o.MP3";
                clickaudio="audio/sound_o.mp3";
                break;
            case "BigP":
                str = R.drawable.badgep;
                letteraudio="audio/big_p.MP3";
                clickaudio="audio/sound_p.mp3";
                break;
            case "BigQ":
                str = R.drawable.badgeq;
                letteraudio="audio/big_q.MP3";
                clickaudio="audio/sound_q.mp3";
                break;
            case "BigR":
                str = R.drawable.badger;
                letteraudio="audio/big_r.MP3";
                clickaudio="audio/sound_r.mp3";
                break;
            case "BigS":
                str = R.drawable.badges;
                letteraudio="audio/big_s.MP3";
                clickaudio="audio/sound_s.mp3";
                break;
            case "BigT":
                str = R.drawable.badget;
                letteraudio="audio/big_t.MP3";
                clickaudio="audio/sound_t.mp3";
                break;
            case "BigU":
                str = R.drawable.badgeu;
                letteraudio="audio/big_u.MP3";
                clickaudio="audio/sound_u.mp3";
                break;
            case "BigV":
                str = R.drawable.badgev;
                letteraudio="audio/big_v.MP3";
                clickaudio="audio/sound_v.mp3";
                break;
            case "BigW":
                str = R.drawable.badgew;
                letteraudio="audio/big_w.MP3";
                clickaudio="audio/sound_w.mp3";
                break;
            case "BigX":
                str = R.drawable.badgex;
                letteraudio="audio/big_x.MP3";
                clickaudio="audio/sound_x.mp3";
                break;
            case "BigY":
                str = R.drawable.badgey;
                letteraudio="audio/big_y.MP3";
                clickaudio="audio/sound_y.mp3";
                break;
            case "BigZ":
                str = R.drawable.badgez;
                letteraudio="audio/big_z.MP3";
                clickaudio="audio/sound_z.mp3";
                break;
            case "Smalla":
                str = R.drawable.sbadge_a;
                letteraudio="audio/small_a.MP3";
                clickaudio="audio/sound_a.mp3";
                break;
            case "Smallb":
                str = R.drawable.sbadge_b;
                letteraudio="audio/small_b.MP3";
                clickaudio="audio/sound_b.mp3";
                break;
            case "Smallc":
                str = R.drawable.sbadge_c;
                letteraudio="audio/small_c.MP3";
                clickaudio="audio/sound_c.mp3";
                break;
            case "Smalld":
                str = R.drawable.sbadge_d;
                letteraudio="audio/small_d.MP3";
                clickaudio="audio/sound_d.mp3";
                break;
            case "Smalle":
                str = R.drawable.sbadge_e;
                letteraudio="audio/small_e.MP3";
                clickaudio="audio/sound_e.mp3";
                break;
            case "Smallf":
                str = R.drawable.sbadge_f;
                letteraudio="audio/small_f.MP3";
                clickaudio="audio/sound_f.mp3";
                break;
            case "Smallg":
                str = R.drawable.sbadge_g;
                letteraudio="audio/small_g.MP3";
                clickaudio="audio/sound_g.mp3";
                break;
            case "Smallh":
                str = R.drawable.sbadge_h;
                letteraudio="audio/small_h.MP3";
                clickaudio="audio/sound_h.mp3";
                break;
            case "Smalli":
                str = R.drawable.sbadge_i;
                letteraudio="audio/small_i.MP3";
                clickaudio="audio/sound_i.mp3";
                break;
            case "Smallj":
                str = R.drawable.sbadge_j;
                letteraudio="audio/small_j.MP3";
                clickaudio="audio/sound_j.mp3";
                break;
            case "Smallk":
                str = R.drawable.sbadge_k;
                letteraudio="audio/small_k.MP3";
                clickaudio="audio/sound_k.mp3";
                break;
            case "Smalll":
                str = R.drawable.sbadge_l;
                letteraudio="audio/small_l.MP3";
                clickaudio="audio/sound_l.mp3";
                break;
            case "Smallm":
                str = R.drawable.sbadge_m;
                letteraudio="audio/small_m.MP3";
                clickaudio="audio/sound_m.mp3";
                break;
            case "Smalln":
                str = R.drawable.sbadge_n;
                letteraudio="audio/small_n.MP3";
                clickaudio="audio/sound_n.mp3";
                break;
            case "Smallo":
                str = R.drawable.sbadge_o;
                letteraudio="audio/small_o.MP3";
                clickaudio="audio/sound_o.mp3";
                break;
            case "Smallp":
                str = R.drawable.sbadge_p;
                letteraudio="audio/small_p.MP3";
                clickaudio="audio/sound_p.mp3";
                break;
            case "Smallq":
                str = R.drawable.sbadge_q;
                letteraudio="audio/small_q.MP3";
                clickaudio="audio/sound_q.mp3";
                break;
            case "Smallr":
                str = R.drawable.sbadge_r;
                letteraudio="audio/small_r.MP3";
                clickaudio="audio/sound_r.mp3";
                break;
            case "Smalls":
                str = R.drawable.sbadge_s;
                letteraudio="audio/small_s.MP3";
                clickaudio="audio/sound_s.mp3";
                break;
            case "Smallt":
                str = R.drawable.sbadge_t;
                letteraudio="audio/small_t.MP3";
                clickaudio="audio/sound_t.mp3";
                break;
            case "Smallu":
                str = R.drawable.sbadge_u;
                letteraudio="audio/small_u.MP3";
                clickaudio="audio/sound_u.mp3";
                break;
            case "Smallv":
                str = R.drawable.sbadge_v;
                letteraudio="audio/small_v.MP3";
                clickaudio="audio/sound_v.mp3";
                break;
            case "Smallw":
                str = R.drawable.sbadge_w;
                letteraudio="audio/small_w.MP3";
                clickaudio="audio/sound_w.mp3";
                break;
            case "Smallx":
                str = R.drawable.sbadge_x;
                letteraudio="audio/small_x.MP3";
                clickaudio="audio/sound_x.mp3";
                break;
            case "Smally":
                str = R.drawable.sbadge_y;
                letteraudio="audio/small_y.MP3";
                clickaudio="audio/sound_y.mp3";
                break;
            case "Smallz":
                str = R.drawable.sbadge_z;
                letteraudio="audio/small_z.MP3";
                clickaudio="audio/sound_z.mp3";
                break;
            case "circle":
                str = R.drawable.badge_circle;
                letteraudio="audio/circle.MP3";
                clickaudio="audio/circle.MP3";
                break;
            case "rectangle":
                str = R.drawable.bdge_rect;
                letteraudio="audio/rectangle.mp3";
                clickaudio="audio/rectangle.mp3";
                break;
            case "square":
                str = R.drawable.badge_square;
                letteraudio="audio/square.MP3";
                clickaudio="audio/square.MP3";
                break;
            case "triangle":
                str = R.drawable.badge_triangle;
                letteraudio="audio/triangle.MP3";
                clickaudio="audio/triangle.MP3";
                break;
                default:
                    Toast.makeText(this, "not seen", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        drawView = (DrawView) findViewById(R.id.draw);
        drawModel = new DrawModel(300, 300);
        drawView.setModel(drawModel);
        drawView.setOnTouchListener(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        loadModel();
        Button erasebtn = (Button) findViewById(R.id.erase);
        try {

            if (m.isPlaying()==true) {
                m.stop();
                m.release();
                m = new MediaPlayer();
            }

            AssetFileDescriptor descriptor = getAssets().openFd(letteraudio);
            m.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();

            m.prepare();
            m.setVolume(1f, 1f);
            m.setLooping(false);
            m.start();
            m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("audio",e.toString());
        }
    }
    public void number(View v){
       // Toast.makeText(this, letter, Toast.LENGTH_SHORT).show();
        try {

            if (m.isPlaying()==true) {
                m.stop();
                m.release();
                m = new MediaPlayer();
            }

            AssetFileDescriptor descriptor = getAssets().openFd(clickaudio);
            m.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();

            m.prepare();
            m.setVolume(1f, 1f);
            m.setLooping(false);
            m.start();
            m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("audio",e.toString());
        }
    }
    @Override
    //OnResume() is called when the user resumes his Activity which he left a while ago,
    // //say he presses home button and then comes back to app, onResume() is called.
    protected void onResume() {
        drawView.onResume();
        super.onResume();
    }

    @Override
    //OnPause() is called when the user receives an event like a call or a text message,
    // //when onPause() is called the Activity may be partially or completely hidden.
    protected void onPause() {
        drawView.onPause();
        super.onPause();
    }
    private void loadModel() {
        //The Runnable interface is another way in which you can implement multi-threading other than extending the
        // //Thread class due to the fact that Java allows you to extend only one class. Runnable is just an interface,
        // //which provides the method run.
        // //Threads are implementations and use Runnable to call the method run().
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //add 2 classifiers to our classifier arraylist
                    //the tensorflow classifier and the keras classifier
                    mClassifiers.add(
                            TensorFlowClassifier.create(getAssets(), "Ker",
                                    "opt_model.pb", "labeltext.txt", PIXEL_WIDTH,
                                    "conv2d_1_input", "dense_2/Softmax", false));
                    Log.d("myTag", "This is my message");
//                    mClassifiers.add(
//                            TensorFlowClassifier.create(getAssets(), "Keras",
//                                    "opt_mnist_convnet-keras.pb", "labels.txt", PIXEL_WIDTH,
//                                    "conv2d_1_input", "dense_2/Softmax", false));
                } catch (final Exception e) {
                    //if they aren't found, throw an error!
                    throw new RuntimeException("Error initializing classifiers!", e);
                }
            }
        }).start();
    }
    @Override
    //this method detects which direction a user is moving
    //their finger and draws a line accordingly in that
    //direction
    public boolean onTouch(View v, MotionEvent event) {
        //get the action and store it as an int
        int action = event.getAction() & MotionEvent.ACTION_MASK;
        //actions have predefined ints, lets match
        //to detect, if the user has touched, which direction the users finger is
        //moving, and if they've stopped moving

        //if touched
        if (action == MotionEvent.ACTION_DOWN) {
            //begin drawing line
            processTouchDown(event);
            return true;
            //draw line in every direction the user moves
        } else if (action == MotionEvent.ACTION_MOVE) {
            processTouchMove(event);
            return true;
            //if finger is lifted, stop drawing
        } else if (action == MotionEvent.ACTION_UP) {
            processTouchUp();
            return true;
        }
        return false;
    }

    //draw line down

    private void processTouchDown(MotionEvent event) {
        //calculate the x, y coordinates where the user has touched
        mLastX = event.getX();
        mLastY = event.getY();
        //user them to calcualte the position
        drawView.calcPos(mLastX, mLastY, mTmpPiont);
        //store them in memory to draw a line between the
        //difference in positions
        float lastConvX = mTmpPiont.x;
        float lastConvY = mTmpPiont.y;
        //and begin the line drawing
        drawModel.startLine(lastConvX, lastConvY);
    }

    //the main drawing function
    //it actually stores all the drawing positions
    //into the drawmodel object
    //we actually render the drawing from that object
    //in the drawrenderer class
    private void processTouchMove(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        drawView.calcPos(x, y, mTmpPiont);
        float newConvX = mTmpPiont.x;
        float newConvY = mTmpPiont.y;
        drawModel.addLineElem(newConvX, newConvY);

        mLastX = x;
        mLastY = y;
        drawView.invalidate();
    }

    private void processTouchUp() {

        drawModel.endLine();

    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public void checker(String output){
        switch(letter)
        {
            case "BigA":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigB":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigC":
                if(output.equals(letter) || output.equals("Smallc")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigD":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigE":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigF":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigG":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigH":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigI":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigJ":
                if(output.equals(letter) || output.equals("Smallj")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigK":
                if(output.equals(letter) || output.equals("SmallK")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigL":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigM":
                if(output.equals(letter) || output.equals("Smallm")|| output.equals("Smalln")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigN":
                if(output.equals(letter) || output.equals("Smalln")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigO":
                if(output.equals(letter) || output.equals("Smallo")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigP":
                if(output.equals(letter) || output.equals("Smallp")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigQ":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigR":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigS":
                if(output.equals(letter) || output.equals("Smalls")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigT":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigU":
                if(output.equals(letter) || output.equals("Smallu")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigV":
                if(output.equals(letter) || output.equals("Smallv")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigW":
                if(output.equals(letter) || output.equals("Smallw")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigX":
                if(output.equals(letter) || output.equals("Smallx")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigY":
                if(output.equals(letter) || output.equals("Smally")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "BigZ":
                if(output.equals(letter) || output.equals("Smallz")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smalla":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smallb":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smallc":
                if(output.equals(letter) || output.equals("BigC")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smalld":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smalle":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smallf":
                if(output.equals(letter) || output.equals("BigF")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smallg":
                if(output.equals(letter) || output.equals("Smallq")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smallh":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smalli":
                if(output.equals(letter) || output.equals("Smallj")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallj":
                if(output.equals(letter) || output.equals("Smalli")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallk":
                if(output.equals(letter) || output.equals("BigK")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smalll":
                if(output.equals(letter)){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallm":
                if(output.equals(letter) || output.equals("Smalln")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smalln":
                if(output.equals(letter) || output.equals("Smalln")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "Smallo":
                if(output.equals(letter)||  output.equals("Smallc")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallp":
                if(output.equals(letter)||  output.equals("BigP")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallq":
                if(output.equals(letter) || output.equals("Smalla") || output.equals("Smallg")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallr":
                if(output.equals(letter) || output.equals("Smallv")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smalls":
                if(output.equals(letter) || output.equals("BigS")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallt":
                if(output.equals(letter) || output.equals("BigT")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }


                break;
            case "Smallu":
                if(output.equals(letter) || output.equals("BigU")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallv":
                if(output.equals(letter) || output.equals("BigV") || output.equals("Smallr") ){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallw":
                if(output.equals(letter) || output.equals("BigW")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallx":
                if(output.equals(letter) || output.equals("BigX")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smally":
                if(output.equals(letter) || output.equals("BigY")||  output.equals("Smallj")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "Smallz":
                if(output.equals(letter) || output.equals("BigZ")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "circle":
                if(output.equals("BigO") || output.equals("Smallo")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "rectangle":
                if(output.equals(letter) || output.equals("Smallo")|| output.equals("square")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }

                break;
            case "square":
                if(output.equals(letter) || output.equals("Smallo") || output.equals("BigB")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            case "triangle":
                if(output.equals(letter)|| output.equals("BigA")){
                    Log.d("Corre", "SEKAI");
                    finaler=1;
                    Checkdialog(1);
                }
                break;
            default:
                throw new RuntimeException("error fetching");
        }
    }
    public void audiobutt(View v){
       // Toast.makeText(this, "audio ko", Toast.LENGTH_SHORT).show();
        MediaPlayer n = new MediaPlayer();

        try {

            if (n.isPlaying()==true) {
                n.stop();
                n.release();
                n = new MediaPlayer();

            }

            AssetFileDescriptor descriptor = getAssets().openFd(letteraudio);
            n.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();

            n.prepare();
            n.setVolume(1f, 1f);
            n.setLooping(false);
            n.start();
            n.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("audio",e.toString());
        }
    }
    public void backer(View view){
//        final Intent board = new Intent(this, WritingBoard.class);
//        startActivity(board);
        finish();
    }
    public void eraseboard(View view){
        drawModel.clear();
        drawView.reset();
        drawView.invalidate();
        drawView.createnew();
    }
    public void checkifriht(View v){
        final Handler handler = new Handler();

        float pixels[] = drawView.getPixelData();
        if(finaler==1){
            return;
        }

        // init an empty string to fill with the classification output
        String text = "";
        //for each classifier in our array

        for (Classifier classifier : mClassifiers) {
            //perform classification on the image

            final Classification res = classifier.recognize(pixels);

            //    if it can't classify, output a question mark
            if (res.getLabel() == null) {
                text += classifier.name() + ": ?\n";
            } else {
                //else output its name

                text += String.format("%s: %s, %f\n", classifier.name(), res.getLabel(),
                        res.getConf());
                checker(res.getLabel());
                if(finaler==0){
                    MediaPlayer med = new MediaPlayer();
                    try {

                        if (med.isPlaying()==true) {
                            med.stop();
                            med.release();
                            med = new MediaPlayer();

                        }
                        Checkdialog(0);
                        AssetFileDescriptor descriptor = getAssets().openFd("audio/please_write.MP3");
                        med.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                        descriptor.close();

                        med.prepare();
                        med.setVolume(1f, 1f);
                        med.setLooping(false);
                        med.start();
                        med.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("audio",e.toString());
                    }
                }
            }
        }
        Log.d("tensoflow", text);
        // resText.setText(text);

    }
    Dialog checkdialog;
    public void Checkdialog(int righto){

        checkdialog = new Dialog(this);
        checkdialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        checkdialog.setContentView(R.layout.checkanimation);
        checkdialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        int width= ViewGroup.LayoutParams.MATCH_PARENT;
        int height=ViewGroup.LayoutParams.MATCH_PARENT;
        checkdialog.getWindow().setLayout(width,height);
        try {
            GifImageView img= (GifImageView) checkdialog.findViewById(R.id.checkanimation);
            GifDrawable gifDrawable;
            int gifdraw = R.drawable.check;
            if(letter.equals("triangle")){
                gifdraw=R.drawable.sparkl;
            }else {
                gifdraw = R.drawable.check;
            }
            if(righto==0){
                gifDrawable  = new GifDrawable(getResources(), R.drawable.ex);
            }else{
                gifDrawable  = new GifDrawable(getResources(), R.drawable.sparkl);
                MediaPlayer m = new MediaPlayer();

                if (m.isPlaying()==true) {
                    m.stop();
                    m.release();
                    m = new MediaPlayer();
                }

                AssetFileDescriptor descriptor = getAssets().openFd("audio/yay.mp3");
                m.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();

                m.prepare();
                m.setVolume(1f, 1f);
                m.setLooping(false);
                m.start();
                m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    }
                });

            }


            img.setImageDrawable(gifDrawable);

        }catch (Exception e){
            Log.d("Error","Error in checkdialog");
        }
        checkdialog.setCancelable(false);
        checkdialog.show();
        final int rightos = righto;
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                if(rightos==0) {
                    checkdialog.dismiss();
                }
                else {
                    checkdialog.dismiss();
                    MyCustomAlertDialog();
                }
            }
        }, 3000);

    }

    Dialog MyDialog;
    public void MyCustomAlertDialog(){

        MyDialog = new Dialog(this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.customdialog);
        MyDialog.setTitle("You are COrrect");

        Button next = (Button)MyDialog.findViewById(R.id.next);
        Button close = (Button)MyDialog.findViewById(R.id.close);
        ImageView img= (ImageView) MyDialog.findViewById(R.id.imagepop);
        Button exit = (Button)MyDialog.findViewById(R.id.exitor);
        img.setImageResource(str);
        exit.setEnabled(false);
        exit.setBackground(null);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nexter();
                // Toast.makeText(getApplicationContext(), "Hello, I'm Custom Alert Dialog", Toast.LENGTH_LONG).show();

            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        MyDialog.setCancelable(false);
        MyDialog.show();

    }
    private void nexter(){

        final Intent inten= new Intent(this,HardDraw.class);
        inten.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(inten);
        finish();


    }
}

