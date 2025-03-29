type Pessoa3 = {
    nome: string,
    idade: number,
    imprimirDetalhes: () => string;
};

type Student2 = Pessoa2 & {
    grade: number
};

const pes2: Pessoa3 = {
    nome: 'Lucas',
    idade: 21,
    imprimirDetalhes: function () {
        return 'Nome: ' + this.nome + ', Idade: ' + this.idade;
    }
};

const aluno2: Student2 = {
    nome: 'Lucas',
    idade: 21,
    grade: 8.5,
    imprimirDetalhes() {
        return `${this.nome}, ${this.idade} anos, tirou a nota ${this.grade}.`;
    }
}

console.log(pes2.imprimirDetalhes());
console.log(aluno2.imprimirDetalhes());
