package com.example.acer.dagger2sharedpref;

/**
 * Created by ACER on 7/19/2018.
 */

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {SharedPrefModule.class})
public interface MyComponent {
    void inject(MainActivity activity);
}
