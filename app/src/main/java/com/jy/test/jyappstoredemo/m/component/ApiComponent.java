package com.jy.test.jyappstoredemo.m.component;


import com.jy.test.jyappstoredemo.MainActivity;
import com.jy.test.jyappstoredemo.m.model.ApiModule;
import com.jy.test.jyappstoredemo.v.fragment.AppFragment;
import com.jy.test.jyappstoredemo.v.fragment.HomeFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(MainActivity mainActivity);

    void inject(HomeFragment homeFragment);

    void inject(AppFragment appFragment);
}
