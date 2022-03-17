const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function (line) {
    let ABC = line.split(' ');
    let A = parseInt(ABC[0]);
    let B = parseInt(ABC[1]);
    let C = parseInt(ABC[2]);

    let breakEven = -1;
    if (B < C) {
        for (let i = 0; true; i++) {
            if (A + B * i < C * i) {
                breakEven = i;
                break;
            }
        }
    }
    console.log(breakEven);
    rl.close();

}).on('close', function () {
    process.exit();
});