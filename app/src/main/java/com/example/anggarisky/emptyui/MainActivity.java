package com.example.anggarisky.emptyui;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titlex, subtitlex, titleitemone, subtitleitemone,
            titleitemtwo, subtitleitemtwo, titleitemthree, subtitleitemthree,
    titlexx, subtitlexx;

    Button btncls, btnplus;

    LinearLayout itemonex, itemtwox, itemthreex;

    ImageView ictask;

    Animation bts, stb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bts = AnimationUtils.loadAnimation(this, R.anim.bts);
        stb = AnimationUtils.loadAnimation(this, R.anim.stb);

        titlex = (TextView) findViewById(R.id.titlex);
        subtitlex = (TextView) findViewById(R.id.subtitlex);
        titleitemone = (TextView) findViewById(R.id.titleitemone);
        subtitleitemone = (TextView) findViewById(R.id.subtitleitemone);
        titleitemtwo = (TextView) findViewById(R.id.titleitemtwo);
        subtitleitemtwo = (TextView) findViewById(R.id.subtitleitemtwo);
        titleitemthree = (TextView) findViewById(R.id.titleitemthree);
        subtitleitemthree = (TextView) findViewById(R.id.subtitleitemthree);
        titlexx = (TextView) findViewById(R.id.titlexx);
        subtitlexx = (TextView) findViewById(R.id.subtitlexx);

        btncls = (Button) findViewById(R.id.btncls);
        btnplus = (Button) findViewById(R.id.btnplus);

        itemonex = (LinearLayout) findViewById(R.id.itemonex);
        itemtwox = (LinearLayout) findViewById(R.id.itemtwox);
        itemthreex = (LinearLayout) findViewById(R.id.itemthreex);

        ictask = (ImageView) findViewById(R.id.ictask);

        ictask.startAnimation(stb);

//        setting ll animate

        itemonex.setAlpha(0);
        itemonex.setTranslationY(400);

        itemtwox.setAlpha(0);
        itemtwox.setTranslationY(400);

        itemthreex.setAlpha(0);
        itemthreex.setTranslationY(400);


//        setting alpha animate

        btncls.setAlpha(0);
        btncls.setTranslationY(400);

//        setting animate tv


        titlex.setAlpha(0);
        titlex.setTranslationY(100);


        subtitlex.setAlpha(0);
        subtitlex.setTranslationY(100);


//        set animate click


        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btncls.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(1000).start();
                btnplus.animate().alpha(0).translationY(400).setDuration(600).start();

                titlex.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(300).start();
                subtitlex.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(300).start();

                itemonex.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(500).start();
                itemtwox.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(700).start();
                itemthreex.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(900).start();

                titlexx.animate().alpha(0).translationY(400).setDuration(600).start();
                subtitlexx.animate().alpha(0).translationY(400).setDuration(600).start();

                ictask.startAnimation(bts);
                ictask.setVisibility(View.GONE);

            }
        });

        btncls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ictask.setVisibility(View.VISIBLE);
                ictask.startAnimation(bts);

                titlex.animate().alpha(0).translationY(400).setDuration(200).start();
                subtitlex.animate().alpha(0).translationY(400).setDuration(200).start();

                btnplus.animate().alpha(1).translationY(0).setDuration(600).setStartDelay(1000).start();
                btncls.animate().alpha(0).translationY(400).setDuration(200).start();

                titlexx.animate().alpha(1).translationY(0).setDuration(600).start();
                subtitlexx.animate().alpha(1).translationY(0).setDuration(600).start();

                itemonex.animate().alpha(0).translationY(400).setDuration(200).start();
                itemtwox.animate().alpha(0).translationY(400).setDuration(200).start();
                itemthreex.animate().alpha(0).translationY(400).setDuration(200).start();
            }
        });


//        font customize

        Typeface mlight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface mreg = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");

        titlex.setTypeface(mreg);
        subtitlex.setTypeface(mlight);
        titleitemone.setTypeface(mreg);
        subtitleitemone.setTypeface(mlight);
        titleitemtwo.setTypeface(mreg);
        subtitleitemtwo.setTypeface(mlight);
        titleitemthree.setTypeface(mreg);
        subtitleitemthree.setTypeface(mlight);
        titlexx.setTypeface(mreg);
        subtitlexx.setTypeface(mlight);

    }
}
