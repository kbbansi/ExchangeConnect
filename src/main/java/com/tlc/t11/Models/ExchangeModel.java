package com.tlc.t11.Models;

public class ExchangeModel {
    private String statusKey;
    private String api_key;

    public ExchangeModel(String statusKey, String api_key) {
        this.statusKey = statusKey;
        this.api_key = api_key;
    }

    public String getStatusKey() {
        return statusKey;
    }

    public void setStatusKey(String statusKey) {
        this.statusKey = statusKey;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    @Override
    public String toString() {
        return "ExchangeModel{" +
                "statusKey='" + statusKey + '\'' +
                ", api_key='" + api_key + '\'' +
                '}';
    }
}
