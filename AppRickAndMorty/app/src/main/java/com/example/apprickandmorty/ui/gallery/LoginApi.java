package com.example.apprickandmorty.ui.gallery;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface LoginApi {
    String API_ROUTE="/login";

    @POST(API_ROUTE)
    Call<Login>getElements();
}
