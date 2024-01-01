package com.cy.cyapisdk.exception;

import lombok.Data;

/**
 * @Author: cy
 * @Date: 2023年09月18日 21:52
 * @Version: 1.0
 * @Description: 错误返回
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
