# REACT NATIVE FULL-SCREEN ANDROID

## Fullscreen for react-native android by CHZAPPS (Jasim T K)

<img src="https://raw.githubusercontent.com/chzappsinc/react-native-fullscreen-chz/main/example/React%20Native%20Fullscreen.png" />

### Fixed all bugs for react-native 0.66+ Enjoy

|ℹ️ **INFO** : All Bug's for React Native 0.69 + has fixed , If any errors or updates please open a new issue [OPEN ISSUE](https://github.com/chzappsinc/react-native-fullscreen-chz/issues) |
| --- |

## Install

```sh
yarn add react-native-fullscreen-chz

OR

npm install react-native-fullscreen-chz --save

```

## Usage

### Important steps

#### Goto android / app / res / values / styles.xml

```diff
- <resources>
+ <resources xmlns:tools="http://schemas.android.com/tools">
    <style name="AppTheme" parent="Theme.AppCompat.DayNight.NoActionBar">
        <item name="android:textColor">#000000</item>
         <!-- Add this line for notched devices. -->
+ <item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item> 
    </style>
</resources>

```

<!-- Now add this in styles.xml _This will help notched devices_

```diff
+ <item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item>
```

This will help notched devices and help them to show on full screens

Js -->

```js
import FullScreenChz from 'react-native-fullscreen-chz';

  FullScreenChz.enable()
  FullScreenChz.disable() // To disable
  
```

## Full Example

```diff
 <resources xmlns:tools="http://schemas.android.com/tools">
    <style name="AppTheme" parent="Theme.AppCompat.DayNight.NoActionBar">
        <item name="android:textColor">#000000</item>
         <!-- Add this line for notched devices. -->
       <item name="android:windowLayoutInDisplayCutoutMode" tools:ignore="NewApi">shortEdges</item> 
    </style>
</resources>

```

```js
import React from 'react';
import {Button, View} from 'react-native';
import FullScreenChz from 'react-native-fullscreen-chz';

const App = () => {
  return (
    <View style={{justifyContent: 'center', flex: 1}}>
      <Button
        title="Foo"
        onPress={() => {
          FullScreenChz.enable();
         //FullScreenChz.disable(); to Disable full screen view
        }}
      />
    </View>
  );
};
export default App;
```
