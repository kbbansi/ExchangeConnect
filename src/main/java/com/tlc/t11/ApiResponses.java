package com.tlc.t11;

public class ApiResponses {
    private String message;
    private int statusCode;

    public ApiResponses(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "ApiResponses{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }
}
