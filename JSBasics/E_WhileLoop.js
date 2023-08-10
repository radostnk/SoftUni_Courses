function oldLibrary(input) {
    let favBook = input[0];
    let index = 1;
    let libraryBook = input[index];
    let booksChecked = 0;

    while(libraryBook != "No More Books") {
        if (favBook === libraryBook) {
            console.log(`You checked ${booksChecked} books and found it.`);
            break;
        }
        booksChecked ++;
        index ++;
        libraryBook = input[index];
    }
    if (favBook != libraryBook) {
        console.log(`The book you search is not here!`);
        console.log(`You checked ${booksChecked} books.`);
    }
}

function examPreparation(input) {
    let badGrades = Number(input[0]);
    let index = 1;
    let task = input[index];
    let taskGrade = Number(input[index + 1]);
    let tasksDone = 0;
    let gradesSum = 0;
    let counter = 0;
    let breakFlag = false;

    while (task != "Enough") {
        if (taskGrade <= 4) {
            counter ++;
            if (counter >= badGrades) {
                breakFlag = true;
                console.log(`You need a break, ${counter} poor grades.`);
                break;
            }
        }
        gradesSum += taskGrade;
        tasksDone ++;
        index += 2;
        task = input[index];
        taskGrade = Number(input[index + 1]);
    }
    if (!breakFlag) {
        let average = gradesSum / tasksDone;
        let lastTask = input[index - 2];
        console.log(`Average score: ${average.toFixed(2)}`);
        console.log(`Number of problems: ${tasksDone}`);
        console.log(`Last problem: ${lastTask}`);
    }
}

function vacation(input) {
 
    let index = 0;
 
    let vacationPrice = Number(input[index]);
    index++;
 
    let availableMoney = Number(input[index]);
    index++;
 
    let command = input[index];
    index++;
 
    let amount = Number(input[index]);
    index++;
 
    let daysCounter = 0;
    let spendDaysCounter = 0;
 
    while (index <= input.length) {
 
        daysCounter++;
 
        if (command === "spend") {
            spendDaysCounter++;
            availableMoney -= amount;
 
            if (spendDaysCounter === 5) {
                console.log(`You can't save the money.`);
                console.log(`${daysCounter}`);
                break;
            }
 
        } else {
            availableMoney += amount;
            spendDaysCounter = 0;
        }
 
        if (availableMoney < 0) {
            availableMoney = 0;
        }
 
        if (availableMoney >= vacationPrice) {
            console.log(`You saved the money for ${daysCounter} days.`);
            break;
        }
        command = input[index];
        index++;
        amount = Number(input[index]);
        index++;
    }
}

function stepsFunc(input) {
    let index = 0;
    let operation = input[index];
    let totalSteps = 0;
    let stopFlag = false;
    let steps = 0;

    while (operation != "Going home") {
        steps = Number(operation);
        totalSteps += steps;
        if (totalSteps >= 10000) {
            console.log(`Goal reached! Good job!`);
            console.log(`${totalSteps - 10000} steps over the goal!`);
            stopFlag = true;
            break;
        } 
        index ++;
        operation = input[index];
    }
    if (!stopFlag) {
        index ++;
        steps = Number(input[index]);
        totalSteps += steps;

        if (totalSteps > 10000) {
            console.log(`Goal reached! Good job!`);
            console.log(`${totalSteps - 10000} steps over the goal!`);
        } else {
            console.log(`${10000 - totalSteps} more steps to reach goal.`);
        }
    }
}

function coins(input) {
    let inputCoins = Number(input[0]);
    let coinsBack = Math.floor(inputCoins * 100);
    let counter = 0;

    while (coinsBack != 0) {
        if (coinsBack - 200 >= 0) {
            counter ++;
            coinsBack -= 200;
        } else if (coinsBack - 100 >= 0) {
            counter ++;
            coinsBack -= 100;
        } else if (coinsBack - 50 >= 0) {
            counter ++;
            coinsBack -= 50;
        } else if (coinsBack - 20 >= 0) {
            counter ++;
            coinsBack -= 20;
        } else if (coinsBack - 10 >= 0) {
            counter ++;
            coinsBack -= 10;
        } else if (coinsBack - 5 >= 0) {
            counter ++;
            coinsBack -= 5;
        } else if (coinsBack - 2 >= 0) {
            counter ++;
            coinsBack -= 2;
        } else if (coinsBack - 1 >= 0) {
            counter ++;
            coinsBack -= 1;
        }
    }
    console.log(counter);
}

function cakeSize(input) {
    let length = Number(input[0]);
    let width = Number(input[1]);
    let piecesLeft = length * width;
    let index = 2;
    let operation = input[index];
    let breakFlag = false;

    while (operation != "STOP") {
        let piecesTaken = Number(operation);
        piecesLeft -= piecesTaken;

        if (piecesLeft <= 0) {
            console.log(`No more cake left! You need ${Math.abs(piecesLeft)} pieces more.`);
            breakFlag = true;
            break;
        }

        index++;
        operation = input[index];
    }
    if (!breakFlag) {
        console.log(`${piecesLeft} pieces are left.`);
    }
}

function houseMoving(input) {
    let width = Number(input[0]);
    let length = Number(input[1]);
    let height = Number(input[2]);
    let space = width * height * length;
    let index = 3;
    let operation = input[index];
    let breakFlag = false;

    while (operation != "Done") {
        let boxes = Number(operation);
        if (space >= boxes) {
            space -= boxes;
        } else {
            space -= boxes;
            console.log(`No more free space! You need ${Math.abs(space)} Cubic meters more.`);
            breakFlag = true;
            break;
        }
        index ++;
        operation = input[index];
    }
    if(!breakFlag) {
        console.log(`${space} Cubic meters left.`);
    }
}