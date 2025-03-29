var pes2 = {
    nome: 'Lucas',
    idade: 21,
    imprimirDetalhes: function () {
        return 'Nome: ' + this.nome + ', Idade: ' + this.idade;
    }
};
var aluno2 = {
    nome: 'Lucas',
    idade: 21,
    grade: 8.5,
    imprimirDetalhes: function () {
        return "".concat(this.nome, ", ").concat(this.idade, " anos, tirou a nota ").concat(this.grade, ".");
    }
};
console.log(pes2.imprimirDetalhes());
console.log(aluno2.imprimirDetalhes());
