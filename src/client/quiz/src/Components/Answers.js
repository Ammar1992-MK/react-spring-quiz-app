
export function getAnswers({handleClick, isActive}) {

    const renderAnswers = (key, answer) => {
        return <div className={"answer"}
                    style={isActive === key ?{backgroundColor : "grey"} : { backgroundColor :"#cb7070"}}
                    key={key} id={key}
                    onClick={() => handleClick(key)}
                    >{answer}
                    </div>
    }
    return renderAnswers;
}