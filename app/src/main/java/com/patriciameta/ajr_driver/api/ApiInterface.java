package com.patriciameta.ajr_driver.api;

import com.patriciameta.ajr_driver.models.TransaksiResponse;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiInterface {

    //Customer
//    @Headers({"Accept: application/json"})
//    @GET("customer")
//    Call<PromoResponse> getAllPromo();
//    @Headers({"Accept: application/json"})
//    @GET("customer/{id}")
//    Call<PromoResponse> getPromoById(@Path("id") long id);
//    @Headers({"Accept: application/json"})
//    @DELETE("customer/{id}")
//    Call<PromoResponse> deleteMPromo(@Path("id") long id);
    //transaksi
    @Headers({"Accept: application/json"})
    @GET("transaksi")
    Call<TransaksiResponse> getAllTransaksi();
    @Headers({"Accept: application/json"})
    @GET("transaksiHistory")
    Call<TransaksiResponse> gethistory();
    @Headers({"Accept: application/json"})
    @GET("transaksiHistoryDrv")
    Call<TransaksiResponse> gethistoryDrv();
    @Headers({"Accept: application/json"})
    @GET("transaksiMobil")
    Call<TransaksiResponse> getIncomeMobil();
    @Headers({"Accept: application/json"})
    @GET("transaksiCust")
    Call<TransaksiResponse> getIncomeCust();
    @Headers({"Accept: application/json"})
    @GET("transaksiTop5Driver")
    Call<TransaksiResponse> getTop5Driver();
    @Headers({"Accept: application/json"})
    @GET("transaksiTop5Cust")
    Call<TransaksiResponse> getTop5Cust();
    @Headers({"Accept: application/json"})
    @GET("transaksi/{id}")
    Call<TransaksiResponse> getTransaksiById(@Path("id") long id);
    @Headers({"Accept: application/json"})
    @DELETE("transaksi/{id}")
    Call<TransaksiResponse> deleteTransaksi(@Path("id") long id);
}
