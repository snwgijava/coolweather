package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ybyan on 2017/2/27.
 * 建立与JSON的映射
 */

public class Basic {
    //由于JSON中有些字段不适合直接作为java字段命名，这里使用了注解方式
    @SerializedName("city")
    public String cityName; //城市名

    @SerializedName("id")
    public String weatherId;    //天气ID

    public Update update;   //天气更新时间

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
