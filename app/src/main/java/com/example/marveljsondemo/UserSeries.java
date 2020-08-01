package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserSeries {

    @SerializedName("available")
    private String seriesavai;

    @SerializedName("collectionURI")
    private String seriescolURI;

    private UserSeriesItems seriesItems;

    public String getSeriesavai() {
        return seriesavai;
    }

    public void setSeriesavai(String seriesavai) {
        this.seriesavai = seriesavai;
    }

    public String getSeriescolURI() {
        return seriescolURI;
    }

    public void setSeriescolURI(String seriescolURI) {
        this.seriescolURI = seriescolURI;
    }

    public UserSeriesItems getSeriesItems() {
        return seriesItems;
    }

    public void setSeriesItems(UserSeriesItems seriesItems) {
        this.seriesItems = seriesItems;
    }
}

