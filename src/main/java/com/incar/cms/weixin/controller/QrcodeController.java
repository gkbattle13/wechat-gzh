package com.incar.cms.weixin.controller;

import com.incar.cms.weixin.config.WechatConfig;
import com.incar.util.fastweixin.api.QrcodeAPI;
import com.incar.util.fastweixin.api.UserAPI;
import com.incar.util.fastweixin.api.config.ApiConfig;
import com.incar.util.fastweixin.api.enums.QrcodeType;
import com.incar.util.fastweixin.api.response.GetGroupsResponse;
import com.incar.util.fastweixin.api.response.QrcodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 二维码相关
 *
 * @author GuoKun
 * @version 1.0
 * @create_date 2018/11/14 14:22
 */
@RestController
@RequestMapping("/weixin/qrcode")
public class QrcodeController {


    @Autowired
    WechatConfig wechatConfig;


    // 用于获取分组列表
    @RequestMapping("/getUserGroup")
    public GetGroupsResponse getUserGroup() {
        ApiConfig apiConfig = new ApiConfig(wechatConfig.getAppid(), wechatConfig.getAppsecret());
        UserAPI userAPI = new UserAPI(apiConfig);
        GetGroupsResponse getGroupsResponse = userAPI.getGroups();
        return getGroupsResponse;
    }


    // 用于获取临时二维码
    @RequestMapping("/get")
    public String qccode(String groupName) {
        ApiConfig apiConfig = new ApiConfig(wechatConfig.getAppid(), wechatConfig.getAppsecret());
        QrcodeAPI qrcodeAPI = new QrcodeAPI(apiConfig);
        QrcodeResponse qrcodeResponse = qrcodeAPI.createQrcode(QrcodeType.QR_STR_SCENE, "1",groupName, wechatConfig.getQrccodetime());
        return "redirect:https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+qrcodeResponse.getTicket();
    }



}
