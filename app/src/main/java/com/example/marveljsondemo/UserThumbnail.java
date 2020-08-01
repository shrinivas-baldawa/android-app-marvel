package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserThumbnail {

    @SerializedName("path")
    private String Path;

    @SerializedName("extension")
    private String ext;

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}
