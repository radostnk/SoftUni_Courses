function catDiet(input) {
    let fatPercentage = Number(input[0]) /100;
    let proteinPercentage = Number(input[1]) /100;
    let carbsPercentage = Number(input[2]) /100;
    let totalCalories = Number(input[3]);
    let waterPercentage = Number(input[4]);

    let fats = fatPercentage * totalCalories / 9;
    let proteins = proteinPercentage * totalCalories / 4;
    let carbs = carbsPercentage * totalCalories / 4;
    let foodWeight = fats + proteins + carbs;
    let caloriesPerGr = totalCalories / foodWeight;

    let nonWaterPercentage = 100 - waterPercentage;
    let totalCals = nonWaterPercentage / 100 * caloriesPerGr;

    console.log(totalCals.toFixed(4));
}

function maidenParty(input) {
    let price = Number(input[0]);
    let loveLettersNum = Number(input[1]);
    let rosesNum = Number(input[2]);
    let keychainsNum = Number(input[3]);
    let drawingsNum = Number(input[4]);
    let luckiesNum = Number(input[5]);

    let earn = loveLettersNum * 0.6 + rosesNum * 7.2 + keychainsNum * 3.6 + drawingsNum * 18.2 + luckiesNum * 22;
    let totalNum = loveLettersNum + rosesNum + keychainsNum + drawingsNum + luckiesNum;

    if (totalNum >= 25) {
        earn -= earn * 0.35;
    }

    earn -= earn * 0.1;
    let moneyLeft = Math.abs(price - earn);

    if (earn >= price) {
        console.log(`Yes! ${moneyLeft.toFixed(2)} lv left.`);
    } else {
        console.log(`Not enough money! ${moneyLeft.toFixed(2)} lv needed.`);
    }

}

function finalCompetition(input) {
    let dancersNum = Number(input[0]);
    let points = Number(input[1]);
    let season = input[2];
    let place = input[3];

    let prize = points * dancersNum;

    if (place === "Abroad") {
        prize += prize * 0.5;
    }

    switch (season) {
        case "summer":
            if (place === "Bulgaria") {
                prize -= prize * 0.05;
            } else if (place === "Abroad") {
                prize -= prize * 0.1;
            }
        break;

        case "winter":
            if (place === "Bulgaria") {
                prize -= prize * 0.08;
            } else if (place === "Abroad") {
                prize -= prize * 0.15;
            }
        break;
    }

    let charitySum = prize * 0.75;
    let individualPrize = (prize - charitySum) / dancersNum;

    console.log(`Charity - ${charitySum.toFixed(2)}`);
    console.log(`Money per dancer - ${individualPrize.toFixed(2)}`);
}
    
function grannyStavri(input) {
    let days = Number(input[0]);
    let litres = 0;
    let degrees = 0;

    for (let i = 1; i < input.length; i+=2) {
        let curLitres = Number(input[i]);
        let curDegrees = Number(input[i+1]);
        
        litres += curLitres;
        degrees += curDegrees * curLitres;
    }

    degrees = degrees / litres;
    console.log(`Liter: ${litres.toFixed(2)}`);
    console.log(`Degrees: ${degrees.toFixed(2)}`);

    if (degrees < 38) {
        console.log("Not good, you should baking!");
    } else if (degrees <= 42) {
        console.log("Super!");
    } else {
        console.log("Dilution with distilled water!");
    }
}

function everest(input) {
    let index = 0;
    let command = input[index];
    let metresClimbed = 5364;
    let sleeping = "";
    let daysCounter = 1;
    let breakFlag = false;

    while (command !== "END") {
        sleeping = input[index];
        let curMmetresClimbed = Number(input[index + 1]);

        if (sleeping === "Yes") {
            daysCounter ++;
        }

        if (metresClimbed >= 8848) {
            breakFlag = true;
            console.log(`Goal reached for ${daysCounter} days!`);
            break;
        }

        if (daysCounter > 5) {
            breakFlag = true;
            console.log("Failed!");
            console.log(metresClimbed);
            break;
        } else {
            metresClimbed += curMmetresClimbed;
        }

        index += 2;
        command = input[index];
    }
    if (!breakFlag) {
        console.log("Failed!");
        console.log(metresClimbed);
    }
}

function multiplicationTable(input) {
    let myNum = input[0];
    let firstDigit = 0;
    let secondDigit = 0;
    let thirdDigit = 0;
    let result = 0;

    for (let i = myNum.length - 1 ; i >= 0; i--) {
        firstDigit = myNum[i+2];
        secondDigit = myNum[i+1];
        thirdDigit = myNum[i];
    }
    
    for (let a = 1; a <= firstDigit; a++) {
        for (let b = 1; b <= secondDigit; b++) {
            for (let c = 1; c <= thirdDigit; c++) {
                result = a * b * c;
                console.log(`${a} * ${b} * ${c} = ${result};`);
            }
        }
    }
}

