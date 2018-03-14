package com.jy.test.jyappstoredemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.jy.test.jyappstoredemo.m.component.ApiComponent;
import com.jy.test.jyappstoredemo.p.activity.MainActivityPresenter;
import com.jy.test.jyappstoredemo.utils.FragmentFactoryUtils;
import com.jy.test.jyappstoredemo.v.adapter.ViewPagerAdapter;
import com.jy.test.jyappstoredemo.v.base.BaseActivity;
import com.jy.test.jyappstoredemo.v.iview.ImainActivityView;

import java.util.Arrays;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainActivityPresenter> implements ImainActivityView, NavigationView.OnNavigationItemSelectedListener {

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
    @BindView(R.id.mainDrawerLayout)
    DrawerLayout mMainDrawerLayout;

    private String[] mStrings = new String[]{"首页", "应用"};

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
        // 将ToolBar 与 DrawerLayout 整合
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mMainDrawerLayout, mToolbar, R.string.open, R.string.close);
        drawerToggle.syncState();

        // 菜单滑动过程中，ToolBar 左侧图标动画变化
        mMainDrawerLayout.addDrawerListener(drawerToggle);
        // 侧滑菜单中 menu 条目点击监听
        mMainNavView.setNavigationItemSelectedListener(this);

        ViewPagerAdapter fragmentAdapter = new ViewPagerAdapter(getSupportFragmentManager(), Arrays.asList(mStrings), FragmentFactoryUtils.getFragmentList(mStrings));
        mViewpager.setOffscreenPageLimit(mStrings.length - 1);
        //给ViewPager设置适配器
        mViewpager.setAdapter(fragmentAdapter);
        //将TabLayout和ViewPager关联起来。
        mTabs.setupWithViewPager(mViewpager);
        //给TabLayout设置适配器
        mTabs.setTabsFromPagerAdapter(fragmentAdapter);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        item.setChecked(true);
        mMainDrawerLayout.closeDrawers();
        return false;

    }
}
