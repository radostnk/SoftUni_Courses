function sumSeconds(input) {
    let seconds1 = Number(input[0]);
    let seconds2 = Number(input[1]);
    let seconds3 = Number(input[2]);

    let totalSeconds = seconds1 + seconds2 + seconds3;
    let totalMinutes = Math.floor(totalSeconds / 60);
    let secondsLeft = totalSeconds % 60;

    if (secondsLeft < 10) {
        console.log(`${totalMinutes}:0${secondsLeft}`);
    } else {
        console.log(`${totalMinutes}:${secondsLeft}`);
    }
}

function bonusScore(input) {
    let startPoints = Number(input[0]);
    let bonusPounts = 0;

    if (startPoints <= 100) {
        bonusPoints = 5;
    } else if (startPoints <= 1000) {
        bonusPoints = startPoints * 0.2;
    } else {
        bonusPoints = startPoints * 0.1;
    }

    if (startPoints % 2 === 0) {
        bonusPoints = bonusPoints + 1;
    } else if (startPoints % 10 === 5) {
        bonusPoints = bonusPoints + 2;
    }

    console.log(bonusPoints);
    console.log(bonusPoints + startPoints);
}

function fifteenMinutesMore(input) {
	let hours = Number(input[0]);
	let minutes = Number(input[1]);
	let totalMinutes = 60*hours + minutes + 15;
	let newHours = Math.floor(totalMinutes / 60);
	let newMinutes = totalMinutes % 60;
	
	if(newHours == 24) {
		newHours = 0;
	}
	
	if (newMinutes < 10) {
		console.log(`${newHours}:0${newMinutes}`);
	} else {
		console.log(`${newHours}:${newMinutes}`);
	}
}

function toysShop(input) {
    let puzzelPrice = 2.6;
    let dollPrice = 3;
    let bearPrice = 4.1;
    let minionPrice = 8.2;
    let truckPrice = 2;

    let moneyLeft = 0;

    let vacationPrice = Number(input[0]);
    let puzzelNum = Number(input[1]);
    let dollNum = Number(input[2]);
    let bearNum = Number(input[3]);
    let minionNum = Number(input[4]);
    let truckNum = Number(input[5]);

    let orderedIToys = puzzelNum + dollNum + bearNum + minionNum + truckNum;
    let totalSum = puzzelNum * puzzelPrice + dollNum * dollPrice + bearNum * bearPrice + 
                     minionNum * minionPrice + truckNum * truckPrice;

    if (orderedIToys >= 50) {
        totalSum -= totalSum * 0.25;
    }

    totalSum -= totalSum * 0.10;

    if (totalSum >= vacationPrice) {
        moneyLeft = (totalSum - vacationPrice);
        console.log(`Yes! ${moneyLeft.toFixed(2)} lv left.`);
    } else {
        moneyLeft = (vacationPrice - totalSum);
        console.log(`Not enough money! ${moneyLeft.toFixed(2)} lv needed.`);
    }
}

function godzillaVsKong(input) {
    let budget = Number(input[0]);
    let numberOfStatists = Number(input[1]);
    let pricePerClothing = Number(input[2]);
    let leftMoney = 0;

    let decor = budget * 0.1;
    if (numberOfStatists > 150) {
        pricePerClothing -= 0.1 * pricePerClothing;
    }
    let expenses = numberOfStatists*pricePerClothing + decor;

    if (expenses > budget) {
        leftMoney = expenses - budget;
        console.log("Not enough money!")
        console.log(`Wingard needs ${leftMoney.toFixed(2)} leva more.`)
    } else {
        leftMoney = budget - expenses;
        console.log("Action!")
        console.log(`Wingard starts filming with ${leftMoney.toFixed(2)} leva left.`)
    }
}

function worldRecord(input) {
    let record = Number(input[0]);
    let distance = Number(input[1]);
    let secondsPerMetre = Number(input[2]);
    
    let swimmingTime = secondsPerMetre * distance;
    let delayTimes = Math.floor(distance / 15);
    let delayTime = delayTimes * 12.5;
    let ivanchoTime = swimmingTime + delayTime;
    let difference = ivanchoTime - record;
    if (ivanchoTime < record) {
        console.log(`Yes, he succeeded! The new world record is ${ivanchoTime.toFixed(2)} seconds.`);
    } else {
        console.log(`No, he failed! He was ${difference.toFixed(2)} seconds slower.`);
    }
}

function shopping(input) {
    let petarBudget = Number(input[0]);
    let videocardsNum = Number(input[1]);
    let cpuNum = Number(input[2]);
    let ramNum = Number(input[3]);
    let moneyDifference = 0;
    let videocardsPrice = videocardsNum * 250;
    let cpuPrice = (videocardsPrice*0.35) * cpuNum;
    let ramPrice = (videocardsPrice*0.1) * ramNum;
    let endSum = videocardsPrice + cpuPrice + ramPrice;

    if (videocardsNum > cpuNum) {
        endSum -= endSum*0.15;
    }

    if (petarBudget >= endSum) {
        moneyDifference = petarBudget - endSum;
        console.log(`You have ${moneyDifference.toFixed(2)} leva left!`);
    } else {
        moneyDifference = endSum - petarBudget;
        console.log(`Not enough money! You need ${moneyDifference.toFixed(2)} leva more!`);
    }
}

function lunchBreak(input) {
	let seriesName = input[0];
	let episodeLength = input[1];
	let breakLength = input[2];
	
	let lunchLength = 0.125 * breakLength;
	let relaxLength = 0.25 * breakLength;
	let timeLeft = breakLength - (lunchLength + relaxLength);
	let minutesLeft = 0;
	
	if (timeLeft >= episodeLength) {
		minutesLeft = timeLeft - episodeLength;
		console.log(`You have enough time to watch ${seriesName} and left with ${Math.ceil(minutesLeft)} minutes free time.`);
	} else {
		minutesLeft = episodeLength - timeLeft;
		console.log(`You don't have enough time to watch ${seriesName}, you need ${Math.ceil(minutesLeft)} more minutes.`);
	}
}

