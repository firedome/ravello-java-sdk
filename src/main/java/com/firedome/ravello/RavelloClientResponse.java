package com.firedome.ravello;

public class RavelloClientResponse {

    private int responseCode;
    private Object responseBody;

    public RavelloClientResponse(int responseCode, Object responseBody) {
        this.responseCode = responseCode;
        this.responseBody = responseBody;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public Object getResponseBody() {
        return responseBody;
    }
}
