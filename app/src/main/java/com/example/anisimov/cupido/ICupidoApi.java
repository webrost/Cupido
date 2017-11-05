package com.example.anisimov.cupido;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
/**
 * Created by anisimov on 15.10.2017.
 */

public interface ICupidoApi {
    @POST("/api/location")
    Call<Location> savePosition(@Body Location l);

    @GET("/api/users")
    Call<List<User>> getUsers();
}
