import {useEffect, useState} from 'react';
import './App.css';

 function App() {

    const[quizzes, setQuizzes] = useState([]);

    useEffect(() => {
      console.log("loaded");
      fetch("http://localhost:8080/api/quiz")
      .then((response) => response.json())
      .then((quiz) => {
        console.log(quiz);
      })
    });

  return (
    <div className="App">
     <h1>Hi There</h1>
    </div>
  );
}

export default App;
