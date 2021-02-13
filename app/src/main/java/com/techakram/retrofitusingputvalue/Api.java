package com.techakram.retrofitusingputvalue;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface Api
{

    @FormUrlEncoded
    @POST("adinterview/interview.php")
    Call<AllData> getdatas(
            @Field("email_id") String  email);
}


