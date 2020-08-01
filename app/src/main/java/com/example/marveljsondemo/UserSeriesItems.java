package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserSeriesItems {
    @SerializedName("resourceURI")
    private String seriesresURI;

    @SerializedName("name")
    private String seriesname;

    public String getSeriesresURI() {
        return seriesresURI;
    }

    public void setSeriesresURI(String seriesresURI) {
        this.seriesresURI = seriesresURI;
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname;
    }
}
