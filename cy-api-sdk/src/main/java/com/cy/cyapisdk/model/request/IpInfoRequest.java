package com.cy.cyapisdk.model.request;

import com.cy.cyapisdk.model.response.ResultResponse;
import com.cy.cyapisdk.model.enums.RequestMethodEnum;
import com.cy.cyapisdk.model.params.IpInfoParams;
import com.cy.cyapisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: cy
 * @Date: 2023/09/22 09:04:04
 * @Version: 1.0
 * @Description: 获取ip地址请求
 */
@Accessors(chain = true)
public class IpInfoRequest extends BaseRequest<IpInfoParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/ipInfo";
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
