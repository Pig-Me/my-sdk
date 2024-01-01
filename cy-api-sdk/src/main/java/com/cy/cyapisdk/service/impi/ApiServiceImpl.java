package com.cy.cyapisdk.service.impi;

import com.cy.cyapisdk.client.CyApiClient;
import com.cy.cyapisdk.exception.ApiException;
import com.cy.cyapisdk.model.request.*;
import com.cy.cyapisdk.model.response.RandomWallpaperResponse;
import com.cy.cyapisdk.model.response.ResultResponse;
import com.cy.cyapisdk.model.response.LoveResponse;
import com.cy.cyapisdk.model.response.PoisonousChickenSoupResponse;
import com.cy.cyapisdk.service.ApiService;
import com.cy.cyapisdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;


/**
 * @Author: cy
 * @Date: 2023年09月17日 08:42
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(CyApiClient cyApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(cyApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(CyApiClient cyApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(cyApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(CyApiClient cyApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(cyApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(CyApiClient cyApiClient, HoroscopeRequest request) throws ApiException {
        return request(cyApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(CyApiClient cyApiClient, IpInfoRequest request) throws ApiException {
        return request(cyApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(CyApiClient cyApiClient, WeatherRequest request) throws ApiException {
        return request(cyApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
