package com.jy.test.jyappstoredemo.v.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * @author ： 张 奎
 * @date ：  2018-03-14 17:19
 * 邮  箱  ： JiaYang627@163.com
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> mFragments;
    private final List<String> mTitles;

    public ViewPagerAdapter(FragmentManager fm , List<String> titles , List<Fragment> fragments) {
        super(fm);
        mFragments = fragments;
        mTitles = titles;

    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
