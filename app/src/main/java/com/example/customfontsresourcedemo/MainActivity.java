package com.example.customfontsresourcedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //How change font in Java code
        TextView textView = findViewById(R.id.textView);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.luxy_font);
        /*if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
            Typeface t = Typeface.create(typeface, 200, false);
        }*/

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTypeface(typeface);

            }
        });
    }
}