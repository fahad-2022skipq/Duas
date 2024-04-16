package com.example.duas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duas.Adapter.FoodAdapter;
import com.example.duas.Model.FoodModel;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    ArrayList<FoodModel> list = new ArrayList<>();
    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_food, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        getActivity().setTitle("Food and Drink");
        list.add(new FoodModel(1,"کھانے سے پہلے کی دعا","بِسْمِ اللّٰہِ وَعَلٰی بَرَكَةِ اللّٰہِ","میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا"));
        list.add(new FoodModel(2,"کھانے کے بعد کی دعا","الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِينَ","اللہ عزوجل کا شکر ہے جس نے ہمیں کھلایا پلایا اور مسلمانوں میں سے بنایا۔"));
        list.add(new FoodModel(3,"کھانا کھانے سے قبل اگر بسم اللہ پڑھنا بھول جائیں تو یہ دعا پڑھیں","بِسْمِ اللَّهِ أَوَّلِهِ وَآخِرِهِ","اللہ عزوجل کے نام سے اس کے پہلے اور اس کے آخر۔"));
        list.add(new FoodModel(4,"دعوت کھانے کے بعد کی دعا","اَللّٰهُمَّ أَطْعِمْ مَنْ أَطْعَمَنِي وَاسْقِ مَنْ سَقَانِي","یا الٰہی عزوجل اس کو کھلا جس نے مجھے کھلایا اور کو پلا جس نے مجھے پلایا۔"));
        list.add(new FoodModel(5,"دودھ پینے کے بعد کی دعا","اَللّٰهُمَّ بَارِكْ لَنَا فِيهِ وَزِدْنَا مِنْهُ","یا الٰہی عزوجل ہمارے لئے اس میں برکت دے اور ہمیں اس سے زیادہ عنایت فرما۔"));
        list.add(new FoodModel(6,"آب زم زم پیتے وقت کی دعا","اَللّٰهُمَّ إِنِّي أَسْأَلُكَ عِلْماً نَافِعاً وَرِزْقاً وَاسِعاً وَشِفَاءً مِنْ كُلِّ دَاءٍ","الٰہی عزوجل میں تجھ سے علم نافع کا اور رزق کی کشادگی کا اور بیماری سے شفایابی کا سوال کرتا ہوں۔"));
        FoodAdapter foodAdapter = new FoodAdapter(list);
        recyclerView.setAdapter(foodAdapter);
        return view;
    }

}