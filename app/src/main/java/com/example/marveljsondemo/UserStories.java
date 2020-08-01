package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserStories {

    @SerializedName("available")
    private String storiesavai;

    @SerializedName("collectionURI")
    private String storiescolURI;

    private UserStoriesItems storiesItems;

    public String getStoriesavai() {
        return storiesavai;
    }

    public void setStoriesavai(String storiesavai) {
        this.storiesavai = storiesavai;
    }

    public String getStoriescolURI() {
        return storiescolURI;
    }

    public void setStoriescolURI(String storiescolURI) {
        this.storiescolURI = storiescolURI;
    }

    public UserStoriesItems getStoriesItems() {
        return storiesItems;
    }

    public void setStoriesItems(UserStoriesItems storiesItems) {
        this.storiesItems = storiesItems;
    }
}
