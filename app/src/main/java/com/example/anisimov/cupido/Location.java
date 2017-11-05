package com.example.anisimov.cupido;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("Longtitude")
    @Expose
    private Double longtitude;
    @SerializedName("Latitude")
    @Expose
    private Double latitude;
    @SerializedName("Accurancy")
    @Expose
    private Double accurancy;
    @SerializedName("InterfaceId")
    @Expose
    private String interfaceId;

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getAccurancy() {
        return accurancy;
    }

    public void setAccurancy(Double accurancy) {
        this.accurancy = accurancy;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

}