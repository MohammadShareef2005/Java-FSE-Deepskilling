import React from 'react';

function SayWelcome() {
  const showWelcome = (msg) => {
    alert("Welcome message: " + msg);
  };

  return (
    <div>
      <button onClick={() => showWelcome("Welcome to React Event Handling!")}>
        Say Welcome
      </button>
    </div>
  );
}

export default SayWelcome;
