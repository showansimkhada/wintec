package com.example.dylan.myapplication;

import android.os.Parcel;
import android.os.Parcelable;


public class workoutitem implements Parcelable {
    public int image;
    public int description;

    public workoutitem (int image, int desc) {
        this.image = image;
        this.description = desc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.image);
        dest.writeInt(this.description);
    }

    protected workoutitem (Parcel in) {
        this.image = in.readInt();
        this.description = in.readInt();
    }

    public static final Parcelable.Creator<workoutitem > CREATOR = new Parcelable.Creator<workoutitem >() {
        @Override
        public workoutitem  createFromParcel(Parcel source) {
            return new workoutitem (source);
        }

        @Override
        public workoutitem [] newArray(int size) {
            return new workoutitem [size];
        }
    };
}