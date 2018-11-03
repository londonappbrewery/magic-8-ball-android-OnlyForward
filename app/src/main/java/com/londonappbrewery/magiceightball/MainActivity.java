package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    private Button mChange;
    private int mVariant;
    private int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random random = new Random();

        mImageView = findViewById(R.id.image_eightBall);
        mImageView.setImageDrawable(getResources().getDrawable(R.drawable.ball1));

        mChange = findViewById(R.id.button_change);
        mChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVariant = ballArray[random.nextInt(5)];
                mImageView.setImageDrawable(getResources().getDrawable(mVariant));
            }
        });
    }
}
