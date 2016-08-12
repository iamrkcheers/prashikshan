package com.example.sher_locked.prashikshan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public CustomList(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.custom_list, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        /*LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);*/
        View v=LayoutInflater.from(context).inflate(R.layout.custom_list,null);
        ImageButton ib=(ImageButton)v.findViewById(R.id.imageButton2);
        TextView tv=(TextView)v.findViewById(R.id.textView11);
        tv.setText(web[position]);
        ib.setImageResource(imageId[position]);
        return v;
    }
}
