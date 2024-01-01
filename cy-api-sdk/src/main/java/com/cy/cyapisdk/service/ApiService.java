package com.cy.cyapisdk.service;

import cn.hutool.http.HttpResponse;
import com.cy.cyapisdk.client.CyApiClient;
import com.cy.cyapisdk.exception.ApiException;
import com.cy.cyapisdk.model.request.*;
import com.cy.cyapisdk.model.response.RandomWallpaperResponse;
import com.cy.cyapisdk.model.response.ResultResponse;
import com.cy.cyapisdk.model.response.LoveResponse;
import com.cy.cyapisdk.model.response.PoisonousChickenSoupResponse;

/**
 * @Author: cy
 * @Date: 2023年09月17日 08:34
 * @Version: 1.0
 * @Description:
 */
public interface ApiService {
    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */

    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param cyApiClient cy api客户端
     * @param request     要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(CyApiClient cyApiClient, BaseRequest<O, T> request) throws ApiException;


    /**
     * 随机毒鸡汤
     *
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException;

    /**
     * 喝毒鸡汤
     *
     * @param cyApiClient cy api客户端
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(CyApiClient cyApiClient) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param request 要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param cyApiClient cy api客户端
     * @param request     要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(CyApiClient cyApiClient, RandomWallpaperRequest request) throws ApiException;

    /**
     * 随意情话
     *
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk() throws ApiException;

    /**
     * 随意情话
     *
     * @param cyApiClient cy api客户端
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk(CyApiClient cyApiClient) throws ApiException;

    /**
     * 星座运势
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(HoroscopeRequest request) throws ApiException;

    /**
     * 星座运势
     *
     * @param cyApiClient cy api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(CyApiClient cyApiClient, HoroscopeRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param cyApiClient cy api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(CyApiClient cyApiClient, IpInfoRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(IpInfoRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param cyApiClient cy api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(CyApiClient cyApiClient, WeatherRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException;
}
