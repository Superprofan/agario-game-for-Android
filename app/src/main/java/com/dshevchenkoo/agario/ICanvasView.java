package com.dshevchenkoo.agario;

/**
 * Created by dshevchenkoo on 17.08.18.
 */

public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void redraw();

    void showMessage(String text);
}