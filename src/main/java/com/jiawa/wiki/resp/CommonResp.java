package com.jiawa.wiki.resp;

public class CommonResp<T> {

    /**
     * 业务上的成功或失败
     */
    private int code = 200;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回泛型数据，自定义类型
     */
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResp{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
