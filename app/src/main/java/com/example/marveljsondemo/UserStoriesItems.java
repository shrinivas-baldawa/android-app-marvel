package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserStoriesItems {

    @SerializedName("resourceURI")
    private String storiesresURI;
    @SerializedName("name")
    private String storiesname;
    @SerializedName("type")
    private String storiestype;

    public String getStoriesresURI() {
        return storiesresURI;
    }

    public void setStoriesresURI(String storiesresURI) {
        this.storiesresURI = storiesresURI;
    }

    public String getStoriesname() {
        return storiesname;
    }

    public void setStoriesname(String storiesname) {
        this.storiesname = storiesname;
    }

    public String getStoriestype() {
        return storiestype;
    }

    public void setStoriestype(String storiestype) {
        this.storiestype = storiestype;
    }
}
