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

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();
        ImageButton b4=(ImageButton)findViewById(R.id.imageButton3);
        //Typeface tf = Typeface.createFromAsset(getAssets(), "good-times.regular.ttf");
        //b4.setTypeface(tf);
        EditText writeusnm=(EditText)findViewById(R.id.editText8);
        writeusnm.setInputType(InputType.TYPE_CLASS_TEXT);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUp.this, Selection.class);
                SignUp.this.startActivity(i);
            }
        });
        final CheckBox cb1=(CheckBox)findViewById(R.id.checkBox2);
        final CheckBox cb2=(CheckBox)findViewById(R.id.checkBox3);
        final EditText writepswd=(EditText)findViewById(R.id.editText11);
        final EditText writepswda=(EditText)findViewById(R.id.editText10);
        TextView t3=(TextView)findViewById(R.id.textView3);
        TextView t4=(TextView)findViewById(R.id.textView4);
        TextView t5=(TextView)findViewById(R.id.textView5);
        TextView t6=(TextView)findViewById(R.id.textView6);
        TextView t7=(TextView)findViewById(R.id.textView7);
        TextView t8=(TextView)findViewById(R.id.textView8);
        TextView t9=(TextView)findViewById(R.id.textView9);
        TextView t10=(TextView)findViewById(R.id.textView10);
        Typeface tf=Typeface.createFromAsset(getAssets(), "neuropol-x-free.regular.ttf");
        t3.setTypeface(tf);
        t4.setTypeface(tf);
        t5.setTypeface(tf);
        t6.setTypeface(tf);
        t7.setTypeface(tf);
        t8.setTypeface(tf);
        t9.setTypeface(tf);
        t10.setTypeface(tf);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb1.isChecked()) {
                    writepswd.setTransformationMethod(null);
                } else {
                    writepswd.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb2.isChecked()) {
                    writepswda.setTransformationMethod(null);
                } else {
                    writepswda.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
    }
}
