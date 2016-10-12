package com.han.ngoc.object_intent;

import java.io.Serializable;

/**
 * Created by NGOC on 10/12/2016.
 */
public class Number implements Serializable{
    private String mKey;
    private int mValue;

    public Number(String mKey, int mValue) {
        this.mKey = mKey;
        this.mValue = mValue;
    }
    public String getmKey() {
        return mKey;
    }
    public int getmValue() {
        return mValue;
    }
    public void setmKey(String mKey) {
        this.mKey = mKey;
    }
    public void setmValue(int mValue) {
        this.mValue = mValue;
    }
}
