function readWords(input) {
    let index = 0;
    let word = input[index];
    while (word !== "Stop") {
        console.log(word);
        index ++;
        word = input[index];
    }
}

function login(input) {
    let username = input[0];
    let password = input[1];
    let realPass = input[3];
    let index = 3;

    while (password !== realPass) {
        password = input[index];
        index ++;
    }
    console.log(`Welcome ${username}!`);
}

function readNum(input) {
    let firstNum = Number(input[0]);
    let index = 1;
    let finalNum = 0;

    while(finalNum < firstNum) {
        let nextNum = Number(input[index]);
        index ++;
        finalNum += nextNum;
    }
    console.log(finalNum);
}

function numbers(input) {
    let end = Number(input[0]);
    let nextNum = 1;

    while(nextNum <= end) {
        console.log(nextNum);
        nextNum = nextNum * 2 + 1;
    }
}

function bankAccount(input) {
    let finalSum = 0;
    let index = 0;
    let command = 0;
    command = input[index];
    index ++;

    while (command !== "NoMoreMoney") {
        let nextTransaction = Number(command);
        if (nextTransaction <= 0) {
            console.log("Invalid operation!");
            break;
        }
        console.log(`Increase: ${nextTransaction.toFixed(2)}`);
        finalSum += nextTransaction;
        command = input[index];
        index ++;
    }
    console.log(`Total: ${finalSum.toFixed(2)}`);
}

function largestNum(input) {
    let index = 0;
    let command = input[index];
    index ++;
    let largestNum = Number.MIN_SAFE_INTEGER;

    while(command !== "Stop") {
        let newNum = Number(command);

        if (newNum > largestNum) {
            largestNum = newNum;
        }
        command = input[index];
        index ++;
    }
    console.log(largestNum);
}

function minNumber(input) {
    let index = 0;
    let minNum = Number.MAX_SAFE_INTEGER;
    let command = input[index];
    index++;

    while(command !== "Stop") {
        let curNum = Number(command);

        if (curNum < minNum) {
            minNum = curNum;
        }
        command = input[index];
        index ++;
    }
    console.log(minNum);
}

function averageGrade(input) {
    let student = input[0];
    let index = 1;
    let curClass = 1;
    let repeatCount = 0;
    let average = 0; 

    while(index <= input.length) {
        let curGrade = Number(input[index]);
        average += curGrade;

        if (curGrade < 4) {
            repeatCount ++;
        } else {
            curClass ++;
        }
        if (repeatCount >= 2) {
            console.log(`${student} has been excluded at ${curClass} grade`);
            break;
        }
        if (curClass == 13) {
            console.log(`${student} graduated. Average grade: ${(average/12).toFixed(2)}`);
            break;
        }
        index ++;
    }
}
averageGrade(["Mimi", 
"5",
"6",
"5",
"6",
"5",
"6",
"6",
"2",
"3"])




