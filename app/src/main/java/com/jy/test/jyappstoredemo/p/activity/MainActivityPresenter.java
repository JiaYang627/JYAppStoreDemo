package com.jy.test.jyappstoredemo.p.activity;

import com.jy.test.jyappstoredemo.m.rxhelper.ErrorListener;
import com.jy.test.jyappstoredemo.m.service.AppStoreService;
import com.jy.test.jyappstoredemo.p.base.BasePresenter;
import com.jy.test.jyappstoredemo.v.iview.ImainActivityView;

import javax.inject.Inject;

/**
 * @author ： 张 奎
 * @date ：  2018-03-14 11:52
 * 邮  箱  ： JiaYang627@163.com
 */

public class MainActivityPresenter extends BasePresenter<ImainActivityView> {

    private final AppStoreService mAppStoreService;

    @Inject
    public MainActivityPresenter(ErrorListener errorListener , AppStoreService appStoreService) {
        super(errorListener);
        mAppStoreService = appStoreService;
    }
}
