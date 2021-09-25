import { useEffect, useState } from "react";
import Result from "./Components/Result";
import "./App.css";
import { getAnswers } from "./Components/Answers";

function App() {
  const [quizzes, setQuizzes] = useState(null);
  const [currentIndex, setCurrentIndex] = useState(0);
  const [chosenAnswers, setChosenAnswers] = useState([]);
  const [isActive, setIsActive] = useState(null);

  //fetch quiz from server
  const fetchQuiz = async () => {
    if (!quizzes) {
      fetch("http://localhost:8080/api/quiz")
        .then((response) => response.json())
        .then((data) => {
          console.log(data);
          setQuizzes(data);
        });
    }
  };

  const handleNextQuestion = () => {
    if (isActive !== null) {
      setCurrentIndex(currentIndex + 1);
      setIsActive(null);
    } else {
      alert("You must choose an answer to continue");
    }
  };

  // render the next question and keep track of the chosen answers
  const handleClick = (key) => {
    setIsActive(key);
    let answerId = key;
    setChosenAnswers((chosenAnswers) => [...chosenAnswers, answerId]);
  };

  //render fetched options/answers from server
  const renderAnswers = getAnswers({ handleClick, isActive });

  useEffect(fetchQuiz, [quizzes]);

  if (!quizzes) {
    return <div>loading...</div>;
  }

  if (currentIndex === quizzes.length) {
    return <Result data={chosenAnswers} />;
  }

  const quiz = quizzes[currentIndex];
  const count = currentIndex + 1 + "/" + quizzes.length;
  return (
    <div className="App">
      <h1 className={"quiz-title"}>Quiz app</h1>
      <div className="main-div">
        <div style={{ color: "white", fontSize: "30px" }}>
          Question {count} : {quiz.question}
        </div>
        {quiz.answers.map((i, answer) => {
          return renderAnswers(answer, i);
        })}

        <div className={"next-btn"} onClick={() => handleNextQuestion()}>
          Next
        </div>
      </div>
    </div>
  );
}

export default App;
