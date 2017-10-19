package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xlj on 10/18/2017.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
