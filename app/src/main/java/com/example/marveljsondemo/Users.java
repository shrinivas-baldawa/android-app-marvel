package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class Users {

    private String id;

    private String name;

    @SerializedName("description")
    private String desp;

    @SerializedName("modified")
    private String mod;

    @SerializedName("resourceURI")
    private String resURI;

    private UserComics comics;

    private UserThumbnail thumbnail;

    private UserSeries series;

    private UserStories stories;

    private UserEvents events;

    private UserURL url;

    public Users(String id, String name, String desp, String mod, String resURI, UserComics comics, UserThumbnail thumbnail, UserSeries series, UserStories stories, UserEvents events, UserURL url) {
        this.id = id;
        this.name = name;
        this.desp = desp;
        this.mod = mod;
        this.resURI = resURI;
        this.comics = comics;
        this.thumbnail = thumbnail;
        this.series = series;
        this.stories = stories;
        this.events = events;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesp() {
        return desp;
    }

    public String getMod() {
        return mod;
    }

    public String getResURI() {
        return resURI;
    }

    public UserComics getComics() {
        return comics;
    }

    public UserThumbnail getThumbnail() {
        return thumbnail;
    }

    public UserSeries getSeries() {
        return series;
    }

    public UserStories getStories() {
        return stories;
    }

    public UserEvents getEvents() {
        return events;
    }

    public UserURL getUrl() {
        return url;
    }
}
