package com.jy.test.jyappstoredemo.m.model;


import com.jy.test.jyappstoredemo.m.service.AppStoreService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.fastjson.FastJsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
@Module(includes = {AppModule.class ,ClientModule.class})
public class ApiModule {


    @Singleton
    @Provides
    Retrofit.Builder provideRetrofitBuilder(){
        return new Retrofit.Builder();
    }


    @Singleton
    @Provides
    public AppStoreService provideGoodsModel(Retrofit.Builder builder, OkHttpClient client) {
        return createRetrofit(builder , AppStoreService.BASE_URL ,client).create(AppStoreService.class);
    }

    private Retrofit createRetrofit(Retrofit.Builder builder, String baseUrl, OkHttpClient client){
        builder.client(client)
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(FastJsonConverterFactory.create());
        return builder.build();
    }
}
