package com.yzf.view;

import com.yzf.util.SimpleChatConstant;

import java.awt.*;

/**
 * @description:客户端窗口
 * @author:leo_yuzhao
 * @date:2020/10/4
 */
public class ClientView extends SimpleChatFrame {
    public ClientView() {
        this(SimpleChatConstant.CLIENTVIEW_HEIGHT, SimpleChatConstant.CLIENTVIEW_WIDTH, SimpleChatConstant.CLIENTVIEW_NAME);
    }

    public ClientView(int height, int width, String title) {
        super(height, width, title);
    }

    @Override
    public void initModule() {
        this.setVisible(true);
    }

    @Override
    public void simpleChatFramePaint(Graphics g) {
        g.setColor(Color.gray);
        g.drawLine(0, 215, getWidth(), 215);
    }
}
