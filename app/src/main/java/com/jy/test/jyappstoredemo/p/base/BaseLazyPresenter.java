package com.jy.test.jyappstoredemo.p.base;


import com.jy.test.jyappstoredemo.m.rxhelper.ErrorListener;
import com.jy.test.jyappstoredemo.v.base.IBaseView;

/**
 * Created by 张 奎 on 2017-09-17 09:21.
 */

public abstract class BaseLazyPresenter<View extends IBaseView> extends BasePresenter<View> {

    protected boolean isPrepared;
    protected boolean allowLoad = true; // 如果需要（重新）加载，这个变量设置为true
    private boolean mBoolean;

    public BaseLazyPresenter(ErrorListener errorListener) {
        super(errorListener);
    }

    @Override
    public void onTakeView() {
        super.onTakeView();
        isPrepared = true;
        preLazyLoad();
    }

    public void preLazyLoad() {
        if (!isPrepared || !mBoolean) {
            return;
        }
        if (!allowLoad) {
            return;
        }
        allowLoad = false;
        lazyLoad();
    }

    protected abstract void lazyLoad();

    public void setVisible(boolean isVisible) {
        mBoolean = isVisible;
    }
}
