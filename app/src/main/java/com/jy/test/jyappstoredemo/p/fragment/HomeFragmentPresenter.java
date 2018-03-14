package com.jy.test.jyappstoredemo.p.fragment;

import com.jy.test.jyappstoredemo.m.rxhelper.ErrorListener;
import com.jy.test.jyappstoredemo.m.service.AppStoreService;
import com.jy.test.jyappstoredemo.p.base.BaseLazyPresenter;
import com.jy.test.jyappstoredemo.utils.LogUtils;
import com.jy.test.jyappstoredemo.v.iview.IhomeFragmentView;

import javax.inject.Inject;

/**
 * @author ： 张 奎
 * @date ：  2018-03-14 17:31
 * 邮  箱  ： JiaYang627@163.com
 */

public class HomeFragmentPresenter extends BaseLazyPresenter<IhomeFragmentView> {

    private final AppStoreService mAppStoreService;

    @Inject
    public HomeFragmentPresenter(ErrorListener errorListener, AppStoreService appStoreService) {
        super(errorListener);
        mAppStoreService = appStoreService;
    }

    @Override
    protected void lazyLoad() {
        LogUtils.e("AppFragmentPresenter");
    }
}
