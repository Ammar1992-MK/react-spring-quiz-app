import React from 'react'
import { useEffect, useState } from 'react';


const Result = ({ fetchedResults }) => {


    useEffect(() => {

        console.log(fetchedResults);
    }, [])

    if (!fetchedResults) {

        return <div>loading...</div>
    }


    return (
        <div>
            <div>Results</div>
        </div>
    )
}
export default Result;