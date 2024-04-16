package com.example.duas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duas.Adapter.Hadees1Adapter;
import com.example.duas.Adapter.TaharatAdapter;
import com.example.duas.Model.HadeesModel;

import java.util.ArrayList;

public class HadeesFragment1 extends Fragment {

    ArrayList<HadeesModel> list;
    public HadeesFragment1() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hadees1, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        getActivity().setTitle("Hadees");
        list = new ArrayList<>();
        list.add(new HadeesModel(3,"غُسل کے تین فرائض","۱. کُلّی کرنا   ۲.ناک میں پانی چڑھانا   ۳. تمام ظاہِر بدن پرپانی بہانا۔","(فتاوٰی عالمگیری ج۱ص۱۳)"));
        list.add(new HadeesModel(4,"وضو کے فرائض ۔ ","(1) مند دھونا  (۲) دونوں ہاتھوں کو کہنیوں سمیت دھونا (۳) پوتھائی سرکا سے کرنا(۴ ) دونوں پاؤں ٹخنوں سمیت دھونا۔",""));
        Hadees1Adapter adapter = new Hadees1Adapter(list);
        recyclerView.setAdapter(adapter);
        return view;
    }
}