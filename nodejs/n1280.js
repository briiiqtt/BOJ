const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
let rlCnt = 0;
let n = 0;
rl.on('line', function (line) {
    if (rlCnt == 0) n = parseInt(line);
    let map = new Map();

    if (rlCnt > 0) {

        let arr = line.split(' ');
        arr.shift();
        let set = new Set(arr);
        
        for (let a of arr){
            if (set.has(a)) {
                if (map.get(a) == undefined) map.set(a, 0);
                map.set(a, map.get(a) + 1)
            }
        }

        let conquered = false;
        let army = '';
        for (let a of arr) {
            if (arr.length / 2 < map.get(a)) {
                conquered = true;
                army = a;
                break;
            }
        }
        console.log(conquered ? army : "SYJKGW");
    }

    if (rlCnt >= n) {
        rl.close();
    }
    rlCnt++;

}).on('close', function () {
    process.exit();
})