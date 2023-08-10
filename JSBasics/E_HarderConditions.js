function cinema(input) {
    let projType = input[0];
    let rows = Number(input[1]);
    let columns = Number(input[2]); 
    let income = 0;

    if (projType == "Premiere") {
        income = 12 * rows * columns;
    } else if (projType == "Normal") {
        income = 7.5 * rows * columns;
    } else if (projType == "Discount") {
        income = 5 * rows * columns;
    }
    console.log(`${income.toFixed(2)} leva`);
}

function weather(input) {
    let degrees = Number(input[0]);
    let time = input[1];
    let outfit;
    let shoes;

    if (degrees >= 10 && degrees <= 18) {
        if (time == "Morning") {
            outfit = "Sweatshirt";
            shoes = "Sneakers";
        } else if (time == "Afternoon" || time == "Evening") {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
    } else if (degrees > 18 && degrees <= 24) {
        if (time == "Morning" || time == "Evening") {
            outfit = "Shirt";
            shoes = "Moccasins";
        } else if (time == "Afternoon") {
            outfit = "T-Shirt";
            shoes = "Sandals";
        }
    } else if (degrees >= 25) {
        if (time == "Morning") {
            outfit = "T-Shirt";
            shoes = "Sandals";
        } else if (time == "Afternoon") {
            outfit = "Swim Suit";
            shoes = "Barefoot";
        } else if (time == "Evening") {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
    }
    console.log(`It's ${degrees} degrees, get your ${outfit} and ${shoes}.`);
}

function newHome(input) {
    let flowers = input[0];
    let quantity = Number(input[1]);
    let budget = Number(input[2]);
    let endSum = 0;

    switch (flowers) {
        case "Roses": 
            endSum = quantity * 5;
            if (quantity > 80) {
                endSum -= endSum * 0.1;
            }
        break;
        case "Dahlias": 
            endSum = quantity * 3.8;
            if (quantity > 90) {
                endSum -= endSum * 0.15;
            }
        break;
        case "Tulips":
            endSum = quantity * 2.8;
            if (quantity > 80) {
                endSum -= endSum * 0.15;
            }
        break;
        case "Narcissus":
            endSum = quantity * 3;
            if (quantity < 120) {
                endSum += endSum * 0.15;
            }
        break;
        case "Gladiolus":
            endSum = quantity * 2.5;
            if (quantity < 80) {
                endSum += endSum * 0.2;
            }
        break;
    }
    let moneyLeft = Math.abs(budget - endSum);

    if (budget >= endSum) {
        console.log(`Hey, you have a great garden with ${quantity} ${flowers} and ${moneyLeft.toFixed(2)} leva left.`);
    } else {
        console.log(`Not enough money, you need ${moneyLeft.toFixed(2)} leva more.`);
    }
}

function fishingBoat(input) {
    let fishermenBudget = Number(input[0]);
    let season = input[1];
    let fishermenNum = Number(input[2]);
    let boatPrice = 0;
    let end = 0;

    switch (season){
        case "Spring":
            boatPrice = 3000;
            break;
        case "Summer":
            boatPrice = 4200;
            break;
        case "Autumn":
            boatPrice = 4200;
            break;
        case "Winter":
            boatPrice = 2600;
            break;
    }

    if (fishermenNum <= 6) {
        boatPrice -= boatPrice * 0.1;
    } else if (fishermenNum > 7 && fishermenNum <= 11) {
        boatPrice -= boatPrice * 0.15;
    } else if (fishermenNum > 12) {
        boatPrice -= boatPrice * 0.25;
    }

    if (season != "Autumn" && fishermenNum % 2 == 0) {
        boatPrice -= boatPrice * 0.05;
    }
    let leftMoney = Math.abs(fishermenBudget - boatPrice);

    if (fishermenBudget >= boatPrice) {
        console.log(`Yes! You have ${leftMoney.toFixed(2)} leva left.`);
    } else {
        console.log(`Not enough money! You need ${leftMoney.toFixed(2)} leva.`);
    }
}

function journey(input) {
    let devBudget = Number(input[0]);
    let journeySeason = input[1];
    let journeyType;
    let journeyPrice = 0;
    let journeyPlace;

    if (devBudget <= 100) {
        journeyPlace = "Bulgaria";
        if (journeySeason == "summer") {
            journeyType = "Camp";
            journeyPrice = 0.3 * devBudget;
        } else if (journeySeason == "winter") {
            journeyType = "Hotel";
            journeyPrice = devBudget * 0.7;
        }
    } else if (devBudget <= 1000) {
        journeyPlace = "Balkans";
        if (journeySeason == "summer") {
            journeyType = "Camp";
            journeyPrice = 0.4 * devBudget;
        } else if (journeySeason == "winter") {
            journeyType = "Hotel";
            journeyPrice = devBudget * 0.8;
        }
    } else if (devBudget > 1000) {
        journeyPlace = "Europe";
        journeyType = "Hotel";
        journeyPrice = devBudget * 0.9;
    }

    console.log(`Somewhere in ${journeyPlace}`);
    console.log(journeyType + " - " + journeyPrice.toFixed(2));
}

function numberOperations(input) {
    let n1 = Number(input[0]);
    let n2 = Number(input[1]);
    let operator = input[2];
    let result = 0;
    let zeroDivision = false;
    let evenOdd;

    switch (operator) {
        case "+":
            result = n1 + n2;
        break;
        
        case "-":
            result = n1 - n2;
        break;

        case "*":
            result = n1 * n2;
        break;

        case "/":
            if (n2 == 0) {
                zeroDivision = true;
            } else {
                result = n1 / n2;
            }
        break;

        case "%":
            if (n2 == 0) {
                zeroDivision = true;
            } else {
                result = n1 % n2;
            }
        break;
    }
    if (operator == "+" || operator == "-" || operator == "*") {
        if (result % 2 == 0) {
            evenOdd = "even"
        } else {
            evenOdd = "odd";
        }
        console.log(`${n1} ${operator} ${n2} = ${result} - ${evenOdd}`);
    } else if (operator == "/") {
        if(zeroDivision) {
            console.log(`Cannot divide ${n1} by zero`);
        } else {
            console.log(`${n1} / ${n2} = ${result.toFixed(2)}`);
        }
    } else if (operator == "%") {
        if (zeroDivision) {
            console.log(`Cannot divide ${n1} by zero`);
        } else {
            console.log(`${n1} % ${n2} = ${result}`);
        }
    }
}

function hotelRoom(input) {
    let month = input[0];
    let nights = Number(input[1]);
    let apartmentPrice = 0;
    let studioPrice = 0;

    if (month == "May" || month == "October") {
        studioPrice = 50;
        apartmentPrice = 65;
        if (nights > 7 && nights <= 14) {
            studioPrice -= studioPrice * 0.05;
        } else if (nights > 14) {
            studioPrice -= studioPrice * 0.3;
        }
    } else if (month == "June" || month == "September") {
        studioPrice = 75.2;
        apartmentPrice = 68.7;
        if (nights > 14) {
            studioPrice -= studioPrice * 0.2;
        }
    } else if (month == "July" || month == "August") {
        studioPrice = 76;
        apartmentPrice = 77;
    }
    if (nights > 14) {
        apartmentPrice -= apartmentPrice * 0.1;
    }
    apartmentPrice = apartmentPrice * nights;
    studioPrice = studioPrice * nights;

    console.log(`Apartment: ${apartmentPrice.toFixed(2)} lv.`);
    console.log(`Studio: ${studioPrice.toFixed(2)} lv.`);
}

function inTime(input) {
    let examHour = Number(input[0]);
    let examMinute = Number(input[1]);
    let arrivalHour = Number(input[2]);
    let arrivalMinute = Number(input[3]);
    let state;

    let examMinutes = examHour * 60 + examMinute;
    let arrivalMinutes = arrivalHour * 60 + arrivalMinute;

    let minsDifference = examMinutes - arrivalMinutes;
    let finalHours = Math.floor(minsDifference / 60);
    let finalMins = minsDifference % 60;

    if (minsDifference >= 0 && minsDifference <= 30) {
        state = "On time";
    } else if (minsDifference > 30) {
        state = "Early";
    } else if (minsDifference < 0) {
        state = "Late";
    }

    switch (state) {
        case "On time":
            console.log("On time");

            if (minsDifference != 0) {
                console.log(`${minsDifference} minutes before the start`);
            } 
        break;

        case "Early":
            console.log("Early");

            if (minsDifference < 60) {
                console.log(`${minsDifference} minutes before the start`);
            } else if (minsDifference >= 60) {
                if (finalMins < 10) {
                    console.log(`${finalHours}:0${finalMins} hours before the start`);
                } else {
                    console.log(`${finalHours}:${finalMins} hours before the start`);
                }
            }
        break;

        case "Late":
            console.log("Late");
            let minutesLate = arrivalMinutes - examMinutes;
            let finalHoursLate = Math.floor(minutesLate / 60);
            let finalMinsLate = minutesLate % 60;

            if (minutesLate < 60) {
                console.log(`${minutesLate} minutes after the start`);
            } else if (minutesLate >= 60) {
                if (finalMinsLate < 10) {
                    console.log(`${finalHoursLate}:0${finalMinsLate} hours after the start`);
                } else {
                    console.log(`${finalHoursLate}:${finalMinsLate} hours after the start`);
                }
            }
        break;
    }
}

function skiHoliday(input) {
    let daysToStay = Number(input[0]);
    let roomType = input[1];
    let grade = input[2];
    let roomPrice = 0;
    let nightsToStay = daysToStay - 1;
    let finalPrice = 0;

    switch (roomType) {
        case "room for one person":
            roomPrice = 18;
            finalPrice = roomPrice * nightsToStay;
        break;

        case "apartment":
            roomPrice = 25;
            finalPrice = roomPrice * nightsToStay;
            if (daysToStay < 10) {
                finalPrice -= finalPrice * 0.3;
            } else if (daysToStay >= 10 && daysToStay < 15) {
                finalPrice -= finalPrice * 0.35;
            } else if (daysToStay > 15) {
                finalPrice -= finalPrice * 0.5;
            }
        break;

        case "president apartment":
            roomPrice = 35;
            finalPrice = roomPrice * nightsToStay;
            if (daysToStay < 10) {
                finalPrice -= finalPrice * 0.1;
            } else if (daysToStay >= 10 && daysToStay < 15) {
                finalPrice -= finalPrice * 0.15;
            } else if (daysToStay > 15) {
                finalPrice -= finalPrice * 0.2;
            }
        break;
    }
    if (grade == "positive") {
        finalPrice += finalPrice * 0.25;
    } else if (grade == "negative") {
        finalPrice -= finalPrice * 0.1;
    }
    console.log(finalPrice.toFixed(2))
}