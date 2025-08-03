import React from 'react';
import './App.css';
import './styles.css';

function App() {
  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "https://images.unsplash.com/photo-1597692493645-82d0e7bf04bf?auto=format&fit=crop&w=800&q=60"
    },
    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Bangalore",
      Image: "https://images.unsplash.com/photo-1557804506-669a67965ba0?auto=format&fit=crop&w=800&q=60"
    }
  ];

  return (
    <div className="App">
      <h1>Office Space , at Affordable Range</h1>
      {officeList.map((item, index) => {
        const colorClass = item.Rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index}>
            <img src={item.Image} width="25%" height="25%" alt="Office Space" />
            <h2>Name: {item.Name}</h2>
            <h3 className={colorClass}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
            <hr />
          </div>
        );
      })}
    </div>
  );
}

export default App;