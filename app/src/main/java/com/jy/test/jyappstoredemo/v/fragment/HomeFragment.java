package com.jy.test.jyappstoredemo.v.fragment;

import com.jy.test.jyappstoredemo.m.component.ApiComponent;
import com.jy.test.jyappstoredemo.p.fragment.HomeFragmentPresenter;
import com.jy.test.jyappstoredemo.v.base.BaseLazyFragment;
import com.jy.test.jyappstoredemo.v.iview.IhomeFragmentView;

/**
 * @author ： 张 奎
 * @date ：  2018-03-14 17:30
 * 邮  箱  ： JiaYang627@163.com
 */

public class HomeFragment extends BaseLazyFragment<HomeFragmentPresenter> implements IhomeFragmentView {
    @Override
    protected void inject(ApiComponent apiComponent) {
        apiComponent.inject(this);
    }
}
