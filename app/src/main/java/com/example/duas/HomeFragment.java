package com.example.duas;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class HomeFragment extends Fragment {
    FoodFragment foodFragment;
    DailyActivitiesFragment dailyActivitiesFragment;
    TaharatFragment taharatFragment;
    MosqueFragment mosqueFragment;

    CardView foodAndDrink,dailyActivities,adabEMasjid,taharat,hadees1,hadees2,changeFont,theme;
    LinearLayout linearLayoutLeft,linearLayoutRight;

    public HomeFragment() { FragmentManager fragmentManager;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        linearLayoutLeft = view.findViewById(R.id.linear_layout_left);
        linearLayoutRight = view.findViewById(R.id.linear_layout_right);
        foodAndDrink = view.findViewById(R.id.food_and_drink);
        dailyActivities = view.findViewById(R.id.daily_activities);
        adabEMasjid = view.findViewById(R.id.adab_e_masjid);
        taharat = view.findViewById(R.id.taharat);
        hadees1=view.findViewById(R.id.hadees1);
        hadees2 = view.findViewById(R.id.hadees2);
        changeFont = view.findViewById(R.id.change_font);
        theme = view.findViewById(R.id.theme);

        linearLayoutLeft.startAnimation(AnimationUtils.loadAnimation(getActivity(),R.anim.slide_to_right));
        linearLayoutRight.startAnimation(AnimationUtils.loadAnimation(getActivity(),R.anim.slide_to_left));

        foodAndDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foodFragment = new FoodFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,foodFragment).addToBackStack(null).commit();
            }
        });

        dailyActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dailyActivitiesFragment = new DailyActivitiesFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,dailyActivitiesFragment).addToBackStack(null).commit();
            }
        });

        adabEMasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mosqueFragment = new MosqueFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,mosqueFragment).addToBackStack(null).commit();
            }
        });

        taharat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taharatFragment = new TaharatFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,taharatFragment).addToBackStack(null).commit();
            }
        });

        hadees1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              HadeesFragment1 fragment = new HadeesFragment1();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit();
            }
        });

        hadees2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             HadeesFragment2 fragment = new HadeesFragment2();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit();
            }
        });

        theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        changeFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FontDialogPicker fragment = new FontDialogPicker();
                fragment.show(getActivity().getSupportFragmentManager(),"Option dialog");
            }
        });

        return view;
    }
}
