package com.dshevchenkoo.agario;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by dshevchenkoo on 17.08.18.
 */

public class ConvasView extends View {
    private MainCircle mainCircle;
    private Paint paint;

    public ConvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initMainCircle();
        initPain();
    }

    private void initPain() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(200, 500);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }
}
