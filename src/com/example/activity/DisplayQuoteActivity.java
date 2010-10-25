package com.example.activity;

import android.os.Bundle;
import android.widget.TextView;
import com.example.R;
import com.example.core.QuoteGenerator;
import com.example.guice.GuiceAndroidActivity;
import com.google.inject.Inject;

/**
 * Created by IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: Oct 22, 2010
 * Time: 1:14:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class DisplayQuoteActivity extends GuiceAndroidActivity {

    @Inject
    private QuoteGenerator quoteGenerator;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(quoteGenerator.generateQuote());
    }
}
