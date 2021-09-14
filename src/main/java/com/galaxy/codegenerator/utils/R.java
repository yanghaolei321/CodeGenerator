package com.galaxy.codegenerator.utils;

import com.galaxy.codegenerator.constant.CommonConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * R
 *
 * @author yanghaolei
 * @date 9/14/21 2:22 PM
 */


@Data
@AllArgsConstructor
@ApiModel(value = "Response对象", description = "")
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "状态码")
    public int code;

    @ApiModelProperty(value = "返回消息")
    public String message;

    @ApiModelProperty(value = "数据")
    public T data;

    @ApiModelProperty(value = "堆栈信息")
    public String stackMessage;

    public static <T> R<T> data(T data) {
        return data(data, "success");
    }

    public static <T> R<T> data(T data, String message) {
        return data(data, message, CommonConstants.DEFAULT_SUCCESS_CODE);
    }

    public static <T> R<T> data(T data, String message, int code) {
        return new R(code, data == null ? "暂无承载数据" : message, data, "");
    }
}
