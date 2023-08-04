
package com.yami.shop.security.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;

/**
 * 用于登陆传递账号密码
 *
 * @author NaiGeLan
 *
 */
@Data
public class AuthenticationDTO {

    /**
     * 用户名
     */
    @NotBlank(message = "userName不能为空")
    @Schema(description = "用户名/邮箱/手机号" , required = true)
    protected String userName;

    /**
     * 密码
     */
    @NotBlank(message = "passWord不能为空")
    @Schema(description = "一般用作密码" , required = true)
    protected String passWord;

}
