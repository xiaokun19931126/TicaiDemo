package com.xiaokun.myapplication;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by 肖坤 on 2018/3/28.
 *
 * @author 肖坤
 * @date 2018/3/28
 */

public interface ApiService
{
    @GET("get_proportion?i_format=json&pool[]=had&pool[]=hhad&i_callback=getReferData1&_=1522241995754")
    Observable<String> getProEntity();
}
