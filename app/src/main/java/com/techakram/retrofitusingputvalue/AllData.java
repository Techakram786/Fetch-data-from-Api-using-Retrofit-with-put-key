package com.techakram.retrofitusingputvalue;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllData
{

    @SerializedName("Response")
    @Expose
    private List<Model> response = null;
    @SerializedName("email_id")
    @Expose
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Model> getResponse() {
        return response;
    }

    public void setResponse(List<Model> response) {
        this.response = response;
    }
}
