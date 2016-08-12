package com.example.sher_locked.prashikshan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

public class SearchList extends ListFragment {

/*
    private final Activity context;
    private final String[] topic;
    private final String[] subtopic;
    private final String[] name;
    public SearchList(Activity context,
                      String[] topic, String[] subtopic, String[] name) {
        super(context, R.layout.search_list, topic);
        this.context = context;
        this.topic = topic;
        this.subtopic = subtopic;
        this.name=name;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        */
/*LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);*//*

        View v= LayoutInflater.from(context).inflate(R.layout.search_list,null);
        TextView tv23=(TextView)v.findViewById(R.id.textView23);
        TextView tv24=(TextView)v.findViewById(R.id.textView24);
        TextView tv25=(TextView)v.findViewById(R.id.textView25);
        tv23.setText(topic[position]);
        tv24.setText(subtopic[position]);
        tv25.setText(name[position]);
        return v;
    }
}
*/
    String[] topic = new String[]{
        "JAVA",
        "DOTNET",
        "PYTHON"
    } ;
    String[] subtopic = new String[]{
            "Assignment 1",
            "Assignment 2",
            "Assignment 3"
    } ;
    String[] name = new String[]{
            "Mr Anil",
            "Mrs Neeta",
            "Mrs Seema"
    } ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Each row in the list stores country name, currency and flag
        List<HashMap<String, String>> aList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            HashMap<String, String> hm = new HashMap<>();
            hm.put("tpc", "Topic : " + topic[i]);
            hm.put("sbt", "Subtopic : " + subtopic[i]);
            hm.put("name", "Name : " + name[i]);
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = {"name", "tpc", "sbt"};

        // Ids of views in listview_layout
        int[] to = {R.id.name, R.id.tpc, R.id.sbt};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.search_list, from, to);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}


