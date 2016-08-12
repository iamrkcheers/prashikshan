package com.example.sher_locked.prashikshan;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Button b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                MainActivity.this.startActivity(i);
            }
        });
        Typeface font_style = Typeface.createFromAsset(getAssets(), "Galberik.otf");
        b3.setTypeface(font_style);
        /*try {
            Thread.sleep(5000);
        }
        catch (Exception e){}*/

        //this.finish();
    }
}
