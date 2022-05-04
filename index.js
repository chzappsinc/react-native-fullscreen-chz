/**
 * FullScreen
 *
 * FullScreen.enable() => FullScreen Android
 *
 * FullScreen.disable() => FullScreen Disable Android
 */
"use strict";

import { NativeModules, Platform, StatusBar } from "react-native";
/**
 * For android!
 *
 */
const enable = () => {
  StatusBar.setHidden(true);
  StatusBar.setTranslucent(true);
};

const moduleName = async () => {
  if (__DEV__) {
    return "react-native-fullscreen-chz";
  }
};

export default Platform.select({
  android: NativeModules.ReactNativeFullscreenChz,
  ios: null,
  windows: null,
});

/**
 *

▒█▀▀█ ▒█░▒█ ▒█▀▀▀█ ░█▀▀█ ▒█▀▀█ ▒█▀▀█ ▒█▀▀▀█
▒█░░░ ▒█▀▀█ ░▄▄▄▀▀ ▒█▄▄█ ▒█▄▄█ ▒█▄▄█ ░▀▀▀▄▄
▒█▄▄█ ▒█░▒█ ▒█▄▄▄█ ▒█░▒█ ▒█░░░ ▒█░░░ ▒█▄▄▄█

COPYRIGHT CHZAPPS
 *
 * */
