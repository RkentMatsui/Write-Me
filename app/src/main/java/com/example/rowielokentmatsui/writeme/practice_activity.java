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

public class practice_activity extends AppCompatActivity {
    DataManager db = new DataManager(this);
    ArrayList<Letter> letter=new ArrayList<Letter>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_activity);

        final TabHost host = (TabHost)findViewById(R.id.tabHost1pract);
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


        final Button btn1b5 = (Button) findViewById(R.id.bigtutora);
        final Button btn2b5= (Button) findViewById(R.id.bigtutorb);
        final Button btn3b5 = (Button) findViewById(R.id.bigtutorc);
        final Button btn4b5 = (Button) findViewById(R.id.bigtutord);
        final Button btn5b5 = (Button) findViewById(R.id.bigtutore);
        final Button btn6b5 = (Button) findViewById(R.id.bigtutorf);
        final Button btn7b5 = (Button) findViewById(R.id.bigtutorg);
        final Button btn8b5= (Button) findViewById(R.id.bigtutorh);
        final Button btn9b5= (Button) findViewById(R.id.bigtutori);
        final Button btn10b5 = (Button) findViewById(R.id.bigtutorj);
        final Button btn11b5 = (Button) findViewById(R.id.bigtutork);
        final Button btn12b5 = (Button) findViewById(R.id.bigtutorl);
        final Button btn13b5 = (Button) findViewById(R.id.bigtutorm);
        final Button btn14b5 = (Button) findViewById(R.id.bigtutorn);
        final Button btn15b5 = (Button) findViewById(R.id.bigtutoro);
        final Button btn16b5 = (Button) findViewById(R.id.bigtutorp);
        final Button btn17b5 = (Button) findViewById(R.id.bigtutorq);
        final Button btn18b5 = (Button) findViewById(R.id.bigtutorr);
        final Button btn19b5 = (Button) findViewById(R.id.bigtutors);
        final Button btn20b5 = (Button) findViewById(R.id.bigtutort);
        final Button btn21b5 = (Button) findViewById(R.id.bigtutoru);
        final Button btn22b5 = (Button) findViewById(R.id.bigtutorv);
        final Button btn23b5 = (Button) findViewById(R.id.bigtutorw);
        final Button btn24b5 = (Button) findViewById(R.id.bigtutorx);
        final Button btn25b5 = (Button) findViewById(R.id.bigtutory);
        final Button btn26b5 = (Button) findViewById(R.id.bigtutorz);

        final Button btn15 = (Button) findViewById(R.id.smalltutora);
        final Button btn25= (Button) findViewById(R.id.smalltutorb);
        final Button btn35 = (Button) findViewById(R.id.smalltutorc);
        final Button btn45 = (Button) findViewById(R.id.smalltutord);
        final Button btn55 = (Button) findViewById(R.id.smalltutore);
        final Button btn65 = (Button) findViewById(R.id.smalltutorf);
        final Button btn75 = (Button) findViewById(R.id.smalltutorg);
        final Button btn85 = (Button) findViewById(R.id.smalltutorh);
        final Button btn95 = (Button) findViewById(R.id.smalltutori);
        final Button btn105 = (Button) findViewById(R.id.smalltutorj);
        final Button btn115 = (Button) findViewById(R.id.smalltutork);
        final Button btn125 = (Button) findViewById(R.id.smalltutorl);
        final Button btn135 = (Button) findViewById(R.id.smalltutorm);
        final Button btn145 = (Button) findViewById(R.id.smalltutorn);
        final Button btn155 = (Button) findViewById(R.id.smalltutoro);
        final Button btn165 = (Button) findViewById(R.id.smalltutorp);
        final Button btn175 = (Button) findViewById(R.id.smalltutorq);
        final Button btn185 = (Button) findViewById(R.id.smalltutorr);
        final Button btn195 = (Button) findViewById(R.id.smalltutors);
        final Button btn205 = (Button) findViewById(R.id.smalltutort);
        final Button btn215 = (Button) findViewById(R.id.smalltutoru);
        final Button btn225 = (Button) findViewById(R.id.smalltutorv);
        final Button btn235 = (Button) findViewById(R.id.smalltutorw);
        final Button btn245 = (Button) findViewById(R.id.smalltutorx);
        final Button btn255 = (Button) findViewById(R.id.smalltutory);
        final Button btn265 = (Button) findViewById(R.id.smalltutorz);
        final Button circ5 = (Button) findViewById(R.id.tutorcircle);
        final Button tri5 = (Button) findViewById(R.id.tutortriangle1);
        final Button sqa5 = (Button) findViewById(R.id.tutorsquare1);
        final Button rect5 = (Button) findViewById(R.id.tutorrectangle1);
        circ5.setBackgroundResource(0);
        tri5.setBackgroundResource(0);
        rect5.setBackgroundResource(0);
        circ5.setBackgroundResource(0);

        circ5.setBackgroundResource(R.drawable.circle);
        tri5.setBackgroundResource(R.drawable.triangle);
        rect5.setBackgroundResource(R.drawable.rectanglebutt);
        circ5.setBackgroundResource(R.drawable.square);

        btn1b5.setBackgroundResource(0);
        btn2b5.setBackgroundResource(0);
        btn3b5.setBackgroundResource(0);
        btn4b5.setBackgroundResource(0);
        btn5b5.setBackgroundResource(0);
        btn6b5.setBackgroundResource(0);
        btn7b5.setBackgroundResource(0);
        btn8b5.setBackgroundResource(0);
        btn9b5.setBackgroundResource(0);
        btn10b5.setBackgroundResource(0);
        btn11b5.setBackgroundResource(0);
        btn12b5.setBackgroundResource(0);
        btn13b5.setBackgroundResource(0);
        btn14b5.setBackgroundResource(0);
        btn15b5.setBackgroundResource(0);
        btn16b5.setBackgroundResource(0);
        btn17b5.setBackgroundResource(0);
        btn18b5.setBackgroundResource(0);
        btn19b5.setBackgroundResource(0);
        btn20b5.setBackgroundResource(0);
        btn21b5.setBackgroundResource(0);
        btn22b5.setBackgroundResource(0);
        btn23b5.setBackgroundResource(0);
        btn24b5.setBackgroundResource(0);
        btn25b5.setBackgroundResource(0);
        btn26b5.setBackgroundResource(0);
        btn15.setBackgroundResource(0);
        btn25.setBackgroundResource(0);
        btn35.setBackgroundResource(0);
        btn45.setBackgroundResource(0);
        btn55.setBackgroundResource(0);
        btn65.setBackgroundResource(0);
        btn75.setBackgroundResource(0);
        btn85.setBackgroundResource(0);
        btn95.setBackgroundResource(0);
        btn105.setBackgroundResource(0);
        btn115.setBackgroundResource(0);
        btn125.setBackgroundResource(0);
        btn135.setBackgroundResource(0);
        btn145.setBackgroundResource(0);
        btn155.setBackgroundResource(0);
        btn165.setBackgroundResource(0);
        btn175.setBackgroundResource(0);
        btn185.setBackgroundResource(0);
        btn195.setBackgroundResource(0);
        btn205.setBackgroundResource(0);
        btn215.setBackgroundResource(0);
        btn225.setBackgroundResource(0);
        btn235.setBackgroundResource(0);
        btn245.setBackgroundResource(0);
        btn255.setBackgroundResource(0);
        btn265.setBackgroundResource(0);

        btn1b5.setBackgroundResource(R.drawable.letter_a);
        btn2b5.setBackgroundResource(R.drawable.letter_b);
        btn3b5.setBackgroundResource(R.drawable.letter_c);
        btn4b5.setBackgroundResource(R.drawable.letter_d);
        btn5b5.setBackgroundResource(R.drawable.letter_e);
        btn6b5.setBackgroundResource(R.drawable.letter_f);
        btn7b5.setBackgroundResource(R.drawable.letter_g);
        btn8b5.setBackgroundResource(R.drawable.letter_h);
        btn9b5.setBackgroundResource(R.drawable.letter_i);
        btn10b5.setBackgroundResource(R.drawable.letter_j);
        btn11b5.setBackgroundResource(R.drawable.letter_k);
        btn12b5.setBackgroundResource(R.drawable.letter_l);
        btn13b5.setBackgroundResource(R.drawable.letter_m);
        btn14b5.setBackgroundResource(R.drawable.letter_n);
        btn15b5.setBackgroundResource(R.drawable.letter_o);
        btn16b5.setBackgroundResource(R.drawable.letter_p);
        btn17b5.setBackgroundResource(R.drawable.letter_q);
        btn18b5.setBackgroundResource(R.drawable.letter_r);
        btn19b5.setBackgroundResource(R.drawable.letter_s);
        btn20b5.setBackgroundResource(R.drawable.letter_t);
        btn21b5.setBackgroundResource(R.drawable.letter_u);
        btn22b5.setBackgroundResource(R.drawable.letter_v);
        btn23b5.setBackgroundResource(R.drawable.letter_w);
        btn24b5.setBackgroundResource(R.drawable.letter_x);
        btn25b5.setBackgroundResource(R.drawable.letter_y);
        btn26b5.setBackgroundResource(R.drawable.letter_z);

        host.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

            public void onTabChanged(String tabId) {
                Log.d("tabhost", "onTabChanged: tab number=" + host.getCurrentTab());

                switch (host.getCurrentTab()) {
                    case 0:
                        btn1b5.setBackgroundResource(R.drawable.letter_a);
                        btn2b5.setBackgroundResource(R.drawable.letter_b);
                        btn3b5.setBackgroundResource(R.drawable.letter_c);
                        btn4b5.setBackgroundResource(R.drawable.letter_d);
                        btn5b5.setBackgroundResource(R.drawable.letter_e);
                        btn6b5.setBackgroundResource(R.drawable.letter_f);
                        btn7b5.setBackgroundResource(R.drawable.letter_g);
                        btn8b5.setBackgroundResource(R.drawable.letter_h);
                        btn9b5.setBackgroundResource(R.drawable.letter_i);
                        btn10b5.setBackgroundResource(R.drawable.letter_j);
                        btn11b5.setBackgroundResource(R.drawable.letter_k);
                        btn12b5.setBackgroundResource(R.drawable.letter_l);
                        btn13b5.setBackgroundResource(R.drawable.letter_m);
                        btn14b5.setBackgroundResource(R.drawable.letter_n);
                        btn15b5.setBackgroundResource(R.drawable.letter_o);
                        btn16b5.setBackgroundResource(R.drawable.letter_p);
                        btn17b5.setBackgroundResource(R.drawable.letter_q);
                        btn18b5.setBackgroundResource(R.drawable.letter_r);
                        btn19b5.setBackgroundResource(R.drawable.letter_s);
                        btn20b5.setBackgroundResource(R.drawable.letter_t);
                        btn21b5.setBackgroundResource(R.drawable.letter_u);
                        btn22b5.setBackgroundResource(R.drawable.letter_v);
                        btn23b5.setBackgroundResource(R.drawable.letter_w);
                        btn24b5.setBackgroundResource(R.drawable.letter_x);
                        btn25b5.setBackgroundResource(R.drawable.letter_y);
                        btn26b5.setBackgroundResource(R.drawable.letter_z);

                        btn15.setBackgroundResource(0);
                        btn25.setBackgroundResource(0);
                        btn35.setBackgroundResource(0);
                        btn45.setBackgroundResource(0);
                        btn55.setBackgroundResource(0);
                        btn65.setBackgroundResource(0);
                        btn75.setBackgroundResource(0);
                        btn85.setBackgroundResource(0);
                        btn95.setBackgroundResource(0);
                        btn105.setBackgroundResource(0);
                        btn115.setBackgroundResource(0);
                        btn125.setBackgroundResource(0);
                        btn135.setBackgroundResource(0);
                        btn145.setBackgroundResource(0);
                        btn155.setBackgroundResource(0);
                        btn165.setBackgroundResource(0);
                        btn175.setBackgroundResource(0);
                        btn185.setBackgroundResource(0);
                        btn195.setBackgroundResource(0);
                        btn205.setBackgroundResource(0);
                        btn215.setBackgroundResource(0);
                        btn225.setBackgroundResource(0);
                        btn235.setBackgroundResource(0);
                        btn245.setBackgroundResource(0);
                        btn255.setBackgroundResource(0);
                        btn265.setBackgroundResource(0);
                        
                        break;
                    case 1:
                        //do what you want when tab 1 is selected

                        btn15.setBackgroundResource(R.drawable.sb_a);
                        btn25.setBackgroundResource(R.drawable.sb_b);
                        btn35.setBackgroundResource(R.drawable.sb_c);
                        btn45.setBackgroundResource(R.drawable.sb_d);
                        btn55.setBackgroundResource(R.drawable.sb_e);
                        btn65.setBackgroundResource(R.drawable.sb_f);
                        btn75.setBackgroundResource(R.drawable.sb_g);
                        btn85.setBackgroundResource(R.drawable.sb_h);
                        btn95.setBackgroundResource(R.drawable.sb_i);
                        btn105.setBackgroundResource(R.drawable.sb_j);
                        btn115.setBackgroundResource(R.drawable.sb_k);
                        btn125.setBackgroundResource(R.drawable.sb_l);
                        btn135.setBackgroundResource(R.drawable.sb_m);
                        btn145.setBackgroundResource(R.drawable.sb_n);
                        btn155.setBackgroundResource(R.drawable.sb_o);
                        btn165.setBackgroundResource(R.drawable.sb_p);
                        btn175.setBackgroundResource(R.drawable.sb_q);
                        btn185.setBackgroundResource(R.drawable.sb_r);
                        btn195.setBackgroundResource(R.drawable.sb_s);
                        btn205.setBackgroundResource(R.drawable.sb_t);
                        btn215.setBackgroundResource(R.drawable.sb_u);
                        btn225.setBackgroundResource(R.drawable.sb_v);
                        btn235.setBackgroundResource(R.drawable.sb_w);
                        btn245.setBackgroundResource(R.drawable.sb_x);
                        btn255.setBackgroundResource(R.drawable.sb_y);
                        btn265.setBackgroundResource(R.drawable.sb_z);
                        btn1b5.setBackgroundResource(0);
                        btn2b5.setBackgroundResource(0);
                        btn3b5.setBackgroundResource(0);
                        btn4b5.setBackgroundResource(0);
                        btn5b5.setBackgroundResource(0);
                        btn6b5.setBackgroundResource(0);
                        btn7b5.setBackgroundResource(0);
                        btn8b5.setBackgroundResource(0);
                        btn9b5.setBackgroundResource(0);
                        btn10b5.setBackgroundResource(0);
                        btn11b5.setBackgroundResource(0);
                        btn12b5.setBackgroundResource(0);
                        btn13b5.setBackgroundResource(0);
                        btn14b5.setBackgroundResource(0);
                        btn15b5.setBackgroundResource(0);
                        btn16b5.setBackgroundResource(0);
                        btn17b5.setBackgroundResource(0);
                        btn18b5.setBackgroundResource(0);
                        btn19b5.setBackgroundResource(0);
                        btn20b5.setBackgroundResource(0);
                        btn21b5.setBackgroundResource(0);
                        btn22b5.setBackgroundResource(0);
                        btn23b5.setBackgroundResource(0);
                        btn24b5.setBackgroundResource(0);
                        btn25b5.setBackgroundResource(0);
                        btn26b5.setBackgroundResource(0);
                        
                        break;
                    case 2:
                        //do what you want when tab 2 is selected
                        break;

                    default:

                        break;
                }
            }
        });

        
    }

    @Override
    protected void onResume() {

        super.onResume();
        
    }

   

    public void backing(View v){
        finish();
    }
    public void onBoard(View view) {
        Bundle bundle = new Bundle();
        final Intent board = new Intent(this, Practice_write.class);

        switch (view.getId()) {
            case R.id.bigtutora:

                bundle.putString("letter", "BigA");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorb:

                bundle.putString("letter", "BigB");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorc:
                bundle.putString("letter", "BigC");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutord:
                bundle.putString("letter", "BigD");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutore:
                bundle.putString("letter", "BigE");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorf:
                bundle.putString("letter", "BigF");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorg:
                bundle.putString("letter", "BigG");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorh:
                bundle.putString("letter", "BigH");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutori:
                bundle.putString("letter", "BigI");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorj:
                bundle.putString("letter", "BigJ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutork:
                bundle.putString("letter", "BigK");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorl:
                bundle.putString("letter", "BigL");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorm:
                bundle.putString("letter", "BigM");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorn:
                bundle.putString("letter", "BigN");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutoro:
                bundle.putString("letter", "BigO");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorp:
                bundle.putString("letter", "BigP");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorq:
                bundle.putString("letter", "BigQ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorr:
                bundle.putString("letter", "BigR");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutors:
                bundle.putString("letter", "BigS");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutort:
                bundle.putString("letter", "BigT");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutoru:
                bundle.putString("letter", "BigU");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorv:
                bundle.putString("letter", "BigV");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorw:
                bundle.putString("letter", "BigW");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorx:
                bundle.putString("letter", "BigX");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutory:
                bundle.putString("letter", "BigY");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.bigtutorz:
                bundle.putString("letter", "BigZ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutora:
                bundle.putString("letter", "Smalla");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorb:
                bundle.putString("letter", "Smallb");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorc:
                bundle.putString("letter", "Smallc");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutord:
                bundle.putString("letter", "Smalld");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutore:
                bundle.putString("letter", "Smalle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorf:
                bundle.putString("letter", "Smallf");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorg:
                bundle.putString("letter", "Smallg");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorh:
                bundle.putString("letter", "Smallh");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutori:
                bundle.putString("letter", "Smalli");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorj:
                bundle.putString("letter", "Smallj");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutork:
                bundle.putString("letter", "Smallk");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorl:
                bundle.putString("letter", "Smalll");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorm:
                bundle.putString("letter", "Smallm");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorn:
                bundle.putString("letter", "Smalln");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutoro:
                bundle.putString("letter", "Smallo");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorp:
                bundle.putString("letter", "Smallp");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorq:
                bundle.putString("letter", "Smallq");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorr:
                bundle.putString("letter", "Smallr");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutors:
                bundle.putString("letter", "Smalls");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutort:
                bundle.putString("letter", "Smallt");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutoru:
                bundle.putString("letter", "Smallu");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorv:
                bundle.putString("letter", "Smallv");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorw:
                bundle.putString("letter", "Smallw");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorx:
                bundle.putString("letter", "Smallx");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutory:
                bundle.putString("letter", "Smally");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.smalltutorz:
                bundle.putString("letter", "Smallz");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.tutorcircle:
                bundle.putString("letter", "circle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.tutorrectangle1:
                bundle.putString("letter", "rectangle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.tutorsquare1:
                bundle.putString("letter", "square");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.tutortriangle1:
                bundle.putString("letter", "triangle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }

    }


}
