import React, { useState } from 'react';

function CurrencyConvertor() {
  const [inr, setInr] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const converted = (parseFloat(inr) / 88.50).toFixed(2); // sample rate
    setEuro(converted);
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter INR"
          value={inr}
          onChange={(e) => setInr(e.target.value)}
        />
        <button type="submit">Convert</button>
      </form>
      {euro && <p>{inr} INR = {euro} EURO</p>}
    </div>
  );
}

export default CurrencyConvertor;
