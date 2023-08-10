function printHours() {
    for (let i = 0; i <= 23; i++) {
        for (let m = 0; m <= 59; m++) {
            console.log(`${i}:${m}`);
        }
    } 
}

function multiplicationTable() {
    for (let a = 1; a <= 10; a++) {
        for (let b = 1; b <= 10; b++) {
            result = a * b;
            console.log(`${a} * ${b} = ${result}`);
        }
    }
}

function combinations(input) {
    let n = Number(input[0]);
    let validCombinations = 0;

    for (let x1 = 0; x1 <= n; x1 ++) {
        for (let x2 = 0; x2 <= n; x2 ++) {
            for (x3 = 0; x3 <= n; x3 ++) {
                if (x1 + x2 + x3 == n) {
                     validCombinations ++;
                }
            }
        }
    }
    console.log(validCombinations);
}

function numbersSum(input) {
    let start = Number(input[0]);
    let end = Number(input[1]);
    let magicNum = Number(input[2]);
    let breakFlag = false;
    let counter = 0;

    for (let i = start; i <= end; i++) {
        for (let j = start; j <= end; j++) {
            counter ++;
            if (i + j == magicNum) {
                breakFlag = true;
                console.log(`Combination N:${counter} (${i} + ${j} = ${magicNum})`);
                break;
            }
        }
        if (breakFlag) { break; }
    }

    if (!breakFlag) {
        console.log(`${counter} combinations - neither equals ${magicNum}`);
    }
}

function travelling(input) {
    let index = 0;
    let command = input[index];
    index++;

    while(command !== "End") {
        let destination = command;
        let budget = Number(input[index])
        index ++;
        let savedMoney = 0;
        while (savedMoney < budget) {
            let sum = Number(input[index]);
            index ++;
            savedMoney += sum;
        }
        console.log(`Going to ${destination}!`);
        command = input[index];
        index++;
    }
}

function building(input) {
    let floors = Number(input[0]);
    let roomsPerFloor = Number(input[1]);

    for (let i=floors; i > 0; i--) {
        let buff = "";
        for (let j=0; j < roomsPerFloor; j++) {
            if (i === floors) {
                buff += "L" + i + j + " ";
            } else if (i % 2 === 0) {
                buff += "O" + i + j + " ";
            } else if (i % 2 !== 0){
                buff += "A" + i + j + " ";
            }
        }
        console.log(buff);
    }
}