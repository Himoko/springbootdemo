package com.ucar.springbootdemo.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: hellovue
 * @description: 结果类
 * @author: peng.zhang11@ucarinc.com
 * @create: 2019-07-18 10:12
 */
public class Result {
    //响应码
    private int code;
    private String message;
    private List<?> dataList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<?> getDataList() {
        return dataList;
    }

    public void setDataList(List<?> dataList) {
        this.dataList = dataList;
    }
}
