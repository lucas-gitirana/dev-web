var pes = {
    nome: 'Lucas',
    idade: 21,
    imprimirDetalhes: function () {
        return 'Nome: ' + this.nome + ', Idade: ' + this.idade;
    }
};
console.log(pes.imprimirDetalhes());
