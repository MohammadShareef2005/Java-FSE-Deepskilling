import React from 'react';

function SyntheticEventDemo() {
  const handleClick = (event) => {
    console.log(event); // SyntheticEvent
    alert("I was clicked!");
  };

  return (
    <div>
      <button onClick={handleClick}>OnPress</button>
    </div>
  );
}

export default SyntheticEventDemo;
