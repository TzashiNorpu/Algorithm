var isRobotBounded = function (instructions) {
    // 只有(x,y)不是原点，并且方向和原来的方向一致，最后才回不去
    let x = 0, y = 0, i = 0, dir = [[0, 1], [1, 0], [0, -1], [-1, 0]];
    /*
             N (0)
               |
       W (3) ------ E (1)
               |
            S (2)
    */
    for (let j = 0; j < instructions.length; j++) {
        if (instructions[j] == 'R') {
            i = (i + 1) % 4;
        } else if (instructions[j] == 'L') {
            i = (i + 3) % 4;
        } else {
            x += dir[i][0];
            y += dir[i][1];
        }
    }
    return x == 0 && y == 0 || i > 0;
};