import React from "react";
import ListofPlayers from "./components/ListofPlayers";
import ScoreBelow70 from "./components/ScoreBelow70";
import OddPlayers from "./components/OddPlayers";
import EvenPlayers from "./components/EvenPlayers";
import MergedIndianPlayers from "./components/MergedIndianPlayers";

function App() {
  const flag = false;

  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 67 },
    { name: "Rahul", score: 88 },
    { name: "Pant", score: 45 },
    { name: "Hardik", score: 77 },
    { name: "Shami", score: 30 },
  ];

  const indianTeam = ["Sachin 1", "Dhoni 2", "Virat 3", "Rohit 4", "Yuvaraj 5", "Raina 6"];

  const T20 = ["First Player", "Second Player", "Third Player"];
  const Ranji = ["Fourth Player", "Fifth Player", "Sixth Player"];

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />

        <hr />

        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Indian Team</h1>

        <h2>Odd Players</h2>
        <OddPlayers team={indianTeam} />

        <hr />

        <h2>Even Players</h2>
        <EvenPlayers team={indianTeam} />

        <hr />

        <h2>List of Indian Players Merged:</h2>
        <MergedIndianPlayers T20={T20} Ranji={Ranji} />
      </div>
    );
  }
}

export default App;
