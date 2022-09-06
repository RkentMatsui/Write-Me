package com.example.rowielokentmatsui.writeme;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;

public class Achievements extends AppCompatActivity {
    DataManager db = new DataManager(this);
    ArrayList<Letter> letter=new ArrayList<Letter>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
        final TabHost host = (TabHost)findViewById(R.id.tabHostachievement);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("big");
        spec.setContent(R.id.tab1achievement);
        spec.setIndicator("",getResources().getDrawable(R.drawable.letters_big));
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("small");
        spec.setContent(R.id.tab2achievement);
        spec.setIndicator("",getResources().getDrawable(R.drawable.letters_small));
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("shape");
        spec.setContent(R.id.tab3achievement);
        spec.setIndicator("",getResources().getDrawable(R.drawable.shapes));
        host.addTab(spec);

        final Button btn1b = (Button) findViewById(R.id.BigAach);
        final Button btn2b= (Button) findViewById(R.id.BigBach);
        final Button btn3b = (Button) findViewById(R.id.BigCach);
        final Button btn4b = (Button) findViewById(R.id.BigDach);
        final Button btn5b = (Button) findViewById(R.id.BigEach);
        final Button btn6b = (Button) findViewById(R.id.BigFach);
        final Button btn7b = (Button) findViewById(R.id.BigGach);
        final Button btn8b= (Button) findViewById(R.id.BigHach);
        final Button btn9b= (Button) findViewById(R.id.BigIach);
        final Button btn10b = (Button) findViewById(R.id.BigJach);
        final Button btn11b = (Button) findViewById(R.id.BigKach);
        final Button btn12b = (Button) findViewById(R.id.BigLach);
        final Button btn13b = (Button) findViewById(R.id.BigMach);
        final Button btn14b = (Button) findViewById(R.id.BigNach);
        final Button btn15b = (Button) findViewById(R.id.BigOach);
        final Button btn16b = (Button) findViewById(R.id.BigPach);
        final Button btn17b = (Button) findViewById(R.id.BigQach);
        final Button btn18b = (Button) findViewById(R.id.BigRach);
        final Button btn19b = (Button) findViewById(R.id.BigSach);
        final Button btn20b = (Button) findViewById(R.id.BigTach);
        final Button btn21b = (Button) findViewById(R.id.BigUach);
        final Button btn22b = (Button) findViewById(R.id.BigVach);
        final Button btn23b = (Button) findViewById(R.id.BigWach);
        final Button btn24b = (Button) findViewById(R.id.BigXach);
        final Button btn25b = (Button) findViewById(R.id.BigYach);
        final Button btn26b = (Button) findViewById(R.id.BigZach);

        final Button btn1 = (Button) findViewById(R.id.Smallaach);
        final Button btn2= (Button) findViewById(R.id.Smallbach);
        final Button btn3 = (Button) findViewById(R.id.Smallcach);
        final Button btn4 = (Button) findViewById(R.id.Smalldach);
        final Button btn5 = (Button) findViewById(R.id.Smalleach);
        final Button btn6 = (Button) findViewById(R.id.Smallfach);
        final Button btn7 = (Button) findViewById(R.id.Smallgach);
        final Button btn8 = (Button) findViewById(R.id.Smallhach);
        final Button btn9 = (Button) findViewById(R.id.Smalliach);
        final Button btn10 = (Button) findViewById(R.id.Smalljach);
        final Button btn11 = (Button) findViewById(R.id.Smallkach);
        final Button btn12 = (Button) findViewById(R.id.Smalllach);
        final Button btn13 = (Button) findViewById(R.id.Smalloach);
        final Button btn14 = (Button) findViewById(R.id.Smallpach);
        final Button btn15 = (Button) findViewById(R.id.Smallqach);
        final Button btn16 = (Button) findViewById(R.id.Smallrach);
        final Button btn17 = (Button) findViewById(R.id.Smallsach);
        final Button btn18 = (Button) findViewById(R.id.Smalltach);
        final Button btn19 = (Button) findViewById(R.id.Smallmach);
        final Button btn20 = (Button) findViewById(R.id.Smallnach);
        final Button btn21 = (Button) findViewById(R.id.Smalluach);
        final Button btn22 = (Button) findViewById(R.id.Smallvach);
        final Button btn23 = (Button) findViewById(R.id.Smallwach);
        final Button btn24 = (Button) findViewById(R.id.Smallxach);
        final Button btn25 = (Button) findViewById(R.id.Smallyach);
        final Button btn26 = (Button) findViewById(R.id.Smallzach);

