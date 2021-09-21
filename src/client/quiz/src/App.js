import {useEffect, useState} from 'react';
import './App.css';

 function App() {

   const [quizzes, setQuizzes] = useState(null);
     const [currentIndex, setCurrentIndex] = useState(0);

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


     const handleClick = (correct) => {
       if (correct) {
         alert("Correct Answer");
       } else {
         alert("Wrong Answer!! :(")
       }
     }

     const renderAnswers = (key, answer, correct) => {
       return <div key={key} onClick={() => console.log("Clicked")}>{answer}</div>
     }

     useEffect(fetchQuiz, [quizzes]);

     if (!quizzes) {
       return <div>loading...</div>;
     }

     const quiz = quizzes[currentIndex];
     const count = (currentIndex + 1) + "/" + quizzes.length;
     return (
       <div className="App">
         <h1>Quiz app</h1>
         <div>
           <div>Question {count} : {quiz.question}</div>
           {quiz.answers ? quiz.answers.map((answer, i) => {

             return renderAnswers(i, answer)
           }) : "loading..."}
         </div>
       </div>
     );
}

export default App;
