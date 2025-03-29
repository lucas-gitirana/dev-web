var matriz = [];
for (var i = 0; i < 4; i++) {
    matriz[i] = []; // Initialize each row before accessing indices
    for (var j = 0; j < 4; j++) {
        matriz[i][j] = i * j * 100;
    }
}
matriz.forEach(function (linha) {
    linha.forEach(function (coluna) {
        console.log(coluna);
    });
});
