/**
 * FullScreen
 * 
 * FullScreen.enable() => FullScreen Android
 * 
 * FullScreen.disable() => FullScreen Disable Android
 */
'use strict';

import { NativeModules, Platform, StatusBar } from 'react-native';
/**
 * For android!
 * */
const enable = () => {
    StatusBar.setHidden(true)
    StatusBar.setTranslucent(true)
    //Also call native module below
}

export default Platform.OS === 'android' && NativeModules.ReactNativeFullscreen;


/**
 *

▒█▀▀█ ▒█░▒█ ▒█▀▀▀█ ░█▀▀█ ▒█▀▀█ ▒█▀▀█ ▒█▀▀▀█
▒█░░░ ▒█▀▀█ ░▄▄▄▀▀ ▒█▄▄█ ▒█▄▄█ ▒█▄▄█ ░▀▀▀▄▄
▒█▄▄█ ▒█░▒█ ▒█▄▄▄█ ▒█░▒█ ▒█░░░ ▒█░░░ ▒█▄▄▄█

COPYRIGHT CHZAPPS
 *
 * */