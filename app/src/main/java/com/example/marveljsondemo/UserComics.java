package com.example.marveljsondemo;

import com.google.gson.annotations.SerializedName;

public class UserComics {

    private int code;
    private String status;
    private DataEntity data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

//    @SerializedName("available")
//    private String comicsavai;
//    @SerializedName("collectionURI")
//    private String comicscolURI;
//
//    private UserComicsItems comicsItems;
//
//    public String getComicsavai() {
//        return comicsavai;
//    }
//
//    public void setComicsavai(String comicsavai) {
//        this.comicsavai = comicsavai;
//    }
//
//    public String getComicscolURI() {
//        return comicscolURI;
//    }
//
//    public void setComicscolURI(String comicscolURI) {
//        this.comicscolURI = comicscolURI;
//    }
//
//    public UserComicsItems getComicsItems() {
//        return comicsItems;
//    }
//
//    public void setComicsItems(UserComicsItems comicsItems) {
//        this.comicsItems = comicsItems;
//    }
}
