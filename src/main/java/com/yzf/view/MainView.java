package com.yzf.view;

import com.yzf.util.ScreenUtils;
import com.yzf.util.SimpleChatConstant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @description:主窗口
 * @author:leo_yuzhao
 * @date:2020/10/4
 */
public class MainView extends SimpleChatFrame {

    // 服务器按钮
    private Button button_server;

    // 客户端按钮
    private Button button_client;

    // 窗口标题
    private JLabel jLabel_title;

    // 分割线
    private JLabel jLabel_line;

    public MainView() {
        this(SimpleChatConstant.MAINVIEW_HEIGHT, SimpleChatConstant.MAINVIEW_WIDTH, SimpleChatConstant.MAINVIEW_NAME);
    }

    private MainView(int height, int width, String title) {
        super(height, width, title);
    }

    /**
     * 初始化窗口的组件
     */
    @Override
    public void initModule() {
        // 添加组件
        contentPanel.add(initJLabelTitle());
        contentPanel.add(initButtonServer());
        contentPanel.add(initButtonClient());
        contentPanel.add(initJLabelLine());
    }

    /**
     * 初始化组件：JLabel_title
     *
     * @return
     */
    private Component initJLabelTitle() {
        this.jLabel_title = new JLabel();
        // 设置字体
        this.jLabel_title.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        // 设置内容在 JLabel 中水平居中
        this.jLabel_title.setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabel_title.setText("-------------- 请选择功能 --------------");
        this.jLabel_title.setSize(360, 20);
        // 设置该组件在窗口中水平居中
        ScreenUtils.setComponentHorizontalCenter(jLabel_title, this, this.jLabel_title.getWidth(), 100);
        return jLabel_title;
    }

    /**
     * 初始化组件：jLabel_line
     *
     * @return
     */
    private Component initJLabelLine() {
        this.jLabel_line = new JLabel();
        // 设置字体
        this.jLabel_line.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        // 设置内容在 JLabel 中水平居中
        this.jLabel_line.setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabel_line.setText("----------------------------------------");
        this.jLabel_line.setSize(360, 20);
        // 设置该组件在窗口中水平居中
        ScreenUtils.setComponentHorizontalCenter(jLabel_line, this, this.jLabel_line.getWidth(), 190);
        return jLabel_line;
    }

    /**
     * 初始化组件：button_server
     *
     * @return
     */
    public Component initButtonServer() {
        button_server = new Button("[SERVER]");
        this.button_server.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        this.button_server.setSize(100, 50);
        this.button_server.setLocation(100, 130);
        this.button_server.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮[SERVER]被点击");
                // todo:处理服务端请求
                MainView.this.dispose();
            }
        });
        return this.button_server;
    }

    /**
     * 初始化组件：button_client
     *
     * @return
     */
    public Component initButtonClient() {
        button_client = new Button("[CLIENT]");
        this.button_client.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        this.button_client.setSize(100, 50);
        this.button_client.setLocation(300, 130);
        this.button_client.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮[CLIENT]被点击");
                // 开启 ClientView
                new ClientInfoView();
                MainView.this.dispose();
            }
        });
        return this.button_client;
    }

    public static void main(String[] args) {
        new MainView();
    }
}
