package com.example.apprickandmorty.ui.slideshow;

import com.example.apprickandmorty.ui.gallery.Login;

import retrofit2.Call;
import retrofit2.http.POST;

public interface RegisterApi {
    String API_ROUTE="/registro";

    @POST(API_ROUTE)
    Call<Register> getElements();
}
