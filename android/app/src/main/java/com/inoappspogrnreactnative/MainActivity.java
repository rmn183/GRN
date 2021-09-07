package com.inoappspogrnreactnative;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.inoappspogrnreactnative.OkHttpCertPin;
import com.facebook.react.modules.network.OkHttpClientProvider;
import okhttp3.OkHttpClient;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "InoappsPogrnReactNative";
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rebuildOkHtttp();
    }

    private void rebuildOkHtttp() {
        OkHttpClient currentClient = OkHttpClientProvider.getOkHttpClient();
        OkHttpClient replacementClient = OkHttpCertPin.extend(currentClient);
        OkHttpClientProvider.replaceOkHttpClient(replacementClient);
    }
}
