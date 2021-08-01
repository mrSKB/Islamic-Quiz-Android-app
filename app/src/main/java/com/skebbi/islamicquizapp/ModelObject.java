package com.skebbi.islamicquizapp;

public enum ModelObject {

    /**
     * Created by Muhammad Abdulrahman Sarkin Kebbi  on 23-07-2021.
     */
    RED(R.string.first, R.layout.activity_developer);

     int mTitleResId;
     int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
