package com.example.sher_locked.prashikshan;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        TextView usrn=(TextView)findViewById(R.id.textView);
        TextView pswd=(TextView)findViewById(R.id.textView2);
        final EditText fillpswd=(EditText)findViewById(R.id.editText2);
        final EditText fillusrn=(EditText)findViewById(R.id.editText);
        final CheckBox cb=(CheckBox)findViewById(R.id.checkBox);
        //Button b4=(Button)findViewById(R.id.button4);
        Typeface tf=Typeface.createFromAsset(getAssets(), "neuropol-x-free.regular.ttf");
        usrn.setTypeface(tf);
        pswd.setTypeface(tf);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb.isChecked()) {
                    fillpswd.setTransformationMethod(null);
                } else {
                    fillpswd.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
        fillusrn.setInputType(InputType.TYPE_CLASS_TEXT);
        ImageButton im=(ImageButton)findViewById(R.id.imageButton);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SignIn.this,MainPage.class);
                SignIn.this.startActivity(i);
            }
        });
        getSupportActionBar().hide();
        //Typeface font_style = Typeface.createFromAsset(getAssets(), "Galberik.otf");
        //b4.setTypeface(font_style);
    }
}
