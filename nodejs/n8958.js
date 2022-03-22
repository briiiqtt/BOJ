const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rlCnt = 0;
let t;
rl.on('line', function (line) {
    rlCnt++;
    if (rlCnt == 1) {
        t = parseInt(line);
    }
    if (rlCnt > 1) {

        let ox = line;
        let score = 0;
        let bonusScore = 0;
        for (let i = 0; i < ox.length; i++) {
            if (ox.substring(i, i + 1) == 'O') {
                score++;
                score += bonusScore;
                bonusScore++;
            } else {
                bonusScore = 0;
            }
        }
        console.log(score);
    }

    if (rlCnt > t) {
        rl.close();
    }
}).on('close', function () {
    process.exit();
});