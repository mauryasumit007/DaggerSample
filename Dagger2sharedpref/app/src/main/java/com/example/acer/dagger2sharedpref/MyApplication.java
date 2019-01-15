package com.example.acer.dagger2sharedpref;

import android.app.Application;

/**
 * Created by ACER on 7/19/2018.
 */

public class MyApplication extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        myComponent = DaggerMyComponent.builder()
                .sharedPreferencesModule(new SharedPrefModule(getApplicationContext()))
                .build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}