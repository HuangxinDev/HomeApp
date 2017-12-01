package com.app.home.framework.adapter;

import android.util.SparseArray;
import android.view.View;

/**
 * Created by Administrator on 2017/11/25.
 */

public class HomeViewHolder {

    private SparseArray<View> mViews = new SparseArray<>();
    private View convertView;

    public HomeViewHolder(View convertView) {
        this.convertView = convertView;
    }

    public <T extends View> T getChildView(Class t, int resId) {
        View childView = mViews.get(resId);
        if (childView == null) {
            childView = convertView.findViewById(resId);
            mViews.put(resId, childView);
        }
        return (T) childView;
    }
}