    //    host.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

//            public void onTabChanged(String tabId) {
//
//
//
//                Log.d("tabhost", "onTabChanged: tab number=" + host.getCurrentTab());

//                switch (host.getCurrentTab()) {
//                    case 0:
//                        btn1.setBackgroundResource(0);
//                        btn2.setBackgroundResource(0);
//                        btn3.setBackgroundResource(0);
//                        btn4.setBackgroundResource(0);
//                        btn5.setBackgroundResource(0);
//                        btn6.setBackgroundResource(0);
//                        btn7.setBackgroundResource(0);
//                        btn8.setBackgroundResource(0);
//                        btn9.setBackgroundResource(0);
//                        btn10.setBackgroundResource(0);
//                        btn11.setBackgroundResource(0);
//                        btn12.setBackgroundResource(0);
//                        btn13.setBackgroundResource(0);
//                        btn14.setBackgroundResource(0);
//                        btn15.setBackgroundResource(0);
//                        btn16.setBackgroundResource(0);
//                        btn17.setBackgroundResource(0);
//                        btn18.setBackgroundResource(0);
//                        btn19.setBackgroundResource(0);
//                        btn20.setBackgroundResource(0);
//                        btn21.setBackgroundResource(0);
//                        btn22.setBackgroundResource(0);
//                        btn23.setBackgroundResource(0);
//                        btn24.setBackgroundResource(0);
//                        btn25.setBackgroundResource(0);
//                        btn26.setBackgroundResource(0);
//                        btn1b.setBackgroundResource(R.drawable.badgea);
//                        btn2b.setBackgroundResource(R.drawable.badgeb);
//                        btn3b.setBackgroundResource(R.drawable.badgec);
//                        btn4b.setBackgroundResource(R.drawable.badged);
//                        btn5b.setBackgroundResource(R.drawable.badgee);
//                        btn6b.setBackgroundResource(R.drawable.badgef);
//                        btn7b.setBackgroundResource(R.drawable.badgeg);
//                        btn8b.setBackgroundResource(R.drawable.badgeh);
//                        btn9b.setBackgroundResource(R.drawable.badgei);
//                        btn10b.setBackgroundResource(R.drawable.badgej);
//                        btn11b.setBackgroundResource(R.drawable.badgek);
//                        btn12b.setBackgroundResource(R.drawable.badgel);
//                        btn13b.setBackgroundResource(R.drawable.badgem);
//                        btn14b.setBackgroundResource(R.drawable.badgen);
//                        btn15b.setBackgroundResource(R.drawable.badgeo);
//                        btn16b.setBackgroundResource(R.drawable.badgep);
//                        btn17b.setBackgroundResource(R.drawable.badgeq);
//                        btn18b.setBackgroundResource(R.drawable.badger);
//                        btn19b.setBackgroundResource(R.drawable.badges);
//                        btn20b.setBackgroundResource(R.drawable.badget);
//                        btn21b.setBackgroundResource(R.drawable.badgeu);
//                        btn22b.setBackgroundResource(R.drawable.badgev);
//                        btn23b.setBackgroundResource(R.drawable.badgew);
//                        btn24b.setBackgroundResource(R.drawable.badgex);
//                        btn25b.setBackgroundResource(R.drawable.badgey);
//                        btn26b.setBackgroundResource(R.drawable.badgez);

