package com.example.anisimov.cupido;

import com.google.ads.AdRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by anisimov on 15.10.2017.
 */

public class CupidoResponse {

    @SerializedName("ErrorCode")
    @Expose
    public int errorCode;

    public void setErrorCode(int errorCode)
    {
        this.errorCode = errorCode;
    }

    public int getErrorCode()
    {
        return  errorCode;
    }
}
