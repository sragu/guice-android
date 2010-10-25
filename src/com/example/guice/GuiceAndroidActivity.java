package com.example.guice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * Date: Oct 24, 2010
 * Time: 2:05:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class GuiceAndroidActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((GuiceAndroidApplication) getApplication()).getInjector().injectMembers(this);
    }
}
