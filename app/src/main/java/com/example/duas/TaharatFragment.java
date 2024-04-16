package com.example.duas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duas.Adapter.TaharatAdapter;
import com.example.duas.Model.TaharatModel;

import java.util.ArrayList;

public class TaharatFragment extends Fragment {
ArrayList<TaharatModel> list;
    public TaharatFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_taharat, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        getActivity().setTitle("Taharat");
        list = new ArrayList<>();
        list.add(new TaharatModel(1,"وضو سے پہلے کی دعا","بِسْمِ اللّٰہِ وَلْحَمْدُ لِلّٰہِ","اللہ عزوجل کے نام سے شروع جو بڑا مہربان اور نہایت رحم والا ہے۔"));
        list.add(new TaharatModel(2,"وضو کے درمیان پڑھنے کی دعا","اَللّٰهُمَّ اغْفِرْ لِي ذَنْبِي وَوَسِّعْ لِي فِي دَارِي وَبَارِكْ لِي فِي رِزْقِي","اے اللہ عزوجل مجھے بخش دے اور میرے گھر میں برکت و شادگی دے اور میرے گھر روزی میں برکت عطا فرما۔"));
        TaharatAdapter adapter = new TaharatAdapter(list);
        recyclerView.setAdapter(adapter);
        return view;
    }
}