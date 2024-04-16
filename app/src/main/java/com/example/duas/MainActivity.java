package com.example.duas;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
    HomeFragment homeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolBar = findViewById(R.id.custom_toolbar);
        setSupportActionBar(toolBar);
        toolBar.setTitleTextColor(Color.WHITE);
        homeFragment =new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,homeFragment).commit();
    }

    @Override
    public void onBackPressed() {
        int count = getSupportFragmentManager().getBackStackEntryCount();
        if(count==0) {
                super.onBackPressed();
            }
            else {
                getSupportFragmentManager().popBackStack();
                setTitle("Duas");
            }
        }
}