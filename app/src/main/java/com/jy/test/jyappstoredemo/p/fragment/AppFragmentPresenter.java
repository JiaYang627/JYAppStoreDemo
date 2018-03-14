package com.jy.test.jyappstoredemo.p.fragment;

import com.jy.test.jyappstoredemo.m.rxhelper.ErrorListener;
import com.jy.test.jyappstoredemo.p.base.BaseLazyPresenter;
import com.jy.test.jyappstoredemo.utils.LogUtils;
import com.jy.test.jyappstoredemo.v.iview.IappFragmentView;

import javax.inject.Inject;

/**
 * @author ： 张 奎
 * @date ：  2018-03-14 17:35
 * 邮  箱  ： JiaYang627@163.com
 */

public class AppFragmentPresenter extends BaseLazyPresenter<IappFragmentView> {

    @Inject
    public AppFragmentPresenter(ErrorListener errorListener) {
        super(errorListener);
    }

    @Override
    protected void lazyLoad() {

        LogUtils.e("AppFragmentPresenter");
    }
}
