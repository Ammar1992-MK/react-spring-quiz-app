import React from 'react'
import { useEffect, useState } from 'react';


const Result = ({ data }) => {

    const [results, setResults] = useState();

    const sendAnswers = () => {
        fetch("http://localhost:8080/api/answers", {
            method: "PUT",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(data),
        }).then(response => response.json()).then((data) => {

            console.log(data);
            setResults(data)
        })
    }


    useEffect(sendAnswers,[])

    if(!results){
        return <div>loading...</div>
    }

    return (
        <div className={"results"}>
            <div className={"result-title"}>Results</div>
            <div className={"result-container"}>
                <div className={"result-correct"}>{results.correctAnswers} correct</div>
                <div className={"result-wrong"}>{results.wrongAnswers} wrong</div>
            </div>
        </div>
    )
}
export default Result;