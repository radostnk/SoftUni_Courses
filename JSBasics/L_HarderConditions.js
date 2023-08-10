function weekday(input) {
    let number = Number(input[0]);
    switch(number) {
        case 1: 
        console.log("Monday");
        break;

        case 2: 
        console.log("Tuesday");
        break;

        case 3:
        console.log("Wednesday");
        break;

        case 4:
        console.log("Thursday");
        break;

        case 5:
        console.log("Friday");
        break;

        case 6:
        console.log("Saturday");
        break;

        case 7: console.log("Sunday");
        break;

        default:
        console.log("Error");
        break;
    }
}

function workdayOrNot(input) {
    let day = (input[0]);
    switch(day) {
        case "Monday": 
        case "Tuesday": 
        case "Wednesday":
        case "Thursday":
        case "Friday":
        console.log("Working day");
        break;

        case "Saturday":
        case "Sunday": 
        console.log("Weekend");
        break;

        default:
        console.log("Error");
        break;
    }
}

function animalType(input) {
    let animal = input[0];
    switch(animal) {
        case "dog":
        console.log("mammal");
        break;

        case "crocodile":
        case "tortoise":
        case "snake":
        console.log("reptile");
        break;

        default:
        console.log("unknown");
        break;
    }
}

function calling(input) {
    let age = Number(input[0]);
    let gender = input[1];

    if (gender == 'f') {
        if (age >= 16) {
            console.log("Ms.");
        } else {
            console.log("Miss");
        }
    } else if (gender == 'm') {
        if (age >= 16) {
            console.log("Mr.");
        } else {
            console.log("Master");
        }
    } 
}


function smallShop(input) {
    let product = input[0];
    let city = input[1];
    let quantity = input[2];
    let sum = 0;

    switch(city) {
        case "Sofia":
            switch(product) {
                case "coffee":
                    sum = quantity * 0.5;
                    break;
                case "water":
                    sum = quantity * 0.8;
                    break;
                case "beer":
                    sum = quantity * 1.2;
                    break;
                case "sweets":
                    sum = quantity * 1.45;
                    break;
                case "peanuts":
                    sum = quantity * 1.6;
                    break;
            }
            break;
        case "Plovdiv":
            switch(product) {
                case "coffee":
                    sum = quantity * 0.4;
                    break;
                case "water":
                    sum = quantity * 0.7;
                    break;
                case "beer":
                    sum = quantity * 1.15;
                    break;
                case "sweets":
                    sum = quantity * 1.3;
                    break;
                case "peanuts":
                    sum = quantity * 1.5;
                    break;
            }
            break;
        case "Varna":
            switch(product) {
                case "coffee":
                    sum = quantity * 0.45;
                    break;
                case "water":
                    sum = quantity * 0.7;
                    break;
                case "beer":
                    sum = quantity * 1.1;
                    break;
                case "sweets":
                    sum = quantity * 1.35;
                    break;
                case "peanuts":
                    sum = quantity * 1.55;
                    break;
            }
            break;
    }
    console.log(sum);
}

function numberInRange(input) {
    let myNum = Number(input[0]);

    if (myNum >= -100 && myNum <= 100 && myNum != 0) {
        console.log("Yes");
    } else {
        console.log("No");
    }
}

function workingHours(input) {
    let time = Number(input[0]);
    let day = input[1];

    if (day != "Sunday" && time >= 10 && time <= 18) {
        console.log("open");
    } else {
        console.log("closed");
    }
}

function cinemaTicket(input) {
    let dayOfWeek = input[0];

    switch(dayOfWeek) {
        case "Monday":
        case "Tuesday":
        case "Friday":
            console.log(12);
            break;
        case "Wednesday":
        case "Thursday":
            console.log(14);
            break;
        case "Saturday":
        case "Sunday":
            console.log(16);
            break;
    }
}

function fruitOrVeggie(input) {
    let myProduct = input[0];
    switch(myProduct) {
        case "banana":
        case "apple":
        case "kiwi":
        case "cherry":
        case "lemon":
        case "grapes":
            console.log("fruit");
            break;
        case "tomato":
        case "cucumber":
        case "pepper":
        case "carrot":
            console.log("vegetable");
            break;
        default:
            console.log("unknown");
            break;
    }
}

function invalidNum(input) {
    let myNumber = Number(input[0]);

    if (!((myNumber >= 100 && myNumber <= 200) || myNumber == 0)) {
        console.log("invalid");
    }
}

function fruitShop(input) {
    let fruitType = input[0];
    let dayFromWeek = input[1];
    let fruitQuantity = input[2];
    let mySum = 0;
    let hasError = false;

    switch(dayFromWeek) {
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
            switch(fruitType) {
                case "banana":
                    mySum = fruitQuantity * 2.5;
                    break;
                case "apple":
                    mySum = fruitQuantity * 1.2;
                    break;
                case "orange":
                    mySum = fruitQuantity * 0.85;
                    break;
                case "grapefruit":
                    mySum = fruitQuantity * 1.45;
                    break;
                case "kiwi":
                    mySum = fruitQuantity * 2.7;
                    break;
                case "pineapple":
                    mySum = fruitQuantity * 5.5;
                    break;
                case "grapes":
                    mySum = fruitQuantity * 3.85;
                    break;
                default:
                    hasError = true;
            }
            break;
        case "Saturday":
        case "Sunday":
            switch(fruitType) {
                case "banana":
                    mySum = fruitQuantity * 2.7;
                    break;
                case "apple":
                    mySum = fruitQuantity * 1.25;
                    break;
                case "orange":
                    mySum = fruitQuantity * 0.9;
                    break;
                case "grapefruit":
                    mySum = fruitQuantity * 1.6;
                    break;
                case "kiwi":
                    mySum = fruitQuantity * 3;
                    break;
                case "pineapple":
                    mySum = fruitQuantity * 5.6;
                    break;
                case "grapes":
                    mySum = fruitQuantity * 4.2;
                    break;
                default:
                    hasError = true;
            }
        break;
        default:
            hasError = true;
    }
    if (!hasError) {
        console.log(mySum.toFixed(2));
    } else {
        console.log("error");
    }
}

function taxes(input) {
    let town = input[0];
    let sales = Number(input[1]);
    let taxToPay = 0;
    let error = false;

    switch(town) {
        case "Sofia":
            if (sales < 0) {
                error = true;
            } else if (sales <= 500) {
                taxToPay = 0.05 * sales;
            } else if (sales <= 1000) {
                taxToPay = 0.07 * sales;
            } else if (sales <= 10000) {
                taxToPay = 0.08 * sales;
            } else {
                taxToPay = 0.12 * sales;
            }
        break;
        case "Plovdiv":
            if (sales < 0) {
                error = true;
            } else if (sales <= 500) {
                taxToPay = 0.055 * sales;
            } else if (sales <= 1000) {
                taxToPay = 0.08 * sales;
            } else if (sales <= 10000) {
                taxToPay = 0.12 * sales;
            } else {
                taxToPay = 0.145 * sales;
            }
        break;
        case "Varna":
            if (sales < 0) {
                error = true;
            } else if (sales <= 500) {
                taxToPay = 0.045 * sales;
            } else if (sales <= 1000) {
                taxToPay = 0.075 * sales;
            } else if (sales <= 10000) {
                taxToPay = 0.1 * sales;
            } else {
                taxToPay = 0.13 * sales;
            }
        break;
        default:
            error = true;
    }
    if (!error) {
        console.log(taxToPay.toFixed(2));
    } else {
        console.log("error");
    }
}

