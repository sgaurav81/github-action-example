package com.gs.poc.model;

public class Postman {

    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Postman{" +
                "url='" + url + '\'' +
                '}';
    }
}
