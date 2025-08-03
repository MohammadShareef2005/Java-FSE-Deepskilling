import React from "react";

const ScoreBelow70 = ({ players }) => {
  const lowScores = players.filter((p) => p.score < 70);

  return (
    <ul>
      {lowScores.map((p, idx) => (
        <li key={idx}>{p.name} - {p.score}</li>
      ))}
    </ul>
  );
};

export default ScoreBelow70;
