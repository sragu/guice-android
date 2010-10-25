package com.example.core;

import com.google.inject.AbstractModule;

/**
 * Created by IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: Oct 23, 2010
 * Time: 7:59:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class GuiceBindingsModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(QuoteGenerator.class).to(QuoteGeneratorImpl.class);
    }
}
