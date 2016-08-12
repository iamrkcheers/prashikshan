package com.example.sher_locked.prashikshan;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class Selection extends AppCompatActivity {

    String[] web = {
            "JAVA",
            "DOTNET",
            "PYTHON"
    } ;
    Integer[] imageId = {
            R.drawable.java,
            R.drawable.msdn,
            R.drawable.python,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        getSupportActionBar().hide();

        CustomList adapter = new CustomList(Selection.this, web, imageId);
        ListView lw=(ListView)findViewById(R.id.listView);
        lw.setAdapter(adapter);

        ImageButton b5=(ImageButton)findViewById(R.id.imageButton4);
        TextView t12=(TextView)findViewById(R.id.textView12);
        //Typeface font_style = Typeface.createFromAsset(getAssets(), "good-times.regular.ttf");
        //b5.setTypeface(font_style);
        //t12.setTypeface(font_style);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Selection.this,MainPage.class);
                Selection.this.startActivity(i);
            }
        });
    }
}

