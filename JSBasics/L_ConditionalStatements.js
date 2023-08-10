function isExcellent(input) {
    let grade = (input[0]);
    if (grade >= 5.5) {
        console.log("Excellent!")
    }
}

function whichIsGreater(input) {
    let a = Number(input[0]);
    let b = Number(input[1]);
    if (a > b) {
        console.log(a);
    }
    else {
        console.log(b);
    }
}

function evenOrOdd(input) {
    let number = Number(input[0]);
    if (number % 2 == 0) {
        console.log("even");
    }
    else {
        console.log("odd");
    }
}

function passwordGuess(input) {
    let guessPass = (input[0]);
    let realPass = "s3cr3t!P@ssw0rd";
    if (guessPass == realPass) {
        console.log("Welcome");
    }
    else {
        console.log("Wrong password!");
    }
}

function sortNumbers(input) {
    let number = Number(input[0]);
    if (number < 100) {
        console.log("Less than 100");
    }
    else if (number <= 200) {
        console.log("Between 100 and 200");
    }
    else {
        console.log("Greater than 200");
    }
}

function speed(input) {
    let speed = Number(input[0]);
    if (speed <= 10) {
        console.log("slow");
    }   
    else if (speed <= 50) {
        console.log("average");
    }
    else if (speed <= 150) {
        console.log("fast");
    }
    else if (speed <= 1000) {
        console.log("ultra fast");
    }
    else {
        console.log("extremely fast");
    }
}

function figureArea(input) {
    let figure = input[0];
    let result = 0;

    if (figure === "square") {
        let a = Number(input[1]);

        result = a*a;
    }
    else if (figure === "rectangle") {
        let b = Number(input[1]);
        let c = Number(input[2]);

        result = b*c;
    }
    else if (figure === "circle") {
        let d = Number(input[1]);

        result = (Math.PI) * Math.pow(d, 2);
    }
    else if (figure === "triangle") {
        let e = Number(input[1]);
        let f = Number(input[2]);

        result = (e*f)/2;
    }
    console.log(result.toFixed(3));
}
