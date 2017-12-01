package com.app.home.framework.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public abstract class HomeBaseAdapter<T> extends BaseAdapter {

    private Context mContext;
    private ArrayList<T> mData;

    public HomeBaseAdapter(Context context, ArrayList<T> data) {
        this.mContext = context;
        this.mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HomeViewHolder mHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(getLayoutId(), parent, false);
            mHolder = new HomeViewHolder(convertView);
            convertView.setTag(mHolder);
        } else {
            mHolder = (HomeViewHolder) convertView.getTag();
        }

        updateViewData(mHolder, mData, position);
        return convertView;
    }

    abstract void updateViewData(HomeViewHolder holder, ArrayList<T> data, int position);

    abstract int getLayoutId();
}
