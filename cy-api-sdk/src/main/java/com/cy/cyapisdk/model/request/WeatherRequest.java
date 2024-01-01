package com.cy.cyapisdk.model.request;

import com.cy.cyapisdk.model.response.ResultResponse;
import com.cy.cyapisdk.model.enums.RequestMethodEnum;
import com.cy.cyapisdk.model.params.WeatherParams;
import com.cy.cyapisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: cy
 * @Date: 2023/09/22 10:11:43
 * @Version: 1.0
 * @Description: 获取天气请求
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/weather";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
