package com.cy.cyapisdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: cy
 * @Date: 2023/09/15 08:41:51
 * @Version: 1.0
 * @Description: cy api客户端，封装ak、sk
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CyApiClient {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
