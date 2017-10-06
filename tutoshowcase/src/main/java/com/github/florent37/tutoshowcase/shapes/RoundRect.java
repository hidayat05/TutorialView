package com.github.florent37.tutoshowcase.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.ColorInt;

public class RoundRect extends Shape {

    private int x;
    private int y;
    private int width;
    private int height;
    private boolean withRadius;
    public int borderPadding;

    public RoundRect(int x, int y, int width, int height, boolean withRadius, int borderPadding) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.withRadius = withRadius;
        this.borderPadding = borderPadding;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isWithRadius() {
        return withRadius;
    }

    public int getBorderPadding() {
        return borderPadding;
    }

    @Override
    public void drawOn(Canvas canvas) {
        if (isDisplayBorder()) {
            drawRoundedRect(canvas, getX() - getBorderPadding(), getY() - getBorderPadding(),
                    getX() + getWidth() + getBorderPadding(), getY() + getHeight() + getBorderPadding(), getBorderPaint());
        }
        drawRoundedRect(canvas, getX(), getY(), getX() + getWidth(), getY() + getHeight(), paint);
    }

    private void drawRoundedRect(Canvas canvas, float left, float top, float right, float bottom, Paint paint) {
        float radius = (bottom - top) / 2;
        RectF rectF = new RectF(left, top, right, bottom);

        if (isWithRadius()) {
            canvas.drawRoundRect(rectF, radius, radius, paint);
        } else {
            canvas.drawRoundRect(rectF, 0, 0, paint);
        }
    }
}
