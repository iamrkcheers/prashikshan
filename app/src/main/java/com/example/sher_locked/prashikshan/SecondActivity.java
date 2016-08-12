package com.example.sher_locked.prashikshan;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();
        Button b=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);
        Typeface font_style = Typeface.createFromAsset(getAssets(), "Galberik.otf");
        b.setTypeface(font_style);
        b2.setTypeface(font_style);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, SignIn.class);
                SecondActivity.this.startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, SignUp.class);
                SecondActivity.this.startActivity(i);
            }
        });
    }
}
