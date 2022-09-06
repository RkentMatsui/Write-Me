package com.example.rowielokentmatsui.writeme;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;


/**
 * Created by andrew on 11/17/16.
 */

public class CustomBackgroundIntro extends AppIntro2 {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SliderPage sliderPage1 = new SliderPage();
        sliderPage1.setTitle("Welcome!");
        sliderPage1.setDescription("First Button Directs you to the letters and in Achievements is where you can check what letters in easy is finished");
        sliderPage1.setImageDrawable(R.drawable.opening);
        sliderPage1.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage1));

        SliderPage sliderPage2 = new SliderPage();
        sliderPage2.setTitle("Achievement");
        sliderPage2.setDescription("You can check what letters your child have achieved.");
        sliderPage2.setImageDrawable(R.drawable.achievem);
        sliderPage2.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage2));

        SliderPage sliderPage3 = new SliderPage();
        sliderPage3.setTitle("Categories");
        sliderPage3.setDescription("Easy, Average and Hard. Please take time to finished all the levels.");
        sliderPage3.setImageDrawable(R.drawable.categorys);
        sliderPage3.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage3));

        SliderPage sliderPage4 = new SliderPage();
        sliderPage4.setTitle("Letters and Shapes");
        sliderPage4.setDescription("You can click letter that is unlocked here");
        sliderPage4.setImageDrawable(R.drawable.letterslist);
        sliderPage4.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage4));


        SliderPage sliderPage5 = new SliderPage();
        sliderPage5.setTitle("Write");
        sliderPage5.setDescription("Write the indicated letter by the voice or the tutorial beside it");
        sliderPage5.setImageDrawable(R.drawable.writingsamp);
        sliderPage5.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage5));
        // Declare a new image view
        ImageView imageView = new ImageView(this);

        // Bind a drawable to the imageview
        imageView.setImageResource(R.drawable.bg2);

        // Set background color
        imageView.setBackgroundColor(Color.BLACK);

        // Set layout params
        imageView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        // Bind the background to the intro
        setBackgroundView(imageView);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }
}
