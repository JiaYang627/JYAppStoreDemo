package com.jy.test.jyappstoredemo.m.component;


import com.jy.test.jyappstoredemo.common.AppStoreDeletage;
import com.jy.test.jyappstoredemo.m.model.AppModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(AppStoreDeletage appStoreDeletage);
}
