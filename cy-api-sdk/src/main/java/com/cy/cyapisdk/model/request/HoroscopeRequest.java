package com.cy.cyapisdk.model.request;

import com.cy.cyapisdk.model.response.ResultResponse;
import com.cy.cyapisdk.model.enums.RequestMethodEnum;
import com.cy.cyapisdk.model.params.HoroscopeParams;
import com.cy.cyapisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: cy
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 随机情话
 */
@Accessors(chain = true)
public class HoroscopeRequest extends BaseRequest<HoroscopeParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/horoscope";
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
