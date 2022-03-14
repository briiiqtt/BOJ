const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let A, B;
rl.on('line', function (line) {
    A = parseInt(line.split(' ')[0]);
    B = parseInt(line.split(' ')[1]);
    rl.close();
    if(A>B)console.log('>')
    if(A<B)console.log('<')
    if(A==B)console.log('==')
}).on('close', function () {
    process.exit();
});