package com.xun.permis.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.xun.permis.result.User;

/**
 * @Author zhangzhe
 * @Date 2019/7/12 14:53
 * 用于生成token返回给客户端
 */
public class TokenService {

    /**
     * 根据用户生成token
     * @param user
     * @return
     */
    public String getToken(User user) {
        //Algorithm.HMAC256():使用HS256生成token,密钥则是用户的密码，唯一密钥的话可以保存在服务端。
        //withAudience()存入需要保存在token的信息，这里我把用户ID存入token中
        String token= JWT.create().withAudience(user.getId())// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getPassword()));// 以 password 作为 token 的密钥
        return token;
    }

    /*public static void main(String[] args) {
        TokenService tokenService = new TokenService();
        User user = new User();
        user.setId("001");
        user.setUsername("xun");
        user.setPassword("123456");
        System.out.println(tokenService.getToken(user));
    }*/
}
