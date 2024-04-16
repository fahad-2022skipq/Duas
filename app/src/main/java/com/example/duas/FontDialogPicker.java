package com.example.duas;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.duas.SharedPreferences.SharedPrefs;


public class FontDialogPicker extends DialogFragment {
    RadioButton sBtn,mBtn,lBtn;
    RadioGroup option;

    public FontDialogPicker() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_d, container, false);

        sBtn = view.findViewById(R.id.small_btn);
        mBtn = view.findViewById(R.id.medium_btn);
        lBtn = view.findViewById(R.id.large_btn);
        option = view.findViewById(R.id.radio_group);

        if(SharedPrefs.getStatus(getActivity()).equals("S")){
           sBtn.setChecked(true);
        }
        else if(SharedPrefs.getStatus(getActivity()).equals("M")){
            mBtn.setChecked(true);
        }
        else if(SharedPrefs.getStatus(getActivity()).equals("L")){
            lBtn.setChecked(true);
        }

        sBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPrefs.setStatus(view.getContext(),"S");
                Toast.makeText(view.getContext(), "Text size changed to small", Toast.LENGTH_SHORT).show();
                dismiss();

            }
        });
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPrefs.setStatus(view.getContext(),"M");
                Toast.makeText(view.getContext(), "Text size changed to medium", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });
        lBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPrefs.setStatus(view.getContext(),"L");
                Toast.makeText(view.getContext(), "Text size changed to large", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        return  view;
    }
}