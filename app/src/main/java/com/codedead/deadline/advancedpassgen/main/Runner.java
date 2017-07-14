package com.codedead.deadline.advancedpassgen.main;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.codedead.deadline.advancedpassgen.domain.LocaleHelper;

public class Runner extends Application{
    @Override
    protected void attachBaseContext(Context base) {
        SharedPreferences sharedPref = base.getSharedPreferences("advancedpassgensettings", Context.MODE_PRIVATE);
        super.attachBaseContext(LocaleHelper.onAttach(base, sharedPref.getString("language", "en")));
    }
}
