package com.example.retrofit.restapi;

import retrofit.RestAdapter;

public class Api {

    public static ApiInterface getClient() {
       // In this class getClient method returns the Api Interface class
        // object which we are using in our MainActivity.

        // change your base URL
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("http://mobileappdatabase.in/") //Set the Root URL
                .build(); //Finally building the adapter

        //Creating object for our interface
        ApiInterface api = adapter.create(ApiInterface.class);
        return api; // return the APIInterface object
    }
}
