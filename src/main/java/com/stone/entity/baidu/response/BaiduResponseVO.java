package com.stone.entity.baidu.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 百度返回结果封装类
 * Created by zhaoc on 2017/4/24.
 */
@Data
public class BaiduResponseVO<T> implements Serializable {
    private static final long serialVersionUID = -7533160667634407166L;
    /**
     * 本次API访问状态，如果成功返回0，如果失败返回其他数字。
     */
    private int status;
    /**
     * 对API访问状态值的英文说明，如果成功返回"ok"，并返回结果字段，如果失败返回错误说明。
     */
    private String message;
    /**
     * 检索总数，用户请求中设置了page_num字段才会出现total字段。
     * 当检索总数值大于760时，多次刷新同一请求得到total的值可能稍有不同，属于正常情况。
     */
    private int total;

    private T responseBody;
}
