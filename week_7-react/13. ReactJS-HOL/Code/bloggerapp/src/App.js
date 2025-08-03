import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState('book');
  const [showCourse, setShowCourse] = useState(true);

  // 1️⃣ Using if-else
  let componentToShow;
  if (view === 'book') {
    componentToShow = <BookDetails />;
  } else if (view === 'blog') {
    componentToShow = <BlogDetails />;
  }

  return (
    <div className="App">
      <h1>Blogger App</h1>

      <button onClick={() => setView('book')}>Show Book</button>
      <button onClick={() => setView('blog')}>Show Blog</button>
      <button onClick={() => setShowCourse(!showCourse)}>Toggle Course</button>

      <hr />

      {/* 2️⃣ Element Variable */}
      {componentToShow}

      {/* 3️⃣ Ternary Operator */}
      <hr />
      <p>Currently showing: {view === 'book' ? 'Book Section' : 'Blog Section'}</p>

      {/* 4️⃣ Short-Circuit Rendering */}
      <hr />
      {showCourse && <CourseDetails />}
    </div>
  );
}

export default App;
