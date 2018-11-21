package com.incar.cms.weixin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author GuoKun
 * @version 1.0
 * @create_date 2018/11/14 14:52
 */
@ConfigurationProperties(prefix = "wechat")
@Component
public class WechatConfig {
    private String appid;
    private String appsecret;
    private String token;
    private String url;
    private Integer qrccodetime;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getQrccodetime() {
        return qrccodetime;
    }

    public void setQrccodetime(Integer qrccodetime) {
        this.qrccodetime = qrccodetime;
    }

    //    public static String appid;
//    public static String appsecret;
//    public static String token;
//    public static String url;
//    public static Integer qrccodetime;
//
//    public static void setAppid(String appid) {
//        WeixinConfig.appid = appid;
//    }
//
//    public static void setAppsecret(String appsecret) {
//        WeixinConfig.appsecret = appsecret;
//    }
//
//    public static void setToken(String token) {
//        WeixinConfig.token = token;
//    }
//
//    public static void setUrl(String url) {
//        WeixinConfig.url = url;
//    }
//
//    public static void setQrccodetime(Integer qrccodetime) {
//        WeixinConfig.qrccodetime = qrccodetime;
//    }
}
