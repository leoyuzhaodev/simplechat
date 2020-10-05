package com.yzf.view;

import com.yzf.util.ScreenUtils;
import com.yzf.util.SimpleChatConstant;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @description:窗口父类
 * @author:leo_yuzhao
 * @date:2020/10/4
 */
public abstract class SimpleChatFrame extends JFrame {

    public final JPanel contentPanel = new JPanel(){
        @Override
        public void paint(Graphics g) {
            SimpleChatFrame.this.simpleChatFramePaint(g);
        }
    };

    /**
     * 初始化窗口
     *
     * @param height 窗口高度
     * @param width  窗口宽度
     */
    public SimpleChatFrame(int height, int width, String title) {
        // 设置窗口大小
        this.setSize(width, height);
        // 设置窗口居中
        ScreenUtils.setPositionCenter(this);
        // 设置窗口不能缩放
        this.setResizable(false);
        // 设置窗口标题
        this.setTitle(title);
        // 设置点击窗口关闭按钮自动退出程序
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // todo：程序关闭之前做响应的检查
                System.exit(0);
            }
        });
        // 设置内容布局：绝对布局
        contentPanel.setLayout(null);
        contentPanel.setBackground(SimpleChatConstant.PANEL_BACKGROUND_COLOR);
        // 初始化组件
        this.initModule();
        // 显示窗口
        this.setContentPane(contentPanel);
        this.setVisible(true);
    }

    /**
     * 初始化窗口
     */
    public abstract void initModule();

    /**
     * 绘制内容
     */
    public void simpleChatFramePaint(Graphics g) {
    }
}
