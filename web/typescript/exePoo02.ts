type Pessoa2 = {
    nome: string,
    idade: number,
    imprimirDetalhes: () => string;
};

type Student = Pessoa2 & {
    grade: number
};

let aluno: Student = {
    nome: 'Lucas',
    idade: 21,
    grade: 8.5,
    imprimirDetalhes() {
        return `${this.nome}, ${this.idade} anos, tirou a nota ${this.grade}.`;
    }
}

console.log(aluno.imprimirDetalhes());
