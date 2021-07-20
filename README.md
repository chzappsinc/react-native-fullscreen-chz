# REACT NATIVE FULL SCREEN ANDROID

Full screen for react native android 

## Install 

```sh
yarn add react-native-fullscreen-chz

yarn react-native link react-native-fullscreen-chz 

```

## Usage

### Important steps

**Goto android/app/res/values/styles.xml** 


```xml
<resources>

TO

<resources xmlns:tools="http://schemas.android.com/tools">

```

Now add this in styles.xml _This will notched devices_

```xml
<item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item>

```

This will help notched devices

Js

```js
import FullScreenAndroid from 'react-native-fullscreen-chz';

  FullScreenAndroid.enable()
  FullScreenAndroid.disable() // To disable
  
```

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
import FullScreenAndroid from 'react-native-fullscreen-chz';

const App = () => {

  FullScreenAndroid.enable()
  //FullScreenAndroid.disable() // To disable

  return (
    <View>

    </View>
  )
}

export default App;

```
