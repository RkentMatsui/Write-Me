package com.example.rowielokentmatsui.writeme;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.rowielokentmatsui.writeme.models.Classification;
import com.example.rowielokentmatsui.writeme.models.Classifier;
import com.example.rowielokentmatsui.writeme.models.TensorFlowClassifier;
import com.example.rowielokentmatsui.writeme.views.DrawModel;
import com.example.rowielokentmatsui.writeme.views.DrawView;

import java.util.ArrayList;
import java.util.List;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;


public class Practice_write extends AppCompatActivity implements View.OnTouchListener{
    DataManager db = new DataManager(this);
    private static final int PIXEL_WIDTH =30;

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
    MediaPlayer m = new MediaPlayer();

    Bitmap b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_write);

        getBundle = this.getIntent().getExtras();
        letter = getBundle.getString("letter");
        ImageView gifimage =(ImageView)findViewById(R.id.gifpractice);

        ImageButton back = (ImageButton)findViewById(R.id.imageButton);
        ImageButton next = (ImageButton)findViewById(R.id.imageButton2);
        try {
            switch(letter)
            {
                case "BigA":
                    back.setEnabled(false);
                    back.setBackground(null);
                    back.setImageDrawable(null);
                    str = R.drawable.badgea;
                    letteraudio="audio/big_a.MP3";
                    clickaudio="audio/sound_a.mp3";
                    gifimage.setImageResource(R.drawable.btutoriala);
                    break;
                case "BigB":
                    str = R.drawable.badgeb;
                    letteraudio="audio/big_b.MP3";
                    clickaudio="audio/sound_b.mp3";
                    gifimage.setImageResource(R.drawable.btutorialb);
                    break;
                case "BigC":
                    str = R.drawable.badgec;
                    letteraudio="audio/big_c.MP3";
                    clickaudio="audio/sound_c.mp3";
                    gifimage.setImageResource(R.drawable.btutorialc);
                    break;
                case "BigD":
                    str = R.drawable.badged;
                    letteraudio="audio/big_d.MP3";
                    clickaudio="audio/sound_d.mp3";
                    gifimage.setImageResource(R.drawable.btutoriald);
                    break;
                case "BigE":
                    str = R.drawable.badgee;
                    letteraudio="audio/big_e.MP3";
                    clickaudio="audio/sound_e.mp3";
                    gifimage.setImageResource(R.drawable.btutoriale);
                    break;
                case "BigF":
                    str = R.drawable.badgef;
                    letteraudio="audio/big_f.MP3";
                    clickaudio="audio/sound_f.mp3";
                    gifimage.setImageResource(R.drawable.btutorialf);
                    break;
                case "BigG":
                    str = R.drawable.badgeg;
                    letteraudio="audio/big_g.MP3";
                    clickaudio="audio/sound_g.mp3";
                    gifimage.setImageResource(R.drawable.btutorialg);
                    break;
                case "BigH":
                    str = R.drawable.badgeh;
                    letteraudio="audio/big_h.MP3";
                    clickaudio="audio/sound_h.mp3";
                    gifimage.setImageResource(R.drawable.btutorialh);
                    break;
                case "BigI":
                    str = R.drawable.badgei;
                    letteraudio="audio/big_i.MP3";
                    clickaudio="audio/sound_i.mp3";
                    gifimage.setImageResource(R.drawable.btutoriali);
                    break;
                case "BigJ":
                    str = R.drawable.badgej;
                    letteraudio="audio/big_j.MP3";
                    clickaudio="audio/sound_j.mp3";
                    gifimage.setImageResource(R.drawable.btutorialj);
                    break;
                case "BigK":
                    str = R.drawable.badgek;
                    letteraudio="audio/big_k.MP3";
                    clickaudio="audio/sound_k.mp3";
                    gifimage.setImageResource(R.drawable.btutorialk);
                    break;
                case "BigL":
                    str = R.drawable.badgel;
                    letteraudio="audio/big_l.MP3";
                    clickaudio="audio/sound_l.mp3";
                    gifimage.setImageResource(R.drawable.btutoriall);
                    break;
                case "BigM":
                    str = R.drawable.badgem;
                    letteraudio="audio/big_m.MP3";
                    clickaudio="audio/sound_m.mp3";
                    gifimage.setImageResource(R.drawable.btutorialm);
                    break;
                case "BigN":
                    str = R.drawable.badgen;
                    letteraudio="audio/big_n.MP3";
                    clickaudio="audio/sound_n.mp3";
                    gifimage.setImageResource(R.drawable.btutorialn);
                    break;
                case "BigO":
                    str = R.drawable.badgeo;
                    letteraudio="audio/big_o.MP3";
                    clickaudio="audio/sound_o.mp3";
                    gifimage.setImageResource(R.drawable.btutorialo);
                    break;
                case "BigP":
                    str = R.drawable.badgep;
                    letteraudio="audio/big_p.MP3";
                    clickaudio="audio/sound_p.mp3";
                    gifimage.setImageResource(R.drawable.btutorialp);
                    break;
                case "BigQ":
                    str = R.drawable.badgeq;
                    letteraudio="audio/big_q.MP3";
                    clickaudio="audio/sound_q.mp3";
                    gifimage.setImageResource(R.drawable.btutorialq);
                    break;
                case "BigR":
                    str = R.drawable.badger;
                    letteraudio="audio/big_r.MP3";
                    clickaudio="audio/sound_r.mp3";
                    gifimage.setImageResource(R.drawable.btutorialr);
                    break;
                case "BigS":
                    str = R.drawable.badges;
                    letteraudio="audio/big_s.MP3";
                    clickaudio="audio/sound_s.mp3";
                    gifimage.setImageResource(R.drawable.btutorials);
                    break;
                case "BigT":
                    str = R.drawable.badget;
                    letteraudio="audio/big_t.MP3";
                    clickaudio="audio/sound_t.mp3";
                    gifimage.setImageResource(R.drawable.btutorialt);
                    break;
                case "BigU":
                    str = R.drawable.badgeu;
                    letteraudio="audio/big_u.MP3";
                    clickaudio="audio/sound_u.mp3";
                    gifimage.setImageResource(R.drawable.btutorialu);
                    break;
                case "BigV":
                    str = R.drawable.badgev;
                    letteraudio="audio/big_v.MP3";
                    clickaudio="audio/sound_v.mp3";
                    gifimage.setImageResource(R.drawable.btutorialv);
                    break;
                case "BigW":
                    str = R.drawable.badgew;
                    letteraudio="audio/big_w.MP3";
                    clickaudio="audio/sound_w.mp3";
                    gifimage.setImageResource(R.drawable.btutorialw);
                    break;
                case "BigX":
                    str = R.drawable.badgex;
                    letteraudio="audio/big_x.MP3";
                    clickaudio="audio/sound_x.mp3";
                    gifimage.setImageResource(R.drawable.btutorialx);
                    break;
                case "BigY":
                    str = R.drawable.badgey;
                    letteraudio="audio/big_y.MP3";
                    clickaudio="audio/sound_y.mp3";
                    gifimage.setImageResource(R.drawable.btutorialy);
                    break;
                case "BigZ":
                    str = R.drawable.badgez;
                    letteraudio="audio/big_z.MP3";
                    clickaudio="audio/sound_z.mp3";
                    gifimage.setImageResource(R.drawable.btutorialz);
                    break;
                case "Smalla":
                    str = R.drawable.sbadge_a;
                    letteraudio="audio/small_a.MP3";
                    clickaudio="audio/sound_a.mp3";
                    gifimage.setImageResource(R.drawable.stutoriala);
                    break;
                case "Smallb":
                    str = R.drawable.sbadge_b;
                    letteraudio="audio/small_b.MP3";
                    clickaudio="audio/sound_b.mp3";
                    gifimage.setImageResource(R.drawable.stutorialb);
                    break;
                case "Smallc":
                    str = R.drawable.sbadge_c;
                    letteraudio="audio/small_c.MP3";
                    clickaudio="audio/sound_c.mp3";
                    gifimage.setImageResource(R.drawable.stutorialc);
                    break;
                case "Smalld":
                    str = R.drawable.sbadge_d;
                    letteraudio="audio/small_d.MP3";
                    clickaudio="audio/sound_d.mp3";
                    gifimage.setImageResource(R.drawable.stutoriald);
                    break;
                case "Smalle":
                    str = R.drawable.sbadge_e;
                    letteraudio="audio/small_e.MP3";
                    clickaudio="audio/sound_e.mp3";
                    gifimage.setImageResource(R.drawable.stutoriale);
                    break;
                case "Smallf":
                    str = R.drawable.sbadge_f;
                    letteraudio="audio/small_f.MP3";
                    clickaudio="audio/sound_f.mp3";
                    gifimage.setImageResource(R.drawable.stutorialf);
                    break;
                case "Smallg":
                    str = R.drawable.sbadge_g;
                    letteraudio="audio/small_g.MP3";
                    clickaudio="audio/sound_g.mp3";
                    gifimage.setImageResource(R.drawable.stutorialg);
                    break;
                case "Smallh":
                    str = R.drawable.sbadge_h;
                    letteraudio="audio/small_h.MP3";
                    clickaudio="audio/sound_h.mp3";
                    gifimage.setImageResource(R.drawable.stutorialh);
                    break;
                case "Smalli":
                    str = R.drawable.sbadge_i;
                    letteraudio="audio/small_i.MP3";
                    clickaudio="audio/sound_i.mp3";
                    gifimage.setImageResource(R.drawable.stutoriali);
                    break;
                case "Smallj":
                    str = R.drawable.sbadge_j;
                    letteraudio="audio/small_j.MP3";
                    clickaudio="audio/sound_j.mp3";
                    gifimage.setImageResource(R.drawable.stutorialj);
                    break;
                case "Smallk":
                    str = R.drawable.sbadge_k;
                    letteraudio="audio/small_k.MP3";
                    clickaudio="audio/sound_k.mp3";
                    gifimage.setImageResource(R.drawable.stutorialk);
                    break;
                case "Smalll":
                    str = R.drawable.sbadge_l;
                    letteraudio="audio/small_l.MP3";
                    clickaudio="audio/sound_l.mp3";
                    gifimage.setImageResource(R.drawable.stutoriall);
                    break;
                case "Smallm":
                    str = R.drawable.sbadge_m;
                    letteraudio="audio/small_m.MP3";
                    clickaudio="audio/sound_m.mp3";
                    gifimage.setImageResource(R.drawable.stutorialm);
                    break;
                case "Smalln":
                    str = R.drawable.sbadge_n;
                    letteraudio="audio/small_n.MP3";
                    clickaudio="audio/sound_n.mp3";
                    gifimage.setImageResource(R.drawable.stutorialn);
                    break;
                case "Smallo":
                    str = R.drawable.sbadge_o;
                    letteraudio="audio/small_o.MP3";
                    clickaudio="audio/sound_o.mp3";
                    gifimage.setImageResource(R.drawable.stutorialo);
                    break;
                case "Smallp":
                    str = R.drawable.sbadge_p;
                    letteraudio="audio/small_p.MP3";
                    clickaudio="audio/sound_p.mp3";
                    gifimage.setImageResource(R.drawable.stutorialp);
                    break;
                case "Smallq":
                    str = R.drawable.sbadge_q;
                    letteraudio="audio/small_q.MP3";
                    clickaudio="audio/sound_q.mp3";
                    gifimage.setImageResource(R.drawable.stutorialq);
                    break;
                case "Smallr":
                    str = R.drawable.sbadge_r;
                    letteraudio="audio/small_r.MP3";
                    clickaudio="audio/sound_r.mp3";
                    gifimage.setImageResource(R.drawable.stutorialr);
                    break;
                case "Smalls":
                    str = R.drawable.sbadge_s;
                    letteraudio="audio/small_s.MP3";
                    clickaudio="audio/sound_s.mp3";
                    gifimage.setImageResource(R.drawable.stutorials);
                    break;
                case "Smallt":
                    str = R.drawable.sbadge_t;
                    letteraudio="audio/small_t.MP3";
                    clickaudio="audio/sound_t.mp3";
                    gifimage.setImageResource(R.drawable.stutorialt);
                    break;
                case "Smallu":
                    str = R.drawable.sbadge_u;
                    letteraudio="audio/small_u.MP3";
                    clickaudio="audio/sound_u.mp3";
                    gifimage.setImageResource(R.drawable.stutorialu);
                    break;
                case "Smallv":
                    str = R.drawable.sbadge_v;
                    letteraudio="audio/small_v.MP3";
                    clickaudio="audio/sound_v.mp3";
                    gifimage.setImageResource(R.drawable.stutorialv);
                    break;
                case "Smallw":
                    str = R.drawable.sbadge_w;
                    letteraudio="audio/small_w.MP3";
                    clickaudio="audio/sound_w.mp3";
                    gifimage.setImageResource(R.drawable.stutorialw);
                    break;
                case "Smallx":
                    str = R.drawable.sbadge_x;
                    letteraudio="audio/small_x.MP3";
                    clickaudio="audio/sound_x.mp3";
                    gifimage.setImageResource(R.drawable.stutorialx);
                    break;
                case "Smally":
                    str = R.drawable.sbadge_y;
                    letteraudio="audio/small_y.MP3";
                    clickaudio="audio/sound_y.mp3";
                    gifimage.setImageResource(R.drawable.stutorialy);
                    break;
                case "Smallz":
                    str = R.drawable.sbadge_z;
                    letteraudio="audio/small_z.MP3";
                    clickaudio="audio/sound_z.mp3";
                    gifimage.setImageResource(R.drawable.stutorialz);
                    break;
                case "circle":
                    str = R.drawable.badge_circle;
                    letteraudio="audio/circle.MP3";
                    gifimage.setImageResource(R.drawable.tutorialcircle);
                    break;
                case "rectangle":
                    str = R.drawable.bdge_rect;
                    letteraudio="audio/rectangle.mp3";
                    gifimage.setImageResource(R.drawable.tutorialrectangle);
                    break;
                case "square":
                    str = R.drawable.badge_square;
                    letteraudio="audio/square.MP3";
                    gifimage.setImageResource(R.drawable.tutorialsquare);
                    break;
                case "triangle":
                    next.setEnabled(false);
                    next.setBackground(null);
                    next.setImageDrawable(null);
                    str = R.drawable.badge_triangle;
                    letteraudio="audio/triangle.MP3";
                    gifimage.setImageResource(R.drawable.tutorialtriangle);
                    break;
                default:
                    Toast.makeText(this, "not seen", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //get drawing view from XML (where the finger writes the number)
        drawView = (DrawView) findViewById(R.id.drawwing);
        drawView.erasing(1);
        //get the model object
       drawModel = new DrawModel(300, 300);

        //init the view with the model object
        drawView.setModel(drawModel);
        // give it a touch listener to activate when the user taps
        drawView.setOnTouchListener(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


      //  Button erasebtn = (Button) findViewById(R.id.erase1);
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

    protected void onResume() {
        super.onResume();
       drawView.onResume();
    }

    @Override

    protected void onPause() {
        drawView.onPause();
        super.onPause();
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {

        int action = event.getAction() & MotionEvent.ACTION_MASK;


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
    }
    public void backingna(View view){
        final Bundle bund = new Bundle();
        final Intent inten= new Intent(this,Practice_write.class);
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
    public void nexter(View v){
        final Bundle bund = new Bundle();
        final Intent inten= new Intent(this,Practice_write.class);
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

