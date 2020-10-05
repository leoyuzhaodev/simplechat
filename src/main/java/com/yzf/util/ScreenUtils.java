package com.yzf.util;

import javax.swing.*;
import java.awt.*;

/**
 * @description:屏幕工具类
 * @author:leo_yuzhao
 * @date:2020/10/4
 */
public class ScreenUtils {

    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * 设置窗口对象居中
     *
     * @param jFrame
     */
    public static void setPositionCenter(JFrame jFrame) {
        jFrame.setLocation((int) (screenSize.getWidth() - jFrame.getWidth()) / 2,
                (int) (screenSize.getHeight() - jFrame.getHeight()) / 2);
    }

    /**
     * 设置组件水平居中
     * @param component
     * @param jFrame
     * @param width
     * @param y
     */
    public static void setComponentHorizontalCenter(JComponent component, JFrame jFrame, int width, int y) {
        component.setLocation((jFrame.getWidth() - width) / 2, y);
    }
}
