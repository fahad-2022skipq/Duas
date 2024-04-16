package com.example.duas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.duas.SharedPreferences.SharedPrefs;

public class ChangeFontFragment extends Fragment {

    TextView textView;

    public ChangeFontFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_setttings, container, false);
        textView = view.findViewById(R.id.text_size);
        if(SharedPrefs.getStatus(view.getContext()).equals("S")){
            textView.setText("S");
        }
        if(SharedPrefs.getStatus(view.getContext()).equals("M")){
            textView.setText("M");
        }
        if(SharedPrefs.getStatus(view.getContext()).equals("L")){
            textView.setText("L");
        }
        return view;
    }
}