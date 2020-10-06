package com.yzf.util;

import java.awt.*;

/**
 * @description:系统常量
 * @author:leo_yuzhao
 * @date:2020/10/4
 */
public interface SimpleChatConstant {

    // SimpleChat 字体
    Font SIMPLECHAT_FONT = new Font("黑体", Font.PLAIN, 16);

    // 面板背景颜色
    Color PANEL_BACKGROUND_COLOR = new Color(255, 255, 255);
    Color PARTING_LINE_COLOR = new Color(235, 235, 235);

    // 主窗口的屏幕：高，宽，名称
    int MAINVIEW_HEIGHT = 350;
    int MAINVIEW_WIDTH = 500;
    String MAINVIEW_NAME = "<SimpleChat-MainView>";

    // Client窗口的屏幕：高，宽，名称
    int CLIENTVIEW_HEIGHT = 700;
    int CLIENTVIEW_WIDTH = 1000;
    String CLIENTVIEW_NAME = "<SimpleChat-ClientView>";

    // ClientInfo窗口的屏幕：高，宽，名称
    int CLIENTINFOVIEW_HEIGHT = 400;
    int CLIENTINFOVIEW_WIDTH = 500;
    String CLIENTINFOVIEW_NAME = "<SimpleChat-ClientInfoView>";
}
