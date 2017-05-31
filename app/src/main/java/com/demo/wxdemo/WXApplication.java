package com.demo.wxdemo;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by fucang on 17/1/5.
 */

public class WXApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config=new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,config);
    }
}
