package com.example.myapplication;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Apinterface {

    @GET("api/?inc=picture,name&results=100")
    Call<UsersResponse> getSingleUser();

}