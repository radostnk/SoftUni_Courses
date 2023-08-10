function endingInSeven() {
    for(let i = 0; i <= 1000; i++) {
        if(i % 10 === 7) {
            console.log(i);
        }
    }
}

function multiplicationTable(input) {
    let num = Number(input[0]);
    for(let i = 1; i <= 10; i++) {
        result =  i * num;
        console.log(`${i} * ${num} = ${result}`);
    }
}

function histogram(input) {
    let index = Number(input[0]);
    let count200 = 0;
    let count400 = 0;
    let count600 = 0;
    let count800 = 0;
    let countLarger = 0;

    for(let i = 1; i <= index; i++) {
        let currNum = Number(input[i]);

        if(currNum < 200) {
            count200 ++;
        } else if (currNum >= 200 && currNum < 400) {
            count400 ++;
        } else if (currNum >= 400 && currNum < 600) {
            count600 ++;
        } else if (currNum >= 600 && currNum < 800) {
            count800 ++;
        } else if (currNum >= 800) {
            countLarger ++;
        }
    }
    let p1 = count200 / index * 100;
    let p2 = count400 / index * 100;
    let p3 = count600 / index * 100;
    let p4 = count800 / index * 100;
    let p5 = countLarger / index * 100;

    console.log(p1.toFixed(2) + "%\n" + p2.toFixed(2) + "%\n" + p3.toFixed(2) + "%\n" + p4.toFixed(2) + "%\n" + p5.toFixed(2) + "%");
}

function cleverLily(input) {
    let age = Number(input[0]);
    let washerPrice = Number(input[1]);
    let toyPrice = Number(input[2]);
    let money = 10;
    let moneyFinal = 0;

    for (let i = 1; i <= age; i++) {
        if (i % 2 == 0) {
            moneyFinal += money;
            moneyFinal -= 1;
            money += 10;
        } else {
            moneyFinal += toyPrice;
        }
    }
    let moneyLeft = Math.abs(moneyFinal - washerPrice);

    if (moneyFinal >= washerPrice) {
        console.log(`Yes! ${moneyLeft.toFixed(2)}`);
    } else {
        console.log(`No! ${moneyLeft.toFixed(2)}`);
    }
}

function salaryLosses(input) {
    let tabsOpen = Number(input[0]);
    let salary = Number(input[1]);

    for (let i = 0; i <= input.length; i++) {
        let tabName = input[i];

        if (tabName == "Facebook") {
            salary -= 150;
        } else if (tabName == "Instagram") {
            salary -= 100
        } else if (tabName == "Reddit") {
            salary -= 50;
        }

        if (salary <= 0) {
            console.log("You have lost your salary.");
            break;
        }
    }
    if (salary > 0) {
        console.log(Math.floor(salary));
    }
}

function oscars(input) {
    let actorName = input[0];
    let academyPoints = Number(input[1]);
    let judgesNum = Number(input[2]);
    let judgePoints = 0;
    let judgeName = 0;
    let finalPoints = 0;
    finalPoints += academyPoints;
    let countLetters = 0;

    for (let i = 3; i < input.length; i+=2) {
        judgeName = input[i];
        judgePoints = input[i+1];

        for (let j = 0; j < judgeName.length; j++) {
            countLetters ++;
            finalPoints += countLetters * judgePoints / 2;
            countLetters = 0;
        }

        if (finalPoints >= 1250.5) {
            console.log(`Congratulations, ${actorName} got a nominee for leading role with ${finalPoints.toFixed(1)}!`);
            break;
        }
    }
    if(1250.5 - finalPoints > 0) {
        console.log(`Sorry, ${actorName} you need ${(1250.5 - finalPoints).toFixed(1)} more!`);
    }
}

function trecking(input) {
    let groupsNum = Number(input[0]);
    let musalaMembers = 0;
    let monblanMembers = 0;
    let kilimandjaroMembers = 0;
    let k2Members = 0;
    let everestMembers = 0;
    let allMembers = 0;

    for(let i=1; i <= groupsNum; i++) {
        let membersNum = Number(input[i]);
        allMembers += membersNum;

        if (membersNum <= 5) {
            musalaMembers += membersNum;
        } else if (membersNum <= 12) {
            monblanMembers += membersNum;
        } else if (membersNum <= 25) {
            kilimandjaroMembers += membersNum;
        } else if (membersNum <= 40) {
            k2Members += membersNum;
        } else {
            everestMembers += membersNum;
        }
    }
    let musalaPercent = musalaMembers / allMembers * 100;
    let monblanPercent = monblanMembers / allMembers * 100;
    let kilimandjaroPercent = kilimandjaroMembers / allMembers * 100;
    let k2Percent = k2Members / allMembers * 100;
    let everestPercent = everestMembers / allMembers * 100;

    console.log(musalaPercent.toFixed(2) + "%\n" + monblanPercent.toFixed(2) + "%\n" 
    + kilimandjaroPercent.toFixed(2) + "%\n" + k2Percent.toFixed(2) + "%\n" + everestPercent.toFixed(2) + "%");
}

function tennisTournament(input) {
	let tournamentsNum = Number(input[0]);
	let startPoints = Number(input[1]);
	let finalPoints = 0;
	finalPoints += startPoints;
	let counter = 0;
	
	for(let i=2; i <= tournamentsNum + 1; i++) {
		let position = input[i];
		if (position == "W") {
			finalPoints += 2000;
			counter ++;
		} else if (position == "F") {
			finalPoints += 1200;
		} else if (position == "SF") {
			finalPoints += 720;
		}
	}
	
	let averagePoints = (finalPoints - startPoints) / tournamentsNum;
	let wonTournaments = counter / tournamentsNum * 100

	console.log(`Final points: ${finalPoints}`);
	console.log(`Average points: ${Math.floor(averagePoints)}`);
	console.log(`${wonTournaments.toFixed(2)}%`);
}


