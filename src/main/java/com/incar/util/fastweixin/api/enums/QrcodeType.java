package com.incar.util.fastweixin.api.enums;

/**
 * 二维码接口状态枚举
 *
 * @author peiyu
 * @since 1.2
 */
public enum QrcodeType {

    /**
     * 临时二维码
     */
    QR_SCENE,

    /**
     * 临时二维码 字符串
     */
    QR_STR_SCENE,

    /**
     * 永久二维码
     */
    QR_LIMIT_SCENE,

    /**
     * 永久的字符串参数值
     */
    QR_LIMIT_STR_SCENE
}
