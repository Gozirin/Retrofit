package com.example.retrofit.restapi;

import com.example.retrofit.response.SignUpResponse;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface ApiInterface {
    //In this step we create an Interface in which we have registration,
    // post request method to send the data using api to our server.

    @FormUrlEncoded // annotation used in POST type requests
    @POST("/retrofit/register.php")     // API's endpoints
    public void registration(@Field("name") String name,
                             @Field("email") String email,
                             @Field("password") String password,
                             @Field("logintype") String logintype,
                             Callback<SignUpResponse> callback);

    // In registration method @Field used to set the keys and String data type is representing
    // its a string type value and callback is used to get the response from api
    // and it will set it in our POJO class

}
