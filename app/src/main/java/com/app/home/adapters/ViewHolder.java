package com.app.home.adapters;

import android.util.SparseArray;
import android.view.View;

/**
 * Created by Administrator on 2017/8/9.
 */

public class ViewHolder {

    private static final String TAG = ViewHolder.class.getSimpleName();

    /**
     * get child view from inflate view.
     * @param convertView Adapter inflate view.
     * @param resId component id {@+id}.
     * @param <T> .
     * @return child view.
     */
    public static <T extends View> T getChildView(View convertView, int resId) {
        SparseArray viewHolder = (SparseArray) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new SparseArray();
            convertView.setTag(viewHolder);
        }
        View childView = (View) viewHolder.get(resId);
        if (childView == null) {
            childView = convertView.findViewById(resId);
            viewHolder.put(resId, childView);
        }
        return (T) childView;
    }
}
