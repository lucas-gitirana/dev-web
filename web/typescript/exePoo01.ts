type Pessoa = {
    nome: string,
    idade: number,
    imprimirDetalhes: () => string;
}

let pes: Pessoa = {
    nome: 'Lucas',
    idade: 21,
    imprimirDetalhes: function () {
        return 'Nome: ' + this.nome + ', Idade: ' + this.idade;
    }
};

console.log(pes.imprimirDetalhes());
