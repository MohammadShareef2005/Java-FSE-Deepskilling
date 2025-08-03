import React from "react";

const EvenPlayers = ({ team }) => {
  return (
    <ul>
      {team.filter((_, i) => i % 2 !== 0).map((player, idx) => (
        <li key={idx}>{player}</li>
      ))}
    </ul>
  );
};

export default EvenPlayers;
