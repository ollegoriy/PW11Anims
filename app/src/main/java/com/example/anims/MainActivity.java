package com.example.anims;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.anims.FrameAnimationActivity;
import com.example.anims.TweenAnimationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnFrameAnimation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FrameAnimationActivity.class));
            }
        });

        findViewById(R.id.btnTweenAnimation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TweenAnimationActivity.class));
            }
        });

        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
