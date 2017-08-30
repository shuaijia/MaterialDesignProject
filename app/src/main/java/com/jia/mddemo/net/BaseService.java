package com.jia.mddemo.net;


import com.jia.mddemo.domain.Picture;
import com.jia.mddemo.domain.Sports;
import com.jia.mddemo.domain.Tuijian;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Describtion:
 * Created by jia on 2017/6/6.
 * 人之所以能，是相信能
 */
public interface BaseService {

//    @POST("mobile/login_mobileLogin.action")
//    Call<ZQLogin> login(@Query("loginId") String username, @Query("passwd") String password);
//
//    @POST("mobile/login_mobileLogin.action")
//    Observable<ZQLogin> loginWithRxjava(@Query("loginId") String username, @Query("passwd") String password);
//
//    @POST("/usesql/noLoginuserdef/newUserDefined_getBySql.action?queryId=AppHotMain&page.pageSize=4&page.curPage=1&data=info&page.searchItem.showSql=true")
//    Observable<ZQRemen> getRemenData();
//
//    @POST("/usesql/noLoginuserdef/newUserDefined_getBySql.action?queryId=siku&page.pageSize=5&page.curPage=1&data=info&page.searchItem.showSql=true")
//    Observable<HttpResult<ZQBanner>> getBannerData();
//
//    @POST("/usesql/noLoginuserdef/newUserDefined_getBySql.action?queryId=appZhibo&page.pageSize=10&page.curPage=1&data=info&page.searchItem.showSql=true")
//    Observable<HttpResult<ZQLive>> getLive();
//
//    @POST("mobile/login_mobileLogin.action")
//    Observable<HttpResult<List<ZQLoginNew>>> loginNew(@Query("loginId") String username, @Query("passwd") String password);
//
//    @POST("/entity/mobile/newUserDefined_getBySql.action?queryId=AppCommend&page.pageSize=4&page.curPage=1&data=info&page.searchItem.showSql=true")
//    Observable<HttpResult<ZQTuijian>> getTuijian();

    @POST("huabian")
    Observable<Tuijian> getTuijian(@Query("key") String key,@Query("num") String num);

    @POST("tiyu")
    Observable<Sports> getSports(@Query("key") String key, @Query("num") String num);

    @POST("meinv")
    Observable<Picture> getPicture(@Query("key") String key, @Query("num") String num);
}
