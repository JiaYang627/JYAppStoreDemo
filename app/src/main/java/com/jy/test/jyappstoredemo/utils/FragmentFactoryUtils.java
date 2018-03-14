package com.jy.test.jyappstoredemo.utils;

import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.jy.test.jyappstoredemo.v.fragment.AppFragment;
import com.jy.test.jyappstoredemo.v.fragment.HomeFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ： 张 奎
 * @date ：  2018-03-14 17:25
 * 邮  箱  ： JiaYang627@163.com
 */

public class FragmentFactoryUtils {

    public static List<Fragment> getFragmentList(String[] titles) {
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0 ; i < titles.length ; i ++) {
            if (TextUtils.equals(String.valueOf(i), "0")) {

                fragments.add(new HomeFragment());
            } else if (TextUtils.equals(String.valueOf(i), "1")) {
                fragments.add(new AppFragment());
            }
        }
        return fragments;
    }
}
