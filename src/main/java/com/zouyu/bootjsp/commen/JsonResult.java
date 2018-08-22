package com.zouyu.bootjsp.commen;

public class JsonResult {

    private String status;

    private Object result;

    public JsonResult() {
    }

    public JsonResult(String status, String result) {
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
