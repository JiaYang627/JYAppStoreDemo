package com.jy.test.jyappstoredemo.common;

import android.app.Application;

import com.jy.test.jyappstoredemo.BuildConfig;
import com.jy.test.jyappstoredemo.m.component.ApiComponent;
import com.jy.test.jyappstoredemo.m.component.DaggerApiComponent;
import com.jy.test.jyappstoredemo.m.model.ApiModule;
import com.jy.test.jyappstoredemo.m.model.AppModule;
import com.jy.test.jyappstoredemo.utils.LogUtils;
import com.jy.test.jyappstoredemo.utils.PreferenceTool;
import com.jy.test.jyappstoredemo.utils.ToastUtils;

/**
 * @author ： 张 奎
 * @date ：  2018-03-14 11:23
 * 邮  箱  ： JiaYang627@163.com
 */

public class AppStoreDeletage {

    private Application mApplication;
    private ApiComponent appComponent;
    private ApiComponent apiComponent;

    public AppStoreDeletage(Application application) {
        mApplication = application;
    }

    public void onCreate() {
        initLogs();                          //Log日志
        PreferenceTool.init(mApplication);   //Preference参数
        ToastUtils.init(mApplication);       //吐司初始化
        initInject();
    }

    private void initLogs() {
        LogUtils.setLogEnable(BuildConfig.DEBUG);
    }

    private void initInject() {
        appComponent = DaggerApiComponent.builder()
                .appModule(getAppModule())
                .build();


        apiComponent = DaggerApiComponent.builder()
                .apiModule(new ApiModule())
                .appModule(getAppModule())
                .build();
    }
    private AppModule getAppModule() {
        return new AppModule(mApplication);
    }

    public ApiComponent getApiComponent(){
        return apiComponent;
    }

    public void onTerminate() {
        this.appComponent = null;
        this.apiComponent = null;
    }
}
