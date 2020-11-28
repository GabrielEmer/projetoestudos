import './App.css';
import { Component } from 'react';
import HelloWorld from './helloWorld/';
import MenuBar from './menu-bar';

class App extends Component {
  render() {
    return (
      <MenuBar>
        <HelloWorld></HelloWorld>
      </MenuBar>
    )
  }
}

export default App;
