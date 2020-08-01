package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserComicsItems {
    @SerializedName("resourceURI")
    private String comicresURI;
    @SerializedName("name")
    private String comicname;

    public String getComicresURI() {
        return comicresURI;
    }

    public void setComicresURI(String comicresURI) {
        this.comicresURI = comicresURI;
    }

    public String getComicname() {
        return comicname;
    }

    public void setComicname(String comicname) {
        this.comicname = comicname;
    }
}
