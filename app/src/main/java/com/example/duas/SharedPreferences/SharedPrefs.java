package com.example.duas.SharedPreferences;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs {
    public static void setStatus(Context context, String textSize) {
        SharedPreferences prefs = context.getSharedPreferences("Prefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("SIZE", textSize);
        editor.apply();
    }

    public static String getStatus(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("Prefs", Context.MODE_PRIVATE);
        String textSize = prefs.getString("SIZE","M");
        return textSize;
    }
}