package com.app.home.custom;

import android.view.View;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * Created by Administrator on 2017/11/7.
 */

public class AnimatorPath {

    ArrayList<PathPoint> mPoints = new ArrayList<>();

    public void moveTo(int x, int y) {
        mPoints.add(PathPoint.moveTo(x, y));
    }

    public void cubicTo(int c0x, int c0y, int clx, int cly, int x, int y) {
        mPoints.add(PathPoint.cubicTo(c0x, c0y, clx, cly, x, y));
    }

    public void lineTo(int x, int y) {
        mPoints.add(PathPoint.lineTo(x, y));
    }

    public Collection<PathPoint> getPoints() {
        return mPoints;
    }

    public void run(View view) {
        for (PathPoint pathPoint : mPoints) {
            view.setTranslationX(pathPoint.mX);
            view.setTranslationY(pathPoint.mY);
        }
    }
}
