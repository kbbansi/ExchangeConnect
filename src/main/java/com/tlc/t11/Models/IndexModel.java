package com.tlc.t11.Models;

import java.time.LocalDate;

public class IndexModel {
    private boolean status;
    private String serviceName;
    private LocalDate date;

    public IndexModel(boolean status, String serviceName, LocalDate date){
        this.status = status;
        this.serviceName = serviceName;
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "IndexModel{" +
                "status=" + status +
                ", serviceName='" + serviceName + '\'' +
                ", date=" + date +
                '}';
    }
}
