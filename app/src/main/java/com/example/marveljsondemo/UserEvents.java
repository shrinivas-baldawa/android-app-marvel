package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserEvents {

    @SerializedName("available")
    private String eventsavai;

    @SerializedName("collectionURI")
    private String eventscolURI;

    private UserEventsItems eventsItems;

    public String getEventsavai() {
        return eventsavai;
    }

    public void setEventsavai(String eventsavai) {
        this.eventsavai = eventsavai;
    }

    public String getEventscolURI() {
        return eventscolURI;
    }

    public void setEventscolURI(String eventscolURI) {
        this.eventscolURI = eventscolURI;
    }

    public UserEventsItems getEventsItems() {
        return eventsItems;
    }

    public void setEventsItems(UserEventsItems eventsItems) {
        this.eventsItems = eventsItems;
    }
}
