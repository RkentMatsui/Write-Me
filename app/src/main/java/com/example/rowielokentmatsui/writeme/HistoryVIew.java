package com.example.rowielokentmatsui.writeme;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;

public class HistoryVIew extends AppCompatActivity {
    private GridViewAdapter mAdapter;
    private ArrayList<String> History;
    private GridView gridView;
    DataManager db = new DataManager(this);
    public Bundle getBundle = null;
    private String letter="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_view);
//        final ImageView omg = (ImageView)findViewById(R.id.imageView2);
//        String photoPath = Environment.getExternalStorageDirectory()+"/BigA0.png";
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
       // Bitmap bitmap = BitmapFactory.decodeFile(photoPath, options);
       // Toast.makeText(this, photoPath, Toast.LENGTH_SHORT).show();
//        Picasso.with(this).load(photoPath).into(omg);
      //  omg.setImageBitmap(bitmap);
        getBundle = this.getIntent().getExtras();
        letter = getBundle.getString("letter");

        prepareList();
        Collections.reverse(History);
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridViewAdapter(this,History);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
               // Toast.makeText(HistoryVIew.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void prepareList()
    {
      History = new ArrayList<String>();
       History= db.getHistory(letter);
     //   Toast.makeText(this, letter, Toast.LENGTH_SHORT).show();
    }

    public void backing(View v){
        finish();
    }
}
