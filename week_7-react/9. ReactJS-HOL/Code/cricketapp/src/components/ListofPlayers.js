import React from "react";

const ListofPlayers = ({ players }) => (
  <ul>
    {players.map((p, idx) => (
      <li key={idx}>{p.name} - {p.score}</li>
    ))}
  </ul>
);

export default ListofPlayers;
