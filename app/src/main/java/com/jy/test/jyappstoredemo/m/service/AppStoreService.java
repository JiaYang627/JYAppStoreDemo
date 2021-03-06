package com.jy.test.jyappstoredemo.m.service;



import com.jy.test.jyappstoredemo.m.bean.LocationBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 张 奎 on 2017-09-02 10:51.
 */

public interface AppStoreService {

    //    http://apis.juhe.cn/  //baseurl
    String BASE_URL = "http://apis.juhe.cn/";
    String KEY = "daf8fa858c330b22e342c882bcbac622";
    // mobile/get  //相对url
// ?phone=13812345678&key=daf8fa858c330b22e342c882bcbac622  参数  Query查询参数  拼接参数
    @GET("mobile/get")
    Observable<LocationBean> getLocation(@Query("phone") String phoneNumber, @Query("key") String key);
}
