package com.example.duas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duas.Adapter.DailyActivitiesAdapter;
import com.example.duas.Model.DailyActivitiesModel;

import java.util.ArrayList;

public class DailyActivitiesFragment extends Fragment {

    ArrayList<DailyActivitiesModel> list = new ArrayList<>();
    public DailyActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_daily_activities, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        getActivity().setTitle("Daily Activities");
        list.add(new DailyActivitiesModel(1,"گھر میں داخل ہوتے وقت کی دعا","اَللّٰھُمَّ اِنِّیْ اَسْئَلُكَ خَیْرَالْمَوْلَجِ وَخَیْرَالْمَخْرَجِ","اے اللہ عَزَّ وَجَلَّ ! میں تجھ سے داخل ہونے اور نکلنے کی جگہوں کی بھلائی طلب کرتا ہوں ۔"));
        list.add(new DailyActivitiesModel(2,"گھر سے نکلتے وقت کی دعا","بِسْمِ اللّٰہِ تَوَكَّلْتُ عَلَى اللّٰہِ وَلَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللّٰہِ","اللہ عزوجل کے نام سے (گھر سے نکلتا ہوں) میں نے اللہ عزوجل پر بھروسہ کیا اللہ عزوجل کے بغیر نہ طاقت ہے (گناہوں سے بچنےکی) اور نہ وقت ہے (نیکیاں کرنے کی)۔"));
        list.add(new DailyActivitiesModel(3,"ملاقات کے وقت کی دعا","اَلسَّلَامُ عَلَيْكُمُ","تم پر سلامتی ہو"));
        list.add(new DailyActivitiesModel(4,"لباس پہنتے وقت کی دعا","الْحَمْدُ لِلَّهِ الَّذِي كَسَانِي هَذَا وَرَزَقَنِيهِ مِنْ غَيْرِ حَوْلٍ مِنِّي وَلَا قُوَّةٍ","تمام خوبیاں اللہ عزوجل کے لئے جس نے مجھ کو یہ کپڑا پہنایا اور میری قوت و طاقت کے بغیر مجھ کو عطا فرمایا۔"));
        list.add(new DailyActivitiesModel(5,"کسی مسلمان کو ہنستا دیکھ کر پڑھنے کی دعا","أَضْحَكَ اللّٰہُ سِنَّكَ","اللہ عزوجل تجھے ہنستا رکھے۔"));
        list.add(new DailyActivitiesModel(6,"بیت الخلاء میں داخل ہونے سے پہلے کی دعا","اَللّٰھُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ","اے اللہ عزوجل میں ناپاک جنوں (نرو مادہ) سے تیری پناہ مانگتا ہوں۔"));
        list.add(new DailyActivitiesModel(7,"بیت الخلاء سے باہر آنے کے بعد کی دعا","اَلْحَمْدُ لِلّٰہِ الَّذِي أَذْهَبَ عَنِّي الْأَذَى وَعَافَانِي","اللہ عزوجل کا شکر ہے جس نے مجھ سے اذیت دور کی اور مجھے عافیت دی۔"));
        list.add(new DailyActivitiesModel(8,"سوتے وقت کی دعا","اَللّٰھُمَّ بِاسْمِكَ أَمُوتُ وَأَحْيَا","الٰہی عزوجل میں تیرے نام پر مرتا ہوں اور جیتا ہوں۔"));
        list.add(new DailyActivitiesModel(9,"نیند سے بیدار ہونے کی دعا","الْحَمْدُ لِلّٰہِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ","تمام تعریفیں اللہ عزوجل کے لئے جس نے ہمیں موت (نیند) کے بعد حیات (بیداری) عطا فرمائی اور ہمیں اسی طرف لوٹنا ہے۔"));
        list.add(new DailyActivitiesModel(10,"آئنہ دیکھتے وقت کی دعا","اَللّٰهُمَّ أَنْتَ حَسَّنْتَ خَلْقِي فَحَسِّنْ خُلُقِي","اللہ عزوجل تو نے میری صورت اچھی بنائی تو میری سیرت (اخلاق) بھی اچھی کردے۔"));
        list.add(new DailyActivitiesModel(11,"مصیبت ذدہ کو دیکھتے وقت کی دعا","اَلْحَمْدُ لِلّٰہِ الَّذِي عَافَانِي مِمَّا ابْتَلَاكَ بِهٖ وَفَضَّلَنِي عَلٰی كَثِيرِ مِمَّنْ خَلَقَ تَفْضِيلَاً","اللہ عزوجل کا شکر ہے جس نے مجھے اس مصیبت سے عافیت دی، جس میں تجھے مبتلا کیا، اور مجھے اپنی بہت سی مخلوق پر فضیلت دی۔"));
        list.add(new DailyActivitiesModel(12,"نیا عمامہ یا نئی چادر پہنتے وقت کی دعا","اَللّٰهُمَّ لَكَ الْحَمْدُ كَمَا كَسَوْتَنِيهِ أَسْأَلُكَ خَيْرَهٗ وَخَيْرَ مَا صُنِعَ لَهٗ وَأَعُوذُ مِنْ شَرِّهٖ وَشَرِّ مَا صُنِعَ لَهٗ","یا للہ عزوجل ، تمام تعریفیں تیرے ہی لئے ہیں تو نے ہی مجھے (یہ چادر یا عمامہ) پہنایا ہے اور میں تجھ سے اس کی بھلائی طلب کر تا ہوں اور اس چیز کی بھلائی جس کے لئے یہ بنایا گیا ہے اور میں اس کےشر سے تیری پناہ مانگتا ہوں اور اس چیز کے شر سے بھی جس کے لئے اس کو بنایا گیا۔"));
        DailyActivitiesAdapter adapter = new DailyActivitiesAdapter(list);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
