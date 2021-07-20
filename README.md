# REACT NATIVE FULL SCREEN ANDROID

Full screen for react native android 

## Install 

```
yarn add react-native-fullscreen-chz

yarn react-native link react-native-fullscreen-chz 

```

## Usage

**Goto android/app/res/values/styles.xml** 


```js
<resources>

TO

<resources xmlns:tools="http://schemas.android.com/tools">

```

Now add this in styles.xml _This will notched devices_

```
<item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item>

```

This will help notched devices

# Full Example

```js
<resources xmlns:tools="http://schemas.android.com/tools">
    <style name="AppTheme" parent="Theme.AppCompat.DayNight.NoActionBar">
        <item name="android:textColor">#000000</item>

         <!-- Add this line for notched devices. -->
        <item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item> 
    </style>
</resources>

```

```js
import React from 'react'
import { View } from 'react-native'
import ReactNativeFullscreen from 'react-native-fullscreen-chz';

const App = () => {

  ReactNativeFullscreen.enable()
  //ReactNativeFullscreen.disable() // To disable

  return (
    <View>

    </View>
  )
}

export default App;

```
