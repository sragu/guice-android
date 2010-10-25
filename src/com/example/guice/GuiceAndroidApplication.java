package com.example.guice;

import com.example.core.GuiceBindingsModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by IntelliJ IDEA.
 * Date: Oct 24, 2010
 * Time: 1:38:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class GuiceAndroidApplication extends android.app.Application{
    private Injector injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = Guice.createInjector(new GuiceBindingsModule());
    }

    public Injector getInjector() {
        return injector;
    }
}
