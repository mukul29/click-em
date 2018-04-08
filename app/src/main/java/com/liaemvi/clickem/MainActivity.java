package com.liaemvi.clickem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sampleText = findViewById(R.id.text_first);
        final ImageView sampleImage = findViewById(R.id.image_first_small);
        final ImageView imageCenter = findViewById(R.id.image_first_large);

        sampleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageCenter.setVisibility(View.VISIBLE);
                imageCenter.setImageResource(R.drawable.ic_launcher);

            }
        });
    }
}
