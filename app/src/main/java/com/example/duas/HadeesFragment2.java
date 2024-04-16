package com.example.duas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duas.Adapter.Hadees2Adapter;
import com.example.duas.Adapter.MosqueDuaAdapter;
import com.example.duas.Model.HadeesModel;

import java.util.ArrayList;


public class HadeesFragment2 extends Fragment {
    ArrayList<HadeesModel> list;
    public HadeesFragment2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hadees2, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        getActivity().setTitle("Adab-e-Masjid");
        list = new ArrayList<>();
        list.add(new HadeesModel(1,"Masjid Aur Namaz Ki Jagahain","","پھر جہاں بھی تمہاری نماز کا وقت ہو جائے ، اسے پڑھ لو ، بلاشبہ وہی جگہ مسجد ہے (Sahih Muslim 1161) "));
        list.add(new HadeesModel(2,"Masjid Aur Namaz Ki Jagahain"," "," (Sahih Muslim 1163) رسول اللہﷺ نے فرمایا : ’’ مجھے پانچ چیزیں عطا کی گئی ہیں جو مجھ سے پہلے کسی کو نہیں دی گئیں : ہر نبی خاص اپنی قوم ہی کی طرف بھیجا جاتا تھا اور مجھے ہر سرخ وسیاہ کی طرف بھیجا گیا ، میرے لیے اموال غنیمت حلال قرار دیے گئے ، مجھ سے پہلے وہ کسی کے لیے حلال نہیں کیے گئے ۔ میرے لیے زمین کو پاک کرنے والی اور سجدہ گاہ بنایا گیا ، لہٰذا جس شخص کے لیے نماز کا وقت ہو جائے وہ جہاں بھی ہو ، وہیں نماز پڑھ لے ، اور مہینہ بھر کی مسافت سے دشمنوں پر طاری ہو جانے والے رعب سے میری نصرت کی گئی اور مجھے شفاعت ( کا منصب ) عطا کیا گیا"));
        Hadees2Adapter adapter = new Hadees2Adapter(list);
        recyclerView.setAdapter(adapter);
        return view;
    }
}