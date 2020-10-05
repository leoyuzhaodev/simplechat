package com.yzf.bean;

/**
 * @description:通信处理器
 * @author:leo_yuzhao
 * @date:2020/10/3
 */
public interface CommunicationHandler{

    /**
     * 消息发送接口
     * @param message
     */
    void sendMessage(String message);

    /**
     * 消息接收器
     */
    void acceptMessage();
}
