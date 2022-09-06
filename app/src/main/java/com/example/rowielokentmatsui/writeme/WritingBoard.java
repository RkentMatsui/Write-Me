package com.example.rowielokentmatsui.writeme;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.rowielokentmatsui.writeme.models.Classification;
import com.example.rowielokentmatsui.writeme.models.Classifier;
import com.example.rowielokentmatsui.writeme.models.TensorFlowClassifier;
import com.example.rowielokentmatsui.writeme.views.DrawModel;
import com.example.rowielokentmatsui.writeme.views.DrawView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class WritingBoard extends Activity implements View.OnTouchListener {
    DataManager db = new DataManager(this);
     Letter letters = new Letter();
    private static final int PIXEL_WIDTH =30;
    MediaPlayer m = new MediaPlayer();
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
    private int finaler = 0;
    public Bundle getBundle = null;
    private String letter="";
    private int str = 0;
    private String letteraudio="";
    private String clickaudio="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing_board);
        getBundle = this.getIntent().getExtras();
        letter = getBundle.getString("letter");
        GifImageView gifimage = (GifImageView)findViewById(R.id.tutorialview);
        GifDrawable gifDrawable;


        try {
            switch(letter)
            {
                case "BigA":
                    str = R.drawable.badgea;
                    gifDrawable  = new GifDrawable(getResources(), R.drawable.lettera);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitala.MP3";
                    clickaudio="audio/sound_a.mp3";
                    break;
                case "BigB":
                    str = R.drawable.badgeb;
                     gifDrawable = new GifDrawable(getResources(), R.drawable.letterb);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalb.MP3";
                    clickaudio="audio/sound_b.mp3";
                    break;
                case "BigC":
                    str = R.drawable.badgec;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterc);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalc.MP3";
                    clickaudio="audio/sound_c.mp3";
                    break;
                case "BigD":
                    str = R.drawable.badged;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterd);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitald.MP3";
                    clickaudio="audio/sound_d.mp3";
                    break;
                case "BigE":
                    str = R.drawable.badgee;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.lettere);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitale.MP3";
                    clickaudio="audio/sound_e.mp3";
                    break;
                case "BigF":
                    str = R.drawable.badgef;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterf);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalf.MP3";
                    clickaudio="audio/sound_f.mp3";
                    break;
                case "BigG":
                    str = R.drawable.badgeg;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterg);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalg.MP3";
                    clickaudio="audio/sound_g.mp3";
                    break;
                case "BigH":
                    str = R.drawable.badgeh;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterh);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalh.MP3";
                    clickaudio="audio/sound_h.mp3";
                    break;
                case "BigI":
                    str = R.drawable.badgei;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letteri);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitali.MP3";
                    clickaudio="audio/sound_i.mp3";
                    break;
                case "BigJ":
                    str = R.drawable.badgej;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterj);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalj.MP3";
                    clickaudio="audio/sound_j.mp3";
                    break;
                case "BigK":
                    str = R.drawable.badgek;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterk);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalk.MP3";
                    clickaudio="audio/sound_k.mp3";
                    break;
                case "BigL":
                    str = R.drawable.badgel;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterl);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitall.MP3";
                    clickaudio="audio/sound_l.mp3";
                    break;
                case "BigM":
                    str = R.drawable.badgem;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterm);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalm.MP3";
                    clickaudio="audio/sound_m.mp3";
                    break;
                case "BigN":
                    str = R.drawable.badgen;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.lettern);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitaln.MP3";
                    clickaudio="audio/sound_n.mp3";
                    break;
                case "BigO":
                    str = R.drawable.badgeo;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.lettero);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalo.MP3";
                    clickaudio="audio/sound_o.mp3";
                    break;
                case "BigP":
                    str = R.drawable.badgep;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterp);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalp.MP3";
                    clickaudio="audio/sound_p.mp3";
                    break;
                case "BigQ":
                    str = R.drawable.badgeq;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterq);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalq.MP3";
                    clickaudio="audio/sound_q.mp3";
                    break;
                case "BigR":
                    str = R.drawable.badger;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterr);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalr.MP3";
                    clickaudio="audio/sound_r.mp3";
                    break;
                case "BigS":
                    str = R.drawable.badges;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letters);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitals.MP3";
                    clickaudio="audio/sound_s.mp3";
                    break;
                case "BigT":
                    str = R.drawable.badget;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.lettert);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalt.MP3";
                    clickaudio="audio/sound_t.mp3";
                    break;
                case "BigU":
                    str = R.drawable.badgeu;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letteru);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalu.MP3";
                    clickaudio="audio/sound_u.mp3";
                    break;
                case "BigV":
                    str = R.drawable.badgev;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterv);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalv.MP3";
                    clickaudio="audio/sound_v.mp3";
                    break;
                case "BigW":
                    str = R.drawable.badgew;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterw);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalw.MP3";
                    clickaudio="audio/sound_w.mp3";
                    break;
                case "BigX":
                    str = R.drawable.badgex;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterx);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalx.MP3";
                    clickaudio="audio/sound_x.mp3";
                    break;
                case "BigY":
                    str = R.drawable.badgey;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.lettery);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitaly.MP3";
                    clickaudio="audio/sound_y.mp3";
                    break;
                case "BigZ":
                    str = R.drawable.badgez;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.letterz);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/capitalz.MP3";
                    clickaudio="audio/sound_z.mp3";
                    break;
                case "Smalla":
                    str = R.drawable.sbadge_a;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_a);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowera.MP3";
                    clickaudio="audio/sound_a.mp3";
                    break;
                case "Smallb":
                    str = R.drawable.sbadge_b;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_b);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerb.MP3";
                    clickaudio="audio/sound_b.mp3";
                    break;
                case "Smallc":
                    str = R.drawable.sbadge_c;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_c);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerc.MP3";
                    clickaudio="audio/sound_c.mp3";
                    break;
                case "Smalld":
                    str = R.drawable.sbadge_d;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_d);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerd.MP3";
                    clickaudio="audio/sound_d.mp3";
                    break;
                case "Smalle":
                    str = R.drawable.sbadge_e;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_e);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowere.MP3";
                    clickaudio="audio/sound_e.mp3";
                    break;
                case "Smallf":
                    str = R.drawable.sbadge_f;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_f);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerf.MP3";
                    clickaudio="audio/sound_f.mp3";
                    break;
                case "Smallg":
                    str = R.drawable.sbadge_g;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_g);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerg.MP3";
                    clickaudio="audio/sound_g.mp3";
                    break;
                case "Smallh":
                    str = R.drawable.sbadge_h;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_h);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerh.MP3";
                    clickaudio="audio/sound_h.mp3";
                    break;
                case "Smalli":
                    str = R.drawable.sbadge_i;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_i);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/loweri.MP3";
                    clickaudio="audio/sound_i.mp3";
                    break;
                case "Smallj":
                    str = R.drawable.sbadge_j;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_j);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerj.MP3";
                    clickaudio="audio/sound_j.mp3";
                    break;
                case "Smallk":
                    str = R.drawable.sbadge_k;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_k);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerk.MP3";
                    clickaudio="audio/sound_k.mp3";
                    break;
                case "Smalll":
                    str = R.drawable.sbadge_l;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_l);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerl.MP3";
                    clickaudio="audio/sound_l.mp3";
                    break;
                case "Smallm":
                    str = R.drawable.sbadge_m;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_m);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerm.MP3";
                    clickaudio="audio/sound_m.mp3";
                    break;
                case "Smalln":
                    str = R.drawable.sbadge_n;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_n);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowern.MP3";
                    clickaudio="audio/sound_n.mp3";
                    break;
                case "Smallo":
                    str = R.drawable.sbadge_o;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_o);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowero.MP3";
                    clickaudio="audio/sound_o.mp3";
                    break;
                case "Smallp":
                    str = R.drawable.sbadge_p;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_p);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerp.MP3";
                    clickaudio="audio/sound_p.mp3";
                    break;
                case "Smallq":
                    str = R.drawable.sbadge_q;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_q);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerq.MP3";
                    clickaudio="audio/sound_q.mp3";
                    break;
                case "Smallr":
                    str = R.drawable.sbadge_r;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_r);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerr.MP3";
                    clickaudio="audio/sound_r.mp3";
                    break;
                case "Smalls":
                    str = R.drawable.sbadge_s;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_s);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowers.MP3";
                    clickaudio="audio/sound_s.mp3";
                    break;
                case "Smallt":
                    str = R.drawable.sbadge_t;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_t);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowert.MP3";
                    clickaudio="audio/sound_t.mp3";
                    break;
                case "Smallu":
                    str = R.drawable.sbadge_u;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_u);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/loweru.MP3";
                    clickaudio="audio/sound_u.mp3";
                    break;
                case "Smallv":
                    str = R.drawable.sbadge_v;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_v);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerv.MP3";
                    clickaudio="audio/sound_v.mp3";
                    break;
                case "Smallw":
                    str = R.drawable.sbadge_w;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_w);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerw.MP3";
                    clickaudio="audio/sound_w.mp3";
                    break;
                case "Smallx":
                    str = R.drawable.sbadge_x;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_x);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerx.MP3";
                    clickaudio="audio/sound_x.mp3";
                    break;
                case "Smally":
                    str = R.drawable.sbadge_y;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_y);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowery.MP3";
                    clickaudio="audio/sound_y.mp3";
                    break;
                case "Smallz":
                    str = R.drawable.sbadge_z;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.anim_z);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/lowerz.MP3";
                    clickaudio="audio/sound_z.mp3";
                    break;
                case "circle":
                    str = R.drawable.badge_circle;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.lettero);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/circle.MP3";
                    clickaudio="audio/circle.MP3";
                    break;
                case "rectangle":
                    str = R.drawable.bdge_rect;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.rectangle);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/rectangle.mp3";
                    clickaudio="audio/rectangle.mp3";
                    break;
                case "square":
                    str = R.drawable.badge_square;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.squareanim);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/square.MP3";
                    clickaudio="audio/square.MP3";
                    break;
                case "triangle":
                    str = R.drawable.badge_triangle;
                    gifDrawable = new GifDrawable(getResources(), R.drawable.triangleanim);
                    gifimage.setImageDrawable(gifDrawable);
                    letteraudio="audio/triangle.MP3";
                    clickaudio="audio/triangle.MP3";
                    break;
                default:
                    Toast.makeText(this, "not seen", Toast.LENGTH_SHORT).show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //get drawing view from XML (where the finger writes the letter)
        drawView = (DrawView) findViewById(R.id.draw);
        //get the model object
        drawModel = new DrawModel(300, 300);
        drawView.erasing(0);
        //init the view with the model object
        drawView.setModel(drawModel);
        // give it a touch listener to activate when the user taps
        drawView.setOnTouchListener(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        drawView.setDrawingCacheEnabled(true);
        loadModel();
        // res text
        //this is the text that shows the output of the classification
        //resText = (TextView) findViewById(R.id.tfRes);
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

    @Override
    //OnResume() is called when the user resumes his Activity which he left a while ago,
    // //say he presses home button and then comes back to app, onResume() is called.
    protected void onResume() {
        super.onResume();
        drawView.onResume();
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

            AssetFileDescriptor descriptor = getAssets().openFd(clickaudio);
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

            Log.e("audio",e.toString());
        }
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
    //this method detects which direction a user is moving
    //their finger and draws a line accordingly in that
    //direction

    @Override
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


    public void savaer()
    {
        Bitmap bitmap = drawView.getDrawingCache();
        String path = Environment.getExternalStorageDirectory().getAbsolutePath();
        int count = db.getHistoryCount();


        File dir = new File(Environment.getExternalStorageDirectory() + "/WriteMe");
        if(dir.isDirectory()) {
         //   Toast.makeText(this, "exist", Toast.LENGTH_SHORT).show();
         }
         else{
           // Toast.makeText(this, "not exist", Toast.LENGTH_SHORT).show();
            new File(Environment.getExternalStorageDirectory(), "WriteMe").mkdirs();
        }
        File file = new File(path+"/WriteMe/"+letter+count+".png");
  //      Toast.makeText(this, file.getAbsolutePath(), Toast.LENGTH_SHORT).show();
        try
        {


            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
            fos.flush();
            fos.close();
            //Toast.makeText(this, file.getAbsolutePath()+" saved", Toast.LENGTH_SHORT).show();
         //   Button btner = (Button) findViewById(R.id.erase);
//            BitmapFactory.Options options = new BitmapFactory.Options();
//            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
          //  Bitmap bitmapo = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
           // BitmapDrawable ob = new BitmapDrawable(getResources(), bitmapo);
           // btner.setBackground(ob);
            letters.setHistoryLetter(letter);
            letters.setHistoryFilename("WriteMe/"+letter+count+".png");
            db.addHistory(letters);
        }
        catch (Exception e)
        {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

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
                            Checkdialog(0);
                        }
                    }
                }
                Log.d("tensoflow", text);
                // resText.setText(text);

    }
