package android.coolweather.com.coolweather.util;

import okhttp3.*;

/**
 * Created by ybyan on 2017/2/26.
 * 网络连接
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
