import React from "react";

const MergedIndianPlayers = ({ T20, Ranji }) => {
  const merged = [...T20, ...Ranji];

  return (
    <ul>
      {merged.map((p, idx) => (
        <li key={idx}>Mr. {p}</li>
      ))}
    </ul>
  );
};

export default MergedIndianPlayers;
