
import React from "react";

const players = [
  { name: "Virat", score: 95 },
  { name: "Rohit", score: 67 },
  { name: "Rahul", score: 88 },
  { name: "Pant", score: 45 },
  { name: "Hardik", score: 77 },
  { name: "Jadeja", score: 90 },
  { name: "Ashwin", score: 55 },
  { name: "Bumrah", score: 99 },
  { name: "Shami", score: 30 },
  { name: "Kuldeep", score: 79 },
  { name: "Gill", score: 82 },
];

const ListofPlayers = () => {

  const allPlayers = players.map((player, index) => (
    <li key={index}>
      {player.name} - {player.score}
    </li>
  ));

 
  const lowScorers = players.filter((p) => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{allPlayers}</ul>

      <h2>Players with score below 70</h2>
      <ul>
        {lowScorers.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
