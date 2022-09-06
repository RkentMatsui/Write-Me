package com.example.rowielokentmatsui.writeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

public class HistoryPick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_pick);
        final Button btn1b = (Button) findViewById(R.id.BigAhist);
        final Button btn2b= (Button) findViewById(R.id.BigBhist);
        final Button btn3b = (Button) findViewById(R.id.BigChist);
        final Button btn4b = (Button) findViewById(R.id.BigDhist);
        final Button btn5b = (Button) findViewById(R.id.BigEhist);
        final Button btn6b = (Button) findViewById(R.id.BigFhist);
        final Button btn7b = (Button) findViewById(R.id.BigGhist);
        final Button btn8b= (Button) findViewById(R.id.BigHhist);
        final Button btn9b= (Button) findViewById(R.id.BigIhist);
        final Button btn10b = (Button) findViewById(R.id.BigJhist);
        final Button btn11b = (Button) findViewById(R.id.BigKhist);
        final Button btn12b = (Button) findViewById(R.id.BigLhist);
        final Button btn13b = (Button) findViewById(R.id.BigMhist);
        final Button btn14b = (Button) findViewById(R.id.BigNhist);
        final Button btn15b = (Button) findViewById(R.id.BigOhist);
        final Button btn16b = (Button) findViewById(R.id.BigPhist);
        final Button btn17b = (Button) findViewById(R.id.BigQhist);
        final Button btn18b = (Button) findViewById(R.id.BigRhist);
        final Button btn19b = (Button) findViewById(R.id.BigShist);
        final Button btn20b = (Button) findViewById(R.id.BigThist);
        final Button btn21b = (Button) findViewById(R.id.BigUhist);
        final Button btn22b = (Button) findViewById(R.id.BigVhist);
        final Button btn23b = (Button) findViewById(R.id.BigWhist);
        final Button btn24b = (Button) findViewById(R.id.BigXhist);
        final Button btn25b = (Button) findViewById(R.id.BigYhist);
        final Button btn26b = (Button) findViewById(R.id.BigZhist);

        final Button btn1 = (Button) findViewById(R.id.Smallahist);
        final Button btn2= (Button) findViewById(R.id.Smallbhist);
        final Button btn3 = (Button) findViewById(R.id.Smallchist);
        final Button btn4 = (Button) findViewById(R.id.Smalldhist);
        final Button btn5 = (Button) findViewById(R.id.Smallehist);
        final Button btn6 = (Button) findViewById(R.id.Smallfhist);
        final Button btn7 = (Button) findViewById(R.id.Smallghist);
        final Button btn8 = (Button) findViewById(R.id.Smallhhist);
        final Button btn9 = (Button) findViewById(R.id.Smallihist);
        final Button btn10 = (Button) findViewById(R.id.Smalljhist);
        final Button btn11 = (Button) findViewById(R.id.Smallkhist);
        final Button btn12 = (Button) findViewById(R.id.Smalllhist);
        final Button btn13 = (Button) findViewById(R.id.Smallmhist);
        final Button btn14 = (Button) findViewById(R.id.Smallnhist);
        final Button btn15 = (Button) findViewById(R.id.Smallohist);
        final Button btn16 = (Button) findViewById(R.id.Smallphist);
        final Button btn17 = (Button) findViewById(R.id.Smallqhist);
        final Button btn18 = (Button) findViewById(R.id.Smallrhist);
        final Button btn19 = (Button) findViewById(R.id.Smallshist);
        final Button btn20 = (Button) findViewById(R.id.Smallthist);
        final Button btn21 = (Button) findViewById(R.id.Smalluhist);
        final Button btn22 = (Button) findViewById(R.id.Smallvhist);
        final Button btn23 = (Button) findViewById(R.id.Smallwhist);
        final Button btn24 = (Button) findViewById(R.id.Smallxhist);
        final Button btn25 = (Button) findViewById(R.id.Smallyhist);
        final Button btn26 = (Button) findViewById(R.id.Smallzhist);
        final Button btn27 = (Button) findViewById(R.id.circlehist);
        final Button btn28 = (Button) findViewById(R.id.rectanglehist);
        final Button btn29 = (Button) findViewById(R.id.trianglehist);
        final Button btn30 = (Button) findViewById(R.id.squarehist);


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
        btn27.setBackgroundResource(R.drawable.circle);
        btn28.setBackgroundResource(R.drawable.rectanglebutt);
        btn29.setBackgroundResource(R.drawable.triangle);
        btn30.setBackgroundResource(R.drawable.square);

        btn1b.getBackground().clearColorFilter();
        btn2b.getBackground().clearColorFilter();
        btn3b.getBackground().clearColorFilter();
        btn4b.getBackground().clearColorFilter();
        btn5b.getBackground().clearColorFilter();
        btn6b.getBackground().clearColorFilter();
        btn7b.getBackground().clearColorFilter();
        btn8b.getBackground().clearColorFilter();
        btn9b.getBackground().clearColorFilter();
        btn10b.getBackground().clearColorFilter();
        btn11b.getBackground().clearColorFilter();
        btn12b.getBackground().clearColorFilter();
        btn13b.getBackground().clearColorFilter();
        btn14b.getBackground().clearColorFilter();
        btn15b.getBackground().clearColorFilter();
        btn16b.getBackground().clearColorFilter();
        btn17b.getBackground().clearColorFilter();
        btn18b.getBackground().clearColorFilter();
        btn19b.getBackground().clearColorFilter();
        btn20b.getBackground().clearColorFilter();
        btn21b.getBackground().clearColorFilter();
        btn22b.getBackground().clearColorFilter();
        btn23b.getBackground().clearColorFilter();
        btn24b.getBackground().clearColorFilter();
        btn25b.getBackground().clearColorFilter();
        btn26b.getBackground().clearColorFilter();

        btn1.getBackground().clearColorFilter();
        btn2.getBackground().clearColorFilter();
        btn3.getBackground().clearColorFilter();
        btn4.getBackground().clearColorFilter();
        btn5.getBackground().clearColorFilter();
        btn6.getBackground().clearColorFilter();
        btn7.getBackground().clearColorFilter();
        btn8.getBackground().clearColorFilter();
        btn9.getBackground().clearColorFilter();
        btn10.getBackground().clearColorFilter();
        btn11.getBackground().clearColorFilter();
        btn12.getBackground().clearColorFilter();
        btn13.getBackground().clearColorFilter();
        btn14.getBackground().clearColorFilter();
        btn15.getBackground().clearColorFilter();
        btn16.getBackground().clearColorFilter();
        btn17.getBackground().clearColorFilter();
        btn18.getBackground().clearColorFilter();
        btn19.getBackground().clearColorFilter();
        btn20.getBackground().clearColorFilter();
        btn21.getBackground().clearColorFilter();
        btn22.getBackground().clearColorFilter();
        btn23.getBackground().clearColorFilter();
        btn24.getBackground().clearColorFilter();
        btn25.getBackground().clearColorFilter();
        btn26.getBackground().clearColorFilter();
        btn27.getBackground().clearColorFilter();
        btn28.getBackground().clearColorFilter();
        btn29.getBackground().clearColorFilter();
        btn30.getBackground().clearColorFilter();
        final TabHost host = (TabHost)findViewById(R.id.tabHosthist);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("bighist");
        spec.setContent(R.id.tab1hist);
        spec.setIndicator("",getResources().getDrawable(R.drawable.letters_big));
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("smallhist");
        spec.setContent(R.id.tab2hist);
        spec.setIndicator("",getResources().getDrawable(R.drawable.letters_small));
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("shapehist");
        spec.setContent(R.id.tab3hist);
        spec.setIndicator("",getResources().getDrawable(R.drawable.shapes));
        host.addTab(spec);

    }
    public void backing(View v){
        finish();
    }
    public void viewWrite(View view){
        Bundle bundle = new Bundle();
        final Intent board = new Intent(this,HistoryVIew.class);
        switch (view.getId()) {
            case R.id.BigAhist:

                bundle.putString("letter", "BigA");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigBhist:

                bundle.putString("letter", "BigB");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigChist:
                bundle.putString("letter", "BigC");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigDhist:
                bundle.putString("letter", "BigD");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigEhist:
                bundle.putString("letter", "BigE");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigFhist:
                bundle.putString("letter", "BigF");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigGhist:
                bundle.putString("letter", "BigG");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigHhist:
                bundle.putString("letter", "BigH");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigIhist:
                bundle.putString("letter", "BigI");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigJhist:
                bundle.putString("letter", "BigJ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigKhist:
                bundle.putString("letter", "BigK");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigLhist:
                bundle.putString("letter", "BigL");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigMhist:
                bundle.putString("letter", "BigM");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigNhist:
                bundle.putString("letter", "BigN");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigOhist:
                bundle.putString("letter", "BigO");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigPhist:
                bundle.putString("letter", "BigP");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigQhist:
                bundle.putString("letter", "BigQ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigRhist:
                bundle.putString("letter", "BigR");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigShist:
                bundle.putString("letter", "BigS");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigThist:
                bundle.putString("letter", "BigT");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigUhist:
                bundle.putString("letter", "BigU");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigVhist:
                bundle.putString("letter", "BigV");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigWhist:
                bundle.putString("letter", "BigW");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigXhist:
                bundle.putString("letter", "BigX");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigYhist:
                bundle.putString("letter", "BigY");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.BigZhist:
                bundle.putString("letter", "BigZ");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallahist:
                bundle.putString("letter", "Smalla");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallbhist:
                bundle.putString("letter", "Smallb");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallchist:
                bundle.putString("letter", "Smallc");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalldhist:
                bundle.putString("letter", "Smalld");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallehist:
                bundle.putString("letter", "Smalle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallfhist:
                bundle.putString("letter", "Smallf");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallghist:
                bundle.putString("letter", "Smallg");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallhhist:
                bundle.putString("letter", "Smallh");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallihist:
                bundle.putString("letter", "Smalli");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalljhist:
                bundle.putString("letter", "Smallj");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallkhist:
                bundle.putString("letter", "Smallk");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalllhist:
                bundle.putString("letter", "Smalll");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallmhist:
                bundle.putString("letter", "Smallm");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallnhist:
                bundle.putString("letter", "Smalln");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallohist:
                bundle.putString("letter", "Smallo");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallphist:
                bundle.putString("letter", "Smallp");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallqhist:
                bundle.putString("letter", "Smallq");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallrhist:
                bundle.putString("letter", "Smallr");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallshist:
                bundle.putString("letter", "Smalls");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallthist:
                bundle.putString("letter", "Smallt");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smalluhist:
                bundle.putString("letter", "Smallu");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallvhist:
                bundle.putString("letter", "Smallv");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallwhist:
                bundle.putString("letter", "Smallw");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallxhist:
                bundle.putString("letter", "Smallx");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallyhist:
                bundle.putString("letter", "Smally");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.Smallzhist:
                bundle.putString("letter", "Smallz");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.circlehist:
                bundle.putString("letter", "circle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.rectanglehist:
                bundle.putString("letter", "rectangle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.squarehist:
                bundle.putString("letter", "square");
                board.putExtras(bundle);
                startActivity(board);
                break;
            case R.id.trianglehist:
                bundle.putString("letter", "triangle");
                board.putExtras(bundle);
                startActivity(board);
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }


    }
}
