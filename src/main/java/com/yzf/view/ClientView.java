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
    }

    @Override
    public void simpleChatFramePaint(Graphics g) {
        // 设置画笔颜色
        g.setColor(SimpleChatConstant.PARTING_LINE_COLOR);
        // 右分隔线
        g.drawLine(SimpleChatConstant.CLIENTVIEW_WIDTH/4*3, 0,
                SimpleChatConstant.CLIENTVIEW_WIDTH/4*3,
                SimpleChatConstant.CLIENTVIEW_HEIGHT);
        // 下分隔线
        g.drawLine(0,  SimpleChatConstant.CLIENTVIEW_HEIGHT/6*4,
                SimpleChatConstant.CLIENTVIEW_WIDTH/4*3,
                SimpleChatConstant.CLIENTVIEW_HEIGHT/6*4);

    }

    public static void main(String[] args) {
        ClientView clientView = new ClientView();
    }
}
