package com.nd.app.growth.wxapi;

import android.app.Activity;
import android.os.Bundle;

import com.nd.uc.thirdLogin.ThirdLoginManager;
import com.nd.android.socialshare.sdk.weixin.view.WXShareEventManager;

/**
 * 微信登录需要制定的包名称，最终多应用打包，通过脚本动态修改包名和AndroidTemplet实现.
 */
public class WXEntryActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThirdLoginManager.getInstance().handleIntent(this);
        WXShareEventManager.getInstance().handleIntent(this);
        finish();
    }
}


