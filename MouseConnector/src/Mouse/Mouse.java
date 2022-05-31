package Mouse;

public class Mouse {
    getMouseCoordinate mouseCoordinate;
    double mouse_x;
    double mouse_y;

    public Mouse(){
        mouseCoordinate = new getMouseCoordinate();
        mouse_x = mouseCoordinate.getMouse_x();
        mouse_y = mouseCoordinate.getMouse_y();
    }
}
