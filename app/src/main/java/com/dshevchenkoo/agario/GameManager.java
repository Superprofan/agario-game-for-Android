package com.dshevchenkoo.agario;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by dshevchenkoo on 17.08.18.
 */

public class GameManager {
    private MainCircle mainCircle;
    private ConvasView convasView;
    private static int width;
    private static int height;
    private Paint paint;

    public GameManager(ConvasView convasView, int w, int h) {
        this.convasView = convasView;
        width = w;
        height = h;
        initMainCircle();
        initPain();
    }

    private void initPain() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }
}
