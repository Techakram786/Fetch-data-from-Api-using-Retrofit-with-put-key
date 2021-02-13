package com.techakram.retrofitusingputvalue;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static final String BASE_URL="https://www.maishainfotech.com/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;
    private RetrofitClient()
    { 
        retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized RetrofitClient getInstance()
    {
       if(mInstance==null)
       {
         mInstance=new RetrofitClient();
       }
       return mInstance;
    }
    public Api getMyInterface()
    {
        return retrofit.create(Api.class);
    }
}
