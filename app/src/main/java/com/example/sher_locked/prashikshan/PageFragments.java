package com.example.sher_locked.prashikshan;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PageFragments extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;
    private static int page;

    public static PageFragments newInstance(int page) {
        PageFragments.page=page;
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragments fragment = new PageFragments();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;

        //View view = inflater.inflate(R.layout.fragments_page, container, false);
        if(mPage==0){
            view = inflater.inflate(R.layout.fragments_page, container, false);
            TextView textView = (TextView) view;
            textView.setText("Sameer");
            System.out.println(page);
        }
        else if(mPage==1){
            view = inflater.inflate(R.layout.fragments_page1, container, false);
            //TextView textView = (TextView) view;
            //textView.setText("Deepak");
            ImageView iv=(ImageView) view;
            System.out.println(page);
        }
        else{
            view = inflater.inflate(R.layout.fragments_page2, container, false);
            //TextView textView = (TextView) view;
            //textView.setText("Ojaswi");
            Button b=(Button)view;
            System.out.println(page);
        }
        return view;
    }
}
