import {useEffect, useState} from 'react';
import Result from './Result'
import './App.css';

 function App() {

   const [quizzes, setQuizzes] = useState(null);
     const [currentIndex, setCurrentIndex] = useState(0);
     const [result, setResult] = useState(null);

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

     const sendAnswers = (answerId, questionId) => {

       fetch("http://localhost:8080/api/answers", {
         method: "PUT",
         headers: {
           "Content-Type": "application/json",
         },
         body: JSON.stringify({ answerId, questionId }),
       }).then(response => response.json()).then(data => {

         setResult(data);
       })

     }



     const handleClick = (key) => {

       setCurrentIndex(currentIndex + 1);
       let id = key;
       sendAnswers(key, quizzes[currentIndex].id)
     }

     const renderAnswers = (key, answer) => {
       return <div key={key} id={key} onClick={() => handleClick(key)}>{answer}</div>
     }

     useEffect(fetchQuiz, [quizzes]);

     if (!quizzes) {
       return <div>loading...</div>;
     }

     if (currentIndex === quizzes.length - 1) {

       return <Result fetchedResults={result} />
     }

     const quiz = quizzes[currentIndex];
     const count = (currentIndex + 1) + "/" + quizzes.length;
     return (
       <div className="App">
         <h1>Quiz app</h1>
         <div>
           <div>Question {count} : {quiz.question}</div>
           {quiz.answers ? quiz.answers.map((answer, i) => {

             return renderAnswers(i, answer, quiz.indexOfRightAnswer === i)
           }) : "loading..."}
         </div>
       </div>
     );
}

export default App;
