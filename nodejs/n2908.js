const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function (line) {
    let A = line.split(' ')[0];
    let B = line.split(' ')[1];

    function reverse(str) {
        let reversed = '';
        for (let i = 0; i < str.length; i++) {
            reversed += str.substring(str.length - i, str.length - i - 1);
        }
        return reversed;
    }
    A = parseInt(reverse(A));
    B = parseInt(reverse(B));

    let answer;
    if (A > B) answer = A;
    if (A < B) answer = B;

    console.log(answer);

    rl.close();
}).on('close', function () {
    process.exit();
})