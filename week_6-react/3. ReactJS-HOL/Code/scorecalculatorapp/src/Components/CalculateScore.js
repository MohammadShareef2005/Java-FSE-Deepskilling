import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
    const { name, school, total, goal } = props;
    const average = total / goal;

    return (
        <div>
            <h1 className="heading">Score Report</h1>
            <p className="name">Name: {name}</p>
            <p className="school">School: {school}</p>
            <p className="total">Total Marks: {total}</p>
            <p className="goal">Goal (Subjects): {goal}</p>
            <p className="average">Average Score: {average.toFixed(2)}</p>
        </div>
    );
}

export default CalculateScore;
