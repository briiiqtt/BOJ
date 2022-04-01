const readline = require('readline');
const { isArrayBufferView } = require('util/types');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rlCnt = 0;
rl.on('line', function (line) {
    let x, y;
    if (rlCnt == 0) {
        x = line.split(' ')[0];
        y = line.split(' ')[1];
    }

    let sum = 0;
    let n = 1;
    let pointer = 1;
    for (let i = 0; i < y; i++) {
        for (let j = 0; j < n; j++) {
            if (pointer >= x && pointer <= y) {
                sum += n;
            }
            pointer++;
        }
        n++;
    }

    console.log(sum);
}).on('close', function () {
    process.exit();
})