package com.example.rowielokentmatsui.writeme;

import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

import java.util.ArrayList;

public class AverageABC extends AppCompatActivity {
    DataManager db = new DataManager(this);
    ArrayList<Letter> letter=new ArrayList<Letter>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average_abc);

        final TabHost host = (TabHost)findViewById(R.id.tabHost1);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("big");
        spec.setContent(R.id.tabAV);
        spec.setIndicator("",getResources().getDrawable(R.drawable.letters_big));
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("small");
        spec.setContent(R.id.tab2AV);
        spec.setIndicator("",getResources().getDrawable(R.drawable.letters_small));
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("shape");
        spec.setContent(R.id.tab3AV);
        spec.setIndicator("",getResources().getDrawable(R.drawable.shapes));
        host.addTab(spec);


        final Button btn1b = (Button) findViewById(R.id.BigA1);
        final Button btn2b= (Button) findViewById(R.id.BigB1);
        final Button btn3b = (Button) findViewById(R.id.BigC1);
        final Button btn4b = (Button) findViewById(R.id.BigD1);
        final Button btn5b = (Button) findViewById(R.id.BigE1);
        final Button btn6b = (Button) findViewById(R.id.BigF1);
        final Button btn7b = (Button) findViewById(R.id.BigG1);
        final Button btn8b= (Button) findViewById(R.id.BigH1);
        final Button btn9b= (Button) findViewById(R.id.BigI1);
        final Button btn10b = (Button) findViewById(R.id.BigJ1);
        final Button btn11b = (Button) findViewById(R.id.BigK1);
        final Button btn12b = (Button) findViewById(R.id.BigL1);
        final Button btn13b = (Button) findViewById(R.id.BigM1);
        final Button btn14b = (Button) findViewById(R.id.BigN1);
        final Button btn15b = (Button) findViewById(R.id.BigO1);
        final Button btn16b = (Button) findViewById(R.id.BigP1);
        final Button btn17b = (Button) findViewById(R.id.BigQ1);
        final Button btn18b = (Button) findViewById(R.id.BigR1);
        final Button btn19b = (Button) findViewById(R.id.BigS1);
        final Button btn20b = (Button) findViewById(R.id.BigT1);
        final Button btn21b = (Button) findViewById(R.id.BigU1);
        final Button btn22b = (Button) findViewById(R.id.BigV1);
        final Button btn23b = (Button) findViewById(R.id.BigW1);
        final Button btn24b = (Button) findViewById(R.id.BigX1);
        final Button btn25b = (Button) findViewById(R.id.BigY1);
        final Button btn26b = (Button) findViewById(R.id.BigZ1);

        final Button btn1 = (Button) findViewById(R.id.Smalla1);
        final Button btn2= (Button) findViewById(R.id.Smallb1);
        final Button btn3 = (Button) findViewById(R.id.Smallc1);
        final Button btn4 = (Button) findViewById(R.id.Smalld1);
        final Button btn5 = (Button) findViewById(R.id.Smalle1);
        final Button btn6 = (Button) findViewById(R.id.Smallf1);
        final Button btn7 = (Button) findViewById(R.id.Smallg1);
        final Button btn8 = (Button) findViewById(R.id.Smallh1);
        final Button btn9 = (Button) findViewById(R.id.Smalli1);
        final Button btn10 = (Button) findViewById(R.id.Smallj1);
        final Button btn11 = (Button) findViewById(R.id.Smallk1);
        final Button btn12 = (Button) findViewById(R.id.Smalll1);
        final Button btn13 = (Button) findViewById(R.id.Smallm1);
        final Button btn14 = (Button) findViewById(R.id.Smalln1);
        final Button btn15 = (Button) findViewById(R.id.Smallo1);
        final Button btn16 = (Button) findViewById(R.id.Smallp1);
        final Button btn17 = (Button) findViewById(R.id.Smallq1);
        final Button btn18 = (Button) findViewById(R.id.Smallr1);
        final Button btn19 = (Button) findViewById(R.id.Smalls1);
        final Button btn20 = (Button) findViewById(R.id.Smallt1);
        final Button btn21 = (Button) findViewById(R.id.Smallu1);
        final Button btn22 = (Button) findViewById(R.id.Smallv1);
        final Button btn23 = (Button) findViewById(R.id.Smallw1);
        final Button btn24 = (Button) findViewById(R.id.Smallx1);
        final Button btn25 = (Button) findViewById(R.id.Smally1);
        final Button btn26 = (Button) findViewById(R.id.Smallz1);

        host.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

            public void onTabChanged(String tabId) {
                Log.d("tabhost", "onTabChanged: tab number=" + host.getCurrentTab());

                switch (host.getCurrentTab()) {
                    case 0:
                        btn1b.setBackgroundResource(R.drawable.letter_a);
                        btn2b.setBackgroundResource(R.drawable.letter_b);
                        btn3b.setBackgroundResource(R.drawable.letter_c);
                        btn4b.setBackgroundResource(R.drawable.letter_d);
                        btn5b.setBackgroundResource(R.drawable.letter_e);
                        btn6b.setBackgroundResource(R.drawable.letter_f);
                        btn7b.setBackgroundResource(R.drawable.letter_g);
                        btn8b.setBackgroundResource(R.drawable.letter_h);
                        btn9b.setBackgroundResource(R.drawable.letter_i);
                        btn10b.setBackgroundResource(R.drawable.letter_j);
                        btn11b.setBackgroundResource(R.drawable.letter_k);
                        btn12b.setBackgroundResource(R.drawable.letter_l);
                        btn13b.setBackgroundResource(R.drawable.letter_m);
                        btn14b.setBackgroundResource(R.drawable.letter_n);
                        btn15b.setBackgroundResource(R.drawable.letter_o);
                        btn16b.setBackgroundResource(R.drawable.letter_p);
                        btn17b.setBackgroundResource(R.drawable.letter_q);
                        btn18b.setBackgroundResource(R.drawable.letter_r);
                        btn19b.setBackgroundResource(R.drawable.letter_s);
                        btn20b.setBackgroundResource(R.drawable.letter_t);
                        btn21b.setBackgroundResource(R.drawable.letter_u);
                        btn22b.setBackgroundResource(R.drawable.letter_v);
                        btn23b.setBackgroundResource(R.drawable.letter_w);
                        btn24b.setBackgroundResource(R.drawable.letter_x);
                        btn25b.setBackgroundResource(R.drawable.letter_y);
                        btn26b.setBackgroundResource(R.drawable.letter_z);

                        btn1.setBackgroundResource(0);
                        btn2.setBackgroundResource(0);
                        btn3.setBackgroundResource(0);
                        btn4.setBackgroundResource(0);
                        btn5.setBackgroundResource(0);
                        btn6.setBackgroundResource(0);
                        btn7.setBackgroundResource(0);
                        btn8.setBackgroundResource(0);
                        btn9.setBackgroundResource(0);
                        btn10.setBackgroundResource(0);
                        btn11.setBackgroundResource(0);
                        btn12.setBackgroundResource(0);
                        btn13.setBackgroundResource(0);
                        btn14.setBackgroundResource(0);
                        btn15.setBackgroundResource(0);
                        btn16.setBackgroundResource(0);
                        btn17.setBackgroundResource(0);
                        btn18.setBackgroundResource(0);
                        btn19.setBackgroundResource(0);
                        btn20.setBackgroundResource(0);
                        btn21.setBackgroundResource(0);
                        btn22.setBackgroundResource(0);
                        btn23.setBackgroundResource(0);
                        btn24.setBackgroundResource(0);
                        btn25.setBackgroundResource(0);
                        btn26.setBackgroundResource(0);
                        loader();
                        break;
                    case 1:
                        //do what you want when tab 1 is selected

                        btn1.setBackgroundResource(R.drawable.sb_a);
                        btn2.setBackgroundResource(R.drawable.sb_b);
                        btn3.setBackgroundResource(R.drawable.sb_c);
                        btn4.setBackgroundResource(R.drawable.sb_d);
                        btn5.setBackgroundResource(R.drawable.sb_e);
                        btn6.setBackgroundResource(R.drawable.sb_f);
                        btn7.setBackgroundResource(R.drawable.sb_g);
                        btn8.setBackgroundResource(R.drawable.sb_h);
                        btn9.setBackgroundResource(R.drawable.sb_i);
                        btn10.setBackgroundResource(R.drawable.sb_j);
                        btn11.setBackgroundResource(R.drawable.sb_k);
                        btn12.setBackgroundResource(R.drawable.sb_l);
                        btn13.setBackgroundResource(R.drawable.sb_m);
                        btn14.setBackgroundResource(R.drawable.sb_n);
                        btn15.setBackgroundResource(R.drawable.sb_o);
                        btn16.setBackgroundResource(R.drawable.sb_p);
                        btn17.setBackgroundResource(R.drawable.sb_q);
                        btn18.setBackgroundResource(R.drawable.sb_r);
                        btn19.setBackgroundResource(R.drawable.sb_s);
                        btn20.setBackgroundResource(R.drawable.sb_t);
                        btn21.setBackgroundResource(R.drawable.sb_u);
                        btn22.setBackgroundResource(R.drawable.sb_v);
                        btn23.setBackgroundResource(R.drawable.sb_w);
                        btn24.setBackgroundResource(R.drawable.sb_x);
                        btn25.setBackgroundResource(R.drawable.sb_y);
                        btn26.setBackgroundResource(R.drawable.sb_z);
                        btn1b.setBackgroundResource(0);
                        btn2b.setBackgroundResource(0);
                        btn3b.setBackgroundResource(0);
                        btn4b.setBackgroundResource(0);
                        btn5b.setBackgroundResource(0);
                        btn6b.setBackgroundResource(0);
                        btn7b.setBackgroundResource(0);
                        btn8b.setBackgroundResource(0);
                        btn9b.setBackgroundResource(0);
                        btn10b.setBackgroundResource(0);
                        btn11b.setBackgroundResource(0);
                        btn12b.setBackgroundResource(0);
                        btn13b.setBackgroundResource(0);
                        btn14b.setBackgroundResource(0);
                        btn15b.setBackgroundResource(0);
                        btn16b.setBackgroundResource(0);
                        btn17b.setBackgroundResource(0);
                        btn18b.setBackgroundResource(0);
                        btn19b.setBackgroundResource(0);
                        btn20b.setBackgroundResource(0);
                        btn21b.setBackgroundResource(0);
                        btn22b.setBackgroundResource(0);
                        btn23b.setBackgroundResource(0);
                        btn24b.setBackgroundResource(0);
                        btn25b.setBackgroundResource(0);
                        btn26b.setBackgroundResource(0);
                        loader();
                        break;
                    case 2:
                        //do what you want when tab 2 is selected
                        break;

                    default:

                        break;
                }
            }
        });

        loader();
    }

    @Override
    protected void onResume() {

        super.onResume();
        loader();
    }

    public void loader(){
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        letter = db.getAvg();


        Button btn[] = new Button[56];
        //  Toast.makeText(this, resID + "ID got," + R.id.BigA, Toast.LENGTH_SHORT).show();
        for (int i = 0 ; i <= 55; i++){
            int resID = getResources().getIdentifier(letter.get(i).getLetterName()+'1', "id", getPackageName());
            String resIDstr = resID + " ";

            btn[i] = (Button) findViewById(resID);
            if(btn[i].getBackground()!=null) {
                if (letter.get(i).getLettterStat() == 0) {


                    // Toast.makeText(this, btn[i].toString(), Toast.LENGTH_SHORT).show();
                    btn[i].getBackground().setColorFilter(filter);
                    btn[i].setEnabled(false);
                } else {
                    btn[i].setEnabled(true);
                    btn[i].getBackground().clearColorFilter();
                }
            }
        }
    }

    public void backing(View v){
        finish();
    }
    public void onBoard(View view) {
        Bundle bundle = new Bundle();
        final Intent board = new Intent(this, WritingBoardAvg.class);

        switch (view.getId()) {
            case R.id.BigA1:

                bundle.putString("letter", "BigA");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigB1:

                bundle.putString("letter", "BigB");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigC1:
                bundle.putString("letter", "BigC");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigD1:
                bundle.putString("letter", "BigD");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigE1:
                bundle.putString("letter", "BigE");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigF1:
                bundle.putString("letter", "BigF");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigG1:
                bundle.putString("letter", "BigG");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigH1:
                bundle.putString("letter", "BigH");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigI1:
                bundle.putString("letter", "BigI");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigJ1:
                bundle.putString("letter", "BigJ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigK1:
                bundle.putString("letter", "BigK");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigL1:
                bundle.putString("letter", "BigL");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigM1:
                bundle.putString("letter", "BigM");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigN1:
                bundle.putString("letter", "BigN");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigO1:
                bundle.putString("letter", "BigO");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigP1:
                bundle.putString("letter", "BigP");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigQ1:
                bundle.putString("letter", "BigQ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigR1:
                bundle.putString("letter", "BigR");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigS1:
                bundle.putString("letter", "BigS");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigT1:
                bundle.putString("letter", "BigT");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigU1:
                bundle.putString("letter", "BigU");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigV1:
                bundle.putString("letter", "BigV");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigW1:
                bundle.putString("letter", "BigW");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigX1:
                bundle.putString("letter", "BigX");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigY1:
                bundle.putString("letter", "BigY");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigZ1:
                bundle.putString("letter", "BigZ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalla1:
                bundle.putString("letter", "Smalla");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallb1:
                bundle.putString("letter", "Smallb");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallc1:
                bundle.putString("letter", "Smallc");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalld1:
                bundle.putString("letter", "Smalld");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalle1:
                bundle.putString("letter", "Smalle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallf1:
                bundle.putString("letter", "Smallf");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallg1:
                bundle.putString("letter", "Smallg");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallh1:
                bundle.putString("letter", "Smallh");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalli1:
                bundle.putString("letter", "Smalli");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallj1:
                bundle.putString("letter", "Smallj");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallk1:
                bundle.putString("letter", "Smallk");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalll1:
                bundle.putString("letter", "Smalll");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallm1:
                bundle.putString("letter", "Smallm");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalln1:
                bundle.putString("letter", "Smalln");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallo1:
                bundle.putString("letter", "Smallo");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallp1:
                bundle.putString("letter", "Smallp");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallq1:
                bundle.putString("letter", "Smallq");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallr1:
                bundle.putString("letter", "Smallr");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalls1:
                bundle.putString("letter", "Smalls");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallt1:
                bundle.putString("letter", "Smallt");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallu1:
                bundle.putString("letter", "Smallu");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallv1:
                bundle.putString("letter", "Smallv");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallw1:
                bundle.putString("letter", "Smallw");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallx1:
                bundle.putString("letter", "Smallx");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smally1:
                bundle.putString("letter", "Smally");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallz1:
                bundle.putString("letter", "Smallz");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.circle1:
                bundle.putString("letter", "circle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.rectangle1:
                bundle.putString("letter", "rectangle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.square1:
                bundle.putString("letter", "square");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.triangle1:
                bundle.putString("letter", "triangle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }

    }


}
