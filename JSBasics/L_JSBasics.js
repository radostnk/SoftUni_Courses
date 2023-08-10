function hello() {
    console.log("Hello SoftUni!");
}

function printNumbers() {
    console.log(1);
    console.log(2);
    console.log(3);
    console.log(4);
    console.log(5);
    console.log(6);
    console.log(7);
    console.log(8);
    console.log(9);
    console.log(10);
}

function sqareArea(input) {
    let a = Number(input[0]);
    let area = a * a;

    console.log(area);
}

function inchToSmConverter(input) {
    let inch = Number(input[0]);
    let sm = inch * 2.54;

    console.log(sm);
}

function greetingByName(input) {
    let name = input[0];
    console.log(`Hello, ${name}!`)
}

function concatData(input) {
    let fname = input[0];
    let lname = input[1];
    let age = input[2];
    let town = input[3];

    console.log(`You are ${fname} ${lname}, a ${age}-years old person from ${town}.`);
}

function architect(input) {
    let name = input[0];
    let numProjects = Number(input[1]);
    let hoursNeeded = numProjects * 3;

    console.log(`The architect ${name} will need ${hoursNeeded} hours to complete ${numProjects} project/s.`)
}

function petShop(input) {
    let dogFoodNum = Number(input[0]);
    let catFoodNum = Number(input[1]);
    let foodPrice = dogFoodNum * 2.5 + catFoodNum * 4;

    console.log(foodPrice);
}

function greening(input) {
    let sqmGreened = Number(input[0]);
    let price = sqmGreened * 7.61;
    let discount = price * 0.18;
    let finalPrice = price - discount;

    console.log(`The final price is: ${finalPrice} lv.`);
    console.log(`The discount is: ${discount} lv.`);
}
