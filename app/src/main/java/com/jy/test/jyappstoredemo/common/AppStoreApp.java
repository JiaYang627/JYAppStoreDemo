package com.jy.test.jyappstoredemo.common;

import android.app.Application;

import com.jy.test.jyappstoredemo.m.component.ApiComponent;

/**
 * @author ： 张 奎
 * @date ：  2018-03-14 11:22
 * 邮  箱  ： JiaYang627@163.com
 */

public class AppStoreApp extends Application {

    private AppStoreDeletage mAppStoreDeletage;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppStoreDeletage = new AppStoreDeletage(this);
        mAppStoreDeletage.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        mAppStoreDeletage.onTerminate();
    }
    public ApiComponent getApiComponent(){
        return mAppStoreDeletage.getApiComponent();
    }
}
