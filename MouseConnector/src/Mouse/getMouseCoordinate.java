package Mouse;

import java.awt.*;


public class getMouseCoordinate {
    // 鼠标横坐标
    private double mouse_x = 0;
    // 鼠标纵坐标
    private double mouse_y = 0;

    public getMouseCoordinate() {
        /**
         * 获取鼠标在屏幕中的位置
         */
        Point location = MouseInfo.getPointerInfo().getLocation();
        mouse_x = location.getX();
        mouse_y = location.getY();
        System.out.println("x = " + mouse_x);
        System.out.println("y = " + mouse_y);
    }

    public double getMouse_x() { return mouse_x; }

    public void setMouse_x(double mouse_x) { this.mouse_x = mouse_x; }

    public double getMouse_y() { return mouse_y; }

    public void setMouse_y(double mouse_y) { this.mouse_y = mouse_y; }
}
