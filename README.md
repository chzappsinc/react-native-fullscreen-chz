# react-native-fullscreen-chz
Full screen for react native android 

## Install 

`yarn add react-native-fullscreen-chz`

## Usage

**Goto android/app/res/values/styles.xml**

```sh
<resources xmlns:tools="http://schemas.android.com/tools">

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.DayNight.NoActionBar">
        <!-- Customize your theme here. -->
        <item name="android:textColor">#000000</item>
       + <item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item>
    </style>

</resources>

```

```js
import React from 'react'
import { View } from 'react-native'
import ReactNativeFullscreen from 'react-native-fullscreen-chz';

const App = () => {

  ReactNativeFullscreen.enable()
  //ReactNativeFullscreen.disable()

  return (
    <View>

    </View>
  )
}

export default App;

```
