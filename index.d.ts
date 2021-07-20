declare module "react-native-fullscreen-chz" {
    export default class FullScreenAndroid {
        /**
         * Enable FullScreen in Android
         * Hide Both StatusBar and NavigationBar
         */
        static enable(): void;
        /**
         * Disable fullScreen View in Android
         */
        static disable(): void;
        /**
         * Full screen without StatusBar and with NavigationBar 
         *  Method will not work on new version
         * @deprecated
         */
        static enableWithoutStatusBar(): void;
        /**
         * Full screen with overlay statusBar
         * Method will not work on new version
         * @deprecated
         */
        static enableWithStatusBar(): void;
        /**
     * 
     * Check if app is not android 
     * New version this may make your app crash!!
     * Version > 1.1.2 don't use this
     * @deprecated
     * */ 
        static isAndroid(): void;
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