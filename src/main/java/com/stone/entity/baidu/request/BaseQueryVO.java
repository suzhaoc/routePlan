package com.stone.entity.baidu.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 百度查询基本参数
 * Created by zhaoc on 2017/4/24.
 */
@Data
public class BaseQueryVO implements Serializable {
    private static final long serialVersionUID = -3025831723426211957L;
    @NotNull(message = "ak参数不可为空！") private String ak;//开发者访问密钥，必选
    private String sn;//用户的权限签名
    private long timestamp;//设置sn后该值必选
}
