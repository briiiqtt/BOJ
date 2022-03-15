const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
let rlCnt = 0;
let divCnt;
rl.on('line', function (line) {
    rlCnt++;
    if (rlCnt == 1)
        divCnt = line;
    
    if (rlCnt == 2) {
        let divStr = line.split(' ');
        let divisors = [];
        for (let div of divStr) {
            divisors.push(parseInt(div));
        }
        
        let min = divisors[0];
        let max = divisors[0];
        for (let div of divisors) {
            if (min > div) min = div;
            if (max < div) max = div;
        }
        console.log(min * max);
        rl.close();
    }

}).on('close', function () {
    process.exit();
});