# REACT NATIVE FULL SCREEN ANDROID

Full screen for react native android 

## Install 

`yarn add react-native-fullscreen-chz`

## Usage

**Goto android/app/res/values/styles.xml** 

Now add `<resources xmlns:tools="http://schemas.android.com/tools">`

Now add ` <item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item> `

### Full Example

```sh
<resources xmlns:tools="http://schemas.android.com/tools">
 <!-- Add this tool also. -->

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.DayNight.NoActionBar">
        <!-- Customize your theme here. -->
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
