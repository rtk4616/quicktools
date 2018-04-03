package com.github.xbynet.model.enums;

public enum ErrorMsgEnum {

    NotNull("can't be null");

    String msg;
    ErrorMsgEnum(String msg){
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
