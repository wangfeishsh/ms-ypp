package com.ypp.domain.dto;

import com.ypp.common.BaseCode;
import com.ypp.common.BusinessCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by nannan on 2017/6/9.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {
    private String code;
    private String message;
    private T data;

    public static Response success() {
        return success((Object) null);
    }

    public static Response success(Object data) {
        Response response = new Response();
        response.setMessage(BusinessCode.SUCCESS.getMessage());
        response.setCode(BusinessCode.SUCCESS.getCode());
        response.setData(data);
        return response;
    }

    public static Response failure(BaseCode code) {
        return failure(code, (Object) null);
    }

    public static Response failure(BaseCode code, Object data) {
        Response response = new Response();
        response.setMessage(code.getMessage());
        response.setCode(code.getCode());
        response.setData(data);
        return response;
    }

    public boolean isSuccess() {
        return this.getCode().equals(BusinessCode.SUCCESS.getCode());
    }

}
