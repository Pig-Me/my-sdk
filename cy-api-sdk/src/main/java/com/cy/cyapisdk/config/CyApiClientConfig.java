package com.cy.cyapisdk.config;

import com.cy.cyapisdk.client.CyApiClient;
import com.cy.cyapisdk.service.ApiService;
import com.cy.cyapisdk.service.impi.ApiServiceImpl;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cy
 * @Date: 2023年08月17日 21:09
 * @Version: 1.0
 * @Description: 将client封装为Bean，将apiservice封装为Bean(相对于client多加一个网关host)
 */
@Data
@Configuration
@ConfigurationProperties("cy.api.client")
@ComponentScan
public class CyApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public CyApiClient CyApiClient() {
        return new CyApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setCyApiClient(new CyApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
