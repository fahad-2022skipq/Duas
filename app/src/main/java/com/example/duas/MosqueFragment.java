package com.example.duas;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duas.Adapter.MosqueDuaAdapter;
import com.example.duas.Model.MosqueModel;

import java.util.ArrayList;

public class MosqueFragment extends Fragment {
  ArrayList<MosqueModel> list;
    public MosqueFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_mosque, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        getActivity().setTitle("Adab-e-Masjid");
        list = new ArrayList<>();
        list.add(new MosqueModel(1,"مسجد میں داخل ہونے کی دعا","اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِکَ.","اے اللہ! میرے لیے رحمت کے دروازے کھول دے۔"));
        list.add(new MosqueModel(2,"مسجد سے نکلنے کی دعا","اَللّٰهُمَّ اِنِّيْ اَسْاَلُکَ مِنْ فَضْلِکَ وَرَحْمَتِکَ","اے اللہ! میں تجھ سے تیرا فضل اور تیری رحمت مانگتا ہوں۔"));
        MosqueDuaAdapter adapter = new MosqueDuaAdapter(list);
        recyclerView.setAdapter(adapter);
        return view;
    }
}