@SuppressWarnings("unused")
public void checker(String output){
    switch(letter)
    {
        case "BigA":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);

                finaler=1;
                int res = db.updateLetter("BigB",0);

//                if (res>0){
//                   //st.makeText(this, res, Toast.LENGTH_SHORT).show();
//                }

            }
            break;
        case "BigB":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigC",0);

            }
            break;
        case "BigC":
            if(output.equals(letter) || output.equals("Smallc")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigD",0);

            }
            break;
        case "BigD":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigE",0);

            }
            break;
        case "BigE":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigF",0);

            }
            break;
        case "BigF":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigG",0);
               }
            break;
        case "BigG":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigH",0);
                }
            break;
        case "BigH":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigI",0);
                }
            break;
        case "BigI":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigJ",0);
                }
            break;
        case "BigJ":
            if(output.equals(letter) || output.equals("Smallj")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigK",0);
                }
            break;
        case "BigK":
            if(output.equals(letter) || output.equals("SmallK")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigL",0);
            }
            break;
        case "BigL":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigM",0);
            }
            break;
        case "BigM":
            if(output.equals(letter) || output.equals("Smallm")|| output.equals("Smalln")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigN",0);
            }
            break;
        case "BigN":
            if(output.equals(letter) || output.equals("Smalln")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigO",0);
            }
            break;
        case "BigO":
            if(output.equals(letter) || output.equals("Smallo")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigP",0);
            }
            break;
        case "BigP":
            if(output.equals(letter) || output.equals("Smallp")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigQ",0);
            }
            break;
        case "BigQ":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigR",0);
            }
            break;
        case "BigR":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigS",0);
            }
            break;
        case "BigS":
            if(output.equals(letter) || output.equals("Smalls")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigT",0);
            }
            break;
        case "BigT":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigU",0);
            }
            break;
        case "BigU":
            if(output.equals(letter) || output.equals("Smallu")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigV",0);
            }
            break;
        case "BigV":
            if(output.equals(letter) || output.equals("Smallv")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigW",0);
            }
            break;
        case "BigW":
            if(output.equals(letter) || output.equals("Smallw")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigX",0);
            }
            break;
        case "BigX":
            if(output.equals(letter) || output.equals("Smallx")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigY",0);
            }
            break;
        case "BigY":
            if(output.equals(letter) || output.equals("Smally")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigZ",0);
            }
            break;
        case "BigZ":
            if(output.equals(letter) || output.equals("Smallz")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smalla",0);
            }
            break;
        case "Smalla":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallb",0);
            }
            break;
        case "Smallb":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallc",0);
            }
            break;
        case "Smallc":
            if(output.equals(letter) || output.equals("BigC")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smalld",0);
            }
            break;
        case "Smalld":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smalle",0);
            }
            break;
        case "Smalle":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallf",0);
            }
            break;
        case "Smallf":
            if(output.equals(letter) || output.equals("BigF")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallg",0);
            }
            break;
        case "Smallg":
            if(output.equals(letter) || output.equals("Smallq")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallh",0);
            }
            break;
        case "Smallh":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smalli",0);
            }

            break;
        case "Smalli":
            if(output.equals(letter) || output.equals("Smallj")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallj",0);
            }

            break;
        case "Smallj":
            if(output.equals(letter) || output.equals("Smalli")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallk",0);
            }

            break;
        case "Smallk":
            if(output.equals(letter) || output.equals("BigK")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smalll",0);
            }

            break;
        case "Smalll":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallm",0);
            }

            break;
        case "Smallm":
            if(output.equals(letter) || output.equals("Smalln")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smalln",0);
            }

            break;
        case "Smalln":
            if(output.equals(letter) || output.equals("Smalln")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallo",0);
            }
            break;
        case "Smallo":
            if(output.equals(letter) ||  output.equals("Smallc")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallp",0);
            }

            break;
        case "Smallp":
            if(output.equals(letter)||  output.equals("BigP")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallq",0);
            }

            break;
        case "Smallq":
            if(output.equals(letter) || output.equals("Smalla") || output.equals("Smallg")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallr",0);
            }

            break;
        case "Smallr":
            if(output.equals(letter)){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smalls",0);
            }

            break;
        case "Smalls":
            if(output.equals(letter) || output.equals("BigS")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallt",0);
            }

            break;
        case "Smallt":
            if(output.equals(letter) || output.equals("BigT")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallu",0);
            }


            break;
        case "Smallu":
            if(output.equals(letter) || output.equals("BigU")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallv",0);
            }

            break;
        case "Smallv":
            if(output.equals(letter) || output.equals("BigV")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallw",0);
            }

            break;
        case "Smallw":
            if(output.equals(letter) || output.equals("BigW")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallx",0);
            }

            break;
        case "Smallx":
            if(output.equals(letter) || output.equals("BigX")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smally",0);
            }

            break;
        case "Smally":
            if(output.equals(letter) || output.equals("BigY")||  output.equals("Smallj")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("Smallz",0);
            }

            break;
        case "Smallz":
            if(output.equals(letter) || output.equals("BigZ")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("circle",0);
            }

            break;
        case "circle":
            if(output.equals("BigO") || output.equals("Smallo")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("rectangle",0);
            }

            break;
        case "rectangle":
            if(output.equals(letter) || output.equals("square")|| output.equals("Smallo")|| output.equals("Smalla")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("square",0);
            }

            break;
        case "square":
            if(output.equals(letter) || output.equals("Smallo") || output.equals("BigB")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("triangle",0);
            }
            break;
        case "triangle":
            if(output.equals(letter)|| output.equals("BigA")){
                Log.d("Corre", "SEKAI");
               Checkdialog(1);
                finaler=1;
                int res = db.updateLetter("BigA",1);
            }
             break;
        default:

    }
}
    public void backer(View view){
//        final Intent board = new Intent(this, WritingBoard.class);
//        startActivity(board);


        finish();
        //abcd. loader();
    }
    public void eraseboard(View view){
        drawModel.clear();
        drawView.reset();
        drawView.invalidate();
        drawView.createnew();
          //  drawView.erasing();
    }
    Dialog checkdialog;
    public void Checkdialog(final int righto){


        checkdialog = new Dialog(this);
        checkdialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        checkdialog.setContentView(R.layout.checkanimation);
        checkdialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        int width=ViewGroup.LayoutParams.MATCH_PARENT;
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


         gifDrawable  = new GifDrawable(getResources(),gifdraw);
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

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    int rightos = righto;
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

        db.updateAchievement(letter,1);

       MyDialog = new Dialog(this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.customdialog);
        MyDialog.setTitle("You are COrrect");

        Button next = (Button)MyDialog.findViewById(R.id.next);
        Button close = (Button)MyDialog.findViewById(R.id.close);
        ImageView img= (ImageView) MyDialog.findViewById(R.id.imagepop);
        Button exit = (Button)MyDialog.findViewById(R.id.exitor);
        img.setImageResource(str);
        savaer();
        if(letter.equals("triangle")){
            next.setEnabled(false);
            close.setEnabled(true);
            next.setBackground(null);
        }
        else if(letter.equals("BigA")){
            next.setEnabled(true);
            close.setEnabled(false);
            close.setBackground(null);
        }
        else{
            next.setEnabled(true);
            close.setEnabled(true);
            close.setBackgroundResource(R.drawable.button_back);
            next.setBackgroundResource(R.drawable.button_next);
        }
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDialog.dismiss();
            }
        });
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
              // abcd.loader();
               // finish();
               // MyDialog.dismiss();
                backingna();
            }
        });
        MyDialog.setCancelable(false);
        MyDialog.show();

    }
    private void backingna(){
        final Bundle bund = new Bundle();
        final Intent inten= new Intent(this,WritingBoard.class);
        inten.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        switch(letter)
        {

            case "BigB":
                bund.putString("letter", "BigA");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigC":
                bund.putString("letter", "BigB");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigD":
                bund.putString("letter", "BigC");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigE":
                bund.putString("letter", "BigD");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigF":
                bund.putString("letter", "BigE");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigG":
                bund.putString("letter", "BigF");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigH":
                bund.putString("letter", "BigG");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigI":
                bund.putString("letter", "BigH");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigJ":
                bund.putString("letter", "BigI");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigK":
                bund.putString("letter", "BigJ");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigL":
                bund.putString("letter", "BigK");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigM":
                bund.putString("letter", "BigL");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigN":
                bund.putString("letter", "BigM");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigO":
                bund.putString("letter", "BigN");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigP":
                bund.putString("letter", "BigO");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigQ":
                bund.putString("letter", "BigP");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigR":
                bund.putString("letter", "BigQ");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigS":
                bund.putString("letter", "BigR");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigT":
                bund.putString("letter", "BigS");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigU":
                bund.putString("letter", "BigT");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigV":
                bund.putString("letter", "BigU");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigW":
                bund.putString("letter", "BigV");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigX":
                bund.putString("letter", "BigW");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigY":
                bund.putString("letter", "BigX");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigZ":
                bund.putString("letter", "BigY");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalla":
                bund.putString("letter", "BigZ");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallb":
                bund.putString("letter", "Smalla");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallc":
                bund.putString("letter", "Smallb");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalld":
                bund.putString("letter", "Smallc");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalle":
                bund.putString("letter", "Smalld");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallf":
                bund.putString("letter", "Smalle");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallg":
                bund.putString("letter", "Smallf");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallh":
                bund.putString("letter", "Smallg");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalli":
                bund.putString("letter", "Smallh");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallj":
                bund.putString("letter", "Smalli");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallk":
                bund.putString("letter", "Smallj");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalll":
                bund.putString("letter", "Smallk");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallm":
                bund.putString("letter", "Smalll");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalln":
                bund.putString("letter", "Smallm");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallo":
                bund.putString("letter", "Smalln");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallp":
                bund.putString("letter", "Smallo");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallq":
                bund.putString("letter", "Smallp");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallr":
                bund.putString("letter", "Smallq");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalls":
                bund.putString("letter", "Smallr");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallt":
                bund.putString("letter", "Smalls");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallu":
                bund.putString("letter", "Smallt");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallv":
                bund.putString("letter", "Smallu");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallw":
                bund.putString("letter", "Smallv");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallx":
                bund.putString("letter", "Smallw");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smally":
                bund.putString("letter", "Smallx");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallz":
                bund.putString("letter", "Smally");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "circle":
                bund.putString("letter", "Smallz");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "rectangle":
                bund.putString("letter", "circle");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "square":
                bund.putString("letter", "rectangle");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "triangle":
                bund.putString("letter", "square");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            default:
                throw new RuntimeException("error fetching");
        }
    }
    private void nexter(){
        final Bundle bund = new Bundle();
        final Intent inten= new Intent(this,WritingBoard.class);
        inten.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        switch(letter)
        {
            case "BigA":
                bund.putString("letter", "BigB");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigB":
                bund.putString("letter", "BigC");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigC":
                bund.putString("letter", "BigD");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigD":
                bund.putString("letter", "BigE");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigE":
                bund.putString("letter", "BigF");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigF":
                bund.putString("letter", "BigG");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigG":
                bund.putString("letter", "BigH");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigH":
                bund.putString("letter", "BigI");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigI":
                bund.putString("letter", "BigJ");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigJ":
                bund.putString("letter", "BigK");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigK":
                bund.putString("letter", "BigL");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigL":
                bund.putString("letter", "BigM");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigM":
                bund.putString("letter", "BigN");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigN":
                bund.putString("letter", "BigO");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigO":
                bund.putString("letter", "BigP");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigP":
                bund.putString("letter", "BigQ");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigQ":
                bund.putString("letter", "BigR");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigR":
                bund.putString("letter", "BigS");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigS":
                bund.putString("letter", "BigT");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigT":
                bund.putString("letter", "BigU");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigU":
                bund.putString("letter", "BigV");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigV":
                bund.putString("letter", "BigW");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigW":
                bund.putString("letter", "BigX");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigX":
                bund.putString("letter", "BigY");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigY":
                bund.putString("letter", "BigZ");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "BigZ":
                bund.putString("letter", "Smalla");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalla":
                bund.putString("letter", "Smallb");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallb":
                bund.putString("letter", "Smallc");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallc":
                bund.putString("letter", "Smalld");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalld":
                bund.putString("letter", "Smalle");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalle":
                bund.putString("letter", "Smallf");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallf":
                bund.putString("letter", "Smallg");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallg":
                bund.putString("letter", "Smallh");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallh":
                bund.putString("letter", "Smalli");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalli":
                bund.putString("letter", "Smallj");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallj":
                bund.putString("letter", "Smallk");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallk":
                bund.putString("letter", "Smalll");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalll":
                bund.putString("letter", "Smallm");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallm":
                bund.putString("letter", "Smalln");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalln":
                bund.putString("letter", "Smallo");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallo":
                bund.putString("letter", "Smallp");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallp":
                bund.putString("letter", "Smallq");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallq":
                bund.putString("letter", "Smallr");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallr":
                bund.putString("letter", "Smalls");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smalls":
                bund.putString("letter", "Smallt");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallt":
                bund.putString("letter", "Smallu");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallu":
                bund.putString("letter", "Smallv");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallv":
                bund.putString("letter", "Smallw");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallw":
                bund.putString("letter", "Smallx");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallx":
                bund.putString("letter", "Smally");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smally":
                bund.putString("letter", "Smallz");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "Smallz":
                bund.putString("letter", "circle");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "circle":
                bund.putString("letter", "rectangle");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "rectangle":
                bund.putString("letter", "square");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "square":
                bund.putString("letter", "triangle");
                inten.putExtras(bund);
                startActivity(inten);
                finish();
                break;
            case "triangle":

                break;
            default:
                throw new RuntimeException("error fetching");
        }
    }
}
