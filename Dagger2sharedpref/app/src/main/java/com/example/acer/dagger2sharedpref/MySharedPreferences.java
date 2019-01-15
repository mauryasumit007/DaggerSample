package com.example.acer.dagger2sharedpref;

import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by ACER on 7/19/2018.
 */

public class MySharedPreferences {
    private SharedPreferences mSharedPreferences;

    @Inject
    public MySharedPreferences(SharedPreferences mSharedPreferences) {
        this.mSharedPreferences = mSharedPreferences;
    }

    public void putData(String key, String data) {
        mSharedPreferences.edit().putString(key,data).apply();
    }

    public String getData(String key) {
        return mSharedPreferences.getString(key,null);
    }
}