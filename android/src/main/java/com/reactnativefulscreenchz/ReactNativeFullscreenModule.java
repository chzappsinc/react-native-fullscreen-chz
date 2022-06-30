 package com.reactnativefullscreenchz;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import android.content.pm.PackageManager;

import java.util.Objects;


public class ReactNativeFullscreenModule extends ReactContextBaseJavaModule {
    @NonNull
    @Override
    public String getName() {
        return "ReactNativeFullscreenChz";
    }

     
    @ReactMethod
    public void enable() {
        UiThreadUtil.runOnUiThread(
                new Runnable() {
                    @Override
                    public void run() {
                        Objects.requireNonNull(getCurrentActivity()).getWindow().getDecorView().setSystemUiVisibility(
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        );
                    }
                }
        );

    }

    @ReactMethod
    public void disable() {
        UiThreadUtil.runOnUiThread(
                new Runnable() {
                    @Override
                    public void run() {
                        Objects.requireNonNull(getCurrentActivity()).getWindow().getDecorView().setSystemUiVisibility(
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        );
                    }
                }
        );

    }
    
    ReactNativeFullscreenModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
}

/**
 * 
 
▒█▀▀█ ▒█░▒█ ▒█▀▀▀█ ░█▀▀█ ▒█▀▀█ ▒█▀▀█ ▒█▀▀▀█ 
▒█░░░ ▒█▀▀█ ░▄▄▄▀▀ ▒█▄▄█ ▒█▄▄█ ▒█▄▄█ ░▀▀▀▄▄ 
▒█▄▄█ ▒█░▒█ ▒█▄▄▄█ ▒█░▒█ ▒█░░░ ▒█░░░ ▒█▄▄▄█

COPYRIGHT CHZAPPS
 * 
 * */ 


