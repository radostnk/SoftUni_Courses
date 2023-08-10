function numbers() {
    for (let i=1; i <= 100; i++) {
        console.log(i);
    }
}

function numbersBack(input) {
    let n = Number(input[0]);
    for (i = n; i >= 1; i--) {
        console.log(i);
    }
}

function numbersThreePass(input) {
    let m = Number(input[0]);
    for(let i = 1; i <= m; i += 3) {
        console.log(i);
    }
}

function evenPowers2(input) {
    let p = Number(input[0]);
    for(let i = 0; i <= p; i += 2) {
        let result = Math.pow(2, i);
        console.log(result);
    }
}

function string(input) {
    let myString = input[0];
    for (let i = 0; i <= myString.length - 1; i ++) {
        console.log(myString[i]);
    }
}

function vowelsSum(input) {
    let text = input[0];
    let sum = 0;

    for (let i = 0; i <= text.length-1; i++) {
        let ch = text[i];
        switch (ch) {
            case "a": sum += 1;
            break;
            case "e": sum += 2;
            break;
            case "i": sum += 3;
            break;
            case "o": sum += 4;
            break;
            case "u": sum += 5;
            break;
        }
    }
    console.log(sum); 
}

function numbersSum(input) {
    let num = input[0];
    let sumNum = 0;

    for (let i = 0; i <= num.length-1; i++) {
        let f = num[i];
        sumNum += Number(f);
    }
    console.log(`The sum of the digits is:${sumNum}`); 
}

function divisibleByNine(input) {
    let begin = Number(input[0]);
    let end = Number(input[1]);
    let mySum = 0;
    let buff = "";

    for (let i = begin; i <= end; i++) {
        if (i % 9 == 0) {
            mySum += i;
            buff += i + "\n";
        }
    }
    console.log(`The sum: ${mySum}`);
    console.log(buff);
}
divisibleByNine(["1", "18"])