package com.cy.cyapisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: cy
 * @Date: 2023年09月19日 11:26
 * @Version: 1.0
 * @Description:
 */
@Data
//注解的作用是将其父类属性也进行比较，用于equals
@EqualsAndHashCode(callSuper = true)
public class LoveResponse extends ResultResponse {
    private static final long serialVersionUID = -1038984103811824271L;
}
