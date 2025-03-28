function somaArray(nums) {
    return nums.reduce(function (valorAcumulado, valorAtual) {
        return valorAcumulado + valorAtual;
    }, 0);
}
console.log(somaArray([1, 2, 3, 4, 5]));
console.log(somaArray([456, 100, -45, 4, 112]));
console.log(somaArray([11, 45, 7, 112, 9]));