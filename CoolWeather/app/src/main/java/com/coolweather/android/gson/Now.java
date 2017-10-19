package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xlj on 10/18/2017.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }

}
