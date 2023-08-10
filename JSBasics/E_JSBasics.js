function radiansToDegrees(input) {
    let radians = Number(input[0]);
    let degrees = radians*180/Math.PI;
    console.log(degrees);
}

function depositCalc(input) {
    depositedSum = Number(input[0]);
    depositMonths = Number(input[1]);
    annualIncreasePercent = Number(input[2]);
    annualIncreaseDecimal = annualIncreasePercent / 100;

    finalSum = depositedSum + depositMonths*((depositedSum*annualIncreaseDecimal)/12);
    console.log(finalSum); 
}

function vacationBooksList(input) {
    let pagesPerBook = Number(input[0]);
    let pagesPerHour = Number(input[1]);
    let daysForReading = Number(input[2]);
    let readingHoursPerDay = pagesPerBook/pagesPerHour/daysForReading;

    console.log(readingHoursPerDay);
}

function repainting(input) {
    let coverage = Number(input[0]);
    let paint = Number(input[1]);
    let thinner = Number(input[2]);
    let worktime = Number(input[3]);

    let finalPaint = paint + paint*(0.1);
    let finalCoverage = coverage + 2;

    let paintPrice = finalPaint * 14.5;
    let coveragePrice = finalCoverage * 1.5;
    let thinnerPrice = thinner * 5;

    let materialsPrice = paintPrice + coveragePrice + thinnerPrice + 0.4;
    let workersPricePerHour = materialsPrice * 0.3;
    let totalPrice = materialsPrice + worktime * workersPricePerHour;

    console.log(totalPrice);
}

function fishTank(input) {
    let length = Number(input[0]);
    let width = Number(input[1]);
    let height = Number(input[2]);
    let percent = Number(input[3]) / 100;

    let capacity = length * width * height;
    let capacityLitres = capacity * 0.001;
    let takenCapacity = capacityLitres * percent;
    let capacityLitresFinal = capacityLitres - takenCapacity;

    console.log(capacityLitresFinal);
}

function basketballEquipment(input) {
    let yearlyFee = Number(input[0]);

    let shoes = yearlyFee - yearlyFee*0.4;
    let clothing = shoes - shoes*0.2;
    let ball = clothing*0.25;
    let accessoaries = ball*0.2;

    let finalPrice = yearlyFee + shoes + clothing + ball + accessoaries;

    console.log(finalPrice);
}

function foodDelivery(input) {
    let chickenMenusCount = Number(input[0]);
    let fishMenusCount = Number(input[1]);
    let veggieMenusCount = Number(input[2]);

    let chickenMenusPrice = 10.35*chickenMenusCount;
    let fishMenusPrice = 12.4*fishMenusCount;
    let veggieMenusPrice = 8.15*veggieMenusCount;
    let allMenusPrice = chickenMenusPrice + fishMenusPrice + veggieMenusPrice;
    let desertPrice = 0.2*allMenusPrice;
    let finalPrice = allMenusPrice + desertPrice + 2.5;

    console.log(finalPrice);
}

function schoolSupplies(input) {
    let pencilsCount = Number(input[0]);
    let markersCount = Number(input[1]);
    let cleanerLitres = Number(input[2]);
    let discontPercentage = Number(input[3]) / 100;

    let suppliesPrice = pencilsCount * 5.8 + markersCount * 7.2 + cleanerLitres * 1.2;
    let finalPrice = suppliesPrice - suppliesPrice * discontPercentage;

    console.log(finalPrice);
}

function bgnToUsdConverter(input) {
    let usd = Number(input[0]);
    let bgn = usd * 1.79549;

    console.log(bgn);
}

