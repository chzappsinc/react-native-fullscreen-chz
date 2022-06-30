# Example App Level

## enable()
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
        }}
      />
    </View>
  );
};
export default App;
```

## disable()
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
          FullScreenChz.disable();
        }}
      />
    </View>
  );
};
export default App;

```
