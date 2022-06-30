# REACT NATIVE FULL-SCREEN ANDROID

## Fullscreen for react native android

### Fixed all bugs for react-native 0.66+ Enjoy

## Install 

```sh
yarn add react-native-fullscreen-chz

OR

npm install react-native-fullscreen-chz --save

```

## Usage

### Important steps

**Goto android/app/res/values/styles.xml** 


```diff
- <resources>

+ <resources xmlns:tools="http://schemas.android.com/tools">
```

Now add this in styles.xml _This will help notched devices_

```diff
+ <item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item>
```

This will help notched devices and help them to show in full screens

Js

```js
import FullScreenChz from 'react-native-fullscreen-chz';

  FullScreenChz.enable()
  FullScreenChz.disable() // To disable
  
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
import FullScreenChz from 'react-native-fullscreen-chz';

const App = () => {

  FullScreenChz.enable()
  // FullScreenChz.disable() // To disable

  return (
    <View>

    </View>
  )
}

export default App;
```
