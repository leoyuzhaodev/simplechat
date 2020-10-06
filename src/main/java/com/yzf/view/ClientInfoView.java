package com.yzf.view;

import com.yzf.util.SimpleChatConstant;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @description:客户信息窗口
 * @author:leo_yuzhao
 * @date:2020/10/5
 */
public class ClientInfoView extends SimpleChatFrame {

    // 服务端ip
    private JLabel jLabel_serverIp;
    private JTextField jTextField_serverIp;

    // 服务端口
    private JLabel jLabel_serverPort;
    private JTextField jTextField_serverPort;

    // 用户昵称
    private JLabel jLabel_nickName;
    private JTextField jTextField_nickName;

    // 提交按钮
    private JButton jButton_submit;

    // 测试连接按钮
    private JButton jButton_testConnect;

    public ClientInfoView() {
        this(SimpleChatConstant.CLIENTINFOVIEW_HEIGHT,
                SimpleChatConstant.CLIENTINFOVIEW_WIDTH,
                SimpleChatConstant.CLIENTINFOVIEW_NAME);
    }

    /**
     * 初始化窗口
     *
     * @param height 窗口高度
     * @param width  窗口宽度
     * @param title
     */
    public ClientInfoView(int height, int width, String title) {
        super(height, width, title);
    }

    @Override
    public void initModule() {
        contentPanel.add(initJLabelServerIp());
        contentPanel.add(initJTextFieldServerIp());
        contentPanel.add(initJLabelServerPort());
        contentPanel.add(initJTextFieldServerPort());
        contentPanel.add(initJLabelNickName());
        contentPanel.add(initJTextFieldNickName());
        contentPanel.add(initJButtonSubmit());
        contentPanel.add(initJButtonTestConnect());
    }

    /**
     * 初始化组件：jLabel_serverIp
     *
     * @return
     */
    public JLabel initJLabelServerIp() {
        this.jLabel_serverIp = new JLabel();
        // 设置字体
        this.jLabel_serverIp.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        // 设置内容在 JLabel 中水平居左
        this.jLabel_serverIp.setHorizontalAlignment(SwingConstants.LEFT);
        this.jLabel_serverIp.setText("服务端IP:");
        this.jLabel_serverIp.setSize(80, 20);
        this.jLabel_serverIp.setLocation(100, 40);
        return this.jLabel_serverIp;
    }

    /**
     * 初始化组件：jTextField_serverIp
     *
     * @return
     */
    public JTextField initJTextFieldServerIp() {
        this.jTextField_serverIp = new JTextField();
        // 设置字体
        this.jTextField_serverIp.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        this.jTextField_serverIp.setSize(200, 30);
        this.jTextField_serverIp.setLocation(200, 35);
        return this.jTextField_serverIp;
    }

    /**
     * 初始化组件：jLabel_serverPort
     *
     * @return
     */
    public JLabel initJLabelServerPort() {
        this.jLabel_serverPort = new JLabel();
        // 设置字体
        this.jLabel_serverPort.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        // 设置内容在 JLabel 中水平居左
        this.jLabel_serverPort.setHorizontalAlignment(SwingConstants.LEFT);
        this.jLabel_serverPort.setText("服务端口:");
        this.jLabel_serverPort.setSize(80, 20);
        this.jLabel_serverPort.setLocation(100, 100);
        return this.jLabel_serverPort;
    }

    /**
     * 初始化组件：jTextField_serverPort
     *
     * @return
     */
    public JTextField initJTextFieldServerPort() {
        this.jTextField_serverPort = new JTextField();
        // 设置字体
        this.jTextField_serverPort.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        this.jTextField_serverPort.setSize(200, 30);
        this.jTextField_serverPort.setLocation(200, 95);
        return this.jTextField_serverPort;
    }

    /**
     * 初始化组件：jLabel_nickName
     *
     * @return
     */
    public JLabel initJLabelNickName() {
        this.jLabel_nickName = new JLabel();
        // 设置字体
        this.jLabel_nickName.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        // 设置内容在 JLabel 中水平居左
        this.jLabel_nickName.setHorizontalAlignment(SwingConstants.LEFT);
        this.jLabel_nickName.setText("用户昵称:");
        this.jLabel_nickName.setSize(80, 20);
        this.jLabel_nickName.setLocation(100, 160);
        return this.jLabel_nickName;
    }

    /**
     * 初始化组件：jTextField_nickName
     *
     * @return
     */
    public JTextField initJTextFieldNickName() {
        this.jTextField_nickName = new JTextField();
        // 设置字体
        this.jTextField_nickName.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        this.jTextField_nickName.setSize(200, 30);
        this.jTextField_nickName.setLocation(200, 155);
        return this.jTextField_nickName;
    }
    // ------------------------------------------------

    /**
     * 初始化组件：jButton_submit
     *
     * @return
     */
    public JButton initJButtonSubmit() {
        this.jButton_submit = new JButton("提交");
        // 设置字体
        this.jButton_submit.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        this.jButton_submit.setSize(300, 30);
        this.jButton_submit.setLocation(100, 215);
        // 获取填写信息
        this.jButton_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String serverIpText = jTextField_serverIp.getText();
                String serverPortText = jTextField_serverPort.getText();
                String nickNameText = jTextField_nickName.getText();
                // todo:client输入数据进行验证
                System.out.println("serverIpText:" + serverIpText + "，serverPortText:" + serverPortText + "，nickNameText:" + nickNameText);
                // 开启 ClientView
                new ClientView();
                // 关闭当前窗口
                ClientInfoView.this.dispose();
            }
        });
        return this.jButton_submit;
    }

    /**
     * 初始化组件：jButton_testConnect
     *
     * @return
     */
    public JButton initJButtonTestConnect() {
        this.jButton_testConnect = new JButton("测试连接");
        // 设置字体
        this.jButton_testConnect.setFont(SimpleChatConstant.SIMPLECHAT_FONT);
        this.jButton_testConnect.setSize(300, 30);
        this.jButton_testConnect.setLocation(100, 260);
        this.jButton_testConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // todo:测试连接功能
                System.out.println("测试连接...");
            }
        });
        return this.jButton_testConnect;
    }

}