                        btn1b.setBackground(bitmapsmall(R.drawable.badgea));
//                        btn2b.setBackground(bitmapsmall(R.drawable.badgeb));
//                        btn3b.setBackground(bitmapsmall(R.drawable.badgec));
//                        btn4b.setBackground(bitmapsmall(R.drawable.badged));
//                        btn5b.setBackground(bitmapsmall(R.drawable.badgee));
//                        btn6b.setBackground(bitmapsmall(R.drawable.badgef));
//                        btn7b.setBackground(bitmapsmall(R.drawable.badgeg));
//                        btn8b.setBackground(bitmapsmall(R.drawable.badgeh));
//                        btn9b.setBackground(bitmapsmall(R.drawable.badgei));
//                        btn10b.setBackground(bitmapsmall(R.drawable.badgej));
//                        btn11b.setBackground(bitmapsmall(R.drawable.badgek));
//                        btn12b.setBackground(bitmapsmall(R.drawable.badgel));
//                        btn13b.setBackground(bitmapsmall(R.drawable.badgem));
//                        btn14b.setBackground(bitmapsmall(R.drawable.badgen));
//                        btn15b.setBackground(bitmapsmall(R.drawable.badgeo));
//                        btn16b.setBackground(bitmapsmall(R.drawable.badgep));
//                       btn17b.setBackground(bitmapsmall(R.drawable.badgeq));
//                        btn18b.setBackground(bitmapsmall(R.drawable.badger));
//                        btn19b.setBackground(bitmapsmall(R.drawable.badges));
//                        btn20b.setBackground(bitmapsmall(R.drawable.badget));
//                        btn21b.setBackground(bitmapsmall(R.drawable.badgeu));
//                        btn22b.setBackground(bitmapsmall(R.drawable.badgev));
//                        btn23b.setBackground(bitmapsmall(R.drawable.badgew));
//                        btn24b.setBackground(bitmapsmall(R.drawable.badgex));
//                        btn25b.setBackground(bitmapsmall(R.drawable.badgey));
//                        btn26b.setBackground(bitmapsmall(R.drawable.badgez));

//                        loader();
//                        break;
//                    case 1:
//                        //do what you want when tab 1 is selected
//
//                        btn1b.setBackgroundResource(0);
//                        btn2b.setBackgroundResource(0);
//                        btn3b.setBackgroundResource(0);
//                        btn4b.setBackgroundResource(0);
//                        btn5b.setBackgroundResource(0);
//                        btn6b.setBackgroundResource(0);
//                        btn7b.setBackgroundResource(0);
//                        btn8b.setBackgroundResource(0);
//                        btn9b.setBackgroundResource(0);
//                        btn10b.setBackgroundResource(0);
//                        btn11b.setBackgroundResource(0);
//                        btn12b.setBackgroundResource(0);
//                        btn13b.setBackgroundResource(0);
//                        btn14b.setBackgroundResource(0);
//                        btn15b.setBackgroundResource(0);
//                        btn16b.setBackgroundResource(0);
//                        btn17b.setBackgroundResource(0);
//                        btn18b.setBackgroundResource(0);
//                        btn19b.setBackgroundResource(0);
//                        btn20b.setBackgroundResource(0);
//                        btn21b.setBackgroundResource(0);
//                        btn22b.setBackgroundResource(0);
//                        btn23b.setBackgroundResource(0);
//                        btn24b.setBackgroundResource(0);
//                        btn25b.setBackgroundResource(0);
//                        btn26b.setBackgroundResource(0);
                        btn1.setBackgroundResource(R.drawable.sbadge_a);
                        btn2.setBackgroundResource(R.drawable.sbadge_b);
                        btn3.setBackgroundResource(R.drawable.sbadge_c);
                        btn4.setBackgroundResource(R.drawable.sbadge_d);
                        btn5.setBackgroundResource(R.drawable.sbadge_e);
                        btn6.setBackgroundResource(R.drawable.sbadge_f);
                        btn7.setBackgroundResource(R.drawable.sbadge_g);
                        btn8.setBackgroundResource(R.drawable.sbadge_h);
                        btn9.setBackgroundResource(R.drawable.sbadge_i);
                        btn10.setBackgroundResource(R.drawable.sbadge_j);
                        btn11.setBackgroundResource(R.drawable.sbadge_k);
                        btn12.setBackgroundResource(R.drawable.sbadge_l);
                        btn13.setBackgroundResource(R.drawable.sbadge_m);
                        btn14.setBackgroundResource(R.drawable.sbadge_n);
                        btn15.setBackgroundResource(R.drawable.sbadge_o);
                        btn16.setBackgroundResource(R.drawable.sbadge_p);
                        btn17.setBackgroundResource(R.drawable.sbadge_q);
                        btn18.setBackgroundResource(R.drawable.sbadge_r);
                        btn19.setBackgroundResource(R.drawable.sbadge_s);
                        btn20.setBackgroundResource(R.drawable.sbadge_t);
                        btn21.setBackgroundResource(R.drawable.sbadge_u);
                        btn22.setBackgroundResource(R.drawable.sbadge_v);
                        btn23.setBackgroundResource(R.drawable.sbadge_w);
                        btn24.setBackgroundResource(R.drawable.sbadge_x);
                        btn25.setBackgroundResource(R.drawable.sbadge_y);
                        btn26.setBackgroundResource(R.drawable.sbadge_z);

//                        btn1.setBackground(bitmapsmall(R.drawable.sbadge_a));
//                        btn2.setBackground(bitmapsmall(R.drawable.sbadge_b));
//                        btn3.setBackground(bitmapsmall(R.drawable.sbadge_c));
//                        btn4.setBackground(bitmapsmall(R.drawable.sbadge_d));
//                        btn5.setBackground(bitmapsmall(R.drawable.sbadge_e));
//                        btn6.setBackground(bitmapsmall(R.drawable.sbadge_f));
//                        btn7.setBackground(bitmapsmall(R.drawable.sbadge_g));
//                        btn8.setBackground(bitmapsmall(R.drawable.sbadge_h));
//                        btn9.setBackground(bitmapsmall(R.drawable.sbadge_i));
//                        btn10.setBackground(bitmapsmall(R.drawable.sbadge_j));
//                        btn11.setBackground(bitmapsmall(R.drawable.sbadge_k));
//                        btn12.setBackground(bitmapsmall(R.drawable.sbadge_l));
//                        btn13.setBackground(bitmapsmall(R.drawable.sbadge_m));
//                        btn14.setBackground(bitmapsmall(R.drawable.sbadge_n));
//                        btn15.setBackground(bitmapsmall(R.drawable.sbadge_o));
//                        btn16.setBackground(bitmapsmall(R.drawable.sbadge_p));
//                        btn17.setBackground(bitmapsmall(R.drawable.sbadge_q));
//                        btn18.setBackground(bitmapsmall(R.drawable.sbadge_r));
//                        btn19.setBackground(bitmapsmall(R.drawable.sbadge_s));
//                        btn20.setBackground(bitmapsmall(R.drawable.sbadge_t));
//                        btn21.setBackground(bitmapsmall(R.drawable.sbadge_u));
//                        btn22.setBackground(bitmapsmall(R.drawable.sbadge_v));
//                        btn23.setBackground(bitmapsmall(R.drawable.sbadge_w));
//                        btn24.setBackground(bitmapsmall(R.drawable.sbadge_x));
//                        btn25.setBackground(bitmapsmall(R.drawable.sbadge_y));
//                        btn26.setBackground(bitmapsmall(R.drawable.sbadge_z));
//

//                        loader();
//                        break;
//                    case 2:
//                        //do what you want when tab 2 is selected
//                        break;
//
//                    default:
//
//                        break;
//                }
//            }
//        });
        loader();

    }

    private BitmapDrawable bitmapsmall(int draw) {

        Drawable dr = getResources().getDrawable(draw);
        Bitmap bitmap = ((BitmapDrawable) dr).getBitmap();
        bitmap = getResizedBitmap( bitmap,100,100);
        BitmapDrawable ob = new BitmapDrawable(getResources(), bitmap);

        return ob;
    }
    private static Bitmap getResizedBitmap(Bitmap bitmap, float maxWidth, float maxHeight) {

        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width > maxWidth) {
            height = (maxWidth / width) * height;
            width = maxWidth;
        }
        if (height > maxHeight) {
            width = (maxHeight / height) * width;
            height = maxHeight;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) width, (int) height, true);

    }
    private void loader (){

        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        letter = db.getAchievements();


        Button img[] = new Button[56];
         // Toast.makeText(this, letter.get(1).getAchievementName()+"ach", Toast.LENGTH_SHORT).show();
        for (int i = 0 ; i <= 55; i++){
            int resID = getResources().getIdentifier(letter.get(i).getAchievementName()+"ach", "id", getPackageName());
            int resdrawableavg = getResources().getIdentifier("a_"+letter.get(i).getAchievementName().toLowerCase(), "drawable", getPackageName());
            int resdrawableeasy = getResources().getIdentifier("e_"+letter.get(i).getAchievementName().toLowerCase(), "drawable", getPackageName());


            img[i] = (Button) findViewById(resID);
            if(img[i].getBackground()!=null) {
                if (letter.get(i).getAchievementStat() == 0) {


                    // Toast.makeText(this, img[i].toString(), Toast.LENGTH_SHORT).show();
                    img[i].getBackground().setColorFilter(filter);
                    img[i].setEnabled(false);
                } else {
                    img[i].setEnabled(true);
                    img[i].getBackground().clearColorFilter();
                    if(letter.get(i).getAchievementStat() == 1){
                        img[i].setBackgroundResource(resdrawableeasy);
                    }
                    else if(letter.get(i).getAchievementStat() == 2){
                        img[i].setBackgroundResource(resdrawableavg);
                    }
                }
            }
        }
    }
    public void backing(View v){
        finish();
    }
}
