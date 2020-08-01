package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserEventsItems {

    @SerializedName("resource URI")
    private String eventsresURI;
    @SerializedName("name")
    private String eventsname;

    public String getEventsresURI() {
        return eventsresURI;
    }

    public void setEventsresURI(String eventsresURI) {
        this.eventsresURI = eventsresURI;
    }

    public String getEventsname() {
        return eventsname;
    }

    public void setEventsname(String eventsname) {
        this.eventsname = eventsname;
    }
}
