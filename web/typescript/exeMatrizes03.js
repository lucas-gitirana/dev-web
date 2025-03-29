var pessoas = [];
for (var i = 0; i < 2; i++) {
    pessoas[i] = [];
    for (var j = 0; j < 2; j++) {
        pessoas[i][j] = {
            nome: 'Pessoa ' + i + ' - ' + j,
            idade: (i + j) * 10,
            cidade: (i + j) % 2 == 0 ? 'Ibirama' : 'Rio do Sul',
            imprimirDetalhes: function () {
                return "".concat(this.nome, ", ").concat(this.idade, " anos, de ").concat(this.cidade);
            }
        };
    }
}
console.log(pessoas);
