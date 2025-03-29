var aluno = {
    nome: 'Lucas',
    idade: 21,
    grade: 8.5,
    imprimirDetalhes: function () {
        return "".concat(this.nome, ", ").concat(this.idade, " anos, tirou a nota ").concat(this.grade, ".");
    }
};
console.log(aluno.imprimirDetalhes());
