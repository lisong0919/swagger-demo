package com.jrmf.demo;

public class Request {
    private String signType;
    private String signValue;
    private String encryptMsg;

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSignValue() {
        return signValue;
    }

    public void setSignValue(String signValue) {
        this.signValue = signValue;
    }

    public String getEncryptMsg() {
        return encryptMsg;
    }

    public void setEncryptMsg(String encryptMsg) {
        this.encryptMsg = encryptMsg;
    }
}
