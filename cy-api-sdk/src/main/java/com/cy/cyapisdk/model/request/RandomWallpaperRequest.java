package com.cy.cyapisdk.model.request;

import com.cy.cyapisdk.model.response.RandomWallpaperResponse;
import com.cy.cyapisdk.model.response.ResultResponse;
import com.cy.cyapisdk.model.enums.RequestMethodEnum;
import com.cy.cyapisdk.model.params.RandomWallpaperParams;
import lombok.experimental.Accessors;

/**
 * @Author: cy
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
