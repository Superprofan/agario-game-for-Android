package com.dshevchenkoo.agario;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by dshevchenkoo on 17.08.18.
 */

public class ConvasView extends View {
    private static int width;
    private static int height;
    private GameManager gameManager;

    public ConvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initHeightAndWidth(context);
        gameManager = new GameManager(this, width, height);
    }

    private void initHeightAndWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        width = point.x;
        height = point.y;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gameManager.onDraw(canvas);
    }
}
