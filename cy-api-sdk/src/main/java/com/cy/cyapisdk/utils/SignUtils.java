package com.cy.cyapisdk.utils;

import cn.hutool.crypto.digest.MD5;
import cn.hutool.json.JSONUtil;

/**
 * @Author: cy
 * @Date: 2023年08月16日 12:22
 * @Version: 1.0
 * @Description: 提供签名算法
 */
public class SignUtils {
    public static String getSign(String body, String secretKey) {
        return MD5.create().digestHex(JSONUtil.toJsonStr(body) + '.' + secretKey);
    }
}
