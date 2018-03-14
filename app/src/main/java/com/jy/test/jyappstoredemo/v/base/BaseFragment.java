package com.jy.test.jyappstoredemo.v.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jy.test.jyappstoredemo.common.AppStoreApp;
import com.jy.test.jyappstoredemo.m.component.ApiComponent;
import com.jy.test.jyappstoredemo.p.base.BasePresenter;
import com.trello.rxlifecycle2.components.support.RxFragment;

import javax.inject.Inject;

/**
 * Created by 张 奎 on 2017-08-31 16:56.
 */

public abstract class BaseFragment <T extends BasePresenter> extends RxFragment implements IBaseView{

    @Inject
    protected T mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject(((AppStoreApp)getActivity().getApplication()).getApiComponent());
        mPresenter.attachView(this);

        mPresenter.getContext(getActivity());
        mPresenter.getData(getActivity().getIntent());
        mPresenter.getArguments(getArguments());

    }
    protected abstract void inject(ApiComponent apiComponent);

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.onTakeView();
    }
}
