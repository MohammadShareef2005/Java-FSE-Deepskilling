import React from 'react';
import Counter from './Components/Counter';
import SayWelcome from './Components/SayWelcome';
import SyntheticEventDemo from './Components/SyntheticEventDemo';
import CurrencyConvertor from './Components/CurrencyConvertor';

function App() {
  return (
    <div>
      <h1>React Event Handling App</h1>
      <Counter />
      <hr />
      <SayWelcome />
      <hr />
      <SyntheticEventDemo />
      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
