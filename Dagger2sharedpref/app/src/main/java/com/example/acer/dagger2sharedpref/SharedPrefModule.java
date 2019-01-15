package com.example.acer.dagger2sharedpref;

/**
 * Created by ACER on 7/19/2018.
 */


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class SharedPrefModule {
    private Context context;

    public SharedPrefModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    @Inject
    public Context provideContext() {
        return context;
    }

    @Singleton
    @Provides
    public SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences("PrefName",Context.MODE_PRIVATE);

    }
}
