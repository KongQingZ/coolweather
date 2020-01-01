package com.example.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
//，全国所有省市县的数据都是从服务器端获取到的，因此 这里和服务器的交互是必不可少
//。现在我们发起一条HTTP请求只需要调 用sendOkHttpRequest()方法，传入请求地址，并注册一个回调来处理服 务器响应就可以了
public class HttpUtil  {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
