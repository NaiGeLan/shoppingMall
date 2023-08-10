
package com.yami.shop.security.common.bo;


import lombok.Data;

/**
 * token信息，该信息存在redis中
 *
 * @author NaiGeLan
 *
 */
@Data
public class TokenInfoBO {

    /**
     * 保存在token信息里面的用户信息
     */
    private UserInfoInTokenBO userInfoInToken;

    private String accessToken;

    private String refreshToken;

    private String userId;
    /**
     * 在多少秒后过期
     */
    private Integer expiresIn;

}
