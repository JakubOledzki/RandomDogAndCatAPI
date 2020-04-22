package com.joledzki.randomdogsapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    @SerializedName("fileSizeBytes")
    @Expose
    private Integer fileSizeBytes;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getFileSizeBytes() {
        return fileSizeBytes;
    }
    public void setFileSizeBytes(Integer fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}