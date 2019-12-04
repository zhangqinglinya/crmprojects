package com.crmproject.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Layui implements Serializable {
    private Integer code;
    private String msg;
    private Integer count;
    private List data;
}
