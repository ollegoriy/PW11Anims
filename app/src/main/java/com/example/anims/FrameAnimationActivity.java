package com.example.anims;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FrameAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.animation_rabbit);

        AnimationDrawable animation = (AnimationDrawable) imageView.getBackground();
        animation.start();

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
