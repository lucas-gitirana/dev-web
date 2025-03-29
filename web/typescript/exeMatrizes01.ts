let matriz: number[][] = [];

for (let i = 0; i < 4; i++) {
    matriz[i] = []; // Initialize each row before accessing indices
    for (let j = 0; j < 4; j++) {
        matriz[i][j] = i * j * 100;
    }
}

matriz.forEach(linha => {
    linha.forEach(coluna => {
        console.log(coluna);
    })
});
