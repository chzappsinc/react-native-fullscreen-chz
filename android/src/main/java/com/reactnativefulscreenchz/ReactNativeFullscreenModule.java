 package com.reactnativefulscreenchz;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;

import java.util.Objects;


public class ReactNativeFullscreenModule extends ReactContextBaseJavaModule {
    @NonNull
    @Override
    public String getName() {
        return "ReactNativeFullscreen";
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

    @ReactMethod
    public void enableWithoutStatusBar() {
        UiThreadUtil.runOnUiThread(
                new Runnable() {
                    @SuppressLint("ObsoleteSdkInt")
                    @Override
                    public void run() {
                        if (Build.VERSION.SDK_INT < 16) {
                            Objects.requireNonNull(getCurrentActivity()).getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
                        }
                    }
                }
        );

    }

    @ReactMethod
    public void enableWithStatusBar() {
        UiThreadUtil.runOnUiThread(
                new Runnable() {
                    @SuppressLint("ObsoleteSdkInt")
                    @Override
                    public void run() {
                        if (Build.VERSION.SDK_INT < 16) {
                            Objects.requireNonNull(getCurrentActivity()).getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
                        }
                    }
                }
        );

    }

    @ReactMethod
    public String isAndroid() {
        return "Yes Its Android";
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


