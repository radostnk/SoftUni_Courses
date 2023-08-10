function pyramid(input) {
    let n = Number(input[0]);
    let current = 1;
    let isBigger = false;
    let printCurrentLine = "";

    for(let rows = 1; rows <= n; rows++) {
        for (let cols = 1; cols <= rows; cols++) {
            if (current > n) {
                isBigger = true;
                break;
            }
            printCurrentLine += current + " ";
            current ++;
        }
        console.log(printCurrentLine);
        printCurrentLine = "";
        if(isBigger) {
            break;
        }
    }
}
pyramid(["12"])

function equalSums (input) {
    let start = Number(input[0]);
    let end = Number(input[1]);
    let validNums = "";

    for (let i = start; i <= end; i++) {
        let oddSum = 0;
        let evenSum = 0;
     // let currNum = "" + i; converts the number to string
        let currNum = i.toString();

        for (let j = 0; j < currNum.length; j++) {
            let currDigit = Number(currNum[j]);
            let position = j + 1;

            if (position % 2 == 0) {
                evenSum += currDigit;
            } else {
                oddSum += currDigit;
            }
        }

        if (evenSum == oddSum) {
            validNums += currNum + " ";
        }
    }
    console.log(validNums);
}

function numsSum(input) {
    let index = 0;
    let command = input[index];
    let primeSum = 0;
    let nonPrimeSum = 0;

    while (command != "stop") {
        let num = Number(command);
        let counter = 0;

        if (num < 0) {
            console.log("Number is negative.");
            index ++;
            command = input[index];
            continue;
        } 

        for(i=1; i <= num; i++) {
            if (num % i == 0) {
                counter ++;
            }
        }
        if (counter > 2) {
            nonPrimeSum += num;
        } else {
            primeSum += num;
        }
        index++;
        command = input[index];
    }
    console.log(`Sum of all prime numbers is: ${primeSum}`);
    console.log(`Sum of all non prime numbers is: ${nonPrimeSum}`);
}

function trainTheTrainers(input) {
    let juryNum = Number(input[0]);
    let index = 1;
    let command = input[index];
    let averageGrade = 0;
    let totalAverage = 0;
    let presentationsCount = 0;

    while(command != "Finish") {
        let presentationName = command;
        index++;
        let currGrade = 0;
        averageGrade = 0;
        presentationsCount ++;

        for (let i = 1; i <= juryNum; i++) {
            currGrade = Number(input[index]);
            index++;
            averageGrade += currGrade; 
        }
        command = input[index];
        averageGrade = averageGrade / juryNum;
        totalAverage += averageGrade;
        console.log(`${presentationName} - ${averageGrade.toFixed(2)}.`);
    }

    totalAverage = totalAverage / presentationsCount;
    console.log(`Student's final assessment is ${totalAverage.toFixed(2)}.`);
}

function specialNums(input) {
    let n = Number(input[0]);
    let isSpecialCount = 0;
    let allSpecialNums = "";

    for (let i = 1111; i <= 9999; i++) {
        let currNum = i.toString();
        isSpecialCount = 0;

        for (let j = 0; j < currNum.length; j++) {
            let currDigit = currNum[j];
            if (n % Number(currDigit) == 0) {
                isSpecialCount ++;
            } 
        }
        if (isSpecialCount == 4) {
            allSpecialNums += currNum + " ";
        }
    }
    console.log(allSpecialNums);
}

function cinemaTickets(input) {
    let index = 0;
    let command = input[index];
    let studentTickets = 0;
    let kidTickets = 0;
    let standardTickets = 0;
    let allTickets = 0;

    while(command !== "Finish") {
        let movieTitle = command;
        index++;
        let freeSpaces = Number(input[index]);
        index++;
        let command1 = input[index];
        let spacesTaken = 0;

        while(command1 !== "End") {
            let ticketType = command1;
            allTickets ++;

            switch (ticketType) {
                case "standard":
                    standardTickets ++;
                break;

                case "student":
                    studentTickets ++;
                break;

                case "kid":
                    kidTickets ++;
                break;
            }
            spacesTaken ++;

            if (freeSpaces == spacesTaken) {
                break;
            }

            index++;
            command1 = input[index];
        }

        index ++;
        command = input[index];  

        let percentFull = (spacesTaken / freeSpaces) * 100;
        console.log(`${movieTitle} - ${percentFull.toFixed(2)}% full.`);
    }

    let totalTickets = kidTickets + standardTickets + studentTickets;
    let kidPercent = kidTickets / totalTickets * 100;
    let studentPercent = studentTickets / totalTickets * 100;
    let standardPercent = standardTickets / totalTickets * 100;

    console.log(`Total tickets: ${totalTickets}`);
    console.log(`${studentPercent.toFixed(2)}% student tickets.`);
    console.log(`${standardPercent.toFixed(2)}% standard tickets.`);
    console.log(`${kidPercent.toFixed(2)}% kids tickets.`);
}