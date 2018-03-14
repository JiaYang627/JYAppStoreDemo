package com.jy.test.jyappstoredemo;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.jy.test.jyappstoredemo.m.component.ApiComponent;
import com.jy.test.jyappstoredemo.p.activity.MainActivityPresenter;
import com.jy.test.jyappstoredemo.v.base.BaseActivity;
import com.jy.test.jyappstoredemo.v.iview.ImainActivityView;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainActivityPresenter> implements ImainActivityView {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tabs)
    TabLayout mTabs;
    @BindView(R.id.app_bar)
    AppBarLayout mAppBar;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    @BindView(R.id.mainNavView)
    NavigationView mMainNavView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void inject(ApiComponent apiComponent) {
        apiComponent.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {

        setSupportActionBar(mToolbar);

    }
}
