package com.example.annikadiekmann.studentportal;

import android.os.Parcel;
import android.os.Parcelable;

public class Portal implements Parcelable {

    private String mURL;
    private String mTitle;



    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmURL() {
        return mURL;
    }

    public void setmURL(String mURL) {
        this.mURL = mURL;
    }

    public Portal(String mTitle, String mURL) {
        this.mTitle = mTitle;
        this.mURL = mURL;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mURL);
        dest.writeString(this.mTitle);
    }

    public Portal() {
    }

    protected Portal(Parcel in) {
        this.mURL = in.readString();
        this.mTitle = in.readString();
    }

    public static final Parcelable.Creator<Portal> CREATOR = new Parcelable.Creator<Portal>() {
        @Override
        public Portal createFromParcel(Parcel source) {
            return new Portal(source);
        }

        @Override
        public Portal[] newArray(int size) {
            return new Portal[size];
        }
    };
}